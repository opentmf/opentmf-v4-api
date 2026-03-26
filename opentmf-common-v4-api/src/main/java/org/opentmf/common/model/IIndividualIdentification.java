package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Represents our registration of information used as proof of identity by an
 * individual (passport, national identity card, drivers license, social
 * security number, birth certificate).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 *   <li>TMF-691: Federated ID Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIndividualIdentification extends IExtensible {

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
   * Identification type (passport, national identity card, drivers license,
   * social security number, birth certificate).
   */
  String getIdentificationType();

  /**
   * Authority which has issued the identifier, such as: social security, town
   * hall.
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
