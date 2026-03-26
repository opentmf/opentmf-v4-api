package org.opentmf.tmf635.model;

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
public interface IUsageSpecificationAttributeValueChangeEventPayload {

  /**
   * A detailed description of a usage event that are of interest to the business
   * and can have charges applied to it. It is comprised of characteristics, which
   * define all attributes known for a particular type of usage.
   */
  IUsageSpecification getUsageSpecification();
}
