package org.opentmf.tmf675.model;

import org.opentmf.common.model.IExtensible;

/**
 * A GeographicLocation is a pure-virtual super-class to the GeoJSON-aligned
 * geometries of Point (addresses and locations), MultiPoint, LineString
 * (streets, highways and boundaries), MultiLineString and Polygon (countries,
 * provinces, tracts of land). Use the {@literal @}type attribute to specify which of these
 * is being specified by the geometry attribute.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> @type<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-675: Geographic Location Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicLocationCreate extends IExtensible {

  /**
   * A user-friendly name for the place, such as [Paris Store], [London Store],
   * [Main Home].
   */
  String getName();
}
