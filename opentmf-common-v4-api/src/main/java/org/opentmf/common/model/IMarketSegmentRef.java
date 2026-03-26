package org.opentmf.common.model;

/**
 * provides references to the corresponding market segment as target of product
 * offerings. A market segment is grouping of Parties, GeographicAreas,
 * SalesChannels, and so forth.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-687: Stock Management API</li>
 *   <li>TMF-699: Sales Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMarketSegmentRef extends IEntityRef {
}
