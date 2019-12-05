//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CertificateTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CertificateTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RemarksType;
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
 * <p>Classe Java per CertificateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CertificateTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CertificateType"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateType", propOrder = {
    "id",
    "certificateTypeCode",
    "certificateType",
    "remarks",
    "issuerParty",
    "documentReference",
    "signature"
})
public class CertificateType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "CertificateTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected CertificateTypeCodeType certificateTypeCode;
    @XmlElement(name = "CertificateType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected CertificateTypeType certificateType;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RemarksType> remarks;
    @XmlElement(name = "IssuerParty", required = true)
    protected PartyType issuerParty;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Signature")
    protected List<SignatureType> signature;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà certificateTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CertificateTypeCodeType }
     *     
     */
    public CertificateTypeCodeType getCertificateTypeCode() {
        return certificateTypeCode;
    }

    /**
     * Imposta il valore della proprietà certificateTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateTypeCodeType }
     *     
     */
    public void setCertificateTypeCode(CertificateTypeCodeType value) {
        this.certificateTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà certificateType.
     * 
     * @return
     *     possible object is
     *     {@link CertificateTypeType }
     *     
     */
    public CertificateTypeType getCertificateType() {
        return certificateType;
    }

    /**
     * Imposta il valore della proprietà certificateType.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateTypeType }
     *     
     */
    public void setCertificateType(CertificateTypeType value) {
        this.certificateType = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarksType }
     * 
     * 
     */
    public List<RemarksType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<RemarksType>();
        }
        return this.remarks;
    }

    /**
     * Recupera il valore della proprietà issuerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    /**
     * Imposta il valore della proprietà issuerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * 
     * 
     */
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            CertificateTypeCodeType theCertificateTypeCode;
            theCertificateTypeCode = this.getCertificateTypeCode();
            strategy.appendField(locator, this, "certificateTypeCode", buffer, theCertificateTypeCode, (this.certificateTypeCode!= null));
        }
        {
            CertificateTypeType theCertificateType;
            theCertificateType = this.getCertificateType();
            strategy.appendField(locator, this, "certificateType", buffer, theCertificateType, (this.certificateType!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            strategy.appendField(locator, this, "remarks", buffer, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            strategy.appendField(locator, this, "issuerParty", buffer, theIssuerParty, (this.issuerParty!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            List<SignatureType> theSignature;
            theSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            strategy.appendField(locator, this, "signature", buffer, theSignature, ((this.signature!= null)&&(!this.signature.isEmpty())));
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
        final CertificateType that = ((CertificateType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            CertificateTypeCodeType lhsCertificateTypeCode;
            lhsCertificateTypeCode = this.getCertificateTypeCode();
            CertificateTypeCodeType rhsCertificateTypeCode;
            rhsCertificateTypeCode = that.getCertificateTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificateTypeCode", lhsCertificateTypeCode), LocatorUtils.property(thatLocator, "certificateTypeCode", rhsCertificateTypeCode), lhsCertificateTypeCode, rhsCertificateTypeCode, (this.certificateTypeCode!= null), (that.certificateTypeCode!= null))) {
                return false;
            }
        }
        {
            CertificateTypeType lhsCertificateType;
            lhsCertificateType = this.getCertificateType();
            CertificateTypeType rhsCertificateType;
            rhsCertificateType = that.getCertificateType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificateType", lhsCertificateType), LocatorUtils.property(thatLocator, "certificateType", rhsCertificateType), lhsCertificateType, rhsCertificateType, (this.certificateType!= null), (that.certificateType!= null))) {
                return false;
            }
        }
        {
            List<RemarksType> lhsRemarks;
            lhsRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            List<RemarksType> rhsRemarks;
            rhsRemarks = (((that.remarks!= null)&&(!that.remarks.isEmpty()))?that.getRemarks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remarks", lhsRemarks), LocatorUtils.property(thatLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())), ((that.remarks!= null)&&(!that.remarks.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsIssuerParty;
            lhsIssuerParty = this.getIssuerParty();
            PartyType rhsIssuerParty;
            rhsIssuerParty = that.getIssuerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuerParty", lhsIssuerParty), LocatorUtils.property(thatLocator, "issuerParty", rhsIssuerParty), lhsIssuerParty, rhsIssuerParty, (this.issuerParty!= null), (that.issuerParty!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsDocumentReference;
            lhsDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            List<DocumentReferenceType> rhsDocumentReference;
            rhsDocumentReference = (((that.documentReference!= null)&&(!that.documentReference.isEmpty()))?that.getDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())), ((that.documentReference!= null)&&(!that.documentReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<SignatureType> lhsSignature;
            lhsSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            List<SignatureType> rhsSignature;
            rhsSignature = (((that.signature!= null)&&(!that.signature.isEmpty()))?that.getSignature():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signature", lhsSignature), LocatorUtils.property(thatLocator, "signature", rhsSignature), lhsSignature, rhsSignature, ((this.signature!= null)&&(!this.signature.isEmpty())), ((that.signature!= null)&&(!that.signature.isEmpty())))) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            CertificateTypeCodeType theCertificateTypeCode;
            theCertificateTypeCode = this.getCertificateTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificateTypeCode", theCertificateTypeCode), currentHashCode, theCertificateTypeCode, (this.certificateTypeCode!= null));
        }
        {
            CertificateTypeType theCertificateType;
            theCertificateType = this.getCertificateType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificateType", theCertificateType), currentHashCode, theCertificateType, (this.certificateType!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuerParty", theIssuerParty), currentHashCode, theIssuerParty, (this.issuerParty!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            List<SignatureType> theSignature;
            theSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signature", theSignature), currentHashCode, theSignature, ((this.signature!= null)&&(!this.signature.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
