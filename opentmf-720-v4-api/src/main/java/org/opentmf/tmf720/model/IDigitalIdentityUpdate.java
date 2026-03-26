package org.opentmf.tmf720.model;


/**
 * DigitalIdentity is a class that allow to describe a digital identity for an
 * individual or a resource or a specific party role. One of these three MUST be
 * provided. If an individual is provided, this identity will be for all her/his
 * partyRole. To avoid confusion it is recommended in this case to not provide
 * partyRoleIdentified.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-720: Digital Identity Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDigitalIdentityUpdate extends IDigitalIdentityCreate {

  /**
   * Used to indicate the current lifecycle status of this digital identity
   * (unknown, active, suspended, archived).
   */
  String getStatus();
}
