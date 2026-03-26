package org.opentmf.product.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristicSpecificationBase;
import org.opentmf.common.model.ICharacteristicValueSpecification;

/**
 * A characteristic quality or distinctive feature of a ProductSpecification.
 * The characteristic can be take on a discrete value, such as color, can take
 * on a range of values, (for example, sensitivity of 100-240 mV), or can be
 * derived from a formula (for example, usage time (hrs) = 30 - talk time *3).
 * Certain characteristics, such as color, may be configured during the ordering
 * or some other process.
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
public interface IProductSpecificationCharacteristic extends ICharacteristicSpecificationBase {

  /**
   * An aggregation, migration, substitution, dependency or exclusivity
   * relationship between/among Specification Characteristics.
   */
  List<? extends IProductSpecificationCharacteristicRelationship> getProductSpecCharRelationships();

  /**
   * A ProductSpecificationCharacteristicValue object is used to define a set of
   * attributes, each of which can be assigned to a corresponding set of
   * attributes in a ProductSpecificationCharacteristic object. The values of the
   * attributes in the ProductSpecificationCharacteristicValue object describe the
   * values of the attributes that a corresponding
   * ProductSpecificationCharacteristic object can take on.
   */
  List<? extends ICharacteristicValueSpecification> getProductSpecCharacteristicValues();
}
