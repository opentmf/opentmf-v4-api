package org.opentmf.tmf673.model;

import java.net.URI;

/**
 * This resource is used to manage address validation request and response.
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
public interface IGeographicAddressValidation extends IGeographicAddressValidationUpdate {

  /**
   * An URI used to access to the address validation resource.
   */
  URI getHref();

  /**
   * Unique identifier of the Address Validation.
   */
  String getId();
}
