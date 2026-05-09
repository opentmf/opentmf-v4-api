package org.opentmf.common.model;


/**
 * A detailed description of the way in which a bill is presented.
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
public interface IBillFormat extends INamedEntity {

  /**
   * An explanatory text for this bill format.
   */
  String getDescription();
}
