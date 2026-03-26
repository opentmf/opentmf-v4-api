package org.opentmf.resource.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;

/**
 * A ResourceFunction is a behavior to transform inputs of any nature into
 * outputs of any nature independently from the way it is provided.
 *
 * <p><br/>
 * <strong>Required:</strong> href, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceFunction extends ILogicalResource {

  /**
   * List of the kinds of auto-modifications that are applied to a given network
   * service e.g. what can be scaled.
   */
  List<? extends ICharacteristic> getAutoModifications();

  /**
   * External connection points of the resource function. These are the service
   * access points (SAP) where inputs and outputs of the function are available.
   */
  List<? extends IConnectionPointRef> getConnectionPoints();

  /**
   * Internal connectivity of contained resource functions.
   */
  List<? extends IResourceGraph> getConnectivities();

  /**
   * A type of the Resource Function as specified by the provider of the API.
   */
  String getFunctionType();

  /**
   * Priority of the Resource Function. Decides what happens in a contention
   * scenario.
   */
  Integer getPriority();

  /**
   * Role of the Resource Function. Used when Resource Function is a component of
   * a composite Resource Function and the exact role of the service within the
   * composite is not clear from descriptor/location.
   */
  String getRole();

  /**
   * This is a reference to a schedule. Allows consumers to schedule modifications
   * to the service at certain times.
   */
  List<? extends IScheduleRef> getSchedules();
}
