package org.opentmf.tmf720.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPartyRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * DigitalIdentity is a class that allow to describe a digital identity for an
 * individual or a resource or a specific party role. One of these three MUST be
 * provided. If an individual is provided, this identity will be for all her/his
 * partyRole. To avoid confusion it is recommended in this case to not provide
 * partyRoleIdentified.
 * <br/>Skipped properties: id,href,status,digitalIdentityDate.
 *
 * <p><br/>
 * <strong>Required:</strong> credential<br/>
 * </p>
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
public interface IDigitalIdentityCreate extends IExtensible {

  /**
   * List of attachment associated with this digital identity. Could be use to
   * link a cute cat or moose picture to a digital identity for example.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * List of contact medium associated with the digital identity.
   */
  List<? extends IDigitalIdentityContactMedium> getContactMediums();

  /**
   * Date and time of the Digital Identity creation (timestamp).
   */
  OffsetDateTime getCreationDate();

  /**
   * A list of credential/authentification method that are used for this digital
   * identity.
   */
  List<? extends ICredential> getCredentials();

  IPartyRef getIndividualIdentified();

  /**
   * Date and time of the Digital Identity last update (timestamp).
   */
  OffsetDateTime getLastUpdate();

  /**
   * Nickname associated to this digital identity (like Juanito17 or the
   * QuebecMoose etc...).
   */
  String getNickname();

  /**
   * Related Parties who are identified by this digital identity.
   */
  List<? extends IRelatedParty> getPartyRoleIdentifieds();

  /**
   * Parties who have an interest in this digital identity (like the organization
   * in charge of providing identity). This is NOT the party identified by this
   * digital identity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  IResourceRef getResourceIdentified();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
