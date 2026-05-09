package org.opentmf.tmf686.model;

import java.util.List;
import org.opentmf.common.model.IGraphRef;
import org.opentmf.common.model.IVertexRef;

/**
 * Represents a task used to query topology in the service
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
public interface ITopologyQueryJobUpdate extends ITopologyDiscoveryJobUpdate {

  /**
   * The topology graph(s) created by the query.
   */
  List<? extends IGraphRef> getGraphResults();

  IGraphRef getGraphSource();

  /**
   * Graph is a directed graph representing edges connecting vertices.
   */
  IGraph getGraphTemplate();

  /**
   * Pattern to search for in graph.
   */
  List<? extends IJSONPathQueryJsonLdExpression> getQueryMatches();

  /**
   * The vertices result of the query.
   */
  List<? extends IVertexRef> getVertexResults();
}
