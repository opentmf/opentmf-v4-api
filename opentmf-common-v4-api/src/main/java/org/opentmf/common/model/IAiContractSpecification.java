package org.opentmf.common.model;

import java.net.URI;

/**
 * A template of an agreement that can be used when establishing partnerships.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAiContractSpecification extends IAiContractSpecificationCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
