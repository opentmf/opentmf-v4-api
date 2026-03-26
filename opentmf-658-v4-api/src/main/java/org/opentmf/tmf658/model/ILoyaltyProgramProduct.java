package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * An instance of a loyalty program specification, linked to a specified loyalty
 * member.
 *
 * <p><br/>
 * <strong>Required:</strong> loyaltyAccount, loyaltyProgramMember, loyaltyProgramProductSpec, name, validFor<br/>
 * </p>
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
public interface ILoyaltyProgramProduct extends ILoyaltyProgramProductUpdate {

  /**
   * A reference to the loyalty member product.
   */
  URI getHref();

  /**
   * Unique identifier for the loyalty program product.
   */
  String getId();
}
