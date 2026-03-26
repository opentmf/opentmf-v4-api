package org.opentmf.tmf686.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * Graph is a directed graph representing edges connecting vertices.
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
public interface IGraphUpdate extends IExtensible {

  /**
   * Description of this REST resource.
   */
  String getDescription();

  /**
   * Graph edge collection reference.
   */
  IEdgeCollectionRef getEdge();

  /**
   * Relationship to another Graph.
   */
  List<? extends IGraphRelationship> getGraphRelationships();

  /**
   * Name given to this REST resource.
   */
  String getName();

  /**
   * Graph vertex collection reference.
   */
  IVertexCollectionRef getVertex();
}
