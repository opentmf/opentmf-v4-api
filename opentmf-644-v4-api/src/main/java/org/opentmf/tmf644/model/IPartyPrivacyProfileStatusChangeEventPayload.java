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
public interface IPartyPrivacyProfileStatusChangeEventPayload {

  /**
   * A Party Privacy Profile represents the set of Privacy settings defined for a
   * Party.
   */
  IPartyPrivacyProfile getPartyPrivacyProfile();
}
