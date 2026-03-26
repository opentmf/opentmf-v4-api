package org.opentmf.tmf730.model;

import java.net.URI;

/**
 * A base class used to define the invariant characteristics and behavior
 * (attributes, constraints, and relationships) of an API.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAPISpecification extends ISoftwareResourceSpecification {

  /**
   * API protocol type like REST, SOAP and so on.
   */
  String getApiProtocolType();

  /**
   * The authentication scheme used for this API.
   */
  String getAuthenticationType();

  /**
   * The external API schema of the (external) URL offered to the client of this
   * API.
   */
  URI getExternalSchema();

  /**
   * The URL of an API offered to the user. This is seen as external url for an
   * API brokerage.
   */
  URI getExternalUrl();

  /**
   * The internal API schema of the (internal) URL which an API broker uses.
   */
  URI getInternalSchema();

  /**
   * The URL of an API offered to an API brokerage.
   */
  URI getInternalUrl();
}
