package org.opentmf.tmf654.model;

import org.opentmf.common.model.ITimePeriod;

/**
 * The TransferBalance resource is a detailed description of credit transfer
 * operation requested between two buckets (reference to products owned by
 * customers and consuming credit when using a service).
 * <br/>Skipped properties:
 * id,href,status,requestedDate,confirmationDate,relatedParty,partyAccount.
 *
 * <p><br/>
 * <strong>Required:</strong> amount, bucket, channel, logicalResource, reason, receiverBucket, receiverBucketUsageType, receiverLogicalResource, usageType<br/>
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
public interface ITransferBalanceCreate extends ITransferBalanceUpdate {

  /**
   * Description of the recharge operation.
   */
  String getDescription();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
