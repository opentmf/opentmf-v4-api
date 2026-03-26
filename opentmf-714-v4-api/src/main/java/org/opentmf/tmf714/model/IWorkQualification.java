package org.opentmf.tmf714.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IPlaceRefOrValue;
import org.opentmf.common.model.IRelatedParty;

/**
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
public interface IWorkQualification extends IEntity {

  /**
   * Description of the qualification.
   */
  String getDescription();

  /**
   * Effective date to qualification completion.
   */
  OffsetDateTime getEffectiveQualificationDate();

  /**
   * Date when the requester expect to provide an answer for the qualification
   * request.
   */
  OffsetDateTime getEstimatedResponseDate();

  /**
   * A date (DateTime). Deadline date when the requester expected a qualification
   * answer.
   */
  OffsetDateTime getExpectedQualificationDate();

  /**
   * Date when the qualification response expires.
   */
  OffsetDateTime getExpirationDate();

  /**
   * Identifier provided by the requester.
   */
  String getExternalId();

  /**
   * An indicator which when the value is "true" means that requester expects to
   * get qualifcation result immediately in the response. If the indicator is true
   * then the response code of 200 indicates the operation is successful otherwise
   * a task is created with a response 201.
   */
  Boolean getInstantSyncQualification();

  /**
   * A place described by reference or by value linked to a specific entity. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to
   * the place entity and not the PlaceRefOrValue class itself.
   */
  IPlaceRefOrValue getPlace();

  /**
   * A list of related party references, defines party or party role linked to
   * this request.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
