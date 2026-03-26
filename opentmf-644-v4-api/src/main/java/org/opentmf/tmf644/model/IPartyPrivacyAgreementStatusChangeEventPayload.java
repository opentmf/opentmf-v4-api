package org.opentmf.tmf644.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyPrivacyAgreementStatusChangeEventPayload {

  /**
   * A specific type of agreement that formalizes the privacy profiles requested
   * for a party.
   */
  IPartyPrivacyAgreement getPartyPrivacyAgreement();
}
