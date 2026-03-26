package org.opentmf.resource.model;

import java.util.List;

/**
 * Specifies a function as a behavior to transform inputs of any nature into
 * outputs of any nature independently from the way it is provided, for example
 * a Medium to Large Enterprise Firewall.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceFunctionSpecification extends IResourceSpecification {

  /**
   * External connection point specifications. These are the service access points
   * (SAP) where inputs and outputs of the function are available.
   */
  List<? extends IConnectionPointSpecificationRef> getConnectionPointSpecifications();

  /**
   * Internal connectivity potential specifications.
   */
  List<? extends IResourceGraphSpecification> getConnectivitySpecifications();
}
