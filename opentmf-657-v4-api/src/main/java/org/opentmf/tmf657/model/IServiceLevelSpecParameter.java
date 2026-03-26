package org.opentmf.tmf657.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * Service Level Specification parameters can be one of two types. A Key Quality
 * Indicator (KQI) 
 * <br/>provides a measurement of a specific aspect of the performance of a
 * Product (i.e., Product 
 * <br/>Specification, Product Offering, or Product) or a Service (i.e., Service
 * Specification or Service).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-657: Service Quality Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceLevelSpecParameter extends IExtensible {

  /**
   * The name of the parameter.
   */
  String getName();

  /**
   * Types of Service Level Specification parameters are KQI or KPI.
   */
  String getParameterType();

  /**
   * A list of entities related to this parameter.
   */
  List<? extends IRelatedEntity> getRelatedEntities();

  /**
   * A string that specifies whether the Service Level Specification Parameter is
   * technology specific, service specific, or technology/service independent.
   */
  String getServiceParmCategory();

  /**
   * A string that specifies whether the Service Level Specification Parameter
   * represents a single user instance parameter or a parameter that represents an
   * aggregation.
   */
  String getServiceParmPerspective();

  /**
   * The description of a logical step-by-step procedure used to calculate the
   * value of a KQI.
   */
  String getTransformationAlgorithmOfKQI();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
