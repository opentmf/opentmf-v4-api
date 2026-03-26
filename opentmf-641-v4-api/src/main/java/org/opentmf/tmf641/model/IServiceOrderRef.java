package org.opentmf.tmf641.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Service Order reference. Useful to understand the which was the Service order
 * through which the service was instantiated in the service inventory.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-641: Service Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceOrderRef extends IEntityRef {
}
