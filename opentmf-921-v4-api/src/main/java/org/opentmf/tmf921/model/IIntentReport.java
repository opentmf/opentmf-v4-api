package org.opentmf.tmf921.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * IntentReport is the mechanism to report back to Intent owner on an Intents
 * status.
 *
 * <p><br/>
 * <strong>Required:</strong> intent<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-921: Intent Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIntentReport extends INamedEntity {

  /**
   * Date and time of the creation of this intent report.
   */
  OffsetDateTime getCreationDate();

  /**
   * The description of the intent report.
   */
  String getDescription();

  /**
   * Expression is the ontology-encoded form of the Intent.
   */
  IExpression getExpression();

  /**
   * Intent Ref (if Intent already exists) or Value (if Intent be created or its
   * details be presented).
   */
  IIntentRefOrValue getIntent();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
