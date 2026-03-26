package org.opentmf.common.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * Represents a task used to import resources from a file
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
public interface IImportJobCreate extends IExtensible {

  /**
   * Date at which the job was completed.
   */
  OffsetDateTime getCompletionDate();

  /**
   * Indicates the format of the imported data.
   */
  String getContentType();

  /**
   * Date at which the job was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * Reason for failure if status is failed.
   */
  String getErrorLog();

  /**
   * URL of the root resource where the content of the file specified by the
   * import job must be applied.
   */
  String getPath();

  /**
   * Valid values for the state of a batch job (e.g. catalog import)
   * <br/><p>Recommended values: Not Started, Running, Succeeded, Failed.
   */
  String getStatus();

  /**
   * URL of the file containing the data to be imported.
   */
  URI getUrl();
}
