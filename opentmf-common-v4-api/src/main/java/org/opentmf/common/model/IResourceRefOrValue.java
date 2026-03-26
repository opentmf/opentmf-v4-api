package org.opentmf.common.model;


/**
 * Resource is an abstract entity that describes the common set of attributes
 * shared by all concrete resources. The polymorphic attributes {@literal @}type,
 * {@literal @}schemaLocation & {@literal @}referredType are related to the Resource entity and not
 * the related ResourceRefOrValue class itself.
 *
 * <p><br/>
 * <strong>Required:</strong> href, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-639: Resource Inventory Management API</li>
 *   <li>TMF-652: Resource Order Management API</li>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-702: Resource Activation Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-716: ResourceReservation</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceRefOrValue extends IResource {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
