package org.opentmf.tmf908.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRef;
import org.opentmf.common.model.IEntityCatalogUpdateBase;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceSpecificationRef;

/**
 * #TODO
 * <br/>Skipped properties: id,href,lastUpdate.
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
public interface IIotDeviceSpecificationUpdate extends IEntityCatalogUpdateBase {

  /**
   * A list of attachments (Attachment [*]). Complements the description of the
   * specification through video, pictures...
   */
  List<? extends IAttachmentRef> getAttachments();

  /**
   * isBundle determines whether a ServiceSpecification represents a single
   * ServiceSpecification (false), or a bundle of ServiceSpecification (true).
   */
  Boolean getIsBundle();

  /**
   * A list of related party references (RelatedParty [*]). A related party
   * defines party or party role linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A list of service spec characteristics (ServiceSpecCharacteristic [*]). This
   * class represents the key features of this service specification.
   */
  List<? extends IResourceSpecCharacteristic> getResourceSpecCharacteristics();

  /**
   * A list of resource specifications related to this specification, e.g.
   * migration, substitution, dependency or exclusivity relationship.
   */
  List<? extends IResourceSpecRelationship> getResourceSpecRelationships();

  /**
   * A list of resource specification references (ResourceSpecificationRef [*]).
   * The ResourceSpecification is required for a service specification with type
   * ResourceFacingServiceSpecification (RFSS).
   */
  List<? extends IResourceSpecificationRef> getResourceSpecifications();

  /**
   * The reference object to the schema and type of target service which is
   * described by service specification.
   */
  ITargetServiceSchema getTargetServiceSchema();
}
