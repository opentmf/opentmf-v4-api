package org.opentmf.common.model;


/**
 * A relationship between agreement specifications. Typical relationships are
 * substitution and dependency.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-651: Agreement Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementSpecificationRelationship extends IFeatureRelationship {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
