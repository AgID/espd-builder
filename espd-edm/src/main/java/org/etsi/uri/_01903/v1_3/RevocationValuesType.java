//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
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
 * <p>Classe Java per RevocationValuesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RevocationValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRLValues" type="{http://uri.etsi.org/01903/v1.3.2#}CRLValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OCSPValues" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OtherValues" type="{http://uri.etsi.org/01903/v1.3.2#}OtherCertStatusValuesType" minOccurs="0"/&gt;
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
@XmlType(name = "RevocationValuesType", propOrder = {
    "crlValues",
    "ocspValues",
    "otherValues"
})
public class RevocationValuesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CRLValues")
    protected CRLValuesType crlValues;
    @XmlElement(name = "OCSPValues")
    protected OCSPValuesType ocspValues;
    @XmlElement(name = "OtherValues")
    protected OtherCertStatusValuesType otherValues;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà crlValues.
     * 
     * @return
     *     possible object is
     *     {@link CRLValuesType }
     *     
     */
    public CRLValuesType getCRLValues() {
        return crlValues;
    }

    /**
     * Imposta il valore della proprietà crlValues.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLValuesType }
     *     
     */
    public void setCRLValues(CRLValuesType value) {
        this.crlValues = value;
    }

    /**
     * Recupera il valore della proprietà ocspValues.
     * 
     * @return
     *     possible object is
     *     {@link OCSPValuesType }
     *     
     */
    public OCSPValuesType getOCSPValues() {
        return ocspValues;
    }

    /**
     * Imposta il valore della proprietà ocspValues.
     * 
     * @param value
     *     allowed object is
     *     {@link OCSPValuesType }
     *     
     */
    public void setOCSPValues(OCSPValuesType value) {
        this.ocspValues = value;
    }

    /**
     * Recupera il valore della proprietà otherValues.
     * 
     * @return
     *     possible object is
     *     {@link OtherCertStatusValuesType }
     *     
     */
    public OtherCertStatusValuesType getOtherValues() {
        return otherValues;
    }

    /**
     * Imposta il valore della proprietà otherValues.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCertStatusValuesType }
     *     
     */
    public void setOtherValues(OtherCertStatusValuesType value) {
        this.otherValues = value;
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
            CRLValuesType theCRLValues;
            theCRLValues = this.getCRLValues();
            strategy.appendField(locator, this, "crlValues", buffer, theCRLValues, (this.crlValues!= null));
        }
        {
            OCSPValuesType theOCSPValues;
            theOCSPValues = this.getOCSPValues();
            strategy.appendField(locator, this, "ocspValues", buffer, theOCSPValues, (this.ocspValues!= null));
        }
        {
            OtherCertStatusValuesType theOtherValues;
            theOtherValues = this.getOtherValues();
            strategy.appendField(locator, this, "otherValues", buffer, theOtherValues, (this.otherValues!= null));
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
        final RevocationValuesType that = ((RevocationValuesType) object);
        {
            CRLValuesType lhsCRLValues;
            lhsCRLValues = this.getCRLValues();
            CRLValuesType rhsCRLValues;
            rhsCRLValues = that.getCRLValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crlValues", lhsCRLValues), LocatorUtils.property(thatLocator, "crlValues", rhsCRLValues), lhsCRLValues, rhsCRLValues, (this.crlValues!= null), (that.crlValues!= null))) {
                return false;
            }
        }
        {
            OCSPValuesType lhsOCSPValues;
            lhsOCSPValues = this.getOCSPValues();
            OCSPValuesType rhsOCSPValues;
            rhsOCSPValues = that.getOCSPValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ocspValues", lhsOCSPValues), LocatorUtils.property(thatLocator, "ocspValues", rhsOCSPValues), lhsOCSPValues, rhsOCSPValues, (this.ocspValues!= null), (that.ocspValues!= null))) {
                return false;
            }
        }
        {
            OtherCertStatusValuesType lhsOtherValues;
            lhsOtherValues = this.getOtherValues();
            OtherCertStatusValuesType rhsOtherValues;
            rhsOtherValues = that.getOtherValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherValues", lhsOtherValues), LocatorUtils.property(thatLocator, "otherValues", rhsOtherValues), lhsOtherValues, rhsOtherValues, (this.otherValues!= null), (that.otherValues!= null))) {
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
            CRLValuesType theCRLValues;
            theCRLValues = this.getCRLValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crlValues", theCRLValues), currentHashCode, theCRLValues, (this.crlValues!= null));
        }
        {
            OCSPValuesType theOCSPValues;
            theOCSPValues = this.getOCSPValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ocspValues", theOCSPValues), currentHashCode, theOCSPValues, (this.ocspValues!= null));
        }
        {
            OtherCertStatusValuesType theOtherValues;
            theOtherValues = this.getOtherValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherValues", theOtherValues), currentHashCode, theOtherValues, (this.otherValues!= null));
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
