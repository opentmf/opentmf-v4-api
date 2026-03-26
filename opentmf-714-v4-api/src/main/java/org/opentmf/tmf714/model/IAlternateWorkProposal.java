package org.opentmf.tmf714.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IWorkRefOrValue;

/**
 * Alternate work proposal is used when the requested unit of work is not valid
 * as specified in the request. An alternate proposal could be a distinct
 * workSpecification close to the requested one or the same specification as
 * requested but with a different parameters.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAlternateWorkProposal extends IExtensible {

  /**
   * A Unit of Work defined by value or existing defined by reference. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are related
   * to the work entity and not the related WorkRefOrValue class itself.
   */
  IWorkRefOrValue getAlternateWork();

  /**
   * Alternate date where the work could take place in case the expected date
   * cannot be met.
   */
  OffsetDateTime getAlternateWorkDate();

  /**
   * Identifier of an alternate work proposal.
   */
  String getId();
}
