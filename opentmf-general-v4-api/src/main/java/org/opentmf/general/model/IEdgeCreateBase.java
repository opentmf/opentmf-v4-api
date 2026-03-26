package org.opentmf.general.model;

import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;

/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-686: Topology API</li>
 *   <li>TMF-general: general</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEdgeCreateBase extends IExtensible {

  /**
   * Description of this REST resource.
   */
  String getDescription();

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getEntity();

  /**
   * Name given to this REST resource.
   */
  String getName();
}
