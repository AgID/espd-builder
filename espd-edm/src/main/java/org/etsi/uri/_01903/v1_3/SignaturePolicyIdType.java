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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
import org.w3._2000._09.xmldsig_.TransformsType;


/**
 * <p>Classe Java per SignaturePolicyIdType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SigPolicyId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/&gt;
 *         &lt;element name="SigPolicyHash" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&gt;
 *         &lt;element name="SigPolicyQualifiers" type="{http://uri.etsi.org/01903/v1.3.2#}SigPolicyQualifiersListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyIdType", propOrder = {
    "sigPolicyId",
    "transforms",
    "sigPolicyHash",
    "sigPolicyQualifiers"
})
public class SignaturePolicyIdType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SigPolicyId", required = true)
    protected ObjectIdentifierType sigPolicyId;
    @XmlElement(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected TransformsType transforms;
    @XmlElement(name = "SigPolicyHash", required = true)
    protected DigestAlgAndValueType sigPolicyHash;
    @XmlElement(name = "SigPolicyQualifiers")
    protected SigPolicyQualifiersListType sigPolicyQualifiers;

    /**
     * Recupera il valore della proprietà sigPolicyId.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSigPolicyId() {
        return sigPolicyId;
    }

    /**
     * Imposta il valore della proprietà sigPolicyId.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setSigPolicyId(ObjectIdentifierType value) {
        this.sigPolicyId = value;
    }

    /**
     * Recupera il valore della proprietà transforms.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Imposta il valore della proprietà transforms.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Recupera il valore della proprietà sigPolicyHash.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getSigPolicyHash() {
        return sigPolicyHash;
    }

    /**
     * Imposta il valore della proprietà sigPolicyHash.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setSigPolicyHash(DigestAlgAndValueType value) {
        this.sigPolicyHash = value;
    }

    /**
     * Recupera il valore della proprietà sigPolicyQualifiers.
     * 
     * @return
     *     possible object is
     *     {@link SigPolicyQualifiersListType }
     *     
     */
    public SigPolicyQualifiersListType getSigPolicyQualifiers() {
        return sigPolicyQualifiers;
    }

    /**
     * Imposta il valore della proprietà sigPolicyQualifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link SigPolicyQualifiersListType }
     *     
     */
    public void setSigPolicyQualifiers(SigPolicyQualifiersListType value) {
        this.sigPolicyQualifiers = value;
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
            ObjectIdentifierType theSigPolicyId;
            theSigPolicyId = this.getSigPolicyId();
            strategy.appendField(locator, this, "sigPolicyId", buffer, theSigPolicyId, (this.sigPolicyId!= null));
        }
        {
            TransformsType theTransforms;
            theTransforms = this.getTransforms();
            strategy.appendField(locator, this, "transforms", buffer, theTransforms, (this.transforms!= null));
        }
        {
            DigestAlgAndValueType theSigPolicyHash;
            theSigPolicyHash = this.getSigPolicyHash();
            strategy.appendField(locator, this, "sigPolicyHash", buffer, theSigPolicyHash, (this.sigPolicyHash!= null));
        }
        {
            SigPolicyQualifiersListType theSigPolicyQualifiers;
            theSigPolicyQualifiers = this.getSigPolicyQualifiers();
            strategy.appendField(locator, this, "sigPolicyQualifiers", buffer, theSigPolicyQualifiers, (this.sigPolicyQualifiers!= null));
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
        final SignaturePolicyIdType that = ((SignaturePolicyIdType) object);
        {
            ObjectIdentifierType lhsSigPolicyId;
            lhsSigPolicyId = this.getSigPolicyId();
            ObjectIdentifierType rhsSigPolicyId;
            rhsSigPolicyId = that.getSigPolicyId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sigPolicyId", lhsSigPolicyId), LocatorUtils.property(thatLocator, "sigPolicyId", rhsSigPolicyId), lhsSigPolicyId, rhsSigPolicyId, (this.sigPolicyId!= null), (that.sigPolicyId!= null))) {
                return false;
            }
        }
        {
            TransformsType lhsTransforms;
            lhsTransforms = this.getTransforms();
            TransformsType rhsTransforms;
            rhsTransforms = that.getTransforms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transforms", lhsTransforms), LocatorUtils.property(thatLocator, "transforms", rhsTransforms), lhsTransforms, rhsTransforms, (this.transforms!= null), (that.transforms!= null))) {
                return false;
            }
        }
        {
            DigestAlgAndValueType lhsSigPolicyHash;
            lhsSigPolicyHash = this.getSigPolicyHash();
            DigestAlgAndValueType rhsSigPolicyHash;
            rhsSigPolicyHash = that.getSigPolicyHash();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sigPolicyHash", lhsSigPolicyHash), LocatorUtils.property(thatLocator, "sigPolicyHash", rhsSigPolicyHash), lhsSigPolicyHash, rhsSigPolicyHash, (this.sigPolicyHash!= null), (that.sigPolicyHash!= null))) {
                return false;
            }
        }
        {
            SigPolicyQualifiersListType lhsSigPolicyQualifiers;
            lhsSigPolicyQualifiers = this.getSigPolicyQualifiers();
            SigPolicyQualifiersListType rhsSigPolicyQualifiers;
            rhsSigPolicyQualifiers = that.getSigPolicyQualifiers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sigPolicyQualifiers", lhsSigPolicyQualifiers), LocatorUtils.property(thatLocator, "sigPolicyQualifiers", rhsSigPolicyQualifiers), lhsSigPolicyQualifiers, rhsSigPolicyQualifiers, (this.sigPolicyQualifiers!= null), (that.sigPolicyQualifiers!= null))) {
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
            ObjectIdentifierType theSigPolicyId;
            theSigPolicyId = this.getSigPolicyId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sigPolicyId", theSigPolicyId), currentHashCode, theSigPolicyId, (this.sigPolicyId!= null));
        }
        {
            TransformsType theTransforms;
            theTransforms = this.getTransforms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transforms", theTransforms), currentHashCode, theTransforms, (this.transforms!= null));
        }
        {
            DigestAlgAndValueType theSigPolicyHash;
            theSigPolicyHash = this.getSigPolicyHash();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sigPolicyHash", theSigPolicyHash), currentHashCode, theSigPolicyHash, (this.sigPolicyHash!= null));
        }
        {
            SigPolicyQualifiersListType theSigPolicyQualifiers;
            theSigPolicyQualifiers = this.getSigPolicyQualifiers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sigPolicyQualifiers", theSigPolicyQualifiers), currentHashCode, theSigPolicyQualifiers, (this.sigPolicyQualifiers!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
