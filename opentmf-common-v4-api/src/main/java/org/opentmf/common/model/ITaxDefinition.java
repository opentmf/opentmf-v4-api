package org.opentmf.common.model;


/**
 * Reference of a tax definition. A tax is levied by an authorized tax
 * jurisdiction. There are many different types of tax (Federal Tax levied by
 * the US Government, State Tax levied by the State of California,…).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITaxDefinition extends IExtensible {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Unique identifier of the tax.
   */
  String getId();

  /**
   * Level of the jurisdiction that levies the tax.
   */
  String getJurisdictionLevel();

  /**
   * Name of the jurisdiction that levies the tax.
   */
  String getJurisdictionName();

  /**
   * Tax name.
   */
  String getName();

  /**
   * Type of the tax.
   */
  String getTaxType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
