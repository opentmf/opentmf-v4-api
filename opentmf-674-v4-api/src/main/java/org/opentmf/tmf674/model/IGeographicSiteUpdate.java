package org.opentmf.tmf674.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPlaceRefOrValue;
import org.opentmf.common.model.IRelatedParty;

/**
 * Skipped properties: id,href.
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
public interface IGeographicSiteUpdate extends IExtensible {

  List<? extends ICalendarPeriod> getCalendars();

  /**
   * A code that may be used for some addressing schemes eg: [ANSI T1.253-1999].
   */
  String getCode();

  /**
   * Text describing additional information regarding the site.
   */
  String getDescription();

  /**
   * A user-friendly name for the place, such as [Paris Store], [London Store],
   * [Main Home].
   */
  String getName();

  /**
   * List of: A place described by reference or by value linked to a specific
   * entity. The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are
   * related to the place entity and not the PlaceRefOrValue class itself.
   */
  List<? extends IPlaceRefOrValue> getPlaces();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  List<? extends IGeographicSiteRelationship> getSiteRelationships();

  /**
   * The condition of the GeographicSite, such as planned, underConstruction,
   * cancelled, active, inactive, former.
   */
  String getStatus();
}
