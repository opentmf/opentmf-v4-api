package org.opentmf.tmf652.model;

import org.opentmf.common.model.IEntity;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceOrderRef extends IEntity {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
