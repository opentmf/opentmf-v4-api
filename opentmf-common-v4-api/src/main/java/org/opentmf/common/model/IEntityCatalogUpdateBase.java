package org.opentmf.common.model;


/**
 * Synthesized abstract parent for 9 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
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
