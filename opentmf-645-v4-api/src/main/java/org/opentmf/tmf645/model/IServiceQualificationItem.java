package org.opentmf.tmf645.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IServiceRefOrValue;
import org.opentmf.service.model.IServiceCategoryRef;

/**
 * A ServiceQualificationItem relates to a specific service being checked in a
 * qualification operation.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceQualificationItem extends IExtensible {

  /**
   * The (service) category resource is used to group service candidates in
   * logical containers. Categories can contain other categories.
   */
  IServiceCategoryRef getCategory();

  /**
   * The date when the service is expected to be activated.
   */
  OffsetDateTime getExpectedActivationDate();

  /**
   * Date when the requester looks for service availability.
   */
  OffsetDateTime getExpectedServiceAvailabilityDate();

  /**
   * Date when the qualification item response expires.
   */
  OffsetDateTime getExpirationDate();

  /**
   * Id of the Service Qualification Item.
   */
  String getId();

  /**
   * A Service to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the Service entity and not the RelatedServiceRefOrValue class itself.
   */
  IServiceRefOrValue getService();
}
