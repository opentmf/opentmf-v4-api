package org.opentmf.product.model;

import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * A migration, substitution, dependency or exclusivity relationship
 * between/among product specifications.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductSpecificationRelationship extends IEntityRef {

  /**
   * Type of relationship such as migration, substitution, dependency,
   * exclusivity.
   */
  String getRelationshipType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
