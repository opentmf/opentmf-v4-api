package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Synthesized abstract parent for 5 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-651: Agreement Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
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
