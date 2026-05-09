package org.opentmf.general.model;

import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IGraphRef;

/**
 * Synthesized abstract parent for 6 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>EdgeCreate (686)</li>
 *   <li>EdgeUpdate (686)</li>
 *   <li>VertexCreate (686)</li>
 *   <li>VertexUpdate (686)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEdgeBase extends IExtensible {

  /**
   * Description of this REST resource.
   */
  String getDescription();

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getEntity();

  IGraphRef getGraph();

  /**
   * Name given to this REST resource.
   */
  String getName();

  IGraphRef getSubGraph();
}
