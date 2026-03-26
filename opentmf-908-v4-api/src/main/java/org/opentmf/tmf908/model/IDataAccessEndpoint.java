package org.opentmf.tmf908.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IPlace;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceRelationship;

/**
 * This is the endpoint exposed by the IoT Device to authorized users.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDataAccessEndpoint extends INamedEntity {

  String getApiType();

  /**
   * Category of the concrete resource, such as: Gold, Silver for MSISDN concrete
   * resource.
   */
  String getCategory();

  List<? extends IResourceCharacteristic> getCharacteristics();

  /**
   * Free-text description of the resource.
   */
  String getDescription();

  /**
   * The date till the resource is effective.
   */
  OffsetDateTime getEndDate();

  /**
   * The life cycle state of the resource.
   */
  String getLifecycleState();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * List of: Party role reference. A party role represents the part played by a
   * party in a given context.
   */
  List<? extends IPartyRoleRef> getPartyRoles();

  /**
   * Place reference. Place defines the places where the products are sold or
   * delivered.
   */
  IPlace getPlace();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

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
   * A date time( DateTime). The date from which the resource is effective.
   */
  OffsetDateTime getStartDate();

  /**
   * URI for using the data access API.
   */
  String getUri();

  /**
   * The value of the logical resource, such as: 0044746712345 for an MSISDN.
   */
  String getValue();

  /**
   * A field that identifies the specific version of an instance of a resource.
   */
  String getVersion();
}
