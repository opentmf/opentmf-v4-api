package org.opentmf.tmf632.model;

import java.net.URI;

/**
 * Organization represents a group of people identified by shared interests or
 * purpose. Examples include business, department and enterprise. Because of the
 * complex nature of many businesses, both organizations and organization units
 * are represented by the same data.
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
public interface IOrganization extends IOrganizationUpdate {

  /**
   * Hyperlink to access the organization.
   */
  URI getHref();

  /**
   * Unique identifier of the organization.
   */
  String getId();
}
