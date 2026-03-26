package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IPlace;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceRef;
import org.opentmf.common.model.IServiceProblemRef;
import org.opentmf.common.model.IServiceRef;

/**
 * The problem information for Middle B which is abstracted in the service layer
 * from the issued event information by First B.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360ServiceProblemVO extends IEntity {

  /**
   * A list of the locations affected by the problem. At least one of
   * affectedResource, affectedService or affectedLocation should be present.
   */
  List<? extends IPlace> getAffectedLocations();

  /**
   * Number of affected services.
   */
  Integer getAffectedNumberOfServices();

  /**
   * List of affected services. At least one of affectedResource, affectedService
   * or affectedLocation should be present.
   */
  List<? extends IServiceRef> getAffectedServices();

  /**
   * Classifier for the problem. Settable. For example, this is used for
   * distinguish the category of problem originator in [role].[category] format.
   * Example: serviceProvider.declarer, supplier.originated, system.originated.
   */
  String getCategory();

  /**
   * Additional identifier coming from an external system.
   */
  String getCorrelationId();

  /**
   * Free form text describing the Service Problem.
   */
  String getDescription();

  /**
   * A generic list of any type of elements. Used for vendor Extensions or loose
   * element encapsulation from other namespaces.
   */
  List<? extends ICharacteristic> getExtensionInfoes();

  /**
   * Impact Importance is characterized by an Impact Importance Factor: overall
   * importance of the impact of all the affected services, e.g. 0 (zero impact)
   * to 100 (worst impact). The Impact Importance is a calculated field which is
   * set by the OSS determining the impact.
   */
  String getImpactImportanceFactor();

  /**
   * Indicates where the problem was generated.
   */
  String getOriginatingSystem();

  /**
   * An indication varying from 1 (highest) to 10 (lowest) of how important it is
   * for the service provider to correct the Service Problem.
   */
  Integer getPriority();

  /**
   * Indicates if this service problem has been escalated or not. Possible values
   * are 0 to 10. A value of zero means no escalation. The meanings of values 1-10
   * are to be determined by the user of the interface, but they show increasing
   * levels of escalation.
   */
  String getProblemEscalation();

  /**
   * Free text or optionally structured text. It can be Unknown.
   */
  String getReason();

  /**
   * List of objects associated to this problem.
   */
  List<? extends IRelatedEntityRef> getRelatedObjects();

  /**
   * List of parties or party roles playing a role within the service problem.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Time the problem was resolved.
   */
  OffsetDateTime getResolutionDate();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getResponsibleParty();

  /**
   * Resource(s) that are associated to the underlying service problems that are
   * the Root Cause of this one if any (used only if applicable).
   */
  List<? extends IResourceRef> getRootCauseResources();

  /**
   * The current status of the service problem. Possible values are Submitted,
   * Rejected, Acknowledged, In Progress [Held, Pending], Resolved, Closed, and
   * Cancelled.
   */
  String getStatus();

  /**
   * Time the problem was last status changed.
   */
  OffsetDateTime getStatusChangeDate();

  /**
   * The reason of state change.
   */
  String getStatusChangeReason();

  /**
   * Time the problem was last changed.
   */
  OffsetDateTime getTimeChanged();

  /**
   * Time the problem was raised.
   */
  OffsetDateTime getTimeRaised();

  /**
   * A list of underlying problems. Relevant only if this problem is derived from
   * other problems.
   */
  List<? extends IServiceProblemRef> getUnderlyingProblems();
}
