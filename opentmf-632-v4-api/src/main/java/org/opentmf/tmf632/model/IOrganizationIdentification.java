package org.opentmf.tmf632.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Represents our registration of information used as proof of identity by an
 * organization.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IOrganizationIdentification extends IExtensible {

  /**
   * An attachment by value or by reference. An attachment complements the
   * description of an element, for example through a document, a video, a
   * picture.
   */
  IAttachmentRefOrValue getAttachment();

  /**
   * Identifier.
   */
  String getIdentificationId();

  /**
   * Type of identification information used to identify the company in a country
   * or internationally.
   */
  String getIdentificationType();

  /**
   * Authority which has issued the identifier (chamber of commerce...).
   */
  String getIssuingAuthority();

  /**
   * Date at which the identifier was issued.
   */
  OffsetDateTime getIssuingDate();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
