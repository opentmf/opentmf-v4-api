package org.opentmf.tmf666.model;

import org.opentmf.common.model.IExtensible;

/**
 * A mean of communicating a bill, supported by the associated bill format. For
 * example, post mail, email, web page.
 * <br/>Skipped properties: id,href.
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
public interface IBillPresentationMediaCreate extends IExtensible {

  /**
   * An explanatory text describing this bill presentation media.
   */
  String getDescription();

  /**
   * A short descriptive name.
   */
  String getName();
}
