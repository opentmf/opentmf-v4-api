package org.opentmf.tmf714.model;

import java.time.OffsetDateTime;

/**
 * CheckWorkQualification is used to validate specific units of work
 * <br/>Skipped properties: id,href,checkWorkQualificationDate.
 *
 * <p><br/>
 * <strong>Required:</strong> workQualificationItem<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICheckWorkQualificationUpdate extends ICheckWorkQualificationCreate {

  /**
   * Effective date to qualification completion.
   */
  OffsetDateTime getEffectiveQualificationDate();

  /**
   * Date when the requester expect to provide an answer for the qualification
   * request.
   */
  OffsetDateTime getEstimatedResponseDate();

  /**
   * Date when the qualification response expires.
   */
  OffsetDateTime getExpirationDate();

  /**
   * Qualification result for this workQualification. It could be: qualified (all
   * qualification item are qualified), alternate (At least one item alternate and
   * no item with unqualified), unqualified (At least one item unqualified).
   */
  String getQualificationResult();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
