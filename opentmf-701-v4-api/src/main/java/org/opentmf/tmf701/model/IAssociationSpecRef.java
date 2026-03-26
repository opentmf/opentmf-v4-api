package org.opentmf.tmf701.model;

import org.opentmf.common.model.IEntity;

/**
 * reference to an AssociationSpecification object.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-701: Process Flow Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAssociationSpecRef extends IEntity {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
