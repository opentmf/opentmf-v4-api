package org.opentmf.product.model;

import java.net.URI;

/**
 * An occurrence of employing a Product, Service, or Resource for its intended
 * purpose, which is of interest to the business and can have charges applied to
 * it. It is comprised of characteristics, which represent attributes of usage.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsage extends IUsageUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
