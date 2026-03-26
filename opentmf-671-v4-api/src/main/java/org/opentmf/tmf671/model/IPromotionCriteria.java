package org.opentmf.tmf671.model;

import org.opentmf.common.model.IExtensible;

/**
 * Set of criteria to be followed by all parties.
 *
 * <p><br/>
 * <strong>Required:</strong> criteriaOperator, criteriaParameter, criteriaValue<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-671: Promotion Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPromotionCriteria extends IExtensible {

  /**
   * Logic operator of this criteria instruction: '=' or '>' or '<' or '>=' or
   * '<=' or '<>'.
   */
  String getCriteriaOperator();

  /**
   * The parameter (factor) of the criteria.The basic factors are abstracted from
   * these data sources.There are several detail parameters.
   */
  String getCriteriaParameter();

  /**
   * The value is filled for the comparison of the criteria.
   */
  String getCriteriaValue();

  /**
   * Unique identifier.
   */
  String getId();
}
