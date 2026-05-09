package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>CheckServiceQualificationCreate (645)</li>
 *   <li>CheckWorkQualificationCreate (714)</li>
 *   <li>QueryServiceQualificationCreate (645)</li>
 *   <li>QueryWorkQualificationCreate (714)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQualificationCreateBase extends IExtensible {

  /**
   * Description of the serviceQualification.
   */
  String getDescription();

  /**
   * A date (DateTime). Deadline date when the requester expected a qualification
   * answer.
   */
  OffsetDateTime getExpectedQualificationDate();

  /**
   * Identifier provided by the requester.
   */
  String getExternalId();

  /**
   * An indicator which when the value is "true" means that requester expects to
   * get qualifcation result immediately in the response. If the indicator is true
   * then the response code of 200 indicates the operation is successful otherwise
   * a task is created with a response 201.
   */
  Boolean getInstantSyncQualification();
}
