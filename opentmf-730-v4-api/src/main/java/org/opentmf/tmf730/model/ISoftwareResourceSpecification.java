package org.opentmf.tmf730.model;

import org.opentmf.common.model.IQuantity;
import org.opentmf.resource.model.IResourceSpecification;

/**
 * An abstract base class used to define the invariant characteristics and
 * behavior (attributes, constraints, and relationships) of a SoftwareResource.
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
public interface ISoftwareResourceSpecification extends IResourceSpecification {

  /**
   * Defines the internal identifier for the compilation of this unit of a
   * SoftwareResourceSpecification.
   */
  String getBuildNumber();

  /**
   * An amount in a given unit.
   */
  IQuantity getInstallSize();

  /**
   * Designates the SoftwareResource as being able to be distributed across
   * multiple physically distinct Resources.
   */
  Boolean getIsDistributable();

  /**
   * True represents a special build (perhaps as a trial to suit specific customer
   * needs).
   */
  Boolean getIsExperimental();

  /**
   * Defines the maintenance number component of the version of
   * SoftwareResourceSpecification.
   */
  String getMaintenanceVersion();

  /**
   * Defines the major number component of the version of
   * SoftwareResourceSpecification.
   */
  String getMajorVersion();

  /**
   * Defines the minor number component of the version of
   * SoftwareResourceSpecification.
   */
  String getMinorVersion();

  /**
   * Enables the manufacturer to label this software as having some set of special
   * restrictions.
   */
  String getOtherDesignator();

  /**
   * Defines the particualr release status of this SoftwareResourceSpecification.
   */
  String getReleaseStatus();
}
