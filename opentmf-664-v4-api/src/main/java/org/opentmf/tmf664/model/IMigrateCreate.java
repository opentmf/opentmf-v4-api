package org.opentmf.tmf664.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPlaceRef;
import org.opentmf.resource.model.IConnectionPointRef;

/**
 * Task resource used to request migration of the Resource Function
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> cause, resourceFunction<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMigrateCreate extends IExtensible {

  /**
   * Connection points to be added when function is migrated.
   */
  List<? extends IConnectionPointRef> getAddConnectionPoints();

  /**
   * SubState required before migrate is carried out.
   */
  String getAdminStateModification();

  /**
   * Reason why migration is being requested.
   */
  String getCause();

  /**
   * Additional attributes to pass to the migrate operation.
   */
  List<? extends ICharacteristic> getCharacteristicses();

  /**
   * In what mode is the migrate operation to be performed.
   */
  String getCompletionMode();

  /**
   * Name of the Migrate task resource.
   */
  String getName();

  /**
   * Place reference. PlaceRef defines the placeRefs where the products are sold
   * or delivered.
   */
  IPlaceRef getPlace();

  /**
   * Priority of the migrate operation.
   */
  Integer getPriority();

  /**
   * Connection points to be removed when function is migrated.
   */
  List<? extends IConnectionPointRef> getRemoveConnectionPoints();

  /**
   * Resource Function reference.
   */
  IResourceFunctionRef getResourceFunction();

  /**
   * The time when the migration needs to commence. This allows a delay to be
   * added.
   */
  String getStartTime();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
