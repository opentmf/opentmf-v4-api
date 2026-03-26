package org.opentmf.tmf666.model;


/**
 * An attachment by value or by reference.
 *
 * <p><br/>
 * <strong>Required:</strong> isRef, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IBillingCycleSpecificationRefOrValue extends IBillingCycleSpecification {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * An offset of a billing/settlement date. The offset is expressed as number of
   * days with regard to the start of the billing/settlement period.
   */
  Integer getDateShift();

  Boolean getIsRef();
}
