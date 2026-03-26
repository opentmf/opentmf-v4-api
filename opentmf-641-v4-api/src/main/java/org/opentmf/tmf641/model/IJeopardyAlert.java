package org.opentmf.tmf641.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;

/**
 * A JeopardyAlert represents a predicted exception during a process that may
 * cause a risk to complete successfully the process.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-641: Service Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IJeopardyAlert extends IExtensible {

  /**
   * A date time( DateTime). The date that the alert issued.
   */
  OffsetDateTime getAlertDate();

  /**
   * The exception associated with this jeopardy alert.
   */
  String getException();

  /**
   * identifier of the JeopardyAlert.
   */
  String getId();

  /**
   * A string represents the type of jeopardy/risk like Normal, Hazard, Critical,
   * ...
   */
  String getJeopardyType();

  /**
   * A string represents the message of the alert.
   */
  String getMessage();

  /**
   * A string used to give a name to the jeopardy alert.
   */
  String getName();
}
