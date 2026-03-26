package org.opentmf.tmf921.model;

import java.net.URI;
import java.time.OffsetDateTime;
import org.opentmf.common.model.IIntentUpdateBase;

/**
 * An Intent instance is the formal description of all expectations including
 * requirements, goals, and constraints given to a technical system
 * <br/>Skipped properties: id,href,{@literal @}type.
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
public interface IIntentUpdate extends IIntentUpdateBase {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * Date and time of the creation of this Intent.
   */
  OffsetDateTime getCreationDate();

  /**
   * Expression is the ontology-encoded form of the Intent.
   */
  IExpression getExpression();

  /**
   * Date and time of the last update of this Intent.
   */
  OffsetDateTime getLastUpdate();

  /**
   * A date time( DateTime). The date that the entity status changed to the
   * current one.
   */
  OffsetDateTime getStatusChangeDate();
}
