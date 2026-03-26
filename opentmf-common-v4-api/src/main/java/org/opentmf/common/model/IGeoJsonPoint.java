package org.opentmf.common.model;

/**
 * Container for a GeoJSON Point: A single position.
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
public interface IGeoJsonPoint extends IGeographicLocation {

  /**
   * GeoJSON: A single position.
   */
  IPoint getGeoJson();
}
