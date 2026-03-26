package org.opentmf.tmf915.model;

import java.time.OffsetDateTime;

/**
 * AiModel is a base class for defining the AiModel hierarchy
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> aiModelSpecification, software, state<br/>
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
public interface IAiModelCreate extends IAiModelUpdate {

  /**
   * Date when the service was created (whatever its status).
   */
  OffsetDateTime getServiceDate();
}
