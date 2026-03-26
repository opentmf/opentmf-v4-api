package org.opentmf.common.model;


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
public interface IAttributeValueChangeEventBase extends IEventBase {

  /**
   * The path identifying the object field concerned by this notification.
   */
  String getFieldPath();
}
