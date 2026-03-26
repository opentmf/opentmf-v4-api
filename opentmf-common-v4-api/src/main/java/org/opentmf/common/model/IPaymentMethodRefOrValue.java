package org.opentmf.common.model;


/**
 * link to the resource that holds information about the payment mean used to
 * complete the operation.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-676: Payment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPaymentMethodRefOrValue extends IPaymentMethod {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
