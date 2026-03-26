package org.opentmf.tmf655.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IEntity;

/**
 * A record in a worklog.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-655: Change Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRecord extends IEntity {

  /**
   * The date time that a record is generated.
   */
  OffsetDateTime getDateTime();

  /**
   * The detail description in a record.
   */
  String getDescription();

  /**
   * The person who logged that record.
   */
  String getSupportPerson();
}
