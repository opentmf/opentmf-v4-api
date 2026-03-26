package org.opentmf.tmf654.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITransferBalanceFailureEventPayload {

  /**
   * The TransferBalance resource is a detailed description of credit transfer
   * operation requested between two buckets (reference to products owned by
   * customers and consuming credit when using a service).
   */
  ITransferBalance getTransferBalance();
}
