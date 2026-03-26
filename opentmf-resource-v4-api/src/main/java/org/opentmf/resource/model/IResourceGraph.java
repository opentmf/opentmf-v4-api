package org.opentmf.resource.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;

/**
 * Resource graph.
 *
 * <p><br/>
 * <strong>Required:</strong> connection<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceGraph extends INamedEntity {

  /**
   * Resource graph edges.
   */
  List<? extends IConnection> getConnections();

  /**
   * Description of the resource graph.
   */
  String getDescription();

  /**
   * Relationships to other resource graphs.
   */
  List<? extends IResourceGraphRelationship> getGraphRelationships();
}
