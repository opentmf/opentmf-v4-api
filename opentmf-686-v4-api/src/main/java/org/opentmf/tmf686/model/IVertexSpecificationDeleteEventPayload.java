package org.opentmf.tmf686.model;

/**
 * The event data structure.
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
public interface IVertexSpecificationDeleteEventPayload {

  /**
   * A Vertex is connected by directed Edges to other vertices in a Graph.
   * <br/>A VertexSpecification is a base class that represents a generic means
   * for implementing a particular type of Vertex. In essence, a
   * VertexSpecification defines the common attributes and relationships of a set
   * of related Vertices, while Vertex defines a specific instance that is based
   * on a particular VertexSpecification.
   */
  IVertexSpecification getVertexSpecification();
}
