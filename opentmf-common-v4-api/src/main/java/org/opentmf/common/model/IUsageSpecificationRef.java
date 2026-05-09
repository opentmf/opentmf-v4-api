package org.opentmf.common.model;

/**
 * UsageSpecification reference. UsageSpecification is a detailed description of
 * a usage event that are of interest to the business and can have charges
 * applied to it. It is comprised of characteristics, which define all
 * attributes known for a particular type of usage.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageSpecificationRef extends IEntityRef {
}
