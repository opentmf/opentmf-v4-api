package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * This resource represents an alarm supporting the information model defined in
 * ITU-T X.733.
 * <br/>Skipped properties: id,href,alarmRaisedTime,sourceSystemId.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-642: Alarm Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAlarmUpdate extends IExtensible {

  /**
   * Provides the Acknowledgement State of the alarm.
   */
  String getAckState();

  /**
   * Provides the name of the system that last changed the ackState of an alarm,
   * i.e. acknowledged or unacknowledged the alarm.
   */
  String getAckSystemId();

  /**
   * Provides the id of the user who has last changed the ack state of the alarm,
   * i.e. acknowledged or unacknowledged the alarm.
   */
  String getAckUserId();

  List<? extends IAffectedService> getAffectedServices();

  /**
   * Indicates the last date and time when the alarm is changed on the
   * alarm-owning system. Any change to the alarm whether coming from the alarmed
   * resource, or triggered by a change from the client is changing this time.
   */
  OffsetDateTime getAlarmChangedTime();

  /**
   * Indicates the time (as a date + time) at which the alarm is cleared at the
   * source.
   */
  OffsetDateTime getAlarmClearedTime();

  /**
   * Contains further information on the alarm.
   */
  String getAlarmDetails();

  /**
   * Indicates if this alarm has been escalated or not.
   */
  Boolean getAlarmEscalation();

  /**
   * Indicates the time (as a date + time) at which the alarm occurred at its
   * source.
   */
  OffsetDateTime getAlarmRaisedTime();

  /**
   * Indicates the time (as a date + time) at which the alarm was reported by the
   * owning OSS. It might be different from the alarmRaisedTime. For instance, if
   * the alarm list is maintained by an EMS, the alarmRaisedtime would be the time
   * the alarm
   * <br/> was detected by the NE, while the alarmReportingTime would be the time
   * this alarm was stored in the alarm list of the EMS.
   */
  OffsetDateTime getAlarmReportingTime();

  /**
   * Categorize the alarm. Should be one of the values defined in X.733 8.1.1 or
   * 3GPP TS 32.111-2 Annex A:
   * <br/>	Communications Alarm
   * <br/>	Processing Error Alarm
   * <br/>	Environmental Alarm
   * <br/>	Quality of Service Alarm
   * <br/>	Equipment Alarm
   * <br/>	Integrity Violation
   * <br/>	Operational Violation
   * <br/>	Physical Violation
   * <br/>	Security Service or Mechanism Violation
   * <br/>	Time Domain Violation.
   */
  String getAlarmType();

  /**
   * Identifies the managed object instance associated with the alarm.
   */
  IAlarmedObject getAlarmedObject();

  /**
   * The type (class) of the managed object associated with the event.
   */
  String getAlarmedObjectType();

  /**
   * Provides the id of the system where the user who invoked the alarmCleared
   * operation is located.
   */
  String getClearSystemId();

  /**
   * Provides the id of the user who invoked the alarmCleared operation.
   */
  String getClearUserId();

  /**
   * List of: Indicates the comments entered on the alarm.
   */
  List<? extends IComment> getComments();

  List<? extends IAlarmRef> getCorrelatedAlarms();

  /**
   * Identifies the details of the threshold that has been crossed.
   */
  ICrossedThresholdInformation getCrossedThresholdInformation();

  /**
   * An identifier of the alarm in the source system.
   */
  String getExternalAlarmId();

  /**
   * Indicates whether the alarm is a root cause alarm..
   */
  Boolean getIsRootCause();

  List<? extends IAlarmRef> getParentAlarms();

  /**
   * Lists the possible severities that can be allocated to an Alarm. The values
   * are consistent with ITU-T Recommendation X.733.
   * <br/>Once an alarm has been cleared, its perceived severity is set to
   * 'cleared' and can no longer be set.
   */
  String getPerceivedSeverity();

  /**
   * List of: Related Entity reference. A related place defines a place described
   * by reference or by value linked to a specific entity. The polymorphic
   * attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place
   * entity and not the RelatedPlaceRefOrValue class itself.
   */
  List<? extends IRelatedPlaceRefOrValue> getPlaces();

  /**
   * Indicates that the Managed Object (related to this alarm) is in planned
   * outage (in planned maintenance, or out-of-service).
   */
  String getPlannedOutageIndicator();

  /**
   * Provides the probable cause of the alarm. The values are consistent with
   * ITU-T Recommendation X.733 or 3GPP TS 32.111-2 Annex B.
   */
  String getProbableCause();

  /**
   * Indicates proposed repair actions, if known to the system emitting the alarm.
   */
  String getProposedRepairedActions();

  /**
   * Reporting system identity.
   */
  String getReportingSystemId();

  /**
   * Indicates whether the alarm affects service or not.
   */
  Boolean getServiceAffecting();

  /**
   * Source system identity.
   */
  String getSourceSystemId();

  /**
   * Provides more specific information about the alarm.
   */
  String getSpecificProblem();

  /**
   * Defines the alarm state during its life cycle.
   */
  String getState();
}
