package org.opentmf.tmf620.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristicValueSpecification;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductSpecificationRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * A use of the ProductSpecificationCharacteristicValue by a ProductOffering to
 * which additional properties (attributes) apply or override the properties of
 * similar properties contained in ProductSpecificationCharacteristicValue. It
 * should be noted that characteristics which their value(s) addressed by this
 * object must exist in corresponding product specification. The available
 * characteristic values for a ProductSpecificationCharacteristic in a Product
 * specification can be modified at the ProductOffering level. For example, a
 * characteristic 'Color' might have values White, Blue, Green, and Red. But,
 * the list of values can be restricted to e.g. White and Blue in an associated
 * product offering. It should be noted that the list of values in
 * 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list
 * of values as defined in the corresponding product specification
 * characteristics.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductSpecificationCharacteristicValueUse extends IExtensible {

  /**
   * A narrative that explains in detail what the
   * productSpecificationCharacteristic is.
   */
  String getDescription();

  /**
   * Unique ID for the characteristic.
   */
  String getId();

  /**
   * The maximum number of instances a CharacteristicValue can take on. For
   * example, zero to five phone numbers in a group calling plan, where five is
   * the value for the maxCardinality.
   */
  Integer getMaxCardinality();

  /**
   * The minimum number of instances a CharacteristicValue can take on. For
   * example, zero to five phone numbers in a group calling plan, where zero is
   * the value for the minCardinality.
   */
  Integer getMinCardinality();

  /**
   * Name of the associated productSpecificationCharacteristic.
   */
  String getName();

  /**
   * A number or text that can be assigned to a
   * ProductSpecificationCharacteristic.
   */
  List<? extends ICharacteristicValueSpecification> getProductSpecCharacteristicValues();

  /**
   * Product specification reference: A ProductSpecification is a detailed
   * description of a tangible or intangible object made available externally in
   * the form of a ProductOffering to customers or other parties playing a party
   * role.
   */
  IProductSpecificationRef getProductSpecification();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * A kind of value that the characteristic can take on, such as numeric, text
   * and so forth.
   */
  String getValueType();
}
