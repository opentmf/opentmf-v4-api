package org.opentmf.tmf620.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.IAgreementRef;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IMarketSegmentRef;
import org.opentmf.common.model.IPlaceRef;
import org.opentmf.common.model.IProductOfferingUpdateBase;
import org.opentmf.common.model.IProductSpecificationRef;
import org.opentmf.common.model.IResourceCandidateRef;
import org.opentmf.common.model.ISLARef;
import org.opentmf.common.model.IServiceCandidateRef;

/**
 * Represents entities that are orderable from the provider of the catalog, this
 * resource includes pricing information.
 * <br/>Skipped properties: id,href,lastUpdate,{@literal @}type,{@literal @}baseType.
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
public interface IProductOfferingUpdate extends IProductOfferingUpdateBase {

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * An agreement represents a contract or arrangement, either written or verbal
   * and sometimes enforceable by law, such as a service level agreement or a
   * customer price agreement. An agreement involves a number of other business
   * entities, such as products, services, and resources and/or their
   * specifications.
   */
  List<? extends IAgreementRef> getAgreements();

  /**
   * Complements the description of an element (for instance a product) through
   * video, pictures...
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * A type of ProductOffering that belongs to a grouping of ProductOfferings made
   * available to the market. It inherits of all attributes of ProductOffering.
   */
  List<? extends IBundledProductOffering> getBundledProductOfferings();

  /**
   * The category resource is used to group product offerings, service and
   * resource candidates in logical containers. Categories can contain other
   * categories and/or product offerings, resource or service candidates.
   */
  List<? extends ICategoryRef> getCategories();

  /**
   * The channel defines the channel for selling product offerings.
   */
  List<? extends IChannelRef> getChannels();

  /**
   * A flag indicating if this product offer can be sold stand-alone for sale or
   * not. If this flag is false it indicates that the offer can only be sold
   * within a bundle.
   */
  Boolean getIsSellable();

  /**
   * provides references to the corresponding market segment as target of product
   * offerings. A market segment is grouping of Parties, GeographicAreas,
   * SalesChannels, and so forth.
   */
  List<? extends IMarketSegmentRef> getMarketSegments();

  /**
   * Place defines the places where the products are sold or delivered.
   */
  List<? extends IPlaceRef> getPlaces();

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
   */
  List<? extends IProductSpecificationCharacteristicValueUse> getProdSpecCharValueUses();

  /**
   * An amount, usually of money, that is asked for or allowed when a
   * ProductOffering is bought, rented, or leased. The price is valid for a
   * defined period of time and may not represent the actual price paid by a
   * customer.
   */
  List<? extends IProductOfferingPriceRefOrValue> getProductOfferingPrices();

  /**
   * A relationship between this product offering and other product offerings.
   */
  List<? extends IProductOfferingRelationship> getProductOfferingRelationships();

  /**
   * A condition under which a ProductOffering is made available to Customers. For
   * instance, a productOffering can be offered with multiple commitment periods.
   */
  List<? extends IProductOfferingTerm> getProductOfferingTerms();

  /**
   * Product specification reference: A ProductSpecification is a detailed
   * description of a tangible or intangible object made available externally in
   * the form of a ProductOffering to customers or other parties playing a party
   * role.
   */
  IProductSpecificationRef getProductSpecification();

  /**
   * ResourceCandidate is an entity that makes a resource specification available
   * to a catalog. A ResourceCandidate and its associated resource specification
   * may be published - made visible - in any number of resource catalogs, or in
   * none.
   */
  IResourceCandidateRef getResourceCandidate();

  /**
   * ServiceCandidate reference. ServiceCandidate is an entity that makes a
   * ServiceSpecification available to a catalog.
   */
  IServiceCandidateRef getServiceCandidate();

  /**
   * ServiceLevelAgreement reference: A service level agreement (SLA) is a type of
   * agreement that represents a formal negotiated agreement between two parties
   * designed to create a common understanding about products, services,
   * priorities, responsibilities, and so forth. The SLA is a set of appropriate
   * procedures and targets formally or informally agreed between parties in order
   * to achieve and maintain specified Quality of Service.
   */
  ISLARef getServiceLevelAgreement();

  /**
   * A string providing a complementary information on the value of the lifecycle
   * status attribute.
   */
  String getStatusReason();
}
