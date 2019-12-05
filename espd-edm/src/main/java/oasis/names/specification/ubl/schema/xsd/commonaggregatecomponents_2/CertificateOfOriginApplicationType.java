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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ApplicationStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CertificateTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OriginalJobIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousJobIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceIDType;
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
 * <p>Classe Java per CertificateOfOriginApplicationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateOfOriginApplicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CertificateType"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ApplicationStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OriginalJobID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousJobID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EndorserParty" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PreparationParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ImporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuingCountry"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentDistribution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportingDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CertificateOfOriginApplicationType", propOrder = {
    "referenceID",
    "certificateType",
    "applicationStatusCode",
    "originalJobID",
    "previousJobID",
    "remarks",
    "shipment",
    "endorserParty",
    "preparationParty",
    "issuerParty",
    "exporterParty",
    "importerParty",
    "issuingCountry",
    "documentDistribution",
    "supportingDocumentReference",
    "signature"
})
public class CertificateOfOriginApplicationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ReferenceIDType referenceID;
    @XmlElement(name = "CertificateType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected CertificateTypeType certificateType;
    @XmlElement(name = "ApplicationStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ApplicationStatusCodeType applicationStatusCode;
    @XmlElement(name = "OriginalJobID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected OriginalJobIDType originalJobID;
    @XmlElement(name = "PreviousJobID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousJobIDType previousJobID;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RemarksType> remarks;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentType shipment;
    @XmlElement(name = "EndorserParty", required = true)
    protected List<EndorserPartyType> endorserParty;
    @XmlElement(name = "PreparationParty", required = true)
    protected PartyType preparationParty;
    @XmlElement(name = "IssuerParty", required = true)
    protected PartyType issuerParty;
    @XmlElement(name = "ExporterParty")
    protected PartyType exporterParty;
    @XmlElement(name = "ImporterParty")
    protected PartyType importerParty;
    @XmlElement(name = "IssuingCountry", required = true)
    protected CountryType issuingCountry;
    @XmlElement(name = "DocumentDistribution")
    protected List<DocumentDistributionType> documentDistribution;
    @XmlElement(name = "SupportingDocumentReference")
    protected List<DocumentReferenceType> supportingDocumentReference;
    @XmlElement(name = "Signature")
    protected List<SignatureType> signature;

    /**
     * Recupera il valore della proprietà referenceID.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceIDType }
     *     
     */
    public ReferenceIDType getReferenceID() {
        return referenceID;
    }

    /**
     * Imposta il valore della proprietà referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceIDType }
     *     
     */
    public void setReferenceID(ReferenceIDType value) {
        this.referenceID = value;
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
     * Recupera il valore della proprietà applicationStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusCodeType }
     *     
     */
    public ApplicationStatusCodeType getApplicationStatusCode() {
        return applicationStatusCode;
    }

    /**
     * Imposta il valore della proprietà applicationStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusCodeType }
     *     
     */
    public void setApplicationStatusCode(ApplicationStatusCodeType value) {
        this.applicationStatusCode = value;
    }

    /**
     * Recupera il valore della proprietà originalJobID.
     * 
     * @return
     *     possible object is
     *     {@link OriginalJobIDType }
     *     
     */
    public OriginalJobIDType getOriginalJobID() {
        return originalJobID;
    }

    /**
     * Imposta il valore della proprietà originalJobID.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalJobIDType }
     *     
     */
    public void setOriginalJobID(OriginalJobIDType value) {
        this.originalJobID = value;
    }

    /**
     * Recupera il valore della proprietà previousJobID.
     * 
     * @return
     *     possible object is
     *     {@link PreviousJobIDType }
     *     
     */
    public PreviousJobIDType getPreviousJobID() {
        return previousJobID;
    }

    /**
     * Imposta il valore della proprietà previousJobID.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousJobIDType }
     *     
     */
    public void setPreviousJobID(PreviousJobIDType value) {
        this.previousJobID = value;
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
     * Recupera il valore della proprietà shipment.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * Imposta il valore della proprietà shipment.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the endorserParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorserParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorserParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndorserPartyType }
     * 
     * 
     */
    public List<EndorserPartyType> getEndorserParty() {
        if (endorserParty == null) {
            endorserParty = new ArrayList<EndorserPartyType>();
        }
        return this.endorserParty;
    }

    /**
     * Recupera il valore della proprietà preparationParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPreparationParty() {
        return preparationParty;
    }

    /**
     * Imposta il valore della proprietà preparationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPreparationParty(PartyType value) {
        this.preparationParty = value;
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
     * Recupera il valore della proprietà exporterParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getExporterParty() {
        return exporterParty;
    }

    /**
     * Imposta il valore della proprietà exporterParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setExporterParty(PartyType value) {
        this.exporterParty = value;
    }

    /**
     * Recupera il valore della proprietà importerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getImporterParty() {
        return importerParty;
    }

    /**
     * Imposta il valore della proprietà importerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setImporterParty(PartyType value) {
        this.importerParty = value;
    }

    /**
     * Recupera il valore della proprietà issuingCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getIssuingCountry() {
        return issuingCountry;
    }

    /**
     * Imposta il valore della proprietà issuingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setIssuingCountry(CountryType value) {
        this.issuingCountry = value;
    }

    /**
     * Gets the value of the documentDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentDistributionType }
     * 
     * 
     */
    public List<DocumentDistributionType> getDocumentDistribution() {
        if (documentDistribution == null) {
            documentDistribution = new ArrayList<DocumentDistributionType>();
        }
        return this.documentDistribution;
    }

    /**
     * Gets the value of the supportingDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getSupportingDocumentReference() {
        if (supportingDocumentReference == null) {
            supportingDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.supportingDocumentReference;
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
            ReferenceIDType theReferenceID;
            theReferenceID = this.getReferenceID();
            strategy.appendField(locator, this, "referenceID", buffer, theReferenceID, (this.referenceID!= null));
        }
        {
            CertificateTypeType theCertificateType;
            theCertificateType = this.getCertificateType();
            strategy.appendField(locator, this, "certificateType", buffer, theCertificateType, (this.certificateType!= null));
        }
        {
            ApplicationStatusCodeType theApplicationStatusCode;
            theApplicationStatusCode = this.getApplicationStatusCode();
            strategy.appendField(locator, this, "applicationStatusCode", buffer, theApplicationStatusCode, (this.applicationStatusCode!= null));
        }
        {
            OriginalJobIDType theOriginalJobID;
            theOriginalJobID = this.getOriginalJobID();
            strategy.appendField(locator, this, "originalJobID", buffer, theOriginalJobID, (this.originalJobID!= null));
        }
        {
            PreviousJobIDType thePreviousJobID;
            thePreviousJobID = this.getPreviousJobID();
            strategy.appendField(locator, this, "previousJobID", buffer, thePreviousJobID, (this.previousJobID!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            strategy.appendField(locator, this, "remarks", buffer, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            ShipmentType theShipment;
            theShipment = this.getShipment();
            strategy.appendField(locator, this, "shipment", buffer, theShipment, (this.shipment!= null));
        }
        {
            List<EndorserPartyType> theEndorserParty;
            theEndorserParty = (((this.endorserParty!= null)&&(!this.endorserParty.isEmpty()))?this.getEndorserParty():null);
            strategy.appendField(locator, this, "endorserParty", buffer, theEndorserParty, ((this.endorserParty!= null)&&(!this.endorserParty.isEmpty())));
        }
        {
            PartyType thePreparationParty;
            thePreparationParty = this.getPreparationParty();
            strategy.appendField(locator, this, "preparationParty", buffer, thePreparationParty, (this.preparationParty!= null));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            strategy.appendField(locator, this, "issuerParty", buffer, theIssuerParty, (this.issuerParty!= null));
        }
        {
            PartyType theExporterParty;
            theExporterParty = this.getExporterParty();
            strategy.appendField(locator, this, "exporterParty", buffer, theExporterParty, (this.exporterParty!= null));
        }
        {
            PartyType theImporterParty;
            theImporterParty = this.getImporterParty();
            strategy.appendField(locator, this, "importerParty", buffer, theImporterParty, (this.importerParty!= null));
        }
        {
            CountryType theIssuingCountry;
            theIssuingCountry = this.getIssuingCountry();
            strategy.appendField(locator, this, "issuingCountry", buffer, theIssuingCountry, (this.issuingCountry!= null));
        }
        {
            List<DocumentDistributionType> theDocumentDistribution;
            theDocumentDistribution = (((this.documentDistribution!= null)&&(!this.documentDistribution.isEmpty()))?this.getDocumentDistribution():null);
            strategy.appendField(locator, this, "documentDistribution", buffer, theDocumentDistribution, ((this.documentDistribution!= null)&&(!this.documentDistribution.isEmpty())));
        }
        {
            List<DocumentReferenceType> theSupportingDocumentReference;
            theSupportingDocumentReference = (((this.supportingDocumentReference!= null)&&(!this.supportingDocumentReference.isEmpty()))?this.getSupportingDocumentReference():null);
            strategy.appendField(locator, this, "supportingDocumentReference", buffer, theSupportingDocumentReference, ((this.supportingDocumentReference!= null)&&(!this.supportingDocumentReference.isEmpty())));
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
        final CertificateOfOriginApplicationType that = ((CertificateOfOriginApplicationType) object);
        {
            ReferenceIDType lhsReferenceID;
            lhsReferenceID = this.getReferenceID();
            ReferenceIDType rhsReferenceID;
            rhsReferenceID = that.getReferenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceID", lhsReferenceID), LocatorUtils.property(thatLocator, "referenceID", rhsReferenceID), lhsReferenceID, rhsReferenceID, (this.referenceID!= null), (that.referenceID!= null))) {
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
            ApplicationStatusCodeType lhsApplicationStatusCode;
            lhsApplicationStatusCode = this.getApplicationStatusCode();
            ApplicationStatusCodeType rhsApplicationStatusCode;
            rhsApplicationStatusCode = that.getApplicationStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicationStatusCode", lhsApplicationStatusCode), LocatorUtils.property(thatLocator, "applicationStatusCode", rhsApplicationStatusCode), lhsApplicationStatusCode, rhsApplicationStatusCode, (this.applicationStatusCode!= null), (that.applicationStatusCode!= null))) {
                return false;
            }
        }
        {
            OriginalJobIDType lhsOriginalJobID;
            lhsOriginalJobID = this.getOriginalJobID();
            OriginalJobIDType rhsOriginalJobID;
            rhsOriginalJobID = that.getOriginalJobID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalJobID", lhsOriginalJobID), LocatorUtils.property(thatLocator, "originalJobID", rhsOriginalJobID), lhsOriginalJobID, rhsOriginalJobID, (this.originalJobID!= null), (that.originalJobID!= null))) {
                return false;
            }
        }
        {
            PreviousJobIDType lhsPreviousJobID;
            lhsPreviousJobID = this.getPreviousJobID();
            PreviousJobIDType rhsPreviousJobID;
            rhsPreviousJobID = that.getPreviousJobID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousJobID", lhsPreviousJobID), LocatorUtils.property(thatLocator, "previousJobID", rhsPreviousJobID), lhsPreviousJobID, rhsPreviousJobID, (this.previousJobID!= null), (that.previousJobID!= null))) {
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
            ShipmentType lhsShipment;
            lhsShipment = this.getShipment();
            ShipmentType rhsShipment;
            rhsShipment = that.getShipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipment", lhsShipment), LocatorUtils.property(thatLocator, "shipment", rhsShipment), lhsShipment, rhsShipment, (this.shipment!= null), (that.shipment!= null))) {
                return false;
            }
        }
        {
            List<EndorserPartyType> lhsEndorserParty;
            lhsEndorserParty = (((this.endorserParty!= null)&&(!this.endorserParty.isEmpty()))?this.getEndorserParty():null);
            List<EndorserPartyType> rhsEndorserParty;
            rhsEndorserParty = (((that.endorserParty!= null)&&(!that.endorserParty.isEmpty()))?that.getEndorserParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endorserParty", lhsEndorserParty), LocatorUtils.property(thatLocator, "endorserParty", rhsEndorserParty), lhsEndorserParty, rhsEndorserParty, ((this.endorserParty!= null)&&(!this.endorserParty.isEmpty())), ((that.endorserParty!= null)&&(!that.endorserParty.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsPreparationParty;
            lhsPreparationParty = this.getPreparationParty();
            PartyType rhsPreparationParty;
            rhsPreparationParty = that.getPreparationParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preparationParty", lhsPreparationParty), LocatorUtils.property(thatLocator, "preparationParty", rhsPreparationParty), lhsPreparationParty, rhsPreparationParty, (this.preparationParty!= null), (that.preparationParty!= null))) {
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
            PartyType lhsExporterParty;
            lhsExporterParty = this.getExporterParty();
            PartyType rhsExporterParty;
            rhsExporterParty = that.getExporterParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exporterParty", lhsExporterParty), LocatorUtils.property(thatLocator, "exporterParty", rhsExporterParty), lhsExporterParty, rhsExporterParty, (this.exporterParty!= null), (that.exporterParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsImporterParty;
            lhsImporterParty = this.getImporterParty();
            PartyType rhsImporterParty;
            rhsImporterParty = that.getImporterParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importerParty", lhsImporterParty), LocatorUtils.property(thatLocator, "importerParty", rhsImporterParty), lhsImporterParty, rhsImporterParty, (this.importerParty!= null), (that.importerParty!= null))) {
                return false;
            }
        }
        {
            CountryType lhsIssuingCountry;
            lhsIssuingCountry = this.getIssuingCountry();
            CountryType rhsIssuingCountry;
            rhsIssuingCountry = that.getIssuingCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuingCountry", lhsIssuingCountry), LocatorUtils.property(thatLocator, "issuingCountry", rhsIssuingCountry), lhsIssuingCountry, rhsIssuingCountry, (this.issuingCountry!= null), (that.issuingCountry!= null))) {
                return false;
            }
        }
        {
            List<DocumentDistributionType> lhsDocumentDistribution;
            lhsDocumentDistribution = (((this.documentDistribution!= null)&&(!this.documentDistribution.isEmpty()))?this.getDocumentDistribution():null);
            List<DocumentDistributionType> rhsDocumentDistribution;
            rhsDocumentDistribution = (((that.documentDistribution!= null)&&(!that.documentDistribution.isEmpty()))?that.getDocumentDistribution():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentDistribution", lhsDocumentDistribution), LocatorUtils.property(thatLocator, "documentDistribution", rhsDocumentDistribution), lhsDocumentDistribution, rhsDocumentDistribution, ((this.documentDistribution!= null)&&(!this.documentDistribution.isEmpty())), ((that.documentDistribution!= null)&&(!that.documentDistribution.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsSupportingDocumentReference;
            lhsSupportingDocumentReference = (((this.supportingDocumentReference!= null)&&(!this.supportingDocumentReference.isEmpty()))?this.getSupportingDocumentReference():null);
            List<DocumentReferenceType> rhsSupportingDocumentReference;
            rhsSupportingDocumentReference = (((that.supportingDocumentReference!= null)&&(!that.supportingDocumentReference.isEmpty()))?that.getSupportingDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supportingDocumentReference", lhsSupportingDocumentReference), LocatorUtils.property(thatLocator, "supportingDocumentReference", rhsSupportingDocumentReference), lhsSupportingDocumentReference, rhsSupportingDocumentReference, ((this.supportingDocumentReference!= null)&&(!this.supportingDocumentReference.isEmpty())), ((that.supportingDocumentReference!= null)&&(!that.supportingDocumentReference.isEmpty())))) {
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
            ReferenceIDType theReferenceID;
            theReferenceID = this.getReferenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceID", theReferenceID), currentHashCode, theReferenceID, (this.referenceID!= null));
        }
        {
            CertificateTypeType theCertificateType;
            theCertificateType = this.getCertificateType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificateType", theCertificateType), currentHashCode, theCertificateType, (this.certificateType!= null));
        }
        {
            ApplicationStatusCodeType theApplicationStatusCode;
            theApplicationStatusCode = this.getApplicationStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicationStatusCode", theApplicationStatusCode), currentHashCode, theApplicationStatusCode, (this.applicationStatusCode!= null));
        }
        {
            OriginalJobIDType theOriginalJobID;
            theOriginalJobID = this.getOriginalJobID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalJobID", theOriginalJobID), currentHashCode, theOriginalJobID, (this.originalJobID!= null));
        }
        {
            PreviousJobIDType thePreviousJobID;
            thePreviousJobID = this.getPreviousJobID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousJobID", thePreviousJobID), currentHashCode, thePreviousJobID, (this.previousJobID!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            ShipmentType theShipment;
            theShipment = this.getShipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipment", theShipment), currentHashCode, theShipment, (this.shipment!= null));
        }
        {
            List<EndorserPartyType> theEndorserParty;
            theEndorserParty = (((this.endorserParty!= null)&&(!this.endorserParty.isEmpty()))?this.getEndorserParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endorserParty", theEndorserParty), currentHashCode, theEndorserParty, ((this.endorserParty!= null)&&(!this.endorserParty.isEmpty())));
        }
        {
            PartyType thePreparationParty;
            thePreparationParty = this.getPreparationParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preparationParty", thePreparationParty), currentHashCode, thePreparationParty, (this.preparationParty!= null));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuerParty", theIssuerParty), currentHashCode, theIssuerParty, (this.issuerParty!= null));
        }
        {
            PartyType theExporterParty;
            theExporterParty = this.getExporterParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exporterParty", theExporterParty), currentHashCode, theExporterParty, (this.exporterParty!= null));
        }
        {
            PartyType theImporterParty;
            theImporterParty = this.getImporterParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "importerParty", theImporterParty), currentHashCode, theImporterParty, (this.importerParty!= null));
        }
        {
            CountryType theIssuingCountry;
            theIssuingCountry = this.getIssuingCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuingCountry", theIssuingCountry), currentHashCode, theIssuingCountry, (this.issuingCountry!= null));
        }
        {
            List<DocumentDistributionType> theDocumentDistribution;
            theDocumentDistribution = (((this.documentDistribution!= null)&&(!this.documentDistribution.isEmpty()))?this.getDocumentDistribution():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentDistribution", theDocumentDistribution), currentHashCode, theDocumentDistribution, ((this.documentDistribution!= null)&&(!this.documentDistribution.isEmpty())));
        }
        {
            List<DocumentReferenceType> theSupportingDocumentReference;
            theSupportingDocumentReference = (((this.supportingDocumentReference!= null)&&(!this.supportingDocumentReference.isEmpty()))?this.getSupportingDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supportingDocumentReference", theSupportingDocumentReference), currentHashCode, theSupportingDocumentReference, ((this.supportingDocumentReference!= null)&&(!this.supportingDocumentReference.isEmpty())));
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
