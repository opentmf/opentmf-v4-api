package org.opentmf.common.model;

import java.net.URI;

/**
 * The reference object to the schema and type of target entity which is
 * described by a specification.
 *
 * <p><br/>
 * <strong>Required:</strong> @schemaLocation, @type<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-653: Service Test Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-667: Document Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITargetEntitySchema {

  /**
   * This field provides a link to the schema describing the target entity.
   */
  URI getAtSchemaLocation();

  /**
   * Class type of the target entity.
   */
  String getAtType();
}
