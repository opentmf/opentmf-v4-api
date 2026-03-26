package org.opentmf.tmf654.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IPartyAccountRef;
import org.opentmf.common.model.IProductRef;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * A bucket (called UsageVolumProduct in the SID Model) represents and tracks a
 * quantity of usage (remaining or consumed). It could be either a quantity or
 * an amount in a currency. It can represent a fixed number of SMS,MMS, call
 * minutes, quantity of data and so on.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IBucket extends INamedEntity {

  /**
   * Date when the deduction was confirmed in the server.
   */
  OffsetDateTime getConfirmationDate();

  /**
   * Text describing the contents of the balance managed by the bucket.
   */
  String getDescription();

  /**
   * True if the bucket is shared between several devices or users.
   */
  Boolean getIsShared();

  /**
   * List of: reference to the LogicalResource eg MSISDN.
   */
  List<? extends ILogicalResourceRef> getLogicalResources();

  /**
   * PartyAccount reference. A party account is an arrangement that a party has
   * with an enterprise that provides products to the party.
   */
  IPartyAccountRef getPartyAccount();

  List<? extends IProductRef> getProducts();

  /**
   * Used to provide information about any other entity with relation to the
   * balance, for instance to define customer hierarchy for the balance (e.g.:
   * customerId, userId, ).
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * An amount in a given unit.
   */
  IQuantity getRemainingValue();

  /**
   * Remaining amount in a formatted string for the bucket given in the balance
   * unit (for example 1.9 Gb). This formatted string could be used for display
   * needs for example.
   */
  String getRemainingValueName();

  /**
   * Date when the deduction request was received in the server.
   */
  OffsetDateTime getRequestedDate();

  /**
   * An amount in a given unit.
   */
  IQuantity getReservedValue();

  /**
   * Valid values for the Balance Status Type
   * <br/><p>Recommended values: active, suspended, expired.
   */
  String getStatus();

  /**
   * Valid values for the usage type are
   * <br/><p>Recommended values: monetary, voice, data, sms, other.
   */
  String getUsageType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
