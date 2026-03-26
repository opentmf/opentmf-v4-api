package org.opentmf.tmf915.model;

import java.time.OffsetDateTime;

/**
 * A template of an agreement that can be used when establishing partnerships
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IAiContractSpecificationCreate extends IAiContractSpecificationUpdate {

  /**
   * Date and time of the last update of the specification.
   */
  OffsetDateTime getLastUpdate();
}
