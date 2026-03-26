package org.opentmf.tmf714.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * QueryWorkQualification is used to retrieve a list of units of work that are
 * valid in the context of the interaction
 * <br/>Skipped properties: id,href,queryWorkQualificationDate.
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
public interface IQueryWorkQualificationUpdate extends IQueryWorkQualificationCreate {

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
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();

  /**
   * List of: A WorkQualificationItem relates to a specific unit of work being
   * checked in a qualification operation.
   */
  List<? extends IWorkQualificationItem> getWorkQualificationItems();
}
