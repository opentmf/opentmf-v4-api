package org.opentmf.common.model;


/**
 * Structure used to describe relationship between WorkQualification items from
 * the same WorkQualification .
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkQualificationItemRelationship extends IExtensible {

  /**
   * Id of the workQualificationItem (from the same workQualification).
   */
  String getId();

  /**
   * Type of relationship (ex: reliesOn, connectedTo, etc...).
   */
  String getRelationshipType();
}
