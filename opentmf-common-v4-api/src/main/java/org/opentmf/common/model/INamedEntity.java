package org.opentmf.common.model;


/**
 * Entity schema with name, for use in TMForum Open-APIs.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-common: common</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface INamedEntity extends IEntity {

  /**
   * Name of the referred entity.
   */
  String getName();
}
