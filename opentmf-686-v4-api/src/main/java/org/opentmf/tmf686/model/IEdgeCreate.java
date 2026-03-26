package org.opentmf.tmf686.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.general.model.IEdgeCreateBase;

/**
 * Edge is a directed edge connecting vertices in a directed Graph.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> graph, name<br/>
 * </p>
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
public interface IEdgeCreate extends IEdgeCreateBase {

  /**
   * Indicates if this Edge is birectional (true) or unidirection originating from
   * the first vertex (false).
   */
  Boolean getBidirectional();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getEdgeCharacteristics();

  /**
   * A directed Edge connects Vertices in a Graph.
   * <br/>An EdgeSpecification is a base class that represents a generic means for
   * implementing a particular type of Edge. In essence, an EdgeSpecification
   * defines the common attributes and relationships of a set of related Edges,
   * while Edge defines a specific instance that is based on a particular
   * EdgeSpecification.
   */
  IEdgeSpecificationRef getEdgeSpecification();

  IGraphRef getGraph();

  IGraphRef getSubGraph();

  /**
   * Graph Vertices connected by this Edge.
   */
  List<? extends IVertexRef> getVertexes();
}
