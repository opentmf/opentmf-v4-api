package org.opentmf.tmf658.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ILoyaltyProgramMemberRef;
import org.opentmf.common.model.ILoyaltyProgramProductRef;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IUsageSpecificationRef;
import org.opentmf.product.model.IRatedProductUsage;
import org.opentmf.product.model.IUsageCharacteristic;

/**
 * A specialised event to process direct loyalty points earnings.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, loyaltyProgramMember, loyaltyProgramProduct, quantity<br/>
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
public interface ILoyaltyEarnCreate extends IExtensible {

  /**
   * A description detailing the earn event.
   */
  String getDescription();

  ILoyaltyProgramMemberRef getLoyaltyProgramMember();

  ILoyaltyProgramProductRef getLoyaltyProgramProduct();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getQuantity();

  /**
   * List of: An occurrence of employing a product for its intended purpose with
   * all rating details.
   */
  List<? extends IRatedProductUsage> getRatedProductUsages();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Possible values for the status of the Usage
   * <br/><p>Recommended values: received, rejected, recycled, guided, rated,
   * rerated, billed.
   */
  String getStatus();

  /**
   * List of: Provides the value of a given characteristic.
   */
  List<? extends IUsageCharacteristic> getUsageCharacteristics();

  /**
   * Date of usage.
   */
  OffsetDateTime getUsageDate();

  /**
   * UsageSpecification reference. UsageSpecification is a detailed description of
   * a usage event that are of interest to the business and can have charges
   * applied to it. It is comprised of characteristics, which define all
   * attributes known for a particular type of usage.
   */
  IUsageSpecificationRef getUsageSpecification();

  /**
   * Type of usage.
   */
  String getUsageType();
}
