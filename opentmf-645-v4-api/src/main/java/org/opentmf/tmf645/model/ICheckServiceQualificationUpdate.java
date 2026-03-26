package org.opentmf.tmf645.model;

import java.time.OffsetDateTime;

/**
 * CheckServiceQualification is used to perform a technical eligibility on
 * service configuration(s). It allows to retrieve services that are technically
 * available in the context of the interaction (place, party, service
 * characteristics, ...).
 * <br/>Skipped properties: id,href,checkServiceQualificationDate.
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
public interface ICheckServiceQualificationUpdate extends ICheckServiceQualificationCreate {

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
   * Qualification result for this serviceQualification. It could be: qualified
   * (all qualification item are qualified), alternate (At least one item
   * alternate and no item with unqualified), unqualified (At least one item
   * unqualified).
   */
  String getQualificationResult();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
