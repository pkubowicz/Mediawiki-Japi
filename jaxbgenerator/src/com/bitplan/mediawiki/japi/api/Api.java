//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.12 at 07:02:42 AM MESZ 
//


package com.bitplan.mediawiki.japi.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="general">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fallback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="thumblimits">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="imagelimits">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="limit" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                               &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="mainpage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="sitename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="logo" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="generator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="phpversion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="phpsapi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="dbtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="dbversion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="imagewhitelistenabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="langconversion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="titleconversion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="linkprefixcharset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="linkprefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="linktrail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="case" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fallback8bitEncoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="writeapi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="timeoffset" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="articlepath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="scriptpath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="script" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="wikiid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="maxuploadsize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="favicon" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="namespaces">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ns" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                     &lt;attribute name="case" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="canonical" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="subpages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query"
})
@XmlRootElement(name = "api")
public class Api {

    @XmlElement(required = true)
    protected Query query;

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

}
