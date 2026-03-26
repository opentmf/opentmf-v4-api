package org.opentmf.tmf915.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;

/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> aiContract, violation<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAiContractViolationCreate extends IExtensible {

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getAiContract();

  OffsetDateTime getDate();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  IViolation getViolation();
}
