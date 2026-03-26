package org.opentmf.tmf620.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingDeleteEventPayload {

  /**
   * Represents entities that are orderable from the provider of the catalog, this
   * resource includes pricing information.
   */
  IProductOffering getProductOffering();
}
