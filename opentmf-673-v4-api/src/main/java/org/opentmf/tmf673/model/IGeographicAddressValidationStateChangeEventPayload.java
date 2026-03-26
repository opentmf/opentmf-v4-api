package org.opentmf.tmf673.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-673: Geographic Address Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicAddressValidationStateChangeEventPayload {

  /**
   * This resource is used to manage address validation request and response.
   */
  IGeographicAddressValidation getGeographicAddressValidation();
}
