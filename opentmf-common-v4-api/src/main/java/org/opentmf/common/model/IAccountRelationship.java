package org.opentmf.common.model;

/**
 * Significant connection between accounts. For instance an aggregating account
 * for a list of shop branches each having its own billing account.
 *
 * <p><br/>
 * <strong>Required:</strong> relationshipType, validFor<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-666: Account Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAccountRelationship extends IInteractionRelationship {

  /**
   * Account reference. An account may be a party account or a financial account.
   */
  IAccountRef getAccount();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
