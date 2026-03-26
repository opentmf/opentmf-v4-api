package org.opentmf.tmf642.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * Task resource for ungroup alarms operation
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> alarmChangedTime, correlatedAlarm, parentAlarm, sourceSystemId<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-642: Alarm Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUnGroupAlarmsCreate extends IExtensible {

  /**
   * Time of the uncorrelation.
   */
  OffsetDateTime getAlarmChangedTime();

  /**
   * Correlated alarms.
   */
  List<? extends IAlarmRefOrValue> getCorrelatedAlarms();

  /**
   * An alarm defined by reference or value. The polymorphic attributes {@literal @}type,
   * {@literal @}schemaLocation & {@literal @}referredType are related to the alarm entity and not the
   * RelatedAlarmRefOrValue class itself.
   */
  IAlarmRefOrValue getParentAlarm();

  /**
   * Source system identifier.
   */
  String getSourceSystemId();

  /**
   * Current state of the operation task.
   */
  String getState();

  /**
   * The successfully uncorrelated alarms.
   */
  List<? extends IAlarmRefOrValue> getUnGroupedAlarms();
}
