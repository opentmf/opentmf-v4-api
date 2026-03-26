package org.opentmf.tmf921.model;

/**
 * The event data structure.
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
public interface IIntentReportChangeEventPayload {

  /**
   * IntentReport is the mechanism to report back to Intent owner on an Intents
   * status.
   */
  IIntentReport getIntentReport();
}
