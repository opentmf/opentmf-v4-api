package org.opentmf.common.model;

/**
 * A place described by reference or by value linked to a specific entity. The
 * polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to
 * the place entity and not the PlaceRefOrValue class itself.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-674: Geographic Site Management API</li>
 *   <li>TMF-687: Stock Management API</li>
 *   <li>TMF-714: Work Qualification Management</li>
 *   <li>TMF-716: ResourceReservation</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPlaceRefOrValue extends IEntityRef {
}
