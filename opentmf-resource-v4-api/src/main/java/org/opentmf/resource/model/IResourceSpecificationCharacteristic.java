package org.opentmf.resource.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristicSpecificationBase;
import org.opentmf.common.model.ICharacteristicValueSpecification;

/**
 * This class defines the characteristic features of a resource specification.
 * Every ResourceSpecification has a variety of important attributes, methods,
 * constraints, and
 * <br/>relationships, which distinguish a resource specification from other
 * resource specifications.
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
public interface IResourceSpecificationCharacteristic extends ICharacteristicSpecificationBase {

  /**
   * An aggregation, migration, substitution, dependency or exclusivity
   * relationship between/among Specification Characteristics.
   */
  List<? extends IResourceSpecificationCharacteristicRelationship> getResourceSpecCharRelationships();

  /**
   * A CharacteristicValueSpecification object is used to define a set of
   * attributes, each of which can be assigned to a corresponding set of
   * attributes in a ResourceSpecificationCharacteristic object. The values of the
   * attributes in the CharacteristicValueSpecification object describe the values
   * of the attributes that a corresponding ResourceSpecificationCharacteristic
   * object can take on.
   */
  List<? extends ICharacteristicValueSpecification> getResourceSpecCharacteristicValues();
}
