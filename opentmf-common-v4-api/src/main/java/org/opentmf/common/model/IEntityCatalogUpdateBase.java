package org.opentmf.common.model;


/**
 * Synthesized abstract parent for 9 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>AssociationSpecificationUpdate (662)</li>
 *   <li>EntityCatalogItemUpdate (662)</li>
 *   <li>EntityCatalogUpdate (662)</li>
 *   <li>EntityCategoryUpdate (662)</li>
 *   <li>IotDeviceSpecificationUpdate (908)</li>
 *   <li>ServiceCandidateUpdate (633)</li>
 *   <li>ServiceCatalogUpdate (633)</li>
 *   <li>ServiceCategoryUpdate (633)</li>
 *   <li>ShipmentSpecificationUpdate (711)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityCatalogUpdateBase extends IExtensible {

  /**
   * Description of the specification.
   */
  String getDescription();

  /**
   * Indicates the current lifecycle status.
   */
  String getLifecycleStatus();

  /**
   * Name given to this association specification.
   */
  String getName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Version of this association.
   */
  String getVersion();
}
