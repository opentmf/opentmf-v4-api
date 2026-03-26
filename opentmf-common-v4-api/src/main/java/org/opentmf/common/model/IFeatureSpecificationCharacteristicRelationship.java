package org.opentmf.common.model;

import java.net.URI;

/**
 * An aggregation, migration, substitution, dependency or exclusivity
 * relationship between/among FeatureSpecificationCharacteristics.
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
public interface IFeatureSpecificationCharacteristicRelationship extends IFeatureRelationship {

  /**
   * Unique identifier of the characteristic within the the target feature
   * specification.
   */
  String getCharacteristicId();

  /**
   * Unique identifier of the target feature specification within the resource
   * specification.
   */
  String getFeatureId();

  /**
   * Hyperlink reference to the resource specification containing the target
   * feature and feature characteristic.
   */
  URI getResourceSpecificationHref();

  /**
   * Unique identifier of the resource specification containing the target feature
   * and feature characteristic.
   */
  String getResourceSpecificationId();
}
