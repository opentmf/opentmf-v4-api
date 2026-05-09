package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Synthesized abstract parent for 5 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>AgreementSpecificationCreate (651)</li>
 *   <li>AgreementSpecificationUpdate (651)</li>
 *   <li>LoyaltyProgramProductSpecUpdate (658)</li>
 *   <li>ResourceSpecificationCreate (634, 730, 908)</li>
 *   <li>ResourceSpecificationUpdate (634, 730, 908)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceSpecificationCreateBase extends IExtensible {

  /**
   * A narrative that explains in detail what the agreement specification is
   * about.
   */
  String getDescription();

  /**
   * If true, this agreement specification is a grouping of other agreement
   * specifications. The list of bundled agreement specifications is provided by
   * the specificationRelationship property.
   */
  Boolean getIsBundle();

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Indicates the current lifecycle status.
   */
  String getLifecycleStatus();

  /**
   * Name of the agreement specification.
   */
  String getName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Agreement specification version.
   */
  String getVersion();
}
