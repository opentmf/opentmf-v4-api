package org.opentmf.tmf632.model;

import java.net.URI;

/**
 * Individual represents a single human being (a man, woman or child). The
 * individual can be a customer, an employee or any other person that the
 * organization needs to store information about.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIndividual extends IIndividualUpdate {

  /**
   * Hyperlink to access the organization.
   */
  URI getHref();

  /**
   * Unique identifier of the organization.
   */
  String getId();
}
