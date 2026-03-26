package org.opentmf.tmf674.model;

import java.net.URI;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-674: Geographic Site Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicSite extends IGeographicSiteUpdate {

  /**
   * Unique reference of the place.
   */
  URI getHref();

  /**
   * Unique identifier of the place.
   */
  String getId();
}
