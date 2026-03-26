package org.opentmf.tmf686.model;

import java.net.URI;

/**
 * Edge is a directed edge connecting vertices in a directed Graph.
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
public interface IEdge extends IEdgeUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
