package org.opentmf.common.model;


/**
 * Represents a task used to export resources to a file
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> url<br/>
 * </p>
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
public interface IExportJobCreate extends IImportJobCreate {

  /**
   * Used to scope the exported data.
   */
  String getQuery();
}
