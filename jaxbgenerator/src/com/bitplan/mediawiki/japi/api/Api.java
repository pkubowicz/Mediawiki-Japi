//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.09 at 03:50:42 PM CET 
//


package com.bitplan.mediawiki.japi.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="continue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="rccontinue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="continue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recentchanges">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rc" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="pageid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="revid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="old_revid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="rcid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="oldlen" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="newlen" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="batchcomplete" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_continue",
    "query"
})
@XmlRootElement(name = "api")
public class Api {

    @XmlElement(name = "continue", required = true)
    protected Continue _continue;
    @XmlElement(required = true)
    protected Query query;
    @XmlAttribute(name = "batchcomplete")
    protected String batchcomplete;

    /**
     * Gets the value of the continue property.
     * 
     * @return
     *     possible object is
     *     {@link Continue }
     *     
     */
    public Continue getContinue() {
        return _continue;
    }

    /**
     * Sets the value of the continue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Continue }
     *     
     */
    public void setContinue(Continue value) {
        this._continue = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Query }
     *     
     */
    public Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Query }
     *     
     */
    public void setQuery(Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the batchcomplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchcomplete() {
        return batchcomplete;
    }

    /**
     * Sets the value of the batchcomplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchcomplete(String value) {
        this.batchcomplete = value;
    }

}
