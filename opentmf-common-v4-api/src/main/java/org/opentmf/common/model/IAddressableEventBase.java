package org.opentmf.common.model;

import java.net.URI;

/**
 * The manually configured common object for event notification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-common: common</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAddressableEventBase extends IEventBase {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
