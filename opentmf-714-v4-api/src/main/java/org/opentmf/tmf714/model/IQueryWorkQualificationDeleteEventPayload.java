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
public interface IQueryWorkQualificationDeleteEventPayload {

  /**
   * QueryWorkQualification is used to retrieve a list of units of work that are
   * valid in the context of the interaction.
   */
  IQueryWorkQualification getQueryWorkQualification();
}
