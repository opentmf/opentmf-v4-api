package org.opentmf.tmf724.model;

import java.net.URI;

/**
 * An Incident is a record of an event that has altered the operational state of
 * a entity (Resource, Service or Customers Product). An incident represents an
 * issue that needs to be diagnosed and resolved.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-724: Incident Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIncident extends IIncidentCreate {

  /**
   * Hyperlink, a reference to the incident entity.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
