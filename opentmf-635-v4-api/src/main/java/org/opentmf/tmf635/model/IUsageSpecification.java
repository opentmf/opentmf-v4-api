package org.opentmf.tmf635.model;

import java.net.URI;

/**
 * A detailed description of a usage event that are of interest to the business
 * and can have charges applied to it. It is comprised of characteristics, which
 * define all attributes known for a particular type of usage.
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
public interface IUsageSpecification extends IUsageSpecificationUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
