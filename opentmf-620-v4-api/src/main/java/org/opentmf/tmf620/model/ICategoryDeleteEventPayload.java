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
public interface ICategoryDeleteEventPayload {

  /**
   * The category resource is used to group product offerings, service and
   * resource candidates in logical containers. Categories can contain other
   * categories and/or product offerings, resource or service candidates.
   */
  ICategory getCategory();
}
