package org.opentmf.tmf645.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IServiceRefOrValue;

/**
 * Alternate service proposal is used when the requested service is not
 * available with characteristic and date asked for. An alternate proposal could
 * be a distinct serviceSpecification close to requested one or same as
 * requested but with a different activation date.
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
public interface IAlternateServiceProposal extends IExtensible {

  /**
   * A Service to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the Service entity and not the RelatedServiceRefOrValue class itself.
   */
  IServiceRefOrValue getAlternateService();

  /**
   * Alternate availability date in case seller is not able to meet requested
   * expected availability date for the service.
   */
  OffsetDateTime getAlternateServiceAvailabilityDate();

  /**
   * Identifier of a alternate service proposal.
   */
  String getId();
}
