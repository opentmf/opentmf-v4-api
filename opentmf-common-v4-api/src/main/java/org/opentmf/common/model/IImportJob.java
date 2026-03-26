package org.opentmf.common.model;

import java.net.URI;

/**
 * Represents a task used to import resources from a file.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IImportJob extends IImportJobCreate {

  /**
   * Reference of the import job.
   */
  URI getHref();

  /**
   * Identifier of the import job.
   */
  String getId();
}
