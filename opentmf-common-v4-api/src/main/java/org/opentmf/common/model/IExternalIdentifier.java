package org.opentmf.common.model;


/**
 * An identification of an entity that is owned by or originates in a software
 * system different from the current system, for example a ProductOrder handed
 * off from a commerce platform into an order handling system. The structure
 * identifies the system itself, the nature of the entity within the system
 * (e.g. class name) and the unique ID of the entity within the system. It is
 * anticipated that multiple external IDs can be held for a single entity, e.g.
 * if the entity passed through multiple systems on the way to the current
 * system. In this case the consumer is expected to sequence the IDs in the
 * array in reverse order of provenance, i.e. most recent system first in the
 * list.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-667: Document Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-724: Incident Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IExternalIdentifier extends IEntity {

  /**
   * Type of the identification, typically would be the type of the entity within
   * the external system.
   */
  String getExternalIdentifierType();

  /**
   * Name of the external system that owns the entity.
   */
  String getOwner();
}
