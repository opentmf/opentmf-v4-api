package org.opentmf.tmf655.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IEntity;

/**
 * A record of the work performed on the change request during the investigation
 * and resolution process.
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
public interface IWorkLog extends IEntity {

  /**
   * Date and time of worklog generated.
   */
  OffsetDateTime getCreateDateTime();

  /**
   * The description of the worklog.
   */
  String getDescription();

  /**
   * Date and time when the worklog updated.
   */
  String getLastUpdateDateTime();

  /**
   * List of: A record in a worklog.
   */
  List<? extends IRecord> getRecords();
}
