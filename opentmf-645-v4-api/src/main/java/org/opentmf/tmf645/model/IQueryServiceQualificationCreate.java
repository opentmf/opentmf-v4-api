package org.opentmf.tmf645.model;

import java.util.List;
import org.opentmf.common.model.IQualificationCreateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * QueryServiceQualification is used to retrieve a list of services that are
 * technically available in the context of the interaction (place, party,
 * service characteristics, ...).
 * <br/>Skipped properties:
 * id,href,serviceQualificationItem,state,effectiveQualificationDate,expirationDate,estimatedResponseDate,queryServiceQualificationDate.
 *
 * <p><br/>
 * <strong>Required:</strong> searchCriteria<br/>
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
public interface IQueryServiceQualificationCreate extends IQualificationCreateBase {

  /**
   * A list of related party references, defines party or party role linked to
   * this request.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A ServiceQualificationItem relates to a specific service being checked in a
   * qualification operation.
   */
  IServiceQualificationItem getSearchCriteria();
}
