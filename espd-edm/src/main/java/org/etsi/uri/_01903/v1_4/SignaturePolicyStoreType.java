//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_4;

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
import org.etsi.uri._01903.v1_3.ObjectIdentifierType;
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
 * <p>Classe Java per SignaturePolicyStoreType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyStoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.4.1#}SPDocSpecification"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SignaturePolicyDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="SigPolDocLocalURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
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
@XmlType(name = "SignaturePolicyStoreType", propOrder = {
    "spDocSpecification",
    "signaturePolicyDocument",
    "sigPolDocLocalURI"
})
public class SignaturePolicyStoreType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SPDocSpecification", required = true)
    protected ObjectIdentifierType spDocSpecification;
    @XmlElement(name = "SignaturePolicyDocument")
    protected byte[] signaturePolicyDocument;
    @XmlElement(name = "SigPolDocLocalURI")
    @XmlSchemaType(name = "anyURI")
    protected String sigPolDocLocalURI;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà spDocSpecification.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSPDocSpecification() {
        return spDocSpecification;
    }

    /**
     * Imposta il valore della proprietà spDocSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setSPDocSpecification(ObjectIdentifierType value) {
        this.spDocSpecification = value;
    }

    /**
     * Recupera il valore della proprietà signaturePolicyDocument.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignaturePolicyDocument() {
        return signaturePolicyDocument;
    }

    /**
     * Imposta il valore della proprietà signaturePolicyDocument.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignaturePolicyDocument(byte[] value) {
        this.signaturePolicyDocument = value;
    }

    /**
     * Recupera il valore della proprietà sigPolDocLocalURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigPolDocLocalURI() {
        return sigPolDocLocalURI;
    }

    /**
     * Imposta il valore della proprietà sigPolDocLocalURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigPolDocLocalURI(String value) {
        this.sigPolDocLocalURI = value;
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
            ObjectIdentifierType theSPDocSpecification;
            theSPDocSpecification = this.getSPDocSpecification();
            strategy.appendField(locator, this, "spDocSpecification", buffer, theSPDocSpecification, (this.spDocSpecification!= null));
        }
        {
            byte[] theSignaturePolicyDocument;
            theSignaturePolicyDocument = this.getSignaturePolicyDocument();
            strategy.appendField(locator, this, "signaturePolicyDocument", buffer, theSignaturePolicyDocument, (this.signaturePolicyDocument!= null));
        }
        {
            String theSigPolDocLocalURI;
            theSigPolDocLocalURI = this.getSigPolDocLocalURI();
            strategy.appendField(locator, this, "sigPolDocLocalURI", buffer, theSigPolDocLocalURI, (this.sigPolDocLocalURI!= null));
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
        final SignaturePolicyStoreType that = ((SignaturePolicyStoreType) object);
        {
            ObjectIdentifierType lhsSPDocSpecification;
            lhsSPDocSpecification = this.getSPDocSpecification();
            ObjectIdentifierType rhsSPDocSpecification;
            rhsSPDocSpecification = that.getSPDocSpecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spDocSpecification", lhsSPDocSpecification), LocatorUtils.property(thatLocator, "spDocSpecification", rhsSPDocSpecification), lhsSPDocSpecification, rhsSPDocSpecification, (this.spDocSpecification!= null), (that.spDocSpecification!= null))) {
                return false;
            }
        }
        {
            byte[] lhsSignaturePolicyDocument;
            lhsSignaturePolicyDocument = this.getSignaturePolicyDocument();
            byte[] rhsSignaturePolicyDocument;
            rhsSignaturePolicyDocument = that.getSignaturePolicyDocument();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signaturePolicyDocument", lhsSignaturePolicyDocument), LocatorUtils.property(thatLocator, "signaturePolicyDocument", rhsSignaturePolicyDocument), lhsSignaturePolicyDocument, rhsSignaturePolicyDocument, (this.signaturePolicyDocument!= null), (that.signaturePolicyDocument!= null))) {
                return false;
            }
        }
        {
            String lhsSigPolDocLocalURI;
            lhsSigPolDocLocalURI = this.getSigPolDocLocalURI();
            String rhsSigPolDocLocalURI;
            rhsSigPolDocLocalURI = that.getSigPolDocLocalURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sigPolDocLocalURI", lhsSigPolDocLocalURI), LocatorUtils.property(thatLocator, "sigPolDocLocalURI", rhsSigPolDocLocalURI), lhsSigPolDocLocalURI, rhsSigPolDocLocalURI, (this.sigPolDocLocalURI!= null), (that.sigPolDocLocalURI!= null))) {
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
            ObjectIdentifierType theSPDocSpecification;
            theSPDocSpecification = this.getSPDocSpecification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spDocSpecification", theSPDocSpecification), currentHashCode, theSPDocSpecification, (this.spDocSpecification!= null));
        }
        {
            byte[] theSignaturePolicyDocument;
            theSignaturePolicyDocument = this.getSignaturePolicyDocument();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signaturePolicyDocument", theSignaturePolicyDocument), currentHashCode, theSignaturePolicyDocument, (this.signaturePolicyDocument!= null));
        }
        {
            String theSigPolDocLocalURI;
            theSigPolDocLocalURI = this.getSigPolDocLocalURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sigPolDocLocalURI", theSigPolDocLocalURI), currentHashCode, theSigPolDocLocalURI, (this.sigPolDocLocalURI!= null));
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
