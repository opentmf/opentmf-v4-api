package org.opentmf.tmf645.model;

import org.opentmf.common.model.IExtensible;

/**
 * Reason for eligibility result if the ServiceQualification result is no
 * (meaning the Service is not available).
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
public interface IServiceEligibilityUnavailabilityReason extends IExtensible {

  /**
   * Unavailability reason code.
   */
  String getCode();

  /**
   * Unavailability reason label.
   */
  String getLabel();
}
