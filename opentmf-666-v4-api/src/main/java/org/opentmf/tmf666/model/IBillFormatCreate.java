package org.opentmf.tmf666.model;

import org.opentmf.common.model.IExtensible;

/**
 * A detailed description of the way in which a bill is presented.
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
public interface IBillFormatCreate extends IExtensible {

  /**
   * An explanatory text for this bill format.
   */
  String getDescription();

  /**
   * A short descriptive name.
   */
  String getName();
}
