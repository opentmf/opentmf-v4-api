package org.opentmf.service.model;

import org.opentmf.common.model.IService;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-638: Service Inventory Management API</li>
 *   <li>TMF-640: Service Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceStateChangeEventPayload {

  /**
   * Service is a base class for defining the Service hierarchy. All Services are
   * characterized as either being possibly visible and usable by a Customer or
   * not. This gives rise to the two subclasses of Service: CustomerFacingService
   * and ResourceFacingService.
   */
  IService getService();
}
