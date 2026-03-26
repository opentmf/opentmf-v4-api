package org.opentmf.tmf683.model;


/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> channel, direction, interactionDate, reason, status<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-683: Party Interaction Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyInteractionCreate extends IPartyInteractionUpdate {

  /**
   * Specifies who started the interaction. It might be the party or the
   * enterprise exposing this API. Possible values are “inbound” and “outbound”.
   */
  String getDirection();
}
