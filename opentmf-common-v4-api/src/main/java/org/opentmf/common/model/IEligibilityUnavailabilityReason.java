package org.opentmf.common.model;


/**
 * Reason for eligibility result if the productOfferingQualification result is
 * no (meaning the productOffering or productSpec is not available).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEligibilityUnavailabilityReason extends IEntity {

  /**
   * Unavailability reason code.
   */
  String getCode();

  /**
   * Unavailability reason label.
   */
  String getLabel();
}
