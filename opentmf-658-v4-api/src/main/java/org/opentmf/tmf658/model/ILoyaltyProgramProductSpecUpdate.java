package org.opentmf.tmf658.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceSpecificationCreateBase;
import org.opentmf.common.model.IResourceSpecificationRef;
import org.opentmf.common.model.IServiceSpecificationRef;
import org.opentmf.common.model.ITargetProductSchema;
import org.opentmf.product.model.IBundledProductSpecification;
import org.opentmf.product.model.IProductSpecificationCharacteristic;
import org.opentmf.product.model.IProductSpecificationRelationship;

/**
 * A reference to a loyalty program specification.
 * <br/>Skipped properties: id,href,needsLoyaltyAccount.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyProgramProductSpecUpdate extends IResourceSpecificationCreateBase {

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
   * The condition of the product specification, such as active, inactive,
   * planned.
   */
  String getLifeCycleStatus();

  /**
   * Collection of Rules.
   */
  List<? extends ILoyaltyRule> getLoyaltyRules();

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
}
