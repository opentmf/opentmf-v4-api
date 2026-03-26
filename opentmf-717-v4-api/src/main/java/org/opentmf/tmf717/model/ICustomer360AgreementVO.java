package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IAgreementSpecificationRef;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * An agreement represents a contract or arrangement, either written or verbal
 * and sometimes enforceable by law, such as a service level agreement or a
 * customer price agreement. An agreement involves a number of other business
 * entities, such as products, services, and resources and/or their
 * specifications.
 *
 * <p><br/>
 * <strong>Required:</strong> agreementType, name<br/>
 * </p>
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
public interface ICustomer360AgreementVO extends INamedEntity {

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getAgreementPeriod();

  /**
   * Agreement specification reference. An AgreementSpecification represents a
   * template of an agreement that can be used when establishing partnerships.
   */
  IAgreementSpecificationRef getAgreementSpecification();

  /**
   * The type of the agreement. For example commercial.
   */
  String getAgreementType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getCompletionDate();

  /**
   * Narrative that explains the agreement and details about it, such as why the
   * agreement is taking place.
   */
  String getDescription();

  /**
   * A reference number assigned to an Agreement that follows a prescribed
   * numbering system.
   */
  Integer getDocumentNumber();

  /**
   * Date at which the agreement was initialized.
   */
  OffsetDateTime getInitialDate();

  /**
   * An overview and goals of the Agreement.
   */
  String getStatementOfIntent();

  /**
   * The current status of the agreement. Typical values are: in process, approved
   * and rejected.
   */
  String getStatus();

  /**
   * A string identifying the version of the agreement.
   */
  String getVersion();
}
