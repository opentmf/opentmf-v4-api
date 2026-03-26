package org.opentmf.tmf714.model;

import java.util.List;
import org.opentmf.common.model.IPlaceRefOrValue;
import org.opentmf.common.model.IQualificationCreateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * QueryWorkQualification is used to retrieve a list of units of work that are
 * valid in the context of the interaction
 * <br/>Skipped properties:
 * id,href,workQualificationItem,state,effectiveQualificationDate,expirationDate,estimatedResponseDate,queryWorkQualificationDate.
 *
 * <p><br/>
 * <strong>Required:</strong> searchCriteria<br/>
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
public interface IQueryWorkQualificationCreate extends IQualificationCreateBase {

  /**
   * A place described by reference or by value linked to a specific entity. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to
   * the place entity and not the PlaceRefOrValue class itself.
   */
  IPlaceRefOrValue getPlace();

  /**
   * A list of related party references, defines party or party role linked to
   * this request.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A WorkQualificationItem relates to a specific unit of work being checked in a
   * qualification operation.
   */
  IWorkQualificationItem getSearchCriteria();
}
