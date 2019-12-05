//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2000._09.xmldsig_;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
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


/**
 * <p>Classe Java per SignatureType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignedInfo"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureValue"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Object" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SignatureType", propOrder = {
    "signedInfo",
    "signatureValue",
    "keyInfo",
    "object"
})
public class SignatureType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SignedInfo", required = true)
    protected SignedInfoType signedInfo;
    @XmlElement(name = "SignatureValue", required = true)
    protected SignatureValueType signatureValue;
    @XmlElement(name = "KeyInfo")
    protected KeyInfoType keyInfo;
    @XmlElement(name = "Object")
    protected List<ObjectType> object;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà signedInfo.
     * 
     * @return
     *     possible object is
     *     {@link SignedInfoType }
     *     
     */
    public SignedInfoType getSignedInfo() {
        return signedInfo;
    }

    /**
     * Imposta il valore della proprietà signedInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedInfoType }
     *     
     */
    public void setSignedInfo(SignedInfoType value) {
        this.signedInfo = value;
    }

    /**
     * Recupera il valore della proprietà signatureValue.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValueType }
     *     
     */
    public SignatureValueType getSignatureValue() {
        return signatureValue;
    }

    /**
     * Imposta il valore della proprietà signatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValueType }
     *     
     */
    public void setSignatureValue(SignatureValueType value) {
        this.signatureValue = value;
    }

    /**
     * Recupera il valore della proprietà keyInfo.
     * 
     * @return
     *     possible object is
     *     {@link KeyInfoType }
     *     
     */
    public KeyInfoType getKeyInfo() {
        return keyInfo;
    }

    /**
     * Imposta il valore della proprietà keyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyInfoType }
     *     
     */
    public void setKeyInfo(KeyInfoType value) {
        this.keyInfo = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectType }
     * 
     * 
     */
    public List<ObjectType> getObject() {
        if (object == null) {
            object = new ArrayList<ObjectType>();
        }
        return this.object;
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
            SignedInfoType theSignedInfo;
            theSignedInfo = this.getSignedInfo();
            strategy.appendField(locator, this, "signedInfo", buffer, theSignedInfo, (this.signedInfo!= null));
        }
        {
            SignatureValueType theSignatureValue;
            theSignatureValue = this.getSignatureValue();
            strategy.appendField(locator, this, "signatureValue", buffer, theSignatureValue, (this.signatureValue!= null));
        }
        {
            KeyInfoType theKeyInfo;
            theKeyInfo = this.getKeyInfo();
            strategy.appendField(locator, this, "keyInfo", buffer, theKeyInfo, (this.keyInfo!= null));
        }
        {
            List<ObjectType> theObject;
            theObject = (((this.object!= null)&&(!this.object.isEmpty()))?this.getObject():null);
            strategy.appendField(locator, this, "object", buffer, theObject, ((this.object!= null)&&(!this.object.isEmpty())));
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
        final SignatureType that = ((SignatureType) object);
        {
            SignedInfoType lhsSignedInfo;
            lhsSignedInfo = this.getSignedInfo();
            SignedInfoType rhsSignedInfo;
            rhsSignedInfo = that.getSignedInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signedInfo", lhsSignedInfo), LocatorUtils.property(thatLocator, "signedInfo", rhsSignedInfo), lhsSignedInfo, rhsSignedInfo, (this.signedInfo!= null), (that.signedInfo!= null))) {
                return false;
            }
        }
        {
            SignatureValueType lhsSignatureValue;
            lhsSignatureValue = this.getSignatureValue();
            SignatureValueType rhsSignatureValue;
            rhsSignatureValue = that.getSignatureValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatureValue", lhsSignatureValue), LocatorUtils.property(thatLocator, "signatureValue", rhsSignatureValue), lhsSignatureValue, rhsSignatureValue, (this.signatureValue!= null), (that.signatureValue!= null))) {
                return false;
            }
        }
        {
            KeyInfoType lhsKeyInfo;
            lhsKeyInfo = this.getKeyInfo();
            KeyInfoType rhsKeyInfo;
            rhsKeyInfo = that.getKeyInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyInfo", lhsKeyInfo), LocatorUtils.property(thatLocator, "keyInfo", rhsKeyInfo), lhsKeyInfo, rhsKeyInfo, (this.keyInfo!= null), (that.keyInfo!= null))) {
                return false;
            }
        }
        {
            List<ObjectType> lhsObject;
            lhsObject = (((this.object!= null)&&(!this.object.isEmpty()))?this.getObject():null);
            List<ObjectType> rhsObject;
            rhsObject = (((that.object!= null)&&(!that.object.isEmpty()))?that.getObject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "object", lhsObject), LocatorUtils.property(thatLocator, "object", rhsObject), lhsObject, rhsObject, ((this.object!= null)&&(!this.object.isEmpty())), ((that.object!= null)&&(!that.object.isEmpty())))) {
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
            SignedInfoType theSignedInfo;
            theSignedInfo = this.getSignedInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signedInfo", theSignedInfo), currentHashCode, theSignedInfo, (this.signedInfo!= null));
        }
        {
            SignatureValueType theSignatureValue;
            theSignatureValue = this.getSignatureValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatureValue", theSignatureValue), currentHashCode, theSignatureValue, (this.signatureValue!= null));
        }
        {
            KeyInfoType theKeyInfo;
            theKeyInfo = this.getKeyInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyInfo", theKeyInfo), currentHashCode, theKeyInfo, (this.keyInfo!= null));
        }
        {
            List<ObjectType> theObject;
            theObject = (((this.object!= null)&&(!this.object.isEmpty()))?this.getObject():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "object", theObject), currentHashCode, theObject, ((this.object!= null)&&(!this.object.isEmpty())));
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
