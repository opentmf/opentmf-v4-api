package org.opentmf.common.model;

import java.util.List;

/**
 * Specification for resource, service or product features.
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
public interface IFeatureSpecification extends INamedEntity {

  /**
   * This is a list of feature constraints.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * This is a list of characteristics for a particular feature.
   */
  List<? extends IFeatureSpecificationCharacteristic> getFeatureSpecCharacteristics();

  /**
   * A dependency, exclusivity or aggregation relationship between/among feature
   * specifications.
   */
  List<? extends IFeatureSpecificationRelationship> getFeatureSpecRelationships();

  /**
   * A flag indicating if this is a feature group (true) or not (false).
   */
  Boolean getIsBundle();

  /**
   * A flag indicating if the feature is enabled (true) or not (false).
   */
  Boolean getIsEnabled();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Version of the feature specification.
   */
  String getVersion();
}
