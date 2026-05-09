package org.opentmf.tmf654.model;

import java.util.List;
import org.opentmf.common.model.IBucketRef;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ILogicalResourceRef;
import org.opentmf.common.model.IPartyAccountRef;
import org.opentmf.common.model.IProductRef;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * The ReserveBalance resource allows adjustments to be made to the original
 * BalanceTopup eg increment the amount, alter the recharge periodicity
 * <br/>Skipped properties:
 * id,href,status,requestedDate,confirmationDate,relatedParty.
 *
 * <p><br/>
 * <strong>Required:</strong> bucket, partyAccount, usageType<br/>
 * </p>
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
public interface IReserveBalanceCreate extends IExtensible {

  /**
   * An amount in a given unit.
   */
  IQuantity getAmount();

  /**
   * link to the resource that holds bucket information.
   */
  IBucketRef getBucket();

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

  /**
   * Description of the recharge operation.
   */
  String getDescription();

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
   * Text describing the reason for the action/task.
   */
  String getReason();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getRequester();

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
