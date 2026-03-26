package org.opentmf.tmf651.model;

import java.util.List;
import org.opentmf.common.model.IAgreementSpecCharacteristic;
import org.opentmf.common.model.IAgreementSpecificationRelationship;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceSpecificationCreateBase;

/**
 * A template of an agreement that can be used when establishing partnerships
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> attachment, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-651: Agreement Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementSpecificationCreate extends IResourceSpecificationCreateBase {

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

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
}
