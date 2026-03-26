package org.opentmf.tmf686.model;

import java.net.URI;

/**
 * Represents a task used to discover topology from providers.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-686: Topology API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITopologyDiscoveryJob extends ITopologyDiscoveryJobUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
