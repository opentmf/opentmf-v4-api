package org.opentmf.tmf645.model;

import java.util.List;
import org.opentmf.common.model.IQualificationCreateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * CheckServiceQualification is used to perform a technical eligibility on
 * service configuration(s). It allows to retrieve services that are technically
 * available in the context of the interaction (place, party, service
 * characteristics, ...).
 * <br/>Skipped properties:
 * id,href,state,effectiveQualificationDate,qualificationResult,expirationDate,checkServiceQualificationDate,estimatedResponseDate,serviceQualificationItem.alternateServiceProposal,serviceQualificationItem.state,serviceQualificationItem.qualificationResult.
 *
 * <p><br/>
 * <strong>Required:</strong> serviceQualificationItem<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICheckServiceQualificationCreate extends IQualificationCreateBase {

  /**
   * When the value is TRUE means that alternative solutions should be provided.
   */
  Boolean getProvideAlternative();

  /**
   * When the value is TRUE means that unavailability reason are expected for non
   * available service.
   */
  Boolean getProvideUnavailabilityReason();

  /**
   * A list of related party references, defines party or party role linked to
   * this request.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A list of service qualification items.
   */
  List<? extends ICheckServiceQualificationItem> getServiceQualificationItems();
}
