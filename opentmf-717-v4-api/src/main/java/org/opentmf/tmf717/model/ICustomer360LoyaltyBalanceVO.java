package org.opentmf.tmf717.model;

import org.opentmf.common.model.IAddressable;
import org.opentmf.common.model.ILoyaltyProgramMemberRef;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.ITimePeriod;

/**
 * A loyalty balance, containing a balance unit and value.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360LoyaltyBalanceVO extends IAddressable {

  ILoyaltyProgramMemberRef getLoyaltyProgramMember();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getQuantity();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
