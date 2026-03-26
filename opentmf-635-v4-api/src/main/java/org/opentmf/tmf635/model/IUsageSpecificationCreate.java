package org.opentmf.tmf635.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IWorkSpecificationUpdateBase;

/**
 * A detailed description of a usage event that are of interest to the business
 * and can have charges applied to it. It is comprised of characteristics, which
 * define all attributes known for a particular type of usage.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageSpecificationCreate extends IWorkSpecificationUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Date and time of the last update of the specification.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();
}
