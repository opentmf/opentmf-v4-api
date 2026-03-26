package org.opentmf.tmf633.model;

import java.time.OffsetDateTime;

/**
 * The root entity for service catalog management.
 * <br/>A service catalog is a group of service specifications made available
 * through service candidates that an organization provides to the consumers
 * (internal consumers like its employees or B2B customers or B2C customers). 
 * <br/>A service catalog typically includes name, description and time period
 * that is valid for. It will have a list of ServiceCandidate catalog items. A
 * ServiceCandidate is an entity that makes a ServiceSpecification available to
 * a catalog.
 * <br/>A ServiceCandidate and its associated ServiceSpecification may be
 * "published" - made visible -in any number of ServiceCatalogs, or in none.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceCatalogCreate extends IServiceCatalogUpdate {

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getLastUpdate();
}
