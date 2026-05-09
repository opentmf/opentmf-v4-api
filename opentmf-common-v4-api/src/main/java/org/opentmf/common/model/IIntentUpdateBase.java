package org.opentmf.common.model;


/**
 * Synthesized abstract parent for 5 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>CatalogUpdate (620)</li>
 *   <li>CategoryUpdate (620)</li>
 *   <li>IntentUpdate (921)</li>
 *   <li>ProcessFlowSpecificationUpdate (701)</li>
 *   <li>TaskFlowSpecificationUpdate (701)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIntentUpdateBase {

  /**
   * Description of this catalog.
   */
  String getDescription();

  /**
   * Used to indicate the current lifecycle status.
   */
  String getLifecycleStatus();

  /**
   * Name of the catalog.
   */
  String getName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Catalog version.
   */
  String getVersion();
}
