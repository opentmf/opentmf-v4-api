package org.opentmf.general.model;

import org.opentmf.common.model.IPolicyRef;

/**
 * reference to an PolicySpecification object.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPolicySpecificationRef extends IPolicyRef {

  /**
   * PolicySpecification version.
   */
  String getVersion();
}
