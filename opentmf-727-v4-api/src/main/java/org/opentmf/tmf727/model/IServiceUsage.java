package org.opentmf.tmf727.model;

import java.net.URI;

/**
 * An occurrence of usage on a Service derived from various Resource usages,
 * which can be used for determining the Product usage. It is comprised of
 * characteristics, which represent attributes of service usage.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-727: Service Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceUsage extends IServiceUsageCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
