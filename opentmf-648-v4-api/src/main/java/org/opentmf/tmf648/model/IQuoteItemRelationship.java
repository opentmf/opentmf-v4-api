package org.opentmf.tmf648.model;

import org.opentmf.common.model.IExtensible;

/**
 * Used to describe relationship between quote item. These relationship could
 * have an impact on pricing and conditions.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-648: Quote Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQuoteItemRelationship extends IExtensible {

  /**
   * ID of the related order item (must be in the same quote).
   */
  String getId();

  /**
   * Relationship type as relies on, bundles, etc...
   */
  String getRelationshipType();
}
