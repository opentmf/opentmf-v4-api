package org.opentmf.tmf687.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPlaceRefOrValue;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IProductStockRef;
import org.opentmf.common.model.IQuantity;

/**
 * AlternateProductStock is used to log and execute Alternate about product
 * stock availability.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-687: Stock Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAlternateProductStock extends IExtensible {

  /**
   * Alternate date when the product stock is available.
   */
  OffsetDateTime getAlternateAvailabilityDate();

  /**
   * A place described by reference or by value linked to a specific entity. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to
   * the place entity and not the PlaceRefOrValue class itself.
   */
  IPlaceRefOrValue getAlternatePlace();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getAlternateProduct();

  /**
   * An amount in a given unit.
   */
  IQuantity getAlternateQuantity();

  /**
   * ProductStockRef is a reference to a product stock.
   */
  IProductStockRef getAlternateStock();

  /**
   * identifier of the Alternate product stock.
   */
  String getId();
}
