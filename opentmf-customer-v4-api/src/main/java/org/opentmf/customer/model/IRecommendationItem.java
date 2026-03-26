package org.opentmf.customer.model;

import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRefOrValue;

/**
 * A list of recommendation items. Every item is a product offering and its
 * rank.
 *
 * <p><br/>
 * <strong>Required:</strong> product<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-680: Recommendation Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRecommendationItem extends IEntity {

  /**
   * The rank of the list of recommended offering.
   */
  Integer getPriority();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getProduct();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();
}
