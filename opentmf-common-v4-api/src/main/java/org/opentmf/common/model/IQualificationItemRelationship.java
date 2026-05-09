package org.opentmf.common.model;


/**
 * Structure used to describe relationship between productOfferingQualification
 * item from the same ProductOfferingQualification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQualificationItemRelationship extends IExtensible {

  /**
   * Id of the ProductOfferingQualificationItem (from the same
   * ProductOfferingQualificationItem).
   */
  String getId();

  /**
   * Type of relationship (ex: reliesOn, connectedTo, etc...).
   */
  String getRelationshipType();
}
