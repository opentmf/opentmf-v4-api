package org.opentmf.resource.model;

import org.opentmf.common.model.IResource;

/**
 * Logic resource is a type of resource that describes the common set of
 * attributes shared by all concrete logical resources (e.g. TPE, MSISDN, IP
 * Addresses) in the inventory.
 *
 * <p><br/>
 * <strong>Required:</strong> href, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-639: Resource Inventory Management API</li>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILogicalResource extends IResource {

  /**
   * the value of the logical resource. E.g '0746712345' for MSISDN's.
   */
  String getValue();
}
