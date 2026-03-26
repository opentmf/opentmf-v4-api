package org.opentmf.tmf711.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristicSpecification;
import org.opentmf.common.model.IConstraintRef;
import org.opentmf.common.model.IEntityCatalogUpdateBase;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.partner.model.IShipmentSpecificationRelationship;
import org.opentmf.partner.model.ITargetShipmentSchema;

/**
 * Definition of the nature of a Shipment. For example, could be a standard
 * ground delivery, overnight express with signature required by an adult, etc.
 * <br/>Skipped properties: id,href,lastUpdate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-711: Shipment Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShipmentSpecificationUpdate extends IEntityCatalogUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * This is a list of constraint references applied to this specification.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * isBundle determines whether an ShipmentSpecification represents a single
   * ShipmentSpecification (false), or a bundle of ShipmentSpecification (true).
   */
  Boolean getIsBundle();

  /**
   * Parties who manage or otherwise have an interest in this shipment
   * specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Relationship to another shipment specification, might be dependency,
   * substitution, etc.
   */
  List<? extends IShipmentSpecificationRelationship> getShipmentSpecRelationships();

  /**
   * Possible values for the signature requirement upon receiving the shipment
   * <br/><p>Recommended values: adult, receiver.
   */
  String getSignatureRequiredBy();

  /**
   * List of characteristics that the shipment can take.
   */
  List<? extends ICharacteristicSpecification> getSpecCharacteristics();

  /**
   * The reference object to the schema and type of target shipment which is
   * described by shipment specification.
   */
  ITargetShipmentSchema getTargetShipmentSchema();
}
