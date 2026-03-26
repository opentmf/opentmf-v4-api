package org.opentmf.tmf724.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IExternalIdentifier;
import org.opentmf.general.model.IResourceEntity;

/**
 * An Incident is a record of an event that has altered the operational state of
 * a entity (Resource, Service or Customers Product). An incident represents an
 * issue that needs to be diagnosed and resolved.
 * <br/>Skipped properties:
 * id,href,lifecycleStatus,creationDate,statusChangeDate.
 *
 * <p><br/>
 * <strong>Required:</strong> ackState, category, domain, name, occurTime, priority, sourceObject, state<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-724: Incident Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIncidentCreate extends IExtensible {

  /**
   * Possible values for the ack state of an Incident
   * <br/><p>Recommended values: acknowledged, unacknowledged.
   */
  String getAckState();

  /**
   * The ackTime or acknowledgeTime of the incident. An acknowledged incident is
   * being worked on, but is not yet resolved.
   */
  OffsetDateTime getAckTime();

  /**
   * List of affected entities.
   */
  List<? extends IEntityRef> getAffectedEntities();

  /**
   * The category of the incident (category is the term used by ITU).
   */
  String getCategory();

  /**
   * The clear time of the incident.
   */
  OffsetDateTime getClearTime();

  /**
   * The domain of the incident, for example RAN, PON, OTN, Cross-Domain etc.
   */
  String getDomain();

  /**
   * The correlation event object such as alarm, externalAlarm, performance, etc.
   */
  List<? extends IResourceEntity> getEventIds();

  /**
   * This is used for extend the incident with attributes.
   */
  List<? extends ICharacteristic> getExtensionInfoes();

  /**
   * An identification of an entity that is owned by or originates in a software
   * system different from the current system, for example a ProductOrder handed
   * off from a commerce platform into an order handling system. The structure
   * identifies the system itself, the nature of the entity within the system
   * (e.g. class name) and the unique ID of the entity within the system. It is
   * anticipated that multiple external IDs can be held for a single entity, e.g.
   * if the entity passed through multiple systems on the way to the current
   * system. In this case the consumer is expected to sequence the IDs in the
   * array in reverse order of provenance, i.e. most recent system first in the
   * list.
   */
  List<? extends IExternalIdentifier> getExternalIdentifiers();

  /**
   * Possible values for the impact of an Incident
   * <br/><p>Recommended values: extensive, significant, moderate, minor.
   */
  String getImpact();

  /**
   * A textual succinct description of the nature, symptoms, cause, or effect of
   * the incident.
   */
  String getIncidentDetail();

  /**
   * Incident resolution suggestion or tip to resolve the incident.
   */
  String getIncidentResolutionSuggestion();

  /**
   * The name of the incident. A short-form string that provides succinct,
   * important information about the incident.
   */
  String getName();

  /**
   * Indicates the time (as a date + time) at which the incident occurred at its
   * source.
   */
  OffsetDateTime getOccurTime();

  /**
   * Possible values for the Priority of an Incident
   * <br/><p>Recommended values: critical, high, medium, low.
   */
  String getPriority();

  /**
   * A root cause is a fundamental or underlying reason behind why an incident
   * occurred that identifies one or more failures. An incident many have multiple
   * rootCauses.
   */
  List<? extends IRootCause> getRootCauses();

  /**
   * The root event object such as alarm, externalAlarm, performance, etc.
   */
  List<? extends IResourceEntity> getRootEventIds();

  /**
   * The objects show the incident, it may be part of Network Equipment. Fault
   * object, which may be an NE or a port.
   */
  List<? extends IResourceEntity> getSourceObjects();

  /**
   * Possible values for the state of an Incident
   * <br/><p>Recommended values: raised, updated, cleared.
   */
  String getState();

  /**
   * The last update time of the incident.
   */
  String getUpdateTime();

  /**
   * Possible values for the urgency of an Incident
   * <br/><p>Recommended values: critical, high, medium, low.
   */
  String getUrgency();
}
