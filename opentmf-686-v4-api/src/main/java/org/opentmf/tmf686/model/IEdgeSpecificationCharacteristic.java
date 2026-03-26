package org.opentmf.tmf686.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristicSpecificationBase;
import org.opentmf.common.model.ICharacteristicValueSpecification;

/**
 * This class defines the characteristic features of an edge specification.
 * Every EdgeSpecification has a variety of important attributes, methods,
 * constraints, and relationships, which distinguish an edge specification from
 * other edge specifications.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-686: Topology API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEdgeSpecificationCharacteristic extends ICharacteristicSpecificationBase {

  /**
   * An aggregation, migration, substitution, dependency or exclusivity
   * relationship between/among Specification Characteristics.
   */
  List<? extends IEdgeSpecificationCharacteristicRelationship> getEdgeSpecCharRelationships();

  /**
   * A CharacteristicValueSpecification object is used to define a set of
   * attributes, each of which can be assigned to a corresponding set of
   * attributes in a EdgeSpecificationCharacteristic object. The values of the
   * attributes in the CharacteristicValueSpecification object describe the values
   * of the attributes that a corresponding EdgeSpecificationCharacteristic object
   * can take on.
   */
  List<? extends ICharacteristicValueSpecification> getEdgeSpecCharacteristicValues();
}
