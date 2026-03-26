package org.opentmf.tmf677.model;

import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * The consumption counters (called ConsumptionSummary in the SID model) detail
 * for example the different kind of consumption done on the bucket.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-677: Usage Consumption Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IConsumptionSummary extends IEntity {

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getConsumptionPeriod();

  /**
   * Type of the consumption counter. We can give for example a counter of the
   * used value for a bucket (counterType=used for example) or the value of the
   * consumption done out of the bucket(s) (counterType=outOfBucket for example).
   */
  String getCounterType();

  /**
   * Counter level. The counter can be given globally for the bucket or detailed
   * by user or by network product for example in case of shared bucket.
   */
  String getLevel();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getUser();

  /**
   * An amount in a given unit.
   */
  IQuantity getValue();

  /**
   * Value of the counter in a formatted string used for display needs for
   * example.
   */
  String getValueName();
}
