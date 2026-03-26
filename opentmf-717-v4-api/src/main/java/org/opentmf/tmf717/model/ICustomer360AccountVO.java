package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAccountRelationship;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.INamedEntity;

/**
 * Generic Account structure used to define commonalities between sub concepts
 * of PartyAccount and Financial Account.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
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
public interface ICustomer360AccountVO extends INamedEntity {

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

  /**
   * Contains the lifecycle state such as: Active, Closed, Suspended and so on.
   */
  String getState();
}
