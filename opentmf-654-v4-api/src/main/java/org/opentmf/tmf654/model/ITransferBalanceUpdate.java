package org.opentmf.tmf654.model;

import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IProductRef;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;

/**
 * The TransferBalance resource is a detailed description of credit transfer
 * operation requested between two buckets (reference to products owned by
 * customers and consuming credit when using a service).
 * <br/>Skipped properties:
 * id,href,status,requestedDate,confirmationDate,validFor,description,partyAccount,relatedParty.
 *
 * <p><br/>
 * <strong>Required:</strong> channel, logicalResource, reason, receiverLogicalResource<br/>
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
public interface ITransferBalanceUpdate extends IExtensible {

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
   * Valid values for this type
   * <br/><p>Recommended values: originator, receiver.
   */
  String getCostOwner();

  /**
   * List of: reference to the LogicalResource eg MSISDN.
   */
  List<? extends ILogicalResourceRef> getLogicalResources();

  List<? extends IProductRef> getProducts();

  /**
   * Text describing the reason for the action/task.
   */
  String getReason();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getReceiver();

  /**
   * link to the resource that holds bucket information.
   */
  IBucketRef getReceiverBucket();

  /**
   * Valid values for the usage type are
   * <br/><p>Recommended values: monetary, voice, data, sms, other.
   */
  String getReceiverBucketUsageType();

  /**
   * reference to the LogicalResource eg MSISDN.
   */
  ILogicalResourceRef getReceiverLogicalResource();

  IProductRef getReceiverProduct();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getRequester();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTransferCost();

  /**
   * Valid values for the usage type are
   * <br/><p>Recommended values: monetary, voice, data, sms, other.
   */
  String getUsageType();
}
