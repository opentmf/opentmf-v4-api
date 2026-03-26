package org.opentmf.tmf686.model;

import java.util.List;

/**
 * Merges two or more Graphs into a single graph.
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
public interface IMergeTopologyGraphJobUpdate extends ITopologyDiscoveryJobUpdate {

  IGraphRef getGraphResult();

  /**
   * URI with query string of the Topology GraphIds to be merged.
   */
  List<? extends IGraphRef> getMergeTopologyGraphs();
}
