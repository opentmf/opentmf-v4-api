package org.opentmf.tmf673.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.general.model.IGeographicAddress;

/**
 * This resource is used to manage address validation request and response
 * <br/>Skipped properties: id,href.
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
public interface IGeographicAddressValidationUpdate extends IGeographicAddressValidationCreate {

  /**
   * List of: Structured textual way of describing how to find a Property in an
   * urban area (country properties are often defined differently).
   * <br/>Note : Address corresponds to SID UrbanPropertyAddress.
   */
  List<? extends IGeographicAddress> getAlternateGeographicAddresses();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();

  /**
   * Structured textual way of describing how to find a Property in an urban area
   * (country properties are often defined differently).
   * <br/>Note : Address corresponds to SID UrbanPropertyAddress.
   */
  IGeographicAddress getValidGeographicAddress();

  /**
   * Date when the address validation is performed.
   */
  OffsetDateTime getValidationDate();

  /**
   * Result of the address validation (success, partial, fails).
   */
  String getValidationResult();
}
