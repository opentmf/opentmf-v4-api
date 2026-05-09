package org.opentmf.common.model;


/**
 * A migration, substitution, dependency or exclusivity relationship
 * between/among entity specifications.
 *
 * <p><br/>
 * <strong>Required:</strong> relationshipType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWarrantySpecificationRelationship extends IPlace {

  /**
   * Type of relationship such as migration, substitution, dependency,
   * exclusivity.
   */
  String getRelationshipType();
}
