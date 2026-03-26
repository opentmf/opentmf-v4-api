package org.opentmf.partner.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.ITimePeriod;

/**
 * Instructions and details for the carrier.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShippingInstruction extends IEntity {

  /**
   * The carrier identifier.
   */
  String getCarrierId();

  /**
   * The carrier name.
   */
  String getCarrierName();

  /**
   * The service code used by the carrier to ship the package, royal mail ground,
   * royal mail first class, etc.
   */
  String getCarrierServiceCode();

  /**
   * Shipping delivery attempts that should be performed.
   */
  Integer getDeliveryAttempts();

  /**
   * Shipping delivery speed, same day, next day, next business day, etc.
   */
  String getDeliverySpeed();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getDeliveryTimeSlot();

  /**
   * Additional shipping characteristics that maybe specific to one or another
   * carrier.
   */
  List<? extends ICharacteristic> getInstructionCharacteristics();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getInsuredValue();

  /**
   * Shipping delivery message label.
   */
  String getLabelMessage();

  /**
   * A list of notes made on this shipment item.
   */
  List<? extends INote> getNotes();

  /**
   * The type of packaging.
   */
  String getPackageType();

  /**
   * Delivery confirmation required for the shipment (none, signature,
   * over18Signature).
   */
  String getReceiptConfirmation();

  /**
   * The shipping type, e.g. thick_envelope, small_flat_rate_box, large_package,
   * etc.
   */
  String getShippingType();

  Boolean getSignatureRequired();

  /**
   * Possible values for the signature requirement upon receiving the shipment
   * <br/><p>Recommended values: adult, receiver.
   */
  String getSignatureRequiredBy();

  /**
   * The identification of the warehouse that the shipment is being shipped from.
   */
  String getWarehouseId();
}
