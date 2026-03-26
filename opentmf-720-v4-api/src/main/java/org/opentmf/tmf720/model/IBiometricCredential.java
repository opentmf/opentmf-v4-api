package org.opentmf.tmf720.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;

/**
 * A Credential based on a login and a password.
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
public interface IBiometricCredential extends ICredential {

  /**
   * List of attachment(s) associated with this biometric data.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * a biometric sub type when required like for finger: thumb, index, ring ,
   * pinkyFinger, etc.
   */
  String getBiometricSubType();

  /**
   * a biometric type like finger, iris, face, etc...
   */
  String getBiometricType();
}
