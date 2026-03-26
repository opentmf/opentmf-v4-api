package org.opentmf.tmf667.model;

import org.opentmf.common.model.IEntitySpecification;

/**
 * A DocumentSpecificationRefOrValue where you can select between a
 * DocumentSpecification (by Value) or a DocumentSpecificationRef (by
 * Reference).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-667: Document Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDocumentSpecificationRefOrValue extends IEntitySpecification {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
