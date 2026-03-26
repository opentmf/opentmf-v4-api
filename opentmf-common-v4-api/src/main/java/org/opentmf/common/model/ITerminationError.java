package org.opentmf.common.model;


/**
 * This indicates an error that caused a qualificationItem to be terminated.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITerminationError extends IExtensible {

  /**
   * Unique identifier of the termination error.
   */
  String getId();

  /**
   * Text to describe the termination error - for example: Unable to proceed to
   * qualification because incomplete information provided.
   */
  String getValue();
}
