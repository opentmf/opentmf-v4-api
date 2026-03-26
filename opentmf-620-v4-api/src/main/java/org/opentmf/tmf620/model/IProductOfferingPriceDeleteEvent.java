package org.opentmf.tmf620.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingPriceDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IProductOfferingPriceDeleteEventPayload getEvent();
}
