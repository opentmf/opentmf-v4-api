package org.opentmf.tmf679.model;

/**
 * The event data structure.
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
public interface IProductOfferingQualificationAttributeValueChangeEventPayload {

  /**
   * ProductOfferingQualification is used to perform a commercial eligibility. It
   * allows to retrieve a list of productOffering that are commercially available
   * in the context of the interaction (defined be place, channel, party,
   * product).
   */
  IProductOfferingQualification getProductOfferingQualification();
}
