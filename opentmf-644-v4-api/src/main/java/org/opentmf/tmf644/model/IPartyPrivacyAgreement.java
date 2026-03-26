package org.opentmf.tmf644.model;

import java.net.URI;

/**
 * A specific type of agreement that formalizes the privacy profiles requested
 * for a party.
 *
 * <p><br/>
 * <strong>Required:</strong> agreementItem, agreementType, engagedParty, name<br/>
 * </p>
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
public interface IPartyPrivacyAgreement extends IPartyPrivacyAgreementUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
