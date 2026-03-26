package org.opentmf.tmf658.model;


/**
 * A reference to a loyalty program specification.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, productNumber<br/>
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
public interface ILoyaltyProgramProductSpecCreate extends ILoyaltyProgramProductSpecUpdate {

  /**
   * A narrative that explains in detail what the product specification is.
   */
  Boolean getNeedsLoyaltyAccount();
}
