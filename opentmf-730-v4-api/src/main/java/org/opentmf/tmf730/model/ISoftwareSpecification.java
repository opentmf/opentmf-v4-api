package org.opentmf.tmf730.model;


/**
 * A base class used to define the invariant characteristics and behavior
 * (attributes, constraints, and relationships) of an InstalledSoftware.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISoftwareSpecification extends ISoftwareResourceSpecification {

  /**
   * Defines the maximum number of users for a SoftwareSpecifciation.
   */
  Integer getNumUsersMax();

  /**
   * Defines the maximum number of total processes that a SoftwareSpecifciation
   * can support at any given time.
   */
  Integer getNumberProcessActiveTotal();

  /**
   * Reference to a SoftwareSupportPackage.
   */
  ISoftwareSupportPackageRef getSoftwareSupportPackage();
}
