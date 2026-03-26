package org.opentmf.tmf654.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IRelatedParty;

/**
 * Represents a detailed description of a recharge operation requested over a
 * bucket (defined by a specific product or reference to a product (i.e.: a
 * commercial id such as an msisidn) and a service type)
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> status<br/>
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
public interface ITopupBalanceUpdate extends ITopupBalanceCreate {

  /**
   * Date when the deduction was confirmed in the server.
   */
  OffsetDateTime getConfirmationDate();

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
