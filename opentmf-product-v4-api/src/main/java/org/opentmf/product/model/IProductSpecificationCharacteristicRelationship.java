package org.opentmf.product.model;

import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * An aggregation, migration, substitution, dependency or exclusivity
 * relationship between/among productSpecificationCharacteristics.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductSpecificationCharacteristicRelationship extends INamedEntity {

  /**
   * The order in which a CharacteristicSpecification appears within another
   * CharacteristicSpecification that defines a grouping of
   * CharacteristicSpecifications.
   * <br/>
   * <br/>For example, a grouping may represent the name of an individual. The
   * given name is first, the middle name is second, and the last name is third.
   */
  Integer getCharSpecSeq();

  /**
   * Type of relationship such as aggregation, migration, substitution,
   * dependency, exclusivity.
   */
  String getRelationshipType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
