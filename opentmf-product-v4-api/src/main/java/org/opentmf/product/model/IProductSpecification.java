package org.opentmf.product.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceSpecificationRef;
import org.opentmf.common.model.IServiceSpecificationRef;
import org.opentmf.common.model.ITargetProductSchema;
import org.opentmf.common.model.ITimePeriod;

/**
 * Is a detailed description of a tangible or intangible object made available
 * externally in the form of a ProductOffering to customers or other parties
 * playing a party role.
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
public interface IProductSpecification extends IBundledProductSpecification {

  /**
   * Complements the description of an element (for instance a product) through
   * video, pictures...
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * The manufacturer or trademark of the specification.
   */
  String getBrand();

  /**
   * A type of ProductSpecification that belongs to a grouping of
   * ProductSpecifications made available to the market. It inherits of all
   * attributes of ProductSpecification.
   */
  List<? extends IBundledProductSpecification> getBundledProductSpecifications();

  /**
   * A narrative that explains in detail what the product specification is.
   */
  String getDescription();

  /**
   * isBundle determines whether a productSpecification represents a single
   * productSpecification (false), or a bundle of productSpecification (true).
   */
  Boolean getIsBundle();

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getLastUpdate();

  /**
   * An identification number assigned to uniquely identity the specification.
   */
  String getProductNumber();

  /**
   * A characteristic quality or distinctive feature of a ProductSpecification.
   * The characteristic can be take on a discrete value, such as color, can take
   * on a range of values, (for example, sensitivity of 100-240 mV), or can be
   * derived from a formula (for example, usage time (hrs) = 30 - talk time *3).
   * Certain characteristics, such as color, may be configured during the ordering
   * or some other process.
   */
  List<? extends IProductSpecificationCharacteristic> getProductSpecCharacteristics();

  /**
   * A migration, substitution, dependency or exclusivity relationship
   * between/among product specifications.
   */
  List<? extends IProductSpecificationRelationship> getProductSpecificationRelationships();

  /**
   * A related party defines party or party role linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * The ResourceSpecification is required to realize a ProductSpecification.
   */
  List<? extends IResourceSpecificationRef> getResourceSpecifications();

  /**
   * ServiceSpecification(s) required to realize a ProductSpecification.
   */
  List<? extends IServiceSpecificationRef> getServiceSpecifications();

  /**
   * The reference object to the schema and type of target product which is
   * described by product specification.
   */
  ITargetProductSchema getTargetProductSchema();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Product specification version.
   */
  String getVersion();
}
