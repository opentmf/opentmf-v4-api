package org.opentmf.tmf653.model;

import java.net.URI;
import org.opentmf.common.model.ITimePeriod;

/**
 * The service test specification describes the service test in terms of
 * parameters to be configured and 
 * <br/>measures to be taken.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, relatedServiceSpecification<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-653: Service Test Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceTestSpecificationCreate extends IServiceTestSpecificationUpdate {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * When subclassing, this defines the subclass Extensible name.
   */
  String getAtType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
