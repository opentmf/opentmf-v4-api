package org.opentmf.common.model;

/**
 * A reference to an entity, where the type of the entity is not known in
 * advance.
 *
 * <p><br/>
 * <strong>Required:</strong> @referredType, id, role<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-621: Trouble Ticket Management API</li>
 *   <li>TMF-646: Appointment Management API</li>
 *   <li>TMF-655: Change Management API</li>
 *   <li>TMF-657: Service Quality Management Management API</li>
 *   <li>TMF-667: Document Management API</li>
 *   <li>TMF-687: Stock Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-701: Process Flow Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-716: ResourceReservation</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRelatedEntity extends IRelatedEntityRefOrValue {
}
