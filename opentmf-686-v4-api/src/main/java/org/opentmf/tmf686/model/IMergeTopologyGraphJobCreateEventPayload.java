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
public interface IMergeTopologyGraphJobCreateEventPayload {

  /**
   * Merges two or more Graphs into a single graph.
   */
  IMergeTopologyGraphJob getMergeTopologyGraphJob();
}
