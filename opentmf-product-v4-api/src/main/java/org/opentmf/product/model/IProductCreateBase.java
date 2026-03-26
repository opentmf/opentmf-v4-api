package org.opentmf.product.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductPrice;
import org.opentmf.common.model.IProductRelationship;
import org.opentmf.common.model.IProductSpecificationRef;
import org.opentmf.common.model.IProductTerm;
import org.opentmf.common.model.IResourceRef;
import org.opentmf.common.model.IServiceRef;

/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-637: Product Inventory Management API</li>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductCreateBase extends IExtensible {

  /**
   * An explanation of what the product is.
   */
  String getDescription();

  /**
   * If true, the product is a ProductBundle which is an instantiation of a
   * BundledProductOffering. If false, the product is a ProductComponent which is
   * an instantiation of a SimpleProductOffering.
   */
  Boolean getIsBundle();

  /**
   * If true, the product is visible by the customer.
   */
  Boolean getIsCustomerVisible();

  /**
   * A word, term, or phrase by which the product is known and distinguished from
   * other products.
   */
  String getName();

  /**
   * Is the date when the product was ordered.
   */
  OffsetDateTime getOrderDate();

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

  List<? extends IResourceRef> getRealizingResources();

  /**
   * List of: Service reference, for when Service is used by other entities.
   */
  List<? extends IServiceRef> getRealizingServices();

  /**
   * Possible values for the status of the product
   * <br/><p>Recommended values: created, pendingActive, cancelled, active,
   * pendingTerminate, terminated, suspended, aborted.
   */
  String getStatus();

  /**
   * Is the date when the product was terminated.
   */
  OffsetDateTime getTerminationDate();
}
