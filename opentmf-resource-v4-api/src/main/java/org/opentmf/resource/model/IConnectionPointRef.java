package org.opentmf.resource.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Connection point reference. A connection point provides a service access
 * point (SAP) for input and/or output of the resource function.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IConnectionPointRef extends IEntityRef {

  /**
   * Connection point version.
   */
  String getVersion();
}
