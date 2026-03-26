package org.opentmf.common.model;

import java.util.List;

/**
 * A tax exemption certificate represents a tax exemption granted to a party
 * (individual or organization) by a tax jurisdiction which may be a city,
 * state, country,... An exemption has a certificate identifier (received from
 * the jurisdiction that levied the tax) and a validity period. An exemption is
 * per tax types and determines for each type of tax what portion of the tax is
 * exempted (partial by percentage or complete) via the tax definition.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITaxExemptionCertificate extends IExtensible {

  /**
   * An attachment by value or by reference. An attachment complements the
   * description of an element, for example through a document, a video, a
   * picture.
   */
  IAttachmentRefOrValue getAttachment();

  /**
   * Identifier of a document that shows proof of exemption from taxes for the
   * taxing jurisdiction.
   */
  String getCertificateNumber();

  /**
   * Identifier of the tax exemption within list of the exemptions.
   */
  String getId();

  /**
   * Name of the jurisdiction that issued the exemption.
   */
  String getIssuingJurisdiction();

  /**
   * Reason for the tax exemption.
   */
  String getReason();

  /**
   * A list of taxes that are covered by the exemption, e.g. City Tax, State Tax.
   * The definition would include the exemption (e.g. for a rate exemption 0%
   * would be a full exemption, 5% could be a partial exemption if the actual rate
   * was 10%).
   */
  List<? extends ITaxDefinition> getTaxDefinitions();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
