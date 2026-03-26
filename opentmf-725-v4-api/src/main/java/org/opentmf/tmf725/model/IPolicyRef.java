package org.opentmf.tmf725.model;

import org.opentmf.common.model.IEntity;

/**
 * Reference to a Policy.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPolicyRef extends IEntity {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
