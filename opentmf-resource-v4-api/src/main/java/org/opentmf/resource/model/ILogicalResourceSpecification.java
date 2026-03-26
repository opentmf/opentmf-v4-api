package org.opentmf.resource.model;

import java.net.URI;

/**
 * This is an example of a derived class of ResourceSpecification, and is used
 * to define the invariant characteristics and behavior (attributes, methods,
 * constraints, and relationships) of a LogicalResource.
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
public interface ILogicalResourceSpecification extends IResourceSpecificationUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
