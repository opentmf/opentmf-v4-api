package org.opentmf.common.model;


/**
 * Structure used to describe relationship between WorkQualification item from
 * the same WorkQualification.
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
public interface IWorkQualificationRelationship extends IEntity {

  /**
   * The type of relationship.
   */
  String getRelationshipType();
}
