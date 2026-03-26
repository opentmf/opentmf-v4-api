package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-653: Service Test Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-667: Document Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-703: Entity Inventory Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAssociationBase extends INamedEntity {

  /**
   * Any constraints in this association.
   */
  List<? extends IConstraintRef> getConstraints();

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
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Version of this REST resource.
   */
  String getVersion();
}
