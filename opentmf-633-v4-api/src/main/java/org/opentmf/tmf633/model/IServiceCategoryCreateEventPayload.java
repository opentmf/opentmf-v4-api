package org.opentmf.tmf633.model;

/**
 * The event data structure.
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
public interface IServiceCategoryCreateEventPayload {

  /**
   * The (service) category resource is used to group service candidates in
   * logical containers. Categories can contain other categories.
   */
  IServiceCategory getServiceCategory();
}
