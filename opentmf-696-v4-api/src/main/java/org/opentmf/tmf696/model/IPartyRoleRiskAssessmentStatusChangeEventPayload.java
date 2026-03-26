package org.opentmf.tmf696.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-696: Risk Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyRoleRiskAssessmentStatusChangeEventPayload {

  /**
   * This is a task resource allowing assessment of the risks associated with a
   * party role.
   */
  IPartyRoleRiskAssessment getPartyRoleRiskAssessment();
}
