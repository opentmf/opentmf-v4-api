package org.opentmf.common.model;


/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>MetadataCatalogItemUpdate (725)</li>
 *   <li>MetadataCategoryUpdate (725)</li>
 *   <li>MetadataSpecificationUpdate (725)</li>
 *   <li>PromotionUpdate (671)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPromotionUpdateBase {

  /**
   * Description of this metadata catalog item resource.
   */
  String getDescription();

  /**
   * Used to indicate the current lifecycle status of this catalog item.
   */
  String getLifecycleStatus();

  /**
   * Name given to this REST resource.
   */
  String getName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
