package org.opentmf.tmf921.model;


/**
 * TurtleExpression is the ontology-encoded form of the Intent as Turtle RDF.
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
public interface ITurtleExpression extends IExpression {

  /**
   * TurtleExpression is the ontology-encoded form of the Intent as Turtle RDF as
   * defined in https://www.w3.org/TR/turtle/.
   */
  String getExpressionValue();
}
