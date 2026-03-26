package org.opentmf.tmf654.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IPartyAccountRef;
import org.opentmf.common.model.IRelatedParty;

/**
 * The TransferBalance resource is a detailed description of credit transfer
 * operation requested between two buckets (reference to products owned by
 * customers and consuming credit when using a service).
 *
 * <p><br/>
 * <strong>Required:</strong> channel, href, id, logicalResource, reason, receiverLogicalResource, status<br/>
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
public interface ITransferBalance extends ITransferBalanceCreate {

  /**
   * Date when the deduction was confirmed in the server.
   */
  OffsetDateTime getConfirmationDate();

  /**
   * A reference to the resource.
   */
  URI getHref();

  /**
   * Unique Identifier for the resource.
   */
  String getId();

  /**
   * PartyAccount reference. A party account is an arrangement that a party has
   * with an enterprise that provides products to the party.
   */
  IPartyAccountRef getPartyAccount();

  /**
   * Used to provide information about any other entity with relation to the
   * operation.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Date when the deduction request was received in the server.
   */
  OffsetDateTime getRequestedDate();

  /**
   * Valid values for the Action Status Type
   * <br/><p>Recommended values: created, failed, cancelled, completed.
   */
  String getStatus();
}
