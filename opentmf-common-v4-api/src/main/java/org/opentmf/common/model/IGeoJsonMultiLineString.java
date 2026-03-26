package org.opentmf.common.model;

/**
 * A container for GeoJSON MultiLineString: A collection of distinct
 * LineStrings.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, href, id, role<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-673: Geographic Address Management API</li>
 *   <li>TMF-675: Geographic Location Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeoJsonMultiLineString extends IGeographicLocation {

  /**
   * A collection of distinct LineStrings.
   */
  IMultiLineString getGeoJson();
}
