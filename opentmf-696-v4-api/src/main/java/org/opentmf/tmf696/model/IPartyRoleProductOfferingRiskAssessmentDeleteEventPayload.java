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
public interface IPartyRoleProductOfferingRiskAssessmentDeleteEventPayload {

  /**
   * This is a task resource allowing assessment of the risks associated with a
   * party or party role that considers acquiring a specific product offering.
   */
  IPartyRoleProductOfferingRiskAssessment getPartyRoleProductOfferingRiskAssessment();
}
