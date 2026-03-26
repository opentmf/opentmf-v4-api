package org.opentmf.tmf696.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductOfferingRef;

/**
 * This is a task resource allowing assessment of the risks associated with a
 * product offering. For example, the risk associated with iPhone X will
 * probably be higher than the risk for a battery.
 *
 * <p><br/>
 * <strong>Required:</strong> productOffering<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-696: Risk Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingRiskAssessment extends IExtensible {

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();
}
