package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Resource is an abstract entity that describes the common set of attributes
 * shared by all concrete resources (e.g. TPE, EQUIPMENT) in the inventory.
 *
 * <p><br/>
 * <strong>Required:</strong> href, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-639: Resource Inventory Management API</li>
 *   <li>TMF-652: Resource Order Management API</li>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-702: Resource Activation Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-716: ResourceReservation</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResource extends INamedEntity {

  /**
   * Configuration features.
   */
  List<? extends IFeature> getActivationFeatures();

  /**
   * ResourceAdministrativeStateType enumerations
   * <br/><p>Recommended values: locked, unlocked, shutdown.
   */
  String getAdministrativeState();

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Category of the concrete resource. e.g. Gold, Silver for MSISDN concrete
   * resource.
   */
  String getCategory();

  /**
   * free-text description of the resource.
   */
  String getDescription();

  /**
   * A date time( DateTime). The date till the resource is operating.
   */
  OffsetDateTime getEndOperatingDate();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * ResourceOperationalStateType enumerations
   * <br/><p>Recommended values: enable, disable.
   */
  String getOperationalState();

  /**
   * Related Entity reference. A related place defines a place described by
   * reference or by value linked to a specific entity. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place entity and
   * not the RelatedPlaceRefOrValue class itself.
   */
  IRelatedPlaceRefOrValue getPlace();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getResourceCharacteristics();

  /**
   * List of: Linked resources to the one instantiate, such as [bundled] if the
   * resource is a bundle and you want to describe the bundled resources inside
   * this bundle; [reliesOn] if the resource needs another already owned resource
   * to rely on (e.g. an option on an already owned mobile access resource)
   * [targets] or [isTargeted] (depending on the way of expressing the link) for
   * any other kind of links that may be useful.
   */
  List<? extends IResourceRelationship> getResourceRelationships();

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
   * ResourceStatusType enumerations
   * <br/><p>Recommended values: standby, alarm, available, reserved, unknown,
   * suspended.
   */
  String getResourceStatus();

  /**
   * A field that identifies the specific version of an instance of a resource.
   */
  String getResourceVersion();

  /**
   * A date time( DateTime). The date from which the resource is operating.
   */
  OffsetDateTime getStartOperatingDate();

  /**
   * ResourceUsageStateType enumerations
   * <br/><p>Recommended values: idle, active, busy.
   */
  String getUsageState();
}
