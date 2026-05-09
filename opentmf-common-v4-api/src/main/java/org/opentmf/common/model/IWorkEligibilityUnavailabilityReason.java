package org.opentmf.common.model;


/**
 * Reason for eligibility result if the WorkQualification result is no (meaning
 * the Unit of Work is not valid).
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
public interface IWorkEligibilityUnavailabilityReason extends IExtensible {

  /**
   * Unavailability reason code.
   */
  String getCode();

  /**
   * Unavailability reason label.
   */
  String getLabel();
}
