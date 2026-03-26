package org.opentmf.tmf668.model;

import java.util.List;
import org.opentmf.common.model.IAgreementSpecificationRef;
import org.opentmf.common.model.IExtensible;

/**
 * A PartnershipRoleSpecification represents a specification of a role defined
 * in the context of a given type of partnership (PartnershipSpecification),
 * such as Buyer, Seller.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IPartnershipRoleSpecification extends IExtensible {

  /**
   * List of: Agreement specification reference. An AgreementSpecification
   * represents a template of an agreement that can be used when establishing
   * partnerships.
   */
  List<? extends IAgreementSpecificationRef> getAgreementSpecifications();

  /**
   * An explanatory text documenting the role specification.
   */
  String getDescription();

  /**
   * The name of the role specification. This name uniquely identifies the role
   * specification within the partnership.
   */
  String getName();

  /**
   * Indicates whether billing operations will be associated to parties playing
   * the role.
   */
  Boolean getRequiresBilling();

  /**
   * Indicates whether settlement operations will be associated to parties playing
   * the role.
   */
  Boolean getRequiresSettlement();
}
