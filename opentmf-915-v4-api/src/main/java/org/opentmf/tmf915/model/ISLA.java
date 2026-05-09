package org.opentmf.tmf915.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRule;
import org.opentmf.common.model.ITemplateRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * Part of a business agreement between a Service Provider and a Customer,
 * quantitatively specifying the service performance level the Service Provider
 * commits to deliver.
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
public interface ISLA extends INamedEntity {

  OffsetDateTime getApprovalDate();

  Boolean getApproved();

  /**
   * Description of the Service Level Agreement (SLA).
   */
  String getDescription();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  List<? extends IRule> getRules();

  /**
   * State of the Service Level Agreement (SLA).
   */
  String getState();

  ITemplateRef getTemplate();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Version of the Service Level Agreement (SLA).
   */
  String getVersion();
}
