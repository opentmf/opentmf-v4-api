package org.opentmf.tmf668.model;

import java.util.List;
import org.opentmf.common.model.IPartner;
import org.opentmf.common.model.IPartnershipSpecificationRef;
import org.opentmf.common.model.IRoleSpecification;

/**
 * A partnership represents a formalized collaboration between various parties,
 * each party playing a role in the partnership. The parties playing a role in
 * the partnership represented by the Partner entity. The structure of a
 * partnership is specified by a PartnershipSpecification which contain all the
 * information for the setup of the partnership, including the list of
 * identified roles and the agreement that should apply.
 *
 * <p><br/>
 * <strong>Required:</strong> name, specification<br/>
 * </p>
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
public interface IPartnership extends IRoleSpecification {

  /**
   * The list of partners of the partnership, where a partner represents a party
   * playing a given role. Hence a partner structure includes primarily a
   * reference to the engaged party and a role name matching necessarily the name
   * of one of the role specifications defined in the specification of the
   * partnership.
   */
  List<? extends IPartner> getPartners();

  /**
   * PartnershipSpecification reference. A partnership specification contains all
   * the information for the setup of a partnership of a given kind. This includes
   * the list of identified role types for the partnership with the corresponding
   * agreement specifications.
   */
  IPartnershipSpecificationRef getSpecification();
}
