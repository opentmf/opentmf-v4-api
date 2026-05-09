package org.opentmf.tmf677.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IPartyAccountRef;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IReserveBalanceRef;
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
 *   <li>TMF-677: Usage Consumption Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IBucketRefOrValue extends INamedEntity {

  /**
   * List of: The consumption counters (called ConsumptionSummary in the SID
   * model) detail for example the different kind of consumption done on the
   * bucket.
   */
  List<? extends IConsumptionSummary> getBucketCounters();

  /**
   * List of: Linked bucket to the one instantiate, such as [isAggregated] if the
   * bucket is a part of other or [aggregator] is the bucket holds others.
   */
  List<? extends IBucketRelationship> getBucketRelationships();

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
  List<? extends IUsageConsumptionLogicalResourceRef> getLogicalResources();

  /**
   * PartyAccount reference. A party account is an arrangement that a party has
   * with an enterprise that provides products to the party.
   */
  IPartyAccountRef getPartyAccount();

  List<? extends IUsageConsumptionProductRef> getProducts();

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
   * List of: The ReserveBalance resource allows adjustments to be made to the
   * original BalanceTopup eg increment the amount, alter the recharge
   * periodicity.
   */
  List<? extends IReserveBalanceRef> getReserveBalances();

  /**
   * An amount in a given unit.
   */
  IQuantity getReservedValue();

  /**
   * List of: Service reference, for when Service is used by other entities.
   */
  List<? extends IUsageConsumptionServiceRef> getServices();

  /**
   * status for the bucket. active, expired, suspended.
   */
  String getStatus();

  /**
   * defines the type of the underlying Balance eg data,voice, any currency eg
   * EUR, USD etc.
   */
  String getUsageType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
