package org.opentmf.tmf908.model;

import java.net.URI;
import org.opentmf.common.model.IEventBase;

/**
 * Generic IotManagementEvent structure used to define commonalities between sub
 * concepts of PartyIotManagementEvent and Financial IotManagementEvent.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIotManagementEvent extends IEventBase {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * When subclassing, this defines the subclass entity name.
   */
  String getAtType();

  Object getEvent();
}
