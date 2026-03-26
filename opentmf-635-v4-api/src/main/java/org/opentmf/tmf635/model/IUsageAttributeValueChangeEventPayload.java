package org.opentmf.tmf635.model;

import org.opentmf.product.model.IUsage;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageAttributeValueChangeEventPayload {

  /**
   * An occurrence of employing a Product, Service, or Resource for its intended
   * purpose, which is of interest to the business and can have charges applied to
   * it. It is comprised of characteristics, which represent attributes of usage.
   */
  IUsage getUsage();
}
