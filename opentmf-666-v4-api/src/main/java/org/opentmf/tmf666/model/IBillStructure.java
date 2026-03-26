package org.opentmf.tmf666.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * The structure of the bill for party accounts (billing or settlement).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IBillStructure extends IExtensible {

  /**
   * An attachment by value or by reference.
   */
  IBillingCycleSpecificationRefOrValue getCycleSpecification();

  /**
   * An attachment by value or by reference.
   */
  IBillFormatRefOrValue getFormat();

  /**
   * List of: An attachment by value or by reference.
   */
  List<? extends IBillPresentationMediaRefOrValue> getPresentationMedias();
}
