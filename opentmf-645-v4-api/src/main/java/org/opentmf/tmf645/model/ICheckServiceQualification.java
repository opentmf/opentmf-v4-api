package org.opentmf.tmf645.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * CheckServiceQualification is used to perform a technical eligibility on
 * service configuration(s). It allows to retrieve services that are technically
 * available in the context of the interaction (place, party, service
 * characteristics, ...).
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
public interface ICheckServiceQualification extends ICheckServiceQualificationUpdate {

  /**
   * Date when the serviceQualification was submitted.
   */
  OffsetDateTime getCheckServiceQualificationDate();

  /**
   * Hyperlink to access the serviceQualification.
   */
  URI getHref();

  /**
   * Unique identifier of the serviceQualification resource.
   */
  String getId();
}
