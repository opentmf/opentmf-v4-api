package org.opentmf.tmf645.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * QueryServiceQualification is used to retrieve a list of services that are
 * technically available in the context of the interaction (place, party,
 * service characteristics, ...).
 * <br/>Skipped properties: id,href,queryServiceQualificationDate.
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
public interface IQueryServiceQualificationUpdate extends IQueryServiceQualificationCreate {

  /**
   * Effective date to serviceQualification completion.
   */
  OffsetDateTime getEffectiveQualificationDate();

  /**
   * Date when the requester expect to provide an answer for the qualification
   * request.
   */
  OffsetDateTime getEstimatedResponseDate();

  /**
   * Date when the qualification response expires.
   */
  OffsetDateTime getExpirationDate();

  /**
   * A list of service qualification items.
   */
  List<? extends IServiceQualificationItem> getServiceQualificationItems();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
