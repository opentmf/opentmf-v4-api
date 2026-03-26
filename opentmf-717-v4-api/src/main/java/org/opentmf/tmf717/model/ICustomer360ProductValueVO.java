package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.IMEntityBase;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IProductSpecificationRef;

/**
 * A product offering procured by a customer or other interested party playing a
 * party role. A product is realized as one or more service(s) and / or
 * resource(s).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360ProductValueVO extends IMEntityBase {

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * If true, the product is visible by the customer.
   */
  Boolean getIsCustomerVisible();

  /**
   * Is the date when the product was ordered.
   */
  OffsetDateTime getOrderDate();

  /**
   * List of: A product to be created defined by value or existing defined by
   * reference. The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType
   * are related to the product entity and not the RelatedProductRefOrValue class
   * itself.
   */
  List<? extends IProductRefOrValue> getProducts();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * Is the serial number for the product. This is typically applicable to
   * tangible products e.g. Broadband Router.
   */
  String getProductSerialNumber();

  /**
   * Product specification reference: A ProductSpecification is a detailed
   * description of a tangible or intangible object made available externally in
   * the form of a ProductOffering to customers or other parties playing a party
   * role.
   */
  IProductSpecificationRef getProductSpecification();

  String getRandomAtt();

  /**
   * Is the date when the product was terminated.
   */
  OffsetDateTime getTerminationDate();
}
