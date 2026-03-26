package org.opentmf.tmf724.model;

import org.opentmf.common.model.IEntity;

/**
 * The name of RootCause, for example:Power Down.
 *
 * <p><br/>
 * <strong>Required:</strong> location<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-724: Incident Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRootCause extends IEntity {

  String getLocation();
}
