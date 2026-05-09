package org.opentmf.resource.model;

import org.opentmf.common.model.ICharacteristicRelationship;
import org.opentmf.common.model.IResourceGraphRef;

/**
 * Describes links between resource graphs.
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
public interface IResourceGraphRelationship extends ICharacteristicRelationship {

  /**
   * Resource graph reference.
   */
  IResourceGraphRef getResourceGraph();
}
