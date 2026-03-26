package org.opentmf.tmf679.model;

import java.time.OffsetDateTime;

/**
 * ProductOfferingQualification is used to perform a commercial eligibility. It
 * allows to retrieve a list of productOffering that are commercially available
 * in the context of the interaction (defined be place, channel, party,
 * product).
 * <br/>Skipped properties: id,href,productOfferingQualificationDate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingQualificationUpdate extends IProductOfferingQualificationCreate {

  /**
   * Effective date to productOfferingQualification completion.
   */
  OffsetDateTime getEffectiveQualificationDate();

  /**
   * Date when the requester expect to provide an answer for the qualification
   * request.
   */
  OffsetDateTime getExpectedPOQCompletionDate();

  /**
   * Date the qualification response expires.
   */
  OffsetDateTime getExpirationDate();

  /**
   * Result of the qualification (example: green, yellow, red).
   */
  String getQualificationResult();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
