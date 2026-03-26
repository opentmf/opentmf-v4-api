package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * A reference to a loyalty program specification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyProgramProductSpec extends ILoyaltyProgramProductSpecCreate {

  /**
   * A reference to the product specification.
   */
  URI getHref();

  /**
   * Unique identifier for the product specification.
   */
  String getId();
}
