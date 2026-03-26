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
public interface IPartyPrivacyProfileSpecificationAttributeValueChangeEventPayload {

  /**
   * Party Privacy Profile Specification serves as a template for creating Privacy
   * Profiles. The specification defines characteristics for the profile. For
   * example there might be a profile specification for residential customers, and
   * a different specification for partners.
   */
  IPartyPrivacyProfileSpecification getPartyPrivacyProfileSpecification();
}
