package org.opentmf.tmf666.model;

import org.opentmf.common.model.IEntityRef;

/**
 * BillingCycleSpecification reference. A description of when to initiate a
 * billing cycle and the various sub steps of a billing cycle.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
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
public interface IBillingCycleSpecificationRef extends IEntityRef {

  /**
   * An offset of a billing/settlement date. The offset is expressed as number of
   * days with regard to the start of the billing/settlement period.
   */
  Integer getDateShift();

  /**
   * Frequency of the billing cycle (monthly for instance).
   */
  String getFrequency();
}
