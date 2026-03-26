package org.opentmf.common.model;

import java.util.List;

/**
 * An individual or an organization used as a contact point for a given account
 * and accessed via some contact medium.
 *
 * <p><br/>
 * <strong>Required:</strong> contactType, validFor<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IContact extends IEntity {

  /**
   * List of: Indicates the contact medium that could be used to contact the
   * party.
   */
  List<? extends IContactMedium> getContactMediums();

  /**
   * A displayable name for that contact.
   */
  String getContactName();

  /**
   * Type of contact (primary, secondary...).
   */
  String getContactType();

  /**
   * Identifies what kind of party role type is linked to the contact (a account
   * manager...).
   */
  String getPartyRoleType();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getRelatedParty();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
