package org.opentmf.tmf713.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IWorkSpecificationUpdateBase;

/**
 * Definition of the nature of a Work Unit. For example, could be wiring,
 * equipment installation, etc.
 * <br/>Skipped properties: id,href,lastUpdate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkSpecificationUpdate extends IWorkSpecificationUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  Boolean getIsAppointmentRequired();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Relationship to another work specification, might be dependency,
   * substitution, etc.
   */
  List<? extends IWorkSpecificationRelationship> getWorkSpecRelationships();
}
