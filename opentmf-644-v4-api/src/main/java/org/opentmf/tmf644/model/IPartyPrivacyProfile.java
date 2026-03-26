package org.opentmf.tmf644.model;

import java.net.URI;

/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a
 * Party.
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
public interface IPartyPrivacyProfile extends IPartyPrivacyProfileCreate {

  /**
   * URI reference of the privacy profile allowing navigation to the resource.
   */
  URI getHref();

  /**
   * Unique identifier of the privacy profile.
   */
  String getId();
}
