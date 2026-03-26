package org.opentmf.tmf655.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExternalReference;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.ISLARef;
import org.opentmf.common.model.IServiceProblemRef;
import org.opentmf.general.model.IEntitySpecificationRef;

/**
 * Change Request is a type of request which can be used for the management and
 * control of Change Management process 
 * <br/> -within a service provider organisation or 
 * <br/> -between a customer and a service provider or 
 * <br/> -between a service provider and a partner and vice versa.
 * <br/>Skipped properties: id,href,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type.
 *
 * <p><br/>
 * <strong>Required:</strong> targetEntity<br/>
 * </p>
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
public interface IChangeRequestUpdate {

  /**
   * Date and time when the change implementation actually finished.
   */
  OffsetDateTime getActualEndTime();

  /**
   * Date and time when the change implementation actually started.
   */
  OffsetDateTime getActualStartTime();

  /**
   * The attachments of the communication message (when it is email type).
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getBudget();

  List<? extends IChangeRequestRelationship> getChangeRelationships();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getChangeRequestCharacteristics();

  /**
   * A channel represents the way the Change Request was created.
   */
  String getChannel();

  /**
   * Date and time when the change request is confirmed to be completed.
   */
  OffsetDateTime getCompletionDate();

  /**
   * Description of the change request.
   */
  String getDescription();

  /**
   * List of: External reference of the individual or reference in other system.
   */
  List<? extends IExternalReference> getExternalReferences();

  /**
   * Indicates the impact of this change.
   */
  String getImpact();

  /**
   * List of: A reference to an imapcted entity.
   */
  List<? extends IImpactEntity> getImpactEntities();

  /**
   * Date and time when the change request was updated.
   */
  OffsetDateTime getLastUpdateDate();

  /**
   * Related Entity reference. A related place defines a place described by
   * reference or by value linked to a specific entity. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place entity and
   * not the RelatedPlaceRefOrValue class itself.
   */
  IRelatedPlaceRefOrValue getLocation();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * Date and time when the change implementation is planned to be finished.
   */
  OffsetDateTime getPlannedEndTime();

  /**
   * Date and time when the change implementation is planned to be started.
   */
  OffsetDateTime getPlannedStartTime();

  /**
   * Used by consumers to prioritize a change request in Change Management system.
   */
  String getPriority();

  List<? extends IServiceProblemRef> getProblemTickets();

  /**
   * The parties involved in the change request.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Date and time when the change request is raised.
   */
  OffsetDateTime getRequestDate();

  /**
   * Indicates the type of the change request.
   */
  String getRequestType();

  /**
   * The way one or more change request has been implementation through a direct
   * remedy or task.
   */
  IResolution getResolution();

  /**
   * The risk to implement this change request.
   */
  String getRisk();

  /**
   * The risk mitigation plan.
   */
  String getRiskMitigationPlan();

  /**
   * The additional cost if the risk will happen.
   */
  String getRiskValue();

  /**
   * Date and time that the schedule is made.
   */
  OffsetDateTime getScheduledDate();

  /**
   * List of: ServiceLevelAgreement reference: A service level agreement (SLA) is
   * a type of agreement that represents a formal negotiated agreement between two
   * parties designed to create a common understanding about products, services,
   * priorities, responsibilities, and so forth. The SLA is a set of appropriate
   * procedures and targets formally or informally agreed between parties in order
   * to achieve and maintain specified Quality of Service.
   */
  List<? extends ISLARef> getSlas();

  /**
   * reference to an EntitySpecification object.
   */
  IEntitySpecificationRef getSpecification();

  /**
   * Possible values for the state of the change request
   * <br/><p>Recommended values: acknowledged, requestForAuthorization,
   * waitForApproval, approved, scheduled, postImplementationReview,
   * fallbackExecution, cancelled, rejected, inProgress, failed, completed.
   */
  String getStatus();

  /**
   * Date and time when the change request status was changed.
   */
  OffsetDateTime getStatusChangeDate();

  /**
   * Reason of the status change.
   */
  String getStatusChangeReason();

  /**
   * List of: A reference to an entity, where the type of the entity is not known
   * in advance.
   */
  List<? extends IRelatedEntity> getTargetEntities();

  /**
   * List of: TroubleTicket reference, for when a Trouble Ticket is used by other
   * entities.
   */
  List<? extends ITroubleTicketRef> getTroubleTickets();

  /**
   * List of: A record of the work performed on the change request during the
   * investigation and resolution process.
   */
  List<? extends IWorkLog> getWorkLogs();
}
