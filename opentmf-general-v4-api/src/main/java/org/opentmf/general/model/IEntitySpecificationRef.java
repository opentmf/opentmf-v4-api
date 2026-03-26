package org.opentmf.general.model;

import org.opentmf.common.model.IEntityRef;

/**
 * reference to an EntitySpecification object.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-655: Change Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-701: Process Flow Management API</li>
 *   <li>TMF-703: Entity Inventory Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntitySpecificationRef extends IEntityRef {

  /**
   * EntitySpecification version.
   */
  String getVersion();
}
