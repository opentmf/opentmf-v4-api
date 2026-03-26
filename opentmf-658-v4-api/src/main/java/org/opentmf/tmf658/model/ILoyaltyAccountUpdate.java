package org.opentmf.tmf658.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAccountBalance;
import org.opentmf.common.model.IAccountRelationship;
import org.opentmf.common.model.IContact;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITaxExemptionCertificate;

/**
 * A loyalty account, containing loyalty balances.
 * <br/>Skipped properties: id,href.
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
public interface ILoyaltyAccountUpdate extends IExtensible {

  /**
   * List of: Balances linked to the account.
   */
  List<? extends IAccountBalance> getAccountBalances();

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
   * Detailed description of the party account.
   */
  String getDescription();

  /**
   * Date of last modification of the account.
   */
  OffsetDateTime getLastModified();

  ILoyaltyProgramProductRef getLoyaltyProgramProduct();

  /**
   * Name of the account.
   */
  String getName();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Contains the lifecycle state such as: Active, Closed, Suspended and so on.
   */
  String getState();

  /**
   * List of: A tax exemption certificate represents a tax exemption granted to a
   * party (individual or organization) by a tax jurisdiction which may be a city,
   * state, country,... An exemption has a certificate identifier (received from
   * the jurisdiction that levied the tax) and a validity period. An exemption is
   * per tax types and determines for each type of tax what portion of the tax is
   * exempted (partial by percentage or complete) via the tax definition.
   */
  List<? extends ITaxExemptionCertificate> getTaxExemptions();
}
