package org.opentmf.common.model;

import java.net.URI;

/**
 * A template of an agreement that can be used when establishing partnerships.
 *
 * <p><br/>
 * <strong>Required:</strong> attachment, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-651: Agreement Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementSpecification extends IAgreementSpecificationUpdate {

  /**
   * Reference of the agreement specification.
   */
  URI getHref();

  /**
   * Unique identifier of the agreement specification.
   */
  String getId();
}
