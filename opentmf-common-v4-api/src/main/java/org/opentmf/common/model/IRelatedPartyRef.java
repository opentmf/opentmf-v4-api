package org.opentmf.common.model;


/**
 * RelatedParty reference. A related party defines party or party role linked to
 * a specific entity.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-678: Customer Bill Management API</li>
 *   <li>TMF-696: Risk Management API</li>
 *   <li>TMF-716: ResourceReservation</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRelatedPartyRef extends IEntityRef {

  /**
   * Role of the related party.
   */
  String getRole();
}
