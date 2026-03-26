package org.opentmf.common.model;


/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyRefOrValue extends IParty {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Name of the related entity.
   */
  String getName();
}
