package org.opentmf.tmf683.model;

import java.net.URI;

/**
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
public interface IPartyInteraction extends IPartyInteractionCreate {

  /**
   * Hyperlink to access the party interaction.
   */
  URI getHref();

  /**
   * Unique identifier of the party interaction.
   */
  String getId();
}
