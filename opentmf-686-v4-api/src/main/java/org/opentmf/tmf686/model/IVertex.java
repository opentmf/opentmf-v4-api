package org.opentmf.tmf686.model;

import java.net.URI;

/**
 * A Vertex is connected by directed Edges to other vertices in a Graph.
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
public interface IVertex extends IVertexUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
