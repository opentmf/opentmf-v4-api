package org.opentmf.tmf679.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRefOrValue;

/**
 * Alternate product Offering proposal is used when the requested product
 * offering is not available with characteristic and date asked for. An
 * alternate proposal could be a distinct product offering or product Spec close
 * to requested one or same as requested but with a different activation date.
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
public interface IAlternateProductOfferingProposal extends IExtensible {

  /**
   * Alternate activation date in case seller is not able to meet requested
   * expected activation date.
   */
  OffsetDateTime getAlternateActivationDate();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getAlternateProduct();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getAlternateProductOffering();

  /**
   * Identifier of a alternate product offering proposal.
   */
  String getId();
}
