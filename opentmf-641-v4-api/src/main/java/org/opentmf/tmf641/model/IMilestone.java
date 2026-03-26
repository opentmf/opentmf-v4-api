package org.opentmf.tmf641.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;

/**
 * Milestone represents an action or event marking a significant change or stage
 * in a process like an order process.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-641: Service Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMilestone extends IExtensible {

  /**
   * free-text description of the Milestone.
   */
  String getDescription();

  /**
   * identifier of the Milestone.
   */
  String getId();

  /**
   * A string represents the message of the milestone.
   */
  String getMessage();

  /**
   * A date time( DateTime). The date that the milestone happens.
   */
  OffsetDateTime getMilestoneDate();

  /**
   * A string used to give a name to the milestone.
   */
  String getName();

  /**
   * The milestone status.
   */
  String getStatus();
}
