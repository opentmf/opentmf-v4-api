package org.opentmf.tmf686.model;

import org.opentmf.common.model.INamedEntity;

/**
 * A relationship between Graphs.
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
public interface IGraphRelationship extends INamedEntity {

  /**
   * Type of relationship such as adjacency, connectivity.
   */
  String getRelationshipType();

  /**
   * The association role for this Graph.
   */
  String getRole();
}
