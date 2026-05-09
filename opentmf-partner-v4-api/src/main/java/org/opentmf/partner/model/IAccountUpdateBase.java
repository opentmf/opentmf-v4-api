package org.opentmf.partner.model;

import java.util.List;
import org.opentmf.common.model.IAccountRelationship;
import org.opentmf.common.model.IBillPresentationMediaUpdate;
import org.opentmf.common.model.IContact;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IRelatedParty;

/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>BillingAccountUpdate (666)</li>
 *   <li>FinancialAccountUpdate (666)</li>
 *   <li>PartyAccountUpdate (666)</li>
 *   <li>SettlementAccountUpdate (666)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAccountUpdateBase extends IBillPresentationMediaUpdate {

  /**
   * List of: Significant connection between accounts. For instance an aggregating
   * account for a list of shop branches each having its own billing account.
   */
  List<? extends IAccountRelationship> getAccountRelationships();

  /**
   * A categorization of an account, such as individual, joint, and so forth,
   * whose instances share some of the same characteristics. Note: for flexibility
   * we use a String here but an implementation may use an enumeration with a
   * limited list of valid values.
   */
  String getAccountType();

  /**
   * List of: An individual or an organization used as a contact point for a given
   * account and accessed via some contact medium.
   */
  List<? extends IContact> getContacts();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getCreditLimit();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Contains the lifecycle state such as: Active, Closed, Suspended and so on.
   */
  String getState();
}
