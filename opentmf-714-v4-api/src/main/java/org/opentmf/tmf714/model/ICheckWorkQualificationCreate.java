package org.opentmf.tmf714.model;

import java.util.List;
import org.opentmf.common.model.IPlaceRefOrValue;
import org.opentmf.common.model.IQualificationCreateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * CheckWorkQualification is used to validate specific units of work
 * <br/>Skipped properties:
 * id,href,state,effectiveQualificationDate,qualificationResult,expirationDate,checkWorkQualificationDate,estimatedResponseDate,workQualificationItem.alternateWorkProposal,workQualificationItem.state,workQualificationItem.qualificationResult.
 *
 * <p><br/>
 * <strong>Required:</strong> workQualificationItem<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICheckWorkQualificationCreate extends IQualificationCreateBase {

  /**
   * A place described by reference or by value linked to a specific entity. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to
   * the place entity and not the PlaceRefOrValue class itself.
   */
  IPlaceRefOrValue getPlace();

  /**
   * When the value is TRUE means that alternative solutions should be provided.
   */
  Boolean getProvideAlternative();

  /**
   * When the value is TRUE means that unavailability reason are expected for non
   * available units of work.
   */
  Boolean getProvideUnavailabilityReason();

  /**
   * A list of related party references, defines party or party role linked to
   * this request.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * List of: A WorkQualificationItem relates to a specific unit of work being
   * checked in a qualification operation.
   */
  List<? extends ICheckWorkQualificationItem> getWorkQualificationItems();
}
