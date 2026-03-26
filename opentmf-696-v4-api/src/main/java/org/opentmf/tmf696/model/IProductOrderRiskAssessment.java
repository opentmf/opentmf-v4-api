package org.opentmf.tmf696.model;

import org.opentmf.common.model.IProductOrderRef;

/**
 * This is a task resource allowing assessment of the risks associated with a
 * product order - presumably submitted by a party role and containing one or
 * more product offerings.
 *
 * <p><br/>
 * <strong>Required:</strong> productOrder<br/>
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
public interface IProductOrderRiskAssessment extends IRiskAssessment {

  /**
   * ProductOrder (ProductOrder) .The product order which the recommendation is
   * related with.
   */
  IProductOrderRef getProductOrder();
}
