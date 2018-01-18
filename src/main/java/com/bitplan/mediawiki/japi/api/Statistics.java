/**
 *
 * This file is part of the https://github.com/WolfgangFahl/Mediawiki-Japi open source project
 *
 * Copyright 2015-2018 BITPlan GmbH https://github.com/BITPlan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *  http:www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.01 at 04:36:47 PM CET 
//


package com.bitplan.mediawiki.japi.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="articles" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="edits" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="images" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="users" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="activeusers" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="admins" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="jobs" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="queued-massmessages" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
public class Statistics {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "pages")
    protected Integer pages;
    @XmlAttribute(name = "articles")
    protected Short articles;
    @XmlAttribute(name = "edits")
    protected Integer edits;
    @XmlAttribute(name = "images")
    protected Short images;
    @XmlAttribute(name = "users")
    protected Integer users;
    @XmlAttribute(name = "activeusers")
    protected Short activeusers;
    @XmlAttribute(name = "admins")
    protected Short admins;
    @XmlAttribute(name = "jobs")
    protected Byte jobs;
    @XmlAttribute(name = "queued-massmessages")
    protected Byte queuedMassmessages;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPages(Integer value) {
        this.pages = value;
    }

    /**
     * Gets the value of the articles property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getArticles() {
        return articles;
    }

    /**
     * Sets the value of the articles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setArticles(Short value) {
        this.articles = value;
    }

    /**
     * Gets the value of the edits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdits() {
        return edits;
    }

    /**
     * Sets the value of the edits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdits(Integer value) {
        this.edits = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setImages(Short value) {
        this.images = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsers(Integer value) {
        this.users = value;
    }

    /**
     * Gets the value of the activeusers property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getActiveusers() {
        return activeusers;
    }

    /**
     * Sets the value of the activeusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setActiveusers(Short value) {
        this.activeusers = value;
    }

    /**
     * Gets the value of the admins property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAdmins() {
        return admins;
    }

    /**
     * Sets the value of the admins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAdmins(Short value) {
        this.admins = value;
    }

    /**
     * Gets the value of the jobs property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getJobs() {
        return jobs;
    }

    /**
     * Sets the value of the jobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setJobs(Byte value) {
        this.jobs = value;
    }

    /**
     * Gets the value of the queuedMassmessages property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getQueuedMassmessages() {
        return queuedMassmessages;
    }

    /**
     * Sets the value of the queuedMassmessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setQueuedMassmessages(Byte value) {
        this.queuedMassmessages = value;
    }

}
