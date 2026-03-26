package org.opentmf.tmf674.model;

import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> id, relationshipType<br/>
 * </p>
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
public interface IGeographicSiteRelationship extends IEntity {

  /**
   * Type of relationship.
   */
  String getRelationshipType();

  /**
   * Role of the related site in the relationship.
   */
  String getRole();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
