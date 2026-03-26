package org.opentmf.tmf915.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRule;
import org.opentmf.common.model.ITimePeriod;

/**
 * An Ai Contract represents a contract or arrangement, either written or verbal
 * and sometimes enforceable by law, such as a service level agreement or a
 * customer price agreement. An agreement involves a number of other business
 * entities, such as products, services, and resources and/or their
 * specifications.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> aiContractSpecification, aiModel, relatedParty, state<br/>
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
public interface IAiContractCreate extends IRuleUpdate {

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getAiContractSpecification();

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getAiModel();

  OffsetDateTime getApprovalDate();

  Boolean getApproved();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getCharacteristics();

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
