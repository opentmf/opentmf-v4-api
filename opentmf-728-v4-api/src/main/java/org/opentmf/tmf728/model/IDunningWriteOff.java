package org.opentmf.tmf728.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;

/**
 * The DunningWriteOff corresponds, in a dunning context, to a credit to
 * definitively balance the CustomerAccount before being able to close it.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-728: Dunning Case Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDunningWriteOff extends IExtensible {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getAmount();

  /**
   * The date on which the write off was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * Unique identifier for the write off.
   */
  String getId();

  /**
   * Reason for the write off. Can be Total or Partial.
   */
  String getReason();

  /**
   * The current status of the write off.
   */
  String getStatus();
}
