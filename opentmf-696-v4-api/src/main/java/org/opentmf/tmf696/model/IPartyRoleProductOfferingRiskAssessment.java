package org.opentmf.tmf696.model;

import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IRelatedPartyRef;

/**
 * This is a task resource allowing assessment of the risks associated with a
 * party or party role that considers acquiring a specific product offering.
 *
 * <p><br/>
 * <strong>Required:</strong> partyRole, productOffering<br/>
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
public interface IPartyRoleProductOfferingRiskAssessment extends IRiskAssessment {

  /**
   * RelatedParty reference. A related party defines party or party role linked to
   * a specific entity.
   */
  IRelatedPartyRef getPartyRole();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();
}
