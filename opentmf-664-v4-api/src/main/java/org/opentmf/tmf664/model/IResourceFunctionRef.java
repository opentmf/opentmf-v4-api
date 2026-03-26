package org.opentmf.tmf664.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Resource Function reference.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceFunctionRef extends IEntityRef {

  /**
   * Resource function version.
   */
  String getVersion();
}
