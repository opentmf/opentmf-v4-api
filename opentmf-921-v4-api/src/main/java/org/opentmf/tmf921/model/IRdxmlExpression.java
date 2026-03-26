package org.opentmf.tmf921.model;


/**
 * RdxmlExpression is the ontology-encoded form of the Intent as RDF-XML.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, expressionLanguage, expressionValue<br/>
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
public interface IRdxmlExpression extends IExpression {

  /**
   * RdxmlExpression is the ontology-encoded form of the Intent as RDF-XML as
   * defined in https://www.w3.org/TR/rdf-syntax-grammar/.
   */
  String getExpressionValue();
}
