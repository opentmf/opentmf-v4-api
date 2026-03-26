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
public interface IRequest extends IExtensible {

  /**
   * The body of the request. For example for an HTTP request might contain
   * content of a form .
   */
  String getBody();

  /**
   * Items included in the header of the request. For example for an HTTP request
   * might contain requested locale, basic authentication.
   */
  List<? extends IHeaderItem> getHeaders();

  /**
   * The protocol of the request, e.g. http.
   */
  String getMethod();

  /**
   * The target of the request, e.g. a URL for an HTTP request.
   */
  String getTo();
}
