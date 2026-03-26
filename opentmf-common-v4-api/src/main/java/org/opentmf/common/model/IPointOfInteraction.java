package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * POI consists of hardware and software which enables a Cardholder and/or an
 * Acceptor to perform a Local Card transaction. This is also referred to as a
 * Physical/EMV Terminal. It may be Attended or Unattended.
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
public interface IPointOfInteraction extends IEntity {

  /**
   * Key entry code that tells the processor how the transaction was captured.
   */
  String getModeOfEntry();

  IResourceRef getResource();

  /**
   * The reference number used to identify a given transaction that allow the
   * Acceptor or Acquirer to keep track of their transactions.
   */
  String getRetrievalReferenceNumber();

  /**
   * Date time related to the POI transaction.
   */
  OffsetDateTime getTransactionDate();
}
