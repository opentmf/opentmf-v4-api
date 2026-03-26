package org.opentmf.tmf673.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.general.model.IGeographicAddress;

/**
 * This resource is used to manage address validation request and response
 * <br/>Skipped properties:
 * id,href,alternateGeographicAddress,validGeographicAddress,state,validationResult,validationDate.
 *
 * <p><br/>
 * <strong>Required:</strong> provideAlternative, submittedGeographicAddress<br/>
 * </p>
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
public interface IGeographicAddressValidationCreate extends IExtensible {

  /**
   * Indicator provided by the requester to specify if alternate addresses must be
   * provided in case of partial or fail result.
   */
  Boolean getProvideAlternative();

  /**
   * Structured textual way of describing how to find a Property in an urban area
   * (country properties are often defined differently).
   * <br/>Note : Address corresponds to SID UrbanPropertyAddress.
   */
  IGeographicAddress getSubmittedGeographicAddress();
}
