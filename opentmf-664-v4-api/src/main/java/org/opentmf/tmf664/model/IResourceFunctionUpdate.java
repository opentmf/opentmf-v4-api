package org.opentmf.tmf664.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IFeature;
import org.opentmf.common.model.IHeaderItem;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.IResourceRelationship;
import org.opentmf.common.model.IResourceSpecificationRef;
import org.opentmf.resource.model.IConnectionPointRef;
import org.opentmf.resource.model.IResourceGraph;
import org.opentmf.resource.model.IScheduleRef;

/**
 * A ResourceFunction is a behavior to transform inputs of any nature into
 * outputs of any nature independently from the way it is provided.
 * <br/>Skipped properties: id,href,usageState.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceFunctionUpdate extends IHeaderItem {

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
   * List of the kinds of auto-modifications that are applied to a given network
   * service e.g. what can be scaled.
   */
  List<? extends ICharacteristic> getAutoModifications();

  /**
   * Category of the concrete resource. e.g. Gold, Silver for MSISDN concrete
   * resource.
   */
  String getCategory();

  /**
   * External connection points of the resource function. These are the service
   * access points (SAP) where inputs and outputs of the function are available.
   */
  List<? extends IConnectionPointRef> getConnectionPoints();

  /**
   * Internal connectivity of contained resource functions.
   */
  List<? extends IResourceGraph> getConnectivities();

  /**
   * free-text description of the resource.
   */
  String getDescription();

  /**
   * A date time( DateTime). The date till the resource is operating.
   */
  OffsetDateTime getEndOperatingDate();

  /**
   * A type of the Resource Function as specified by the provider of the API.
   */
  String getFunctionType();

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
   * Priority of the Resource Function. Decides what happens in a contention
   * scenario.
   */
  Integer getPriority();

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
   * Role of the Resource Function. Used when Resource Function is a component of
   * a composite Resource Function and the exact role of the service within the
   * composite is not clear from descriptor/location.
   */
  String getRole();

  /**
   * This is a reference to a schedule. Allows consumers to schedule modifications
   * to the service at certain times.
   */
  List<? extends IScheduleRef> getSchedules();

  /**
   * A date time( DateTime). The date from which the resource is operating.
   */
  OffsetDateTime getStartOperatingDate();
}
