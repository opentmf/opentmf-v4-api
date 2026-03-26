package org.opentmf.common.model;

import java.util.List;

/**
 * Configuration feature.
 *
 * <p><br/>
 * <strong>Required:</strong> featureCharacteristic, id, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-638: Service Inventory Management API</li>
 *   <li>TMF-639: Resource Inventory Management API</li>
 *   <li>TMF-640: Service Activation Management API</li>
 *   <li>TMF-641: Service Ordering Management API</li>
 *   <li>TMF-645: Service Qualification Management API</li>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-702: Resource Activation Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-716: ResourceReservation</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IFeature extends INamedEntity {

  /**
   * This is a list of feature constraints.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * This is a list of Characteristics for a particular feature.
   */
  List<? extends ICharacteristic> getFeatureCharacteristics();

  /**
   * List of: Configuration feature.
   */
  List<? extends IFeatureRelationship> getFeatureRelationships();

  /**
   * True if this is a feature group. Default is false.
   */
  Boolean getIsBundle();

  /**
   * True if this feature is enabled. Default is true.
   */
  Boolean getIsEnabled();
}
