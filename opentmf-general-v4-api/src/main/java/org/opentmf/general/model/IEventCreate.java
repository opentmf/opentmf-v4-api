package org.opentmf.general.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IEventBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * event with common attributes.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-688: Event Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEventCreate extends IEventBase {

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
   * When subclassing, this defines the subclass entity name.
   */
  String getAtType();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getAnalyticCharacteristics();

  Object getEvent();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getReportingSystem();

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getSource();
}
