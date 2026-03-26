package org.opentmf.tmf696.model;

import org.opentmf.customer.model.IShoppingCartRef;

/**
 * This is a task resource allowing assessment of the risks associated with a
 * shopping cart - presumably created by a party role and containing one or more
 * product offerings.
 *
 * <p><br/>
 * <strong>Required:</strong> shoppingCart<br/>
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
public interface IShoppingCartRiskAssessment extends IRiskAssessment {

  /**
   * ShoppingCart (ShoppingCartRef) . The shopping cart which the recommendation
   * is related with.
   */
  IShoppingCartRef getShoppingCart();
}
