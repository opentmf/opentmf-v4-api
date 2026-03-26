package org.opentmf.common.model;


/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-667: Document Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingUpdateBase {

  /**
   * Description of the specification.
   */
  String getDescription();

  /**
   * isBundle determines whether specification represents a single specification
   * (false), or a bundle of specifications (true).
   */
  Boolean getIsBundle();

  /**
   * Possible values for the status of a DocumentSpecification
   * <br/><p>Recommended values: created, reviewed, approved, published, archived,
   * deleted.
   */
  String getLifecycleStatus();

  /**
   * The name of the DocumentSpecification.
   */
  String getName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * The version of the DocumentSpecification.
   */
  String getVersion();
}
