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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Classe Java per SignedSignaturePropertiesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignedSignaturePropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningCertificate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningCertificateV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignaturePolicyIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureProductionPlace" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureProductionPlaceV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignerRole" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignerRoleV2" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SignedSignaturePropertiesType", propOrder = {
    "signingTime",
    "signingCertificate",
    "signingCertificateV2",
    "signaturePolicyIdentifier",
    "signatureProductionPlace",
    "signatureProductionPlaceV2",
    "signerRole",
    "signerRoleV2",
    "any"
})
public class SignedSignaturePropertiesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SigningTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingTime;
    @XmlElement(name = "SigningCertificate")
    protected CertIDListType signingCertificate;
    @XmlElement(name = "SigningCertificateV2")
    protected CertIDListV2Type signingCertificateV2;
    @XmlElement(name = "SignaturePolicyIdentifier")
    protected SignaturePolicyIdentifierType signaturePolicyIdentifier;
    @XmlElement(name = "SignatureProductionPlace")
    protected SignatureProductionPlaceType signatureProductionPlace;
    @XmlElement(name = "SignatureProductionPlaceV2")
    protected SignatureProductionPlaceV2Type signatureProductionPlaceV2;
    @XmlElement(name = "SignerRole")
    protected SignerRoleType signerRole;
    @XmlElement(name = "SignerRoleV2")
    protected SignerRoleV2Type signerRoleV2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà signingTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningTime() {
        return signingTime;
    }

    /**
     * Imposta il valore della proprietà signingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSigningTime(XMLGregorianCalendar value) {
        this.signingTime = value;
    }

    /**
     * Recupera il valore della proprietà signingCertificate.
     * 
     * @return
     *     possible object is
     *     {@link CertIDListType }
     *     
     */
    public CertIDListType getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Imposta il valore della proprietà signingCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIDListType }
     *     
     */
    public void setSigningCertificate(CertIDListType value) {
        this.signingCertificate = value;
    }

    /**
     * Recupera il valore della proprietà signingCertificateV2.
     * 
     * @return
     *     possible object is
     *     {@link CertIDListV2Type }
     *     
     */
    public CertIDListV2Type getSigningCertificateV2() {
        return signingCertificateV2;
    }

    /**
     * Imposta il valore della proprietà signingCertificateV2.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIDListV2Type }
     *     
     */
    public void setSigningCertificateV2(CertIDListV2Type value) {
        this.signingCertificateV2 = value;
    }

    /**
     * Recupera il valore della proprietà signaturePolicyIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyIdentifierType }
     *     
     */
    public SignaturePolicyIdentifierType getSignaturePolicyIdentifier() {
        return signaturePolicyIdentifier;
    }

    /**
     * Imposta il valore della proprietà signaturePolicyIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyIdentifierType }
     *     
     */
    public void setSignaturePolicyIdentifier(SignaturePolicyIdentifierType value) {
        this.signaturePolicyIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà signatureProductionPlace.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProductionPlaceType }
     *     
     */
    public SignatureProductionPlaceType getSignatureProductionPlace() {
        return signatureProductionPlace;
    }

    /**
     * Imposta il valore della proprietà signatureProductionPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProductionPlaceType }
     *     
     */
    public void setSignatureProductionPlace(SignatureProductionPlaceType value) {
        this.signatureProductionPlace = value;
    }

    /**
     * Recupera il valore della proprietà signatureProductionPlaceV2.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProductionPlaceV2Type }
     *     
     */
    public SignatureProductionPlaceV2Type getSignatureProductionPlaceV2() {
        return signatureProductionPlaceV2;
    }

    /**
     * Imposta il valore della proprietà signatureProductionPlaceV2.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProductionPlaceV2Type }
     *     
     */
    public void setSignatureProductionPlaceV2(SignatureProductionPlaceV2Type value) {
        this.signatureProductionPlaceV2 = value;
    }

    /**
     * Recupera il valore della proprietà signerRole.
     * 
     * @return
     *     possible object is
     *     {@link SignerRoleType }
     *     
     */
    public SignerRoleType getSignerRole() {
        return signerRole;
    }

    /**
     * Imposta il valore della proprietà signerRole.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRoleType }
     *     
     */
    public void setSignerRole(SignerRoleType value) {
        this.signerRole = value;
    }

    /**
     * Recupera il valore della proprietà signerRoleV2.
     * 
     * @return
     *     possible object is
     *     {@link SignerRoleV2Type }
     *     
     */
    public SignerRoleV2Type getSignerRoleV2() {
        return signerRoleV2;
    }

    /**
     * Imposta il valore della proprietà signerRoleV2.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRoleV2Type }
     *     
     */
    public void setSignerRoleV2(SignerRoleV2Type value) {
        this.signerRoleV2 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
            XMLGregorianCalendar theSigningTime;
            theSigningTime = this.getSigningTime();
            strategy.appendField(locator, this, "signingTime", buffer, theSigningTime, (this.signingTime!= null));
        }
        {
            CertIDListType theSigningCertificate;
            theSigningCertificate = this.getSigningCertificate();
            strategy.appendField(locator, this, "signingCertificate", buffer, theSigningCertificate, (this.signingCertificate!= null));
        }
        {
            CertIDListV2Type theSigningCertificateV2;
            theSigningCertificateV2 = this.getSigningCertificateV2();
            strategy.appendField(locator, this, "signingCertificateV2", buffer, theSigningCertificateV2, (this.signingCertificateV2 != null));
        }
        {
            SignaturePolicyIdentifierType theSignaturePolicyIdentifier;
            theSignaturePolicyIdentifier = this.getSignaturePolicyIdentifier();
            strategy.appendField(locator, this, "signaturePolicyIdentifier", buffer, theSignaturePolicyIdentifier, (this.signaturePolicyIdentifier!= null));
        }
        {
            SignatureProductionPlaceType theSignatureProductionPlace;
            theSignatureProductionPlace = this.getSignatureProductionPlace();
            strategy.appendField(locator, this, "signatureProductionPlace", buffer, theSignatureProductionPlace, (this.signatureProductionPlace!= null));
        }
        {
            SignatureProductionPlaceV2Type theSignatureProductionPlaceV2;
            theSignatureProductionPlaceV2 = this.getSignatureProductionPlaceV2();
            strategy.appendField(locator, this, "signatureProductionPlaceV2", buffer, theSignatureProductionPlaceV2, (this.signatureProductionPlaceV2 != null));
        }
        {
            SignerRoleType theSignerRole;
            theSignerRole = this.getSignerRole();
            strategy.appendField(locator, this, "signerRole", buffer, theSignerRole, (this.signerRole!= null));
        }
        {
            SignerRoleV2Type theSignerRoleV2;
            theSignerRoleV2 = this.getSignerRoleV2();
            strategy.appendField(locator, this, "signerRoleV2", buffer, theSignerRoleV2, (this.signerRoleV2 != null));
        }
        {
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            strategy.appendField(locator, this, "any", buffer, theAny, ((this.any!= null)&&(!this.any.isEmpty())));
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
        final SignedSignaturePropertiesType that = ((SignedSignaturePropertiesType) object);
        {
            XMLGregorianCalendar lhsSigningTime;
            lhsSigningTime = this.getSigningTime();
            XMLGregorianCalendar rhsSigningTime;
            rhsSigningTime = that.getSigningTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signingTime", lhsSigningTime), LocatorUtils.property(thatLocator, "signingTime", rhsSigningTime), lhsSigningTime, rhsSigningTime, (this.signingTime!= null), (that.signingTime!= null))) {
                return false;
            }
        }
        {
            CertIDListType lhsSigningCertificate;
            lhsSigningCertificate = this.getSigningCertificate();
            CertIDListType rhsSigningCertificate;
            rhsSigningCertificate = that.getSigningCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signingCertificate", lhsSigningCertificate), LocatorUtils.property(thatLocator, "signingCertificate", rhsSigningCertificate), lhsSigningCertificate, rhsSigningCertificate, (this.signingCertificate!= null), (that.signingCertificate!= null))) {
                return false;
            }
        }
        {
            CertIDListV2Type lhsSigningCertificateV2;
            lhsSigningCertificateV2 = this.getSigningCertificateV2();
            CertIDListV2Type rhsSigningCertificateV2;
            rhsSigningCertificateV2 = that.getSigningCertificateV2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signingCertificateV2", lhsSigningCertificateV2), LocatorUtils.property(thatLocator, "signingCertificateV2", rhsSigningCertificateV2), lhsSigningCertificateV2, rhsSigningCertificateV2, (this.signingCertificateV2 != null), (that.signingCertificateV2 != null))) {
                return false;
            }
        }
        {
            SignaturePolicyIdentifierType lhsSignaturePolicyIdentifier;
            lhsSignaturePolicyIdentifier = this.getSignaturePolicyIdentifier();
            SignaturePolicyIdentifierType rhsSignaturePolicyIdentifier;
            rhsSignaturePolicyIdentifier = that.getSignaturePolicyIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signaturePolicyIdentifier", lhsSignaturePolicyIdentifier), LocatorUtils.property(thatLocator, "signaturePolicyIdentifier", rhsSignaturePolicyIdentifier), lhsSignaturePolicyIdentifier, rhsSignaturePolicyIdentifier, (this.signaturePolicyIdentifier!= null), (that.signaturePolicyIdentifier!= null))) {
                return false;
            }
        }
        {
            SignatureProductionPlaceType lhsSignatureProductionPlace;
            lhsSignatureProductionPlace = this.getSignatureProductionPlace();
            SignatureProductionPlaceType rhsSignatureProductionPlace;
            rhsSignatureProductionPlace = that.getSignatureProductionPlace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatureProductionPlace", lhsSignatureProductionPlace), LocatorUtils.property(thatLocator, "signatureProductionPlace", rhsSignatureProductionPlace), lhsSignatureProductionPlace, rhsSignatureProductionPlace, (this.signatureProductionPlace!= null), (that.signatureProductionPlace!= null))) {
                return false;
            }
        }
        {
            SignatureProductionPlaceV2Type lhsSignatureProductionPlaceV2;
            lhsSignatureProductionPlaceV2 = this.getSignatureProductionPlaceV2();
            SignatureProductionPlaceV2Type rhsSignatureProductionPlaceV2;
            rhsSignatureProductionPlaceV2 = that.getSignatureProductionPlaceV2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatureProductionPlaceV2", lhsSignatureProductionPlaceV2), LocatorUtils.property(thatLocator, "signatureProductionPlaceV2", rhsSignatureProductionPlaceV2), lhsSignatureProductionPlaceV2, rhsSignatureProductionPlaceV2, (this.signatureProductionPlaceV2 != null), (that.signatureProductionPlaceV2 != null))) {
                return false;
            }
        }
        {
            SignerRoleType lhsSignerRole;
            lhsSignerRole = this.getSignerRole();
            SignerRoleType rhsSignerRole;
            rhsSignerRole = that.getSignerRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signerRole", lhsSignerRole), LocatorUtils.property(thatLocator, "signerRole", rhsSignerRole), lhsSignerRole, rhsSignerRole, (this.signerRole!= null), (that.signerRole!= null))) {
                return false;
            }
        }
        {
            SignerRoleV2Type lhsSignerRoleV2;
            lhsSignerRoleV2 = this.getSignerRoleV2();
            SignerRoleV2Type rhsSignerRoleV2;
            rhsSignerRoleV2 = that.getSignerRoleV2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signerRoleV2", lhsSignerRoleV2), LocatorUtils.property(thatLocator, "signerRoleV2", rhsSignerRoleV2), lhsSignerRoleV2, rhsSignerRoleV2, (this.signerRoleV2 != null), (that.signerRoleV2 != null))) {
                return false;
            }
        }
        {
            List<Object> lhsAny;
            lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            List<Object> rhsAny;
            rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny, ((this.any!= null)&&(!this.any.isEmpty())), ((that.any!= null)&&(!that.any.isEmpty())))) {
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
            XMLGregorianCalendar theSigningTime;
            theSigningTime = this.getSigningTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signingTime", theSigningTime), currentHashCode, theSigningTime, (this.signingTime!= null));
        }
        {
            CertIDListType theSigningCertificate;
            theSigningCertificate = this.getSigningCertificate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signingCertificate", theSigningCertificate), currentHashCode, theSigningCertificate, (this.signingCertificate!= null));
        }
        {
            CertIDListV2Type theSigningCertificateV2;
            theSigningCertificateV2 = this.getSigningCertificateV2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signingCertificateV2", theSigningCertificateV2), currentHashCode, theSigningCertificateV2, (this.signingCertificateV2 != null));
        }
        {
            SignaturePolicyIdentifierType theSignaturePolicyIdentifier;
            theSignaturePolicyIdentifier = this.getSignaturePolicyIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signaturePolicyIdentifier", theSignaturePolicyIdentifier), currentHashCode, theSignaturePolicyIdentifier, (this.signaturePolicyIdentifier!= null));
        }
        {
            SignatureProductionPlaceType theSignatureProductionPlace;
            theSignatureProductionPlace = this.getSignatureProductionPlace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatureProductionPlace", theSignatureProductionPlace), currentHashCode, theSignatureProductionPlace, (this.signatureProductionPlace!= null));
        }
        {
            SignatureProductionPlaceV2Type theSignatureProductionPlaceV2;
            theSignatureProductionPlaceV2 = this.getSignatureProductionPlaceV2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatureProductionPlaceV2", theSignatureProductionPlaceV2), currentHashCode, theSignatureProductionPlaceV2, (this.signatureProductionPlaceV2 != null));
        }
        {
            SignerRoleType theSignerRole;
            theSignerRole = this.getSignerRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signerRole", theSignerRole), currentHashCode, theSignerRole, (this.signerRole!= null));
        }
        {
            SignerRoleV2Type theSignerRoleV2;
            theSignerRoleV2 = this.getSignerRoleV2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signerRoleV2", theSignerRoleV2), currentHashCode, theSignerRoleV2, (this.signerRoleV2 != null));
        }
        {
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny, ((this.any!= null)&&(!this.any.isEmpty())));
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
