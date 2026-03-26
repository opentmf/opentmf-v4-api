package org.opentmf.tmf671.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Contains the conditions and benefits of the promotion toan eligible party.
 *
 * <p><br/>
 * <strong>Required:</strong> action, criteriaGroup<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-671: Promotion Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPromotionPattern extends IExtensible {

  /**
   * List of: Action of the promotion. When the customer meets the conditions in
   * the promotion pattern, the customer can be given the benefits in the action.
   */
  List<? extends IPromotionAction> getActions();

  /**
   * List of: Set of group criteria to promotion. Fulfilling these criteria,
   * parties will receice benefits.
   */
  List<? extends IPromotionCriteriaGroup> getCriteriaGroups();

  /**
   * Logical relation followed by the criteria group.
   */
  String getCriteriaGroupLogicalRelationship();

  /**
   * Small description to clarify the pattern details.
   */
  String getDescription();

  /**
   * Unique identifier of promotion pattern.
   */
  String getId();

  /**
   * Alias to promotion pattern. This way is easily mentioned.
   */
  String getName();

  /**
   * Priority. Smaller number means high.
   */
  Integer getPriority();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
