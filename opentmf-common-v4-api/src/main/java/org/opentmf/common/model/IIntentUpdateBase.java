package org.opentmf.common.model;


/**
 * Synthesized abstract parent for 5 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-701: Process Flow Management API</li>
 *   <li>TMF-921: Intent Management API</li>
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
