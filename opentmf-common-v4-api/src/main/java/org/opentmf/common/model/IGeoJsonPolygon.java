package org.opentmf.common.model;

/**
 * Container for GeoJSON Polygon: An array of linear rings.
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
public interface IGeoJsonPolygon extends IGeographicLocation {

  /**
   * An array of linear rings.
   */
  IPolygon getGeoJson();
}
