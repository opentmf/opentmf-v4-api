package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * A product offering procured by a customer or other interested party playing a
 * party role. A product is realized as one or more service(s) and / or
 * resource(s).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 *   <li>TMF-637: Product Inventory Management API</li>
 *   <li>TMF-648: Quote Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-663: Shopping Cart Management API</li>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 *   <li>TMF-680: Recommendation Management API</li>
 *   <li>TMF-687: Stock Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProduct extends IMEntityBase {

  /**
   * List of: Agreement reference. An agreement represents a contract or
   * arrangement, either written or verbal and sometimes enforceable by law, such
   * as a service level agreement or a customer price agreement. An agreement
   * involves a number of other business entities, such as products, services, and
   * resources and/or their specifications.
   */
  List<? extends IAgreementItemRef> getAgreements();

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * If true, the product is visible by the customer.
   */
  Boolean getIsCustomerVisible();

  /**
   * Is the date when the product was ordered.
   */
  OffsetDateTime getOrderDate();

  /**
   * List of: Related Entity reference. A related place defines a place described
   * by reference or by value linked to a specific entity. The polymorphic
   * attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place
   * entity and not the RelatedPlaceRefOrValue class itself.
   */
  List<? extends IRelatedPlaceRefOrValue> getPlaces();

  /**
   * List of: A product to be created defined by value or existing defined by
   * reference. The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType
   * are related to the product entity and not the RelatedProductRefOrValue class
   * itself.
   */
  List<? extends IProductRefOrValue> getProducts();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getProductCharacteristics();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * List of: RelatedProductOrderItem (ProductOrder item) .The product order item
   * which triggered product creation/change/termination.
   */
  List<? extends IRelatedProductOrderItem> getProductOrderItems();

  /**
   * List of: An amount, usually of money, that represents the actual price paid
   * by a Customer for a purchase, a rent or a lease of a Product. The price is
   * valid for a defined period of time.
   */
  List<? extends IProductPrice> getProductPrices();

  /**
   * List of: Linked products to the one instantiate, such as [bundled] if the
   * product is a bundle and you want to describe the bundled products inside this
   * bundle; [reliesOn] if the product needs another already owned product to rely
   * on (e.g. an option on an already owned mobile access product) [targets] or
   * [isTargeted] (depending on the way of expressing the link) for any other kind
   * of links that may be useful.
   */
  List<? extends IProductRelationship> getProductRelationships();

  /**
   * Is the serial number for the product. This is typically applicable to
   * tangible products e.g. Broadband Router.
   */
  String getProductSerialNumber();

  /**
   * Product specification reference: A ProductSpecification is a detailed
   * description of a tangible or intangible object made available externally in
   * the form of a ProductOffering to customers or other parties playing a party
   * role.
   */
  IProductSpecificationRef getProductSpecification();

  /**
   * List of: Description of a productTerm linked to this product. This represents
   * a commitment with a duration.
   */
  List<? extends IProductTerm> getProductTerms();

  String getRandomAtt();

  List<? extends IResourceRef> getRealizingResources();

  /**
   * List of: Service reference, for when Service is used by other entities.
   */
  List<? extends IServiceRef> getRealizingServices();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Is the date when the product was terminated.
   */
  OffsetDateTime getTerminationDate();
}
