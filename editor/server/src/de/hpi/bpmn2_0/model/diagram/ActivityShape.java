//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.07 at 02:19:19 PM CEST 
//


package de.hpi.bpmn2_0.model.diagram;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activityShapeType_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activityShapeType_1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bpmndi.org}bpmnNodeType">
 *       &lt;attribute name="activityRef" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(namespace="http://bpmndi.org", name = "activityShape")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activityShapeType_1", namespace = "http://bpmndi.org")
@XmlSeeAlso({
//    SubprocessShape.class,
//    CalledSubprocessShapeType.class
})
public class ActivityShape
    extends BpmnNode
{

	@XmlAttribute
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object activityRef;

    /**
     * Gets the value of the activityRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Object getActivityRef() {
        return activityRef;
    }

    /**
     * Sets the value of the activityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityRef(Object value) {
        this.activityRef = value;
    }

}
