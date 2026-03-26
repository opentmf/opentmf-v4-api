package org.opentmf.tmf655.model;


/**
 * A Service to be created defined by value or existing defined by reference.
 * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
 * to the Service entity and not the RelatedServiceRefOrValue class itself.
 *
 * <p><br/>
 * <strong>Required:</strong> targetEntity<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-655: Change Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IChangeRequestRefOrValue extends IChangeRequest {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
