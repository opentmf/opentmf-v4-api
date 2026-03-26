package org.opentmf.tmf664.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;

/**
 * Task Resource used to request healing of a Resource Function
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> cause, degreeOfHealing, resourceFunction<br/>
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
public interface IHealCreate extends IExtensible {

  /**
   * Additional parameters to be sent to the heal action as name value pairs.
   */
  List<? extends ICharacteristic> getAdditionalParmses();

  /**
   * Reason why healing is being requested.
   */
  String getCause();

  /**
   * Indicates the degree of healing required.
   */
  String getDegreeOfHealing();

  /**
   * Exact action to be taken as part of the heal process or a pointer to a script
   * to be run.
   */
  String getHealAction();

  /**
   * Heal policy reference.
   */
  IHealPolicyRef getHealPolicy();

  /**
   * Name of the Heal task resource.
   */
  String getName();

  /**
   * Resource Function reference.
   */
  IResourceFunctionRef getResourceFunction();

  /**
   * The time when the heal action needs to commence. This allows a delay to be
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
