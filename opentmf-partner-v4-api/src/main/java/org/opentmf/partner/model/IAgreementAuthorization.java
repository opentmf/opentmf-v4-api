package org.opentmf.partner.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IEntity;

/**
 * A business participant that is responsible for approving the agreement.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 *   <li>TMF-651: Agreement Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementAuthorization extends IEntity {

  /**
   * The date associated with the authorization state.
   */
  OffsetDateTime getDate();

  /**
   * Indication that represents whether the signature is a physical paper
   * signature or a digital signature.
   */
  String getSignatureRepresentation();

  /**
   * Current status of the authorization, for example in process, approved,
   * rejected.
   */
  String getState();
}
