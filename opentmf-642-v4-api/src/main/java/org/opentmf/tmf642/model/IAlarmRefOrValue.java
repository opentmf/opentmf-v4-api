package org.opentmf.tmf642.model;

import org.opentmf.common.model.IAlarm;

/**
 * An alarm defined by reference or value. The polymorphic attributes {@literal @}type,
 * {@literal @}schemaLocation & {@literal @}referredType are related to the alarm entity and not the
 * RelatedAlarmRefOrValue class itself.
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
public interface IAlarmRefOrValue extends IAlarm {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Name of the related entity.
   */
  String getName();
}
