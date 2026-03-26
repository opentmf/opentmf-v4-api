package org.opentmf.tmf671.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * Set of group criteria to promotion. Fulfilling these criteria, parties will
 * receice benefits.
 *
 * <p><br/>
 * <strong>Required:</strong> criteria<br/>
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
public interface IPromotionCriteriaGroup extends IExtensible {

  /**
   * List of: Set of criteria to be followed by all parties.
   */
  List<? extends IPromotionCriteria> getCriterias();

  /**
   * Logical relation followed by all criteria.
   */
  String getCriteriaLogicalRelationship();

  /**
   * Name of the group to be easily identified.
   */
  String getGroupName();

  /**
   * Unique Identifier.
   */
  String getId();
}
