package org.opentmf.common.model;


/**
 * An individual might be evaluated for its worthiness and this evaluation might
 * be based on a credit rating given by a credit agency.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyCreditProfile extends IEntity {

  /**
   * Name of the credit agency giving the score.
   */
  String getCreditAgencyName();

  /**
   * Type of the credit agency giving the score.
   */
  String getCreditAgencyType();

  /**
   * Reference corresponding to the credit rating.
   */
  String getRatingReference();

  /**
   * A measure of a party’s creditworthiness calculated on the basis of a
   * combination of factors such as their income and credit history.
   */
  Integer getRatingScore();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
