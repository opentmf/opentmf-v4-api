package org.opentmf.tmf658.model;

import org.opentmf.common.model.IParty;

/**
 * Entity reference. A related party defines party or party role linked to a
 * specific entity.
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
public interface IRelatedPartyRefOrValue extends IParty {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Name of the related entity.
   */
  String getName();

  String getRole();
}
