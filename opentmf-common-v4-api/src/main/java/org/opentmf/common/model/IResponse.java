package org.opentmf.common.model;

import java.util.List;

/**
 * A response to a request.
 *
 * <p><br/>
 * <strong>Required:</strong> body, header<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-640: Service Activation Management API</li>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-702: Resource Activation Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResponse extends IExtensible {

  /**
   * The body of the response. For example for an HTTP response might contain HTML
   * for rendering.
   */
  String getBody();

  /**
   * Items included in the header of the response. For example for an HTTP
   * response might contain negotiated locale.
   */
  List<? extends IHeaderItem> getHeaders();

  /**
   * The status of the response. For example for an HTTP response would be codes
   * such as 200, 400, etc.
   */
  String getStatusCode();
}
