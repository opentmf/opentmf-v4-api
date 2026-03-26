package org.opentmf.common.model;


/**
 * PartyAccount reference. A party account is an arrangement that a party has
 * with an enterprise that provides products to the party.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 *   <li>TMF-677: Usage Consumption Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyAccountRef extends IEntityRef {

  /**
   * Detailed description of the party account.
   */
  String getDescription();

  /**
   * The condition of the account, such as due, paid, in arrears.
   */
  String getStatus();
}
