package org.opentmf.tmf696.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedPartyRef;

/**
 * This is a task resource allowing assessment of the risks associated with a
 * party role
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> partyRole<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-696: Risk Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyRoleRiskAssessmentCreate extends IExtensible {

  /**
   * RelatedParty reference. A related party defines party or party role linked to
   * a specific entity.
   */
  IRelatedPartyRef getPartyRole();
}
