package org.opentmf.common.model;


/**
 * A Unit of Work defined by value or existing defined by reference. The
 * polymorphic attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are related
 * to the work entity and not the related WorkRefOrValue class itself.
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
public interface IWorkRefOrValue extends IWork {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
