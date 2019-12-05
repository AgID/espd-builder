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
 * <p>Classe Java per CompleteRevocationRefsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompleteRevocationRefsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRLRefs" type="{http://uri.etsi.org/01903/v1.3.2#}CRLRefsType" minOccurs="0"/&gt;
 *         &lt;element name="OCSPRefs" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPRefsType" minOccurs="0"/&gt;
 *         &lt;element name="OtherRefs" type="{http://uri.etsi.org/01903/v1.3.2#}OtherCertStatusRefsType" minOccurs="0"/&gt;
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
@XmlType(name = "CompleteRevocationRefsType", propOrder = {
    "crlRefs",
    "ocspRefs",
    "otherRefs"
})
public class CompleteRevocationRefsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CRLRefs")
    protected CRLRefsType crlRefs;
    @XmlElement(name = "OCSPRefs")
    protected OCSPRefsType ocspRefs;
    @XmlElement(name = "OtherRefs")
    protected OtherCertStatusRefsType otherRefs;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà crlRefs.
     * 
     * @return
     *     possible object is
     *     {@link CRLRefsType }
     *     
     */
    public CRLRefsType getCRLRefs() {
        return crlRefs;
    }

    /**
     * Imposta il valore della proprietà crlRefs.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLRefsType }
     *     
     */
    public void setCRLRefs(CRLRefsType value) {
        this.crlRefs = value;
    }

    /**
     * Recupera il valore della proprietà ocspRefs.
     * 
     * @return
     *     possible object is
     *     {@link OCSPRefsType }
     *     
     */
    public OCSPRefsType getOCSPRefs() {
        return ocspRefs;
    }

    /**
     * Imposta il valore della proprietà ocspRefs.
     * 
     * @param value
     *     allowed object is
     *     {@link OCSPRefsType }
     *     
     */
    public void setOCSPRefs(OCSPRefsType value) {
        this.ocspRefs = value;
    }

    /**
     * Recupera il valore della proprietà otherRefs.
     * 
     * @return
     *     possible object is
     *     {@link OtherCertStatusRefsType }
     *     
     */
    public OtherCertStatusRefsType getOtherRefs() {
        return otherRefs;
    }

    /**
     * Imposta il valore della proprietà otherRefs.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCertStatusRefsType }
     *     
     */
    public void setOtherRefs(OtherCertStatusRefsType value) {
        this.otherRefs = value;
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
            CRLRefsType theCRLRefs;
            theCRLRefs = this.getCRLRefs();
            strategy.appendField(locator, this, "crlRefs", buffer, theCRLRefs, (this.crlRefs!= null));
        }
        {
            OCSPRefsType theOCSPRefs;
            theOCSPRefs = this.getOCSPRefs();
            strategy.appendField(locator, this, "ocspRefs", buffer, theOCSPRefs, (this.ocspRefs!= null));
        }
        {
            OtherCertStatusRefsType theOtherRefs;
            theOtherRefs = this.getOtherRefs();
            strategy.appendField(locator, this, "otherRefs", buffer, theOtherRefs, (this.otherRefs!= null));
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
        final CompleteRevocationRefsType that = ((CompleteRevocationRefsType) object);
        {
            CRLRefsType lhsCRLRefs;
            lhsCRLRefs = this.getCRLRefs();
            CRLRefsType rhsCRLRefs;
            rhsCRLRefs = that.getCRLRefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crlRefs", lhsCRLRefs), LocatorUtils.property(thatLocator, "crlRefs", rhsCRLRefs), lhsCRLRefs, rhsCRLRefs, (this.crlRefs!= null), (that.crlRefs!= null))) {
                return false;
            }
        }
        {
            OCSPRefsType lhsOCSPRefs;
            lhsOCSPRefs = this.getOCSPRefs();
            OCSPRefsType rhsOCSPRefs;
            rhsOCSPRefs = that.getOCSPRefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ocspRefs", lhsOCSPRefs), LocatorUtils.property(thatLocator, "ocspRefs", rhsOCSPRefs), lhsOCSPRefs, rhsOCSPRefs, (this.ocspRefs!= null), (that.ocspRefs!= null))) {
                return false;
            }
        }
        {
            OtherCertStatusRefsType lhsOtherRefs;
            lhsOtherRefs = this.getOtherRefs();
            OtherCertStatusRefsType rhsOtherRefs;
            rhsOtherRefs = that.getOtherRefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherRefs", lhsOtherRefs), LocatorUtils.property(thatLocator, "otherRefs", rhsOtherRefs), lhsOtherRefs, rhsOtherRefs, (this.otherRefs!= null), (that.otherRefs!= null))) {
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
            CRLRefsType theCRLRefs;
            theCRLRefs = this.getCRLRefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crlRefs", theCRLRefs), currentHashCode, theCRLRefs, (this.crlRefs!= null));
        }
        {
            OCSPRefsType theOCSPRefs;
            theOCSPRefs = this.getOCSPRefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ocspRefs", theOCSPRefs), currentHashCode, theOCSPRefs, (this.ocspRefs!= null));
        }
        {
            OtherCertStatusRefsType theOtherRefs;
            theOtherRefs = this.getOtherRefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherRefs", theOtherRefs), currentHashCode, theOtherRefs, (this.otherRefs!= null));
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
