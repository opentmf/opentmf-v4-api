package org.opentmf.tmf648.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;

/**
 * If special discount or special product offering price or specific condition
 * need an approval for ISP sale representative it is described here.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-648: Quote Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAuthorization extends IExtensible {

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getApprovers();

  /**
   * Date when the authorization (approved or declined) was done.
   */
  OffsetDateTime getGivenDate();

  /**
   * Name of the required authorization.
   */
  String getName();

  /**
   * Date when the authorization is requested for.
   */
  OffsetDateTime getRequestedDate();

  /**
   * To describe a digital or manual signature.
   */
  String getSignatureRepresentation();

  /**
   * State of the authorization, such as: approved or declined.
   */
  String getState();
}
