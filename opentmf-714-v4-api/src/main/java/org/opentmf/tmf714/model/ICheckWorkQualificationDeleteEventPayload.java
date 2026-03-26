package org.opentmf.tmf714.model;

/**
 * The event data structure.
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
public interface ICheckWorkQualificationDeleteEventPayload {

  /**
   * CheckWorkQualification is used to validate specific units of work.
   */
  ICheckWorkQualification getCheckWorkQualification();
}
