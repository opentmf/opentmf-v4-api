package org.opentmf.partner.model;

import java.util.List;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRef;

/**
 * A part of the agreement expressed in terms of a product offering and possibly
 * including specific terms and conditions.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 *   <li>TMF-651: Agreement Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementItem extends IEntity {

  /**
   * The list of products indirectly referred by this agreement item (since an
   * agreement item refers primarily to product offerings).
   */
  List<? extends IProductRef> getProducts();

  /**
   * The list of product offerings referred by this agreement item.
   */
  List<? extends IProductOfferingRef> getProductOfferings();

  /**
   * List of: Aspects of the agreement not formally specified elsewhere in the
   * agreement and that cannot be captured elsewhere in a formal notation, or
   * automatically monitored and require a more human level of management.
   */
  List<? extends IAgreementTermOrCondition> getTermOrConditions();
}
