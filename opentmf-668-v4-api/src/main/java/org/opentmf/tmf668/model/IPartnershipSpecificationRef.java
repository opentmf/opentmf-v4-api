package org.opentmf.tmf668.model;

import org.opentmf.common.model.IEntityRef;

/**
 * PartnershipSpecification reference. A partnership specification contains all
 * the information for the setup of a partnership of a given kind. This includes
 * the list of identified role types for the partnership with the corresponding
 * agreement specifications.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
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
public interface IPartnershipSpecificationRef extends IEntityRef {
}
