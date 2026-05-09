package org.opentmf.common.model;

import java.net.URI;

/**
 * The reference object to the schema and type of target resource which is
 * described by resource specification.
 *
 * <p><br/>
 * <strong>Required:</strong> @schemaLocation, @type<br/>
 * </p>
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
public interface ITargetResourceSchema {

  /**
   * This field provides a link to the schema describing the target resource.
   */
  URI getAtSchemaLocation();

  /**
   * Class type of the target resource.
   */
  String getAtType();
}
