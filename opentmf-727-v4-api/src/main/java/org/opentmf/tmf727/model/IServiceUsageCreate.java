package org.opentmf.tmf727.model;

import java.time.OffsetDateTime;

/**
 * An occurrence of usage on a Service derived from various Resource usages,
 * which can be used for determining the Product usage. It is comprised of
 * characteristics, which represent attributes of service usage.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> status<br/>
 * </p>
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
public interface IServiceUsageCreate extends IServiceUsageUpdate {

  /**
   * Date of usage.
   */
  OffsetDateTime getUsageDate();
}
