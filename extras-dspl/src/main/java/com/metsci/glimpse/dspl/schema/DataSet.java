/*
 * Copyright (c) 2016, Metron, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Metron, Inc. nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL METRON, INC. BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3-
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.12.05 at 11:09:09 AM EST
//

package com.metsci.glimpse.dspl.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 *         A DSPL specification describes a dataset. A dataset is
 *         identified by its namespace. A dataset is comprised of the
 *         following elements:
 *
 *         - Tables: Data for the concepts and slices defined in the
 *         dataset
 *
 *         - Concepts: User-specified definitions and structures used in
 *         the dataset
 *
 *         - Slices: Combinations of dimensions and metrics present in
 *         the dataset
 *
 *         - Topics: Hierarchical labels used to organise the concepts of
 *         the dataset
 *
 *
 * <p>Java class for dspl element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="dspl">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="import" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="namespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="info" type="{http://schemas.google.com/dspl/2010}Info"/>
 *           &lt;element name="provider" type="{http://schemas.google.com/dspl/2010}Info"/>
 *           &lt;element name="attribute" type="{http://schemas.google.com/dspl/2010}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="topics" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="topic" type="{http://schemas.google.com/dspl/2010}Topic" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="concepts" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="concept" type="{http://schemas.google.com/dspl/2010}Concept" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="slices" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="slice" type="{http://schemas.google.com/dspl/2010}Slice" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="tables" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="table" type="{http://schemas.google.com/dspl/2010}Table" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = { "_import", "info", "provider", "attribute", "topics", "concepts", "slices", "tables" } )
@XmlRootElement( name = "dspl" )
public class DataSet
{

    @XmlElement( name = "import" )
    protected List<DataSet.Import> _import;
    @XmlElement( required = true )
    protected Info info;
    @XmlElement( required = true )
    protected Info provider;
    protected List<Attribute> attribute;
    protected DataSet.Topics topics;
    protected DataSet.Concepts concepts;
    protected DataSet.Slices slices;
    protected DataSet.Tables tables;
    @XmlAttribute( name = "targetNamespace" )
    @XmlSchemaType( name = "anyURI" )
    protected String targetNamespace;

    /**
     * Gets the value of the import property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the import property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImport().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSet.Import }
     *
     *
     */
    public List<DataSet.Import> getImport( )
    {
        if ( _import == null )
        {
            _import = new ArrayList<DataSet.Import>( );
        }
        return this._import;
    }

    /**
     * Gets the value of the info property.
     *
     * @return
     *     possible object is
     *     {@link Info }
     *
     */
    public Info getInfo( )
    {
        return info;
    }

    /**
     * Sets the value of the info property.
     *
     * @param value
     *     allowed object is
     *     {@link Info }
     *
     */
    public void setInfo( Info value )
    {
        this.info = value;
    }

    /**
     * Gets the value of the provider property.
     *
     * @return
     *     possible object is
     *     {@link Info }
     *
     */
    public Info getProvider( )
    {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     *
     * @param value
     *     allowed object is
     *     {@link Info }
     *
     */
    public void setProvider( Info value )
    {
        this.provider = value;
    }

    /**
     * Gets the value of the attribute property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     *
     *
     */
    public List<Attribute> getAttribute( )
    {
        if ( attribute == null )
        {
            attribute = new ArrayList<Attribute>( );
        }
        return this.attribute;
    }

    /**
     * Gets the value of the topics property.
     *
     * @return
     *     possible object is
     *     {@link DataSet.Topics }
     *
     */
    public DataSet.Topics getTopics( )
    {
        return topics;
    }

    /**
     * Sets the value of the topics property.
     *
     * @param value
     *     allowed object is
     *     {@link DataSet.Topics }
     *
     */
    public void setTopics( DataSet.Topics value )
    {
        this.topics = value;
    }

    /**
     * Gets the value of the concepts property.
     *
     * @return
     *     possible object is
     *     {@link DataSet.Concepts }
     *
     */
    public DataSet.Concepts getConcepts( )
    {
        return concepts;
    }

    /**
     * Sets the value of the concepts property.
     *
     * @param value
     *     allowed object is
     *     {@link DataSet.Concepts }
     *
     */
    public void setConcepts( DataSet.Concepts value )
    {
        this.concepts = value;
    }

    /**
     * Gets the value of the slices property.
     *
     * @return
     *     possible object is
     *     {@link DataSet.Slices }
     *
     */
    public DataSet.Slices getSlices( )
    {
        return slices;
    }

    /**
     * Sets the value of the slices property.
     *
     * @param value
     *     allowed object is
     *     {@link DataSet.Slices }
     *
     */
    public void setSlices( DataSet.Slices value )
    {
        this.slices = value;
    }

    /**
     * Gets the value of the tables property.
     *
     * @return
     *     possible object is
     *     {@link DataSet.Tables }
     *
     */
    public DataSet.Tables getTables( )
    {
        return tables;
    }

    /**
     * Sets the value of the tables property.
     *
     * @param value
     *     allowed object is
     *     {@link DataSet.Tables }
     *
     */
    public void setTables( DataSet.Tables value )
    {
        this.tables = value;
    }

    /**
     * Gets the value of the targetNamespace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTargetNamespace( )
    {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTargetNamespace( String value )
    {
        this.targetNamespace = value;
    }

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
     *         &lt;element name="concept" type="{http://schemas.google.com/dspl/2010}Concept" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType( XmlAccessType.FIELD )
    @XmlType( name = "", propOrder = { "concept" } )
    public static class Concepts
    {

        @XmlElement( required = true )
        protected List<Concept> concept;

        /**
         * Gets the value of the concept property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concept property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConcept().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Concept }
         *
         *
         */
        public List<Concept> getConcept( )
        {
            if ( concept == null )
            {
                concept = new ArrayList<Concept>( );
            }
            return this.concept;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="namespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType( XmlAccessType.FIELD )
    @XmlType( name = "" )
    public static class Import
    {

        @XmlAttribute( name = "namespace", required = true )
        @XmlSchemaType( name = "anySimpleType" )
        protected String namespace;
        @XmlAttribute( name = "location" )
        @XmlSchemaType( name = "anySimpleType" )
        protected String location;

        /**
         * Gets the value of the namespace property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNamespace( )
        {
            return namespace;
        }

        /**
         * Sets the value of the namespace property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNamespace( String value )
        {
            this.namespace = value;
        }

        /**
         * Gets the value of the location property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getLocation( )
        {
            return location;
        }

        /**
         * Sets the value of the location property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setLocation( String value )
        {
            this.location = value;
        }

    }

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
     *         &lt;element name="slice" type="{http://schemas.google.com/dspl/2010}Slice" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType( XmlAccessType.FIELD )
    @XmlType( name = "", propOrder = { "slice" } )
    public static class Slices
    {

        @XmlElement( required = true )
        protected List<Slice> slice;

        /**
         * Gets the value of the slice property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the slice property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSlice().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Slice }
         *
         *
         */
        public List<Slice> getSlice( )
        {
            if ( slice == null )
            {
                slice = new ArrayList<Slice>( );
            }
            return this.slice;
        }

    }

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
     *         &lt;element name="table" type="{http://schemas.google.com/dspl/2010}Table" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType( XmlAccessType.FIELD )
    @XmlType( name = "", propOrder = { "table" } )
    public static class Tables
    {

        @XmlElement( required = true )
        protected List<Table> table;

        /**
         * Gets the value of the table property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the table property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTable().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Table }
         *
         *
         */
        public List<Table> getTable( )
        {
            if ( table == null )
            {
                table = new ArrayList<Table>( );
            }
            return this.table;
        }

    }

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
     *         &lt;element name="topic" type="{http://schemas.google.com/dspl/2010}Topic" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType( XmlAccessType.FIELD )
    @XmlType( name = "", propOrder = { "topic" } )
    public static class Topics
    {

        @XmlElement( required = true )
        protected List<Topic> topic;

        /**
         * Gets the value of the topic property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the topic property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTopic().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Topic }
         *
         *
         */
        public List<Topic> getTopic( )
        {
            if ( topic == null )
            {
                topic = new ArrayList<Topic>( );
            }
            return this.topic;
        }

    }

    @javax.xml.bind.annotation.XmlTransient
    protected java.io.File file;

    public java.io.File getFile( )
    {
        return file;
    }

    public void setFile( java.io.File file )
    {
        this.file = file;
    }

    @javax.xml.bind.annotation.XmlTransient
    protected com.metsci.glimpse.dspl.DsplParser parser;

    public com.metsci.glimpse.dspl.DsplParser getParser( )
    {
        return parser;
    }

    public void setParser( com.metsci.glimpse.dspl.DsplParser parser )
    {
        this.parser = parser;
    }

    public Concept getConcept( String namespace, String local ) throws javax.xml.bind.JAXBException, java.io.IOException, com.metsci.glimpse.dspl.util.DsplException
    {
        return com.metsci.glimpse.dspl.util.DsplHelper.getConcept( this, namespace, local );
    }

    public Concept getConcept( String localId ) throws javax.xml.bind.JAXBException, java.io.IOException, com.metsci.glimpse.dspl.util.DsplException
    {
        return getConcept( null, localId );
    }

    public Concept getConcept( javax.xml.namespace.QName ref ) throws javax.xml.bind.JAXBException, java.io.IOException, com.metsci.glimpse.dspl.util.DsplException
    {
        if ( ref == null ) return null;
        return getConcept( ref.getNamespaceURI( ), ref.getLocalPart( ) );
    }

    public DataSet getDataSet( Import imp ) throws javax.xml.bind.JAXBException, java.io.IOException, com.metsci.glimpse.dspl.util.DsplException
    {
        return getDataSet( imp.getNamespace( ), imp.getLocation( ) );
    }

    protected DataSet getDataSet( String namespace, String location ) throws javax.xml.bind.JAXBException, java.io.IOException, com.metsci.glimpse.dspl.util.DsplException
    {
        return parser.loadDataset( this, namespace, location );
    }

}
