package org.opentmf.tmf644.model;

import java.time.OffsetDateTime;

/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a
 * Party
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> agreedByParty, partyPrivacyProfileCharacteristic, partyPrivacyProfileSpecification<br/>
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
public interface IPartyPrivacyProfileCreate extends IPartyPrivacyProfileUpdate {

  /**
   * The date on which the PartyPrivacyProfile was created.
   */
  OffsetDateTime getCreationDate();
}
