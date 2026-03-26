package org.opentmf.tmf666.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Proof of freedom from taxes imposed by a taxing jurisdiction.
 *
 * <p><br/>
 * <strong>Required:</strong> issuingJurisdiction, validFor<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAccountTaxExemption extends IExtensible {

  /**
   * Identifier of a document that shows proof of exemption from taxes for the
   * taxing jurisdiction.
   */
  String getCertificateNumber();

  /**
   * Name of the taxing jurisdiction for which taxes are exempt.
   */
  String getIssuingJurisdiction();

  /**
   * Reason of the tax exemption.
   */
  String getReason();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
