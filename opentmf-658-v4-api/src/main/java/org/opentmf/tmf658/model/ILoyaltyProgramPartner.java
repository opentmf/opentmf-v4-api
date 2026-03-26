package org.opentmf.tmf658.model;

import java.util.List;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IPartner;

/**
 * A partner engaged in the Loyalty Program.
 *
 * <p><br/>
 * <strong>Required:</strong> engagedParty, name<br/>
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
public interface ILoyaltyProgramPartner extends IPartner {

  /**
   * The partner catalog category reference maps to a category containing the
   * partner product offerings.
   */
  List<? extends ICategoryRef> getPartnerCatalogs();
}
