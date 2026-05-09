package org.opentmf.common.model;


/**
 * A mean of communicating a bill, supported by the associated bill format. For
 * example, post mail, email, web page.
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
public interface IBillPresentationMedia extends INamedEntity {

  /**
   * An explanatory text describing this bill presentation media.
   */
  String getDescription();
}
