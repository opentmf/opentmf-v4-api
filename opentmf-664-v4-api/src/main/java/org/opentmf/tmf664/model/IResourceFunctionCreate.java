package org.opentmf.tmf664.model;


/**
 * A ResourceFunction is a behavior to transform inputs of any nature into
 * outputs of any nature independently from the way it is provided.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, resourceSpecification<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceFunctionCreate extends IResourceFunctionUpdate {

  /**
   * ResourceUsageStateType enumerations
   * <br/><p>Recommended values: idle, active, busy.
   */
  String getUsageState();
}
