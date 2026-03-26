package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * A template of an agreement that can be used when establishing partnerships.
 *
 * <p><br/>
 * <strong>Required:</strong> attachment, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-651: Agreement Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementSpecification extends INamedEntity {

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * A narrative that explains in detail what the agreement specification is
   * about.
   */
  String getDescription();

  /**
   * If true, this agreement specification is a grouping of other agreement
   * specifications. The list of bundled agreement specifications is provided by
   * the specificationRelationship property.
   */
  Boolean getIsBundle();

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Indicates the current lifecycle status.
   */
  String getLifecycleStatus();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * The category for grouping recommendations.
   */
  ICategoryRef getServiceCategory();

  /**
   * List of: A characteristic quality or distinctive feature of an agreement.
   */
  List<? extends IAgreementSpecCharacteristic> getSpecificationCharacteristics();

  /**
   * List of: A relationship between agreement specifications. Typical
   * relationships are substitution and dependency.
   */
  List<? extends IAgreementSpecificationRelationship> getSpecificationRelationships();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Agreement specification version.
   */
  String getVersion();
}
