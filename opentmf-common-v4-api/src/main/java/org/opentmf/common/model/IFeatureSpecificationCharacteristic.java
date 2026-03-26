package org.opentmf.common.model;

import java.util.List;

/**
 * Configuration feature characteristic specification.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IFeatureSpecificationCharacteristic extends ICharacteristicSpecificationBase {

  /**
   * An aggregation, migration, substitution, dependency or exclusivity
   * relationship between/among feature characteristics.
   */
  List<? extends IFeatureSpecificationCharacteristicRelationship> getFeatureSpecCharRelationships();

  /**
   * Used to define a set of attributes, each of which can be assigned to a
   * corresponding set of attributes in a FeatureCharacteristic object.
   */
  List<? extends ICharacteristicValueSpecification> getFeatureSpecCharacteristicValues();
}
