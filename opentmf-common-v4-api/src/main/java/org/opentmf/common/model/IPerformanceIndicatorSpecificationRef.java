package org.opentmf.common.model;


/**
 * PerformanceIndicatorSpecification reference: A
 * PerformanceIndicatorSpecification is a detailed description of a tangible or
 * intangible object made available externally in the form of a
 * PerformanceIndicatorSpecification to customers or other parties playing a
 * party role.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 *   <li>TMF-common: common</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPerformanceIndicatorSpecificationRef extends IEntityRef {

  /**
   * Version of the performance indicator specification.
   */
  String getVersion();
}
