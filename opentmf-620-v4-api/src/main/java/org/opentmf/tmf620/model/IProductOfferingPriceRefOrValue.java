package org.opentmf.tmf620.model;


/**
 * A new product offering price being created by value or a reference to an
 * existing product offering price that already created. The polymorphic
 * attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the product
 * offering price and not to this ReforValue structure.
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
public interface IProductOfferingPriceRefOrValue extends IPOPCharge {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
