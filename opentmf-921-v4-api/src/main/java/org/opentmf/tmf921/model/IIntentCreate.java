package org.opentmf.tmf921.model;


/**
 * An Intent instance is the formal description of all expectations including
 * requirements, goals, and constraints given to a technical system
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> expression, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-921: Intent Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIntentCreate extends IIntentUpdate {

  /**
   * When subclassing, this defines the subclass Extensible name.
   */
  String getAtType();
}
