package org.opentmf.tmf686.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;

/**
 * Represents a task used to discover topology from providers
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-686: Topology API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITopologyDiscoveryJobCreate extends IExtensible {

  /**
   * Date at which the job was completed.
   */
  OffsetDateTime getCompletionDate();

  /**
   * Date at which the job was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getStatus();
}
