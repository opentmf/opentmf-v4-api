package org.opentmf.tmf655.model;

import org.opentmf.common.model.IEntity;

/**
 * Reference to a Change Request.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-655: Change Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IChangeRequestRef extends IEntity {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
