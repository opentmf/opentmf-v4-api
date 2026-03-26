package org.opentmf.tmf652.model;

import java.util.List;
import org.opentmf.common.model.IAppointmentRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IResourceRefOrValue;
import org.opentmf.common.model.IResourceSpecificationRef;

/**
 * An identified part of the order. A resource order is decomposed into one or
 * more order items.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceOrderItem extends IExtensible {

  /**
   * Can be "add" / "modify" / "no_change"/ "delete".
   */
  String getAction();

  /**
   * Refers an appointment, such as a Customer presentation or internal meeting or
   * site visit.
   */
  IAppointmentRef getAppointment();

  /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03,
   * ...).
   */
  String getId();

  List<? extends IResourceOrderItemRelationship> getOrderItemRelationships();

  /**
   * Quantity ordered.
   */
  Integer getQuantity();

  /**
   * Resource is an abstract entity that describes the common set of attributes
   * shared by all concrete resources. The polymorphic attributes {@literal @}type,
   * {@literal @}schemaLocation & {@literal @}referredType are related to the Resource entity and not
   * the related ResourceRefOrValue class itself.
   */
  IResourceRefOrValue getResource();

  /**
   * Resources are physical or non-physical components (or some combination of
   * these) within an enterprise's infrastructure or inventory. They are typically
   * consumed or used by services (for example a physical port assigned to a
   * service) or contribute to the realization of a Product (for example, a SIM
   * card). They can be drawn from the Application, Computing and Network domains,
   * and include, for example, Network Elements, software, IT systems, content and
   * information, and technology components.
   * <br/>A ResourceSpecification is an abstract base class for representing a
   * generic means for implementing a particular type of Resource. In essence, a
   * ResourceSpecification defines the common attributes and relationships of a
   * set of related Resources, while Resource defines a specific instance that is
   * based on a particular ResourceSpecification.
   */
  IResourceSpecificationRef getResourceSpecification();

  /**
   * State of the order item : described in the state machine diagram.
   */
  String getState();
}
