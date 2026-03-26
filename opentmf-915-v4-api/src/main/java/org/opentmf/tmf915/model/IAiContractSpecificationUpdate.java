package org.opentmf.tmf915.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IWorkSpecificationUpdateBase;

/**
 * A template of an agreement that can be used when establishing partnerships
 * <br/>Skipped properties: id,href,lastUpdate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAiContractSpecificationUpdate extends IWorkSpecificationUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();
}
