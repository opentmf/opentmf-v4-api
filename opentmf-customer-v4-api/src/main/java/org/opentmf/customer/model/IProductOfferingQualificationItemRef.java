package org.opentmf.customer.model;

import java.net.URI;
import org.opentmf.common.model.IEntityRef;

/**
 * It's a productOfferingQualification item that has been executed previously.
 *
 * <p><br/>
 * <strong>Required:</strong> id, productOfferingQualificationId<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 *   <li>TMF-648: Quote Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingQualificationItemRef extends IEntityRef {

  /**
   * Reference of the related entity.
   */
  URI getProductOfferingQualificationHref();

  /**
   * Unique identifier of a related entity.
   */
  String getProductOfferingQualificationId();

  /**
   * Name of the related entity.
   */
  String getProductOfferingQualificationName();
}
