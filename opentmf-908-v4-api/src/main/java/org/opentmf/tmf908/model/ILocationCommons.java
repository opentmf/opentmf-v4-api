package org.opentmf.tmf908.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IGeographicLocation;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILocationCommons extends IExtensible {

  /**
   * Structured textual way of describing how to find a Property in an urban area
   * (country properties are often
   * <br/>defined differently).
   * <br/>Note : Address corresponds to SID UrbanPropertyAddress.
   */
  IAddress getAddress();

  String getAreaServed();

  /**
   * A GeographicLocation is a pure-virtual super-class to the GeoJSON-aligned
   * geometries of Point (addresses and locations), MultiPoint, LineString
   * (streets, highways and boundaries), MultiLineString and Polygon (countries,
   * provinces, tracts of land). Use the {@literal @}type attribute to specify which of these
   * is being specified by the geometry attribute.
   */
  IGeographicLocation getLocation();
}
