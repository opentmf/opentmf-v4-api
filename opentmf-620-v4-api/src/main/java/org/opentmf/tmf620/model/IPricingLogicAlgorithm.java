package org.opentmf.tmf620.model;

import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * The PricingLogicAlgorithm entity represents an instantiation of an interface
 * specification to external rating function (without a modeled behaviour in
 * SID). Some of the parameters of the interface definition may be already set
 * (such as price per unit) and some may be gathered during the rating process
 * from the event (such as call duration) or from ProductCharacteristicValues
 * (such as assigned bandwidth).
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
public interface IPricingLogicAlgorithm extends INamedEntity {

  /**
   * Description of the PricingLogicAlgorithm.
   */
  String getDescription();

  /**
   * id of corresponding PricingLogicAlgorithm specification.
   */
  String getPlaSpecId();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
