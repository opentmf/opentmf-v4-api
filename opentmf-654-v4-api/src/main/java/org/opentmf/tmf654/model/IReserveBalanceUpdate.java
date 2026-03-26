package org.opentmf.tmf654.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IRelatedParty;

/**
 * The ReserveBalance resource allows adjustments to be made to the original
 * BalanceTopup eg increment the amount, alter the recharge periodicity
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> reason, status<br/>
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
public interface IReserveBalanceUpdate extends IReserveBalanceCreate {

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
