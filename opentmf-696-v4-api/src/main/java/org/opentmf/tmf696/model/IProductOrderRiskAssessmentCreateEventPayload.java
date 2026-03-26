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
public interface IProductOrderRiskAssessmentCreateEventPayload {

  /**
   * This is a task resource allowing assessment of the risks associated with a
   * product order - presumably submitted by a party role and containing one or
   * more product offerings.
   */
  IProductOrderRiskAssessment getProductOrderRiskAssessment();
}
