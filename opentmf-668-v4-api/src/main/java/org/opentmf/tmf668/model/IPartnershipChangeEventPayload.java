package org.opentmf.tmf668.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-668: Partnership Type</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartnershipChangeEventPayload {

  /**
   * A partnership represents a formalized collaboration between various parties,
   * each party playing a role in the partnership. The parties playing a role in
   * the partnership represented by the Partner entity. The structure of a
   * partnership is specified by a PartnershipSpecification which contain all the
   * information for the setup of the partnership, including the list of
   * identified roles and the agreement that should apply.
   */
  IPartnership getPartnership();
}
