package org.opentmf.tmf666.model;

import java.net.URI;

/**
 * A detailed description of when to initiate a billing cycle and the various
 * sub steps of a billing cycle.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IBillingCycleSpecification extends IBillingCycleSpecificationUpdate {

  /**
   * Reference of the billing cycle specification.
   */
  URI getHref();

  /**
   * Unique identifier of the billing cycle specification.
   */
  String getId();
}
