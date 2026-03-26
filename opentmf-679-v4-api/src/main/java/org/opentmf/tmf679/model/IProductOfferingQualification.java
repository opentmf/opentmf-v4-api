package org.opentmf.tmf679.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * ProductOfferingQualification is used to perform a commercial eligibility. It
 * allows to retrieve a list of productOffering that are commercially available
 * in the context of the interaction (defined be place, channel, party,
 * product).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingQualification extends IProductOfferingQualificationUpdate {

  /**
   * Hyperlink to access the productOfferingQualification.
   */
  URI getHref();

  /**
   * Unique identifier of the productOfferingQualification resource.
   */
  String getId();

  /**
   * Date when the productOfferingQualification has been submitted.
   */
  OffsetDateTime getProductOfferingQualificationDate();
}
