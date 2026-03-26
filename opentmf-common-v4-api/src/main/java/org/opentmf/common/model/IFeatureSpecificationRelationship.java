package org.opentmf.common.model;

import java.net.URI;

/**
 * Relationship between feature specifications.
 *
 * <p><br/>
 * <strong>Required:</strong> name, relationshipType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IFeatureSpecificationRelationship extends IFeatureRelationship {

  /**
   * Unique identifier of the target feature specification.
   */
  String getFeatureId();

  /**
   * Hyperlink reference to the parent specification containing the target
   * feature.
   */
  URI getParentSpecificationHref();

  /**
   * Unique identifier of the parent specification containing the target feature.
   */
  String getParentSpecificationId();
}
