package org.opentmf.tmf686.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IEdgeRef;
import org.opentmf.general.model.IEdgeBase;

/**
 * A Vertex is connected by directed Edges to other vertices in a Graph.
 * <br/>Skipped properties: id,href.
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
public interface IVertexUpdate extends IEdgeBase {

  /**
   * Directed Edges which this Vertex is connected by. (optional, read only).
   */
  List<? extends IEdgeRef> getEdges();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getVertexCharacteristics();

  /**
   * A Vertex is connected by directed Edges to other vertices in a Graph.
   * <br/>A VertexSpecification is a base class that represents a generic means
   * for implementing a particular type of Vertex. In essence, a
   * VertexSpecification defines the common attributes and relationships of a set
   * of related Vertices, while Vertex defines a specific instance that is based
   * on a particular VertexSpecification.
   */
  IVertexSpecificationRef getVertexSpecification();
}
