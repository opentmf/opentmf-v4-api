package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Synthesized abstract parent for 10 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>AssociationCreate (662, 703)</li>
 *   <li>AssociationUpdate (662, 703)</li>
 *   <li>EdgeSpecificationCreate (686)</li>
 *   <li>EdgeSpecificationUpdate (686)</li>
 *   <li>ResourceCandidateCreate (634)</li>
 *   <li>ResourceCandidateUpdate (634)</li>
 *   <li>ResourceCatalogCreate (634)</li>
 *   <li>ResourceCatalogUpdate (634)</li>
 *   <li>VertexSpecificationCreate (686)</li>
 *   <li>VertexSpecificationUpdate (686)</li>
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
