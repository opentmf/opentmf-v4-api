package org.opentmf.tmf634.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceCategoryDeleteEventPayload {

  /**
   * The (resource) category resource is used to group resource candidates in
   * logical containers. Categories can contain other categories.
   */
  IResourceCategory getResourceCategory();
}
