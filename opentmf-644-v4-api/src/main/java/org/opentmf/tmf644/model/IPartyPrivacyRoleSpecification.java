package org.opentmf.tmf644.model;

import java.util.List;
import org.opentmf.common.model.IAgreementSpecificationRef;
import org.opentmf.common.model.IRoleSpecification;

/**
 * A PartyPrivacyRoleSpecification represents a specification of a role defined
 * in the context of a given privacy spesification, such as Customer, User.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyPrivacyRoleSpecification extends IRoleSpecification {

  /**
   * List of: Agreement specification reference. An AgreementSpecification
   * represents a template of an agreement that can be used when establishing
   * partnerships.
   */
  List<? extends IAgreementSpecificationRef> getAgreementSpecifications();
}
