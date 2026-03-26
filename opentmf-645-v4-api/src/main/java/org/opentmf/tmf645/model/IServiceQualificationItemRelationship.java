package org.opentmf.tmf645.model;

import org.opentmf.common.model.IExtensible;

/**
 * Structure used to describe relationship between serviceQualification items
 * from the same serviceQualification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceQualificationItemRelationship extends IExtensible {

  /**
   * Id of the serviceQualificationItem (from the same serviceQualificationItem).
   */
  String getId();

  /**
   * Type of relationship (ex: reliesOn, connectedTo, etc...).
   */
  String getRelationshipType();
}
