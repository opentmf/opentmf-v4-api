package org.opentmf.tmf668.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * A partnership specification contains all the information for the setup of a
 * partnership of a given kind. This includes the list of identified role types
 * for the partnership with the corresponding agreement specifications.
 * <br/>Skipped properties: id,href.
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
public interface IPartnershipSpecificationUpdate extends IExtensible {

  /**
   * An explanatory text regarding this partnership specification.
   */
  String getDescription();

  /**
   * An identifying name for the partnership specification.
   */
  String getName();

  /**
   * The list of roles specifications a engaged party will be able to play for
   * this kind of partnership.
   */
  List<? extends IPartnershipRoleSpecification> getRoleSpecifications();
}
