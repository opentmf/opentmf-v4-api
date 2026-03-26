package org.opentmf.tmf658.model;

import org.opentmf.common.model.IAccount;

/**
 * A loyalty account, containing loyalty balances.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface ILoyaltyAccount extends IAccount {

  ILoyaltyProgramProductRef getLoyaltyProgramProduct();
}
