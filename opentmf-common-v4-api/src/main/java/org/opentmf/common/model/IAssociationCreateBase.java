package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Synthesized abstract parent for 10 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-686: Topology API</li>
 *   <li>TMF-703: Entity Inventory Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAssociationCreateBase extends IExtensible {

  /**
   * Description of the association.
   */
  String getDescription();

  /**
   * The last modified date of this association object.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Indicates the current lifecycle status.
   */
  String getLifecycleStatus();

  /**
   * Name given to this association.
   */
  String getName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Version of this REST resource.
   */
  String getVersion();
}
