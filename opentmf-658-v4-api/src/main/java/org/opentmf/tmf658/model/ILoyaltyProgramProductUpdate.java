package org.opentmf.tmf658.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAgreementItemRef;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.ILoyaltyAccountRef;
import org.opentmf.common.model.ILoyaltyProgramProductSpecRef;
import org.opentmf.common.model.IProductCreateBase;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.IRelatedProductOrderItem;
import org.opentmf.common.model.ITimePeriod;

/**
 * An instance of a loyalty program specification, linked to a specified loyalty
 * member.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> loyaltyAccount, loyaltyProgramMember, loyaltyProgramProductSpec, name, validFor<br/>
 * </p>
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
public interface ILoyaltyProgramProductUpdate extends IProductCreateBase {

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
   * Name value pairs of product characteristics.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * Reference to a loyalty account.
   */
  ILoyaltyAccountRef getLoyaltyAccount();

  /**
   * A person or group that opts in to a loyalty program.
   */
  ILoyaltyProgramMember getLoyaltyProgramMember();

  ILoyaltyProgramProductSpecRef getLoyaltyProgramProductSpec();

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
   * List of: RelatedProductOrderItem (ProductOrder item) .The product order item
   * which triggered product creation/change/termination.
   */
  List<? extends IRelatedProductOrderItem> getProductOrderItems();

  /**
   * The condition of the product, such as planned, designed, activated,
   * disconnected.
   */
  String getProductStatus();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Is the date from which the product starts.
   */
  OffsetDateTime getStartDate();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
