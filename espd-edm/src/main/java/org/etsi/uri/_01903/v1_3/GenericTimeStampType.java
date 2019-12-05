//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3._2000._09.xmldsig_.CanonicalizationMethodType;


/**
 * <p>Classe Java per GenericTimeStampType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GenericTimeStampType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ReferenceInfo" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}CanonicalizationMethod" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="EncapsulatedTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType"/&gt;
 *           &lt;element name="XMLTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericTimeStampType", propOrder = {
    "include",
    "referenceInfo",
    "canonicalizationMethod",
    "encapsulatedTimeStampOrXMLTimeStamp"
})
@XmlSeeAlso({
    XAdESTimeStampType.class,
    OtherTimeStampType.class
})
public abstract class GenericTimeStampType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Include")
    protected List<IncludeType> include;
    @XmlElement(name = "ReferenceInfo")
    protected List<ReferenceInfoType> referenceInfo;
    @XmlElement(name = "CanonicalizationMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected CanonicalizationMethodType canonicalizationMethod;
    @XmlElements({
        @XmlElement(name = "EncapsulatedTimeStamp", type = EncapsulatedPKIDataType.class),
        @XmlElement(name = "XMLTimeStamp", type = AnyType.class)
    })
    protected List<Serializable> encapsulatedTimeStampOrXMLTimeStamp;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludeType }
     * 
     * 
     */
    public List<IncludeType> getInclude() {
        if (include == null) {
            include = new ArrayList<IncludeType>();
        }
        return this.include;
    }

    /**
     * Gets the value of the referenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType }
     * 
     * 
     */
    public List<ReferenceInfoType> getReferenceInfo() {
        if (referenceInfo == null) {
            referenceInfo = new ArrayList<ReferenceInfoType>();
        }
        return this.referenceInfo;
    }

    /**
     * Recupera il valore della proprietà canonicalizationMethod.
     * 
     * @return
     *     possible object is
     *     {@link CanonicalizationMethodType }
     *     
     */
    public CanonicalizationMethodType getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Imposta il valore della proprietà canonicalizationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CanonicalizationMethodType }
     *     
     */
    public void setCanonicalizationMethod(CanonicalizationMethodType value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Gets the value of the encapsulatedTimeStampOrXMLTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encapsulatedTimeStampOrXMLTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncapsulatedTimeStampOrXMLTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedPKIDataType }
     * {@link AnyType }
     * 
     * 
     */
    public List<Serializable> getEncapsulatedTimeStampOrXMLTimeStamp() {
        if (encapsulatedTimeStampOrXMLTimeStamp == null) {
            encapsulatedTimeStampOrXMLTimeStamp = new ArrayList<Serializable>();
        }
        return this.encapsulatedTimeStampOrXMLTimeStamp;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<IncludeType> theInclude;
            theInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            strategy.appendField(locator, this, "include", buffer, theInclude, ((this.include!= null)&&(!this.include.isEmpty())));
        }
        {
            List<ReferenceInfoType> theReferenceInfo;
            theReferenceInfo = (((this.referenceInfo!= null)&&(!this.referenceInfo.isEmpty()))?this.getReferenceInfo():null);
            strategy.appendField(locator, this, "referenceInfo", buffer, theReferenceInfo, ((this.referenceInfo!= null)&&(!this.referenceInfo.isEmpty())));
        }
        {
            CanonicalizationMethodType theCanonicalizationMethod;
            theCanonicalizationMethod = this.getCanonicalizationMethod();
            strategy.appendField(locator, this, "canonicalizationMethod", buffer, theCanonicalizationMethod, (this.canonicalizationMethod!= null));
        }
        {
            List<Serializable> theEncapsulatedTimeStampOrXMLTimeStamp;
            theEncapsulatedTimeStampOrXMLTimeStamp = (((this.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!this.encapsulatedTimeStampOrXMLTimeStamp.isEmpty()))?this.getEncapsulatedTimeStampOrXMLTimeStamp():null);
            strategy.appendField(locator, this, "encapsulatedTimeStampOrXMLTimeStamp", buffer, theEncapsulatedTimeStampOrXMLTimeStamp, ((this.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!this.encapsulatedTimeStampOrXMLTimeStamp.isEmpty())));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GenericTimeStampType that = ((GenericTimeStampType) object);
        {
            List<IncludeType> lhsInclude;
            lhsInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            List<IncludeType> rhsInclude;
            rhsInclude = (((that.include!= null)&&(!that.include.isEmpty()))?that.getInclude():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "include", lhsInclude), LocatorUtils.property(thatLocator, "include", rhsInclude), lhsInclude, rhsInclude, ((this.include!= null)&&(!this.include.isEmpty())), ((that.include!= null)&&(!that.include.isEmpty())))) {
                return false;
            }
        }
        {
            List<ReferenceInfoType> lhsReferenceInfo;
            lhsReferenceInfo = (((this.referenceInfo!= null)&&(!this.referenceInfo.isEmpty()))?this.getReferenceInfo():null);
            List<ReferenceInfoType> rhsReferenceInfo;
            rhsReferenceInfo = (((that.referenceInfo!= null)&&(!that.referenceInfo.isEmpty()))?that.getReferenceInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceInfo", lhsReferenceInfo), LocatorUtils.property(thatLocator, "referenceInfo", rhsReferenceInfo), lhsReferenceInfo, rhsReferenceInfo, ((this.referenceInfo!= null)&&(!this.referenceInfo.isEmpty())), ((that.referenceInfo!= null)&&(!that.referenceInfo.isEmpty())))) {
                return false;
            }
        }
        {
            CanonicalizationMethodType lhsCanonicalizationMethod;
            lhsCanonicalizationMethod = this.getCanonicalizationMethod();
            CanonicalizationMethodType rhsCanonicalizationMethod;
            rhsCanonicalizationMethod = that.getCanonicalizationMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canonicalizationMethod", lhsCanonicalizationMethod), LocatorUtils.property(thatLocator, "canonicalizationMethod", rhsCanonicalizationMethod), lhsCanonicalizationMethod, rhsCanonicalizationMethod, (this.canonicalizationMethod!= null), (that.canonicalizationMethod!= null))) {
                return false;
            }
        }
        {
            List<Serializable> lhsEncapsulatedTimeStampOrXMLTimeStamp;
            lhsEncapsulatedTimeStampOrXMLTimeStamp = (((this.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!this.encapsulatedTimeStampOrXMLTimeStamp.isEmpty()))?this.getEncapsulatedTimeStampOrXMLTimeStamp():null);
            List<Serializable> rhsEncapsulatedTimeStampOrXMLTimeStamp;
            rhsEncapsulatedTimeStampOrXMLTimeStamp = (((that.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!that.encapsulatedTimeStampOrXMLTimeStamp.isEmpty()))?that.getEncapsulatedTimeStampOrXMLTimeStamp():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encapsulatedTimeStampOrXMLTimeStamp", lhsEncapsulatedTimeStampOrXMLTimeStamp), LocatorUtils.property(thatLocator, "encapsulatedTimeStampOrXMLTimeStamp", rhsEncapsulatedTimeStampOrXMLTimeStamp), lhsEncapsulatedTimeStampOrXMLTimeStamp, rhsEncapsulatedTimeStampOrXMLTimeStamp, ((this.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!this.encapsulatedTimeStampOrXMLTimeStamp.isEmpty())), ((that.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!that.encapsulatedTimeStampOrXMLTimeStamp.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            List<IncludeType> theInclude;
            theInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "include", theInclude), currentHashCode, theInclude, ((this.include!= null)&&(!this.include.isEmpty())));
        }
        {
            List<ReferenceInfoType> theReferenceInfo;
            theReferenceInfo = (((this.referenceInfo!= null)&&(!this.referenceInfo.isEmpty()))?this.getReferenceInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceInfo", theReferenceInfo), currentHashCode, theReferenceInfo, ((this.referenceInfo!= null)&&(!this.referenceInfo.isEmpty())));
        }
        {
            CanonicalizationMethodType theCanonicalizationMethod;
            theCanonicalizationMethod = this.getCanonicalizationMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canonicalizationMethod", theCanonicalizationMethod), currentHashCode, theCanonicalizationMethod, (this.canonicalizationMethod!= null));
        }
        {
            List<Serializable> theEncapsulatedTimeStampOrXMLTimeStamp;
            theEncapsulatedTimeStampOrXMLTimeStamp = (((this.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!this.encapsulatedTimeStampOrXMLTimeStamp.isEmpty()))?this.getEncapsulatedTimeStampOrXMLTimeStamp():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encapsulatedTimeStampOrXMLTimeStamp", theEncapsulatedTimeStampOrXMLTimeStamp), currentHashCode, theEncapsulatedTimeStampOrXMLTimeStamp, ((this.encapsulatedTimeStampOrXMLTimeStamp!= null)&&(!this.encapsulatedTimeStampOrXMLTimeStamp.isEmpty())));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
