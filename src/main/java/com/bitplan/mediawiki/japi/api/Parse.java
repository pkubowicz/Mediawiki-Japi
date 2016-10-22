//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.05 at 05:20:14 PM CEST 
//


package com.bitplan.mediawiki.japi.api;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sections">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="s" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="toclevel" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="fromtitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="byteoffset" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                           &lt;attribute name="anchor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "parse")
@XmlAccessorType(XmlAccessType.NONE)
public class Parse {

    protected List<S> sections=new ArrayList<S>();
    @XmlElement
    protected String text;
    
    @XmlAttribute(name = "title")
    protected String title;

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link Sections }
     *     
     */
    @XmlElementWrapper(name = "sections")
    @XmlElement(name = "s", type = S.class)
    public List<S> getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sections }
     *     
     */
    public void setSections(List<S> value) {
        this.sections = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }
    
    /**
     * get the text
     * @return the text (if any)
     */
    public String getText() {
      return text;
    }


}
