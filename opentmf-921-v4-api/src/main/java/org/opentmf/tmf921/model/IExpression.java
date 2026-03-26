package org.opentmf.tmf921.model;

import org.opentmf.common.model.IExtensible;

/**
 * Expression is the ontology-encoded form of the Intent.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, expressionLanguage<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-921: Intent Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IExpression extends IExtensible {

  /**
   * The serialized Expression language of an intent or Intent report
   * <br/><p>Recommended values: Turtle, JSON-LD, RDF-XML.
   */
  String getExpressionLanguage();

  /**
   * Internationalized Resource Identifier of the intent Expression.
   */
  String getIri();
}
