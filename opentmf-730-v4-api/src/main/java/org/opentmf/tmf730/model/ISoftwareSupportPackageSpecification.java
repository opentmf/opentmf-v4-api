package org.opentmf.tmf730.model;

import org.opentmf.resource.model.IResourceSpecification;

/**
 * A base class used to define the invariant characteristics and behavior
 * (attributes, constraints, and relationships) of a SoftwareSupportPackage.
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
public interface ISoftwareSupportPackageSpecification extends IResourceSpecification {

  /**
   * This is a string that represents a manufacturer-allocated number used to
   * identify the general type and/or category of the hardware item. This, in
   * combination with the Part and the Vendor, identify different types of
   * hardware items. The SerialNumber can then be used to differentiate between
   * different instances of the same type of hardware item. This is an optional
   * attribute.
   */
  String getModel();

  /**
   * This is a string that defines a manufacturer-allocated part number assigned
   * by the organization that manufactures the hardware item. This, in combination
   * with the Model and the Vendor, identify different types of hardware items.
   * The SerialNumber can then be used to differentiate between different
   * instances of the same type of hardware item. This is a REQUIRED attribute.
   */
  String getPart();

  /**
   * This is a string that defines the manufacturer-allocated Stock Keeping Unit
   * (SKU) number of the hardware item. This is an optional attribute.
   */
  String getSku();

  /**
   * This is a string that defines the name of the manufacturer. This, in
   * combination with the Model and the Part, identify different types of hardware
   * items. The SerialNumber can then be used to differentiate between different
   * instances of the same type of hardware item. This is a REQUIRED attribute for
   * a physical resource.
   */
  String getVendor();
}
