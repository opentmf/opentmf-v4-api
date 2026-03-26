package org.opentmf.tmf720.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Credential is a class that allow to describe an authentification method.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, id<br/>
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
public interface ICredential extends IExtensible {

  /**
   * List of contact medium associated with this credential/authentification
   * method.
   */
  List<? extends IDigitalIdentityContactMedium> getContactMediums();

  /**
   * an identifier for a credential/authentification method for this digital
   * identity.
   */
  String getId();

  /**
   * Used to indicate the current lifecycle state of this credential (like active,
   * inactive, expired).
   */
  String getState();

  /**
   * A level of assurance associated with this credential - this could be used to
   * limit/allow specific permission based on this trust level.
   */
  String getTrustLevel();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
