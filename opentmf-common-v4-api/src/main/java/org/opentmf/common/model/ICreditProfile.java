package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Credit profile for the party (containing credit scoring, ...). By default,
 * only the current credit profile is retrieved. It can be used as a list to
 * give the party credit profiles history, the first one in the list will be the
 * current one.
 *
 * <p><br/>
 * <strong>Required:</strong> creditProfileDate, validFor<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-629: Customer Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-668: Partnership Type</li>
 *   <li>TMF-669: Party Role Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICreditProfile extends IEntity {

  /**
   * The date the profile was established.
   */
  OffsetDateTime getCreditProfileDate();

  /**
   * This is an integer whose value is used to rate the risk.
   */
  Integer getCreditRiskRating();

  /**
   * A measure of a person or organizations creditworthiness calculated on the
   * basis of a combination of factors such as their income and credit history.
   */
  Integer getCreditScore();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
