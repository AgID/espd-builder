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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FeeAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FeeDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TenderEnvelopeIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TenderEnvelopeTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VariantIDType;
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
 * <p>Classe Java per TenderedProjectType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderedProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VariantID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalMonetaryTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingCriterionResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderedProjectType", propOrder = {
    "variantID",
    "feeAmount",
    "feeDescription",
    "tenderEnvelopeID",
    "tenderEnvelopeTypeCode",
    "procurementProjectLot",
    "evidenceDocumentReference",
    "taxTotal",
    "legalMonetaryTotal",
    "tenderLine",
    "awardingCriterionResponse"
})
public class TenderedProjectType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "VariantID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VariantIDType variantID;
    @XmlElement(name = "FeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FeeAmountType feeAmount;
    @XmlElement(name = "FeeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<FeeDescriptionType> feeDescription;
    @XmlElement(name = "TenderEnvelopeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderEnvelopeIDType tenderEnvelopeID;
    @XmlElement(name = "TenderEnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderEnvelopeTypeCodeType tenderEnvelopeTypeCode;
    @XmlElement(name = "ProcurementProjectLot")
    protected ProcurementProjectLotType procurementProjectLot;
    @XmlElement(name = "EvidenceDocumentReference")
    protected List<DocumentReferenceType> evidenceDocumentReference;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "LegalMonetaryTotal")
    protected MonetaryTotalType legalMonetaryTotal;
    @XmlElement(name = "TenderLine")
    protected List<TenderLineType> tenderLine;
    @XmlElement(name = "AwardingCriterionResponse")
    protected List<AwardingCriterionResponseType> awardingCriterionResponse;

    /**
     * Recupera il valore della proprietà variantID.
     * 
     * @return
     *     possible object is
     *     {@link VariantIDType }
     *     
     */
    public VariantIDType getVariantID() {
        return variantID;
    }

    /**
     * Imposta il valore della proprietà variantID.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantIDType }
     *     
     */
    public void setVariantID(VariantIDType value) {
        this.variantID = value;
    }

    /**
     * Recupera il valore della proprietà feeAmount.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmountType }
     *     
     */
    public FeeAmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Imposta il valore della proprietà feeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmountType }
     *     
     */
    public void setFeeAmount(FeeAmountType value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDescriptionType }
     * 
     * 
     */
    public List<FeeDescriptionType> getFeeDescription() {
        if (feeDescription == null) {
            feeDescription = new ArrayList<FeeDescriptionType>();
        }
        return this.feeDescription;
    }

    /**
     * Recupera il valore della proprietà tenderEnvelopeID.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeIDType }
     *     
     */
    public TenderEnvelopeIDType getTenderEnvelopeID() {
        return tenderEnvelopeID;
    }

    /**
     * Imposta il valore della proprietà tenderEnvelopeID.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeIDType }
     *     
     */
    public void setTenderEnvelopeID(TenderEnvelopeIDType value) {
        this.tenderEnvelopeID = value;
    }

    /**
     * Recupera il valore della proprietà tenderEnvelopeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeTypeCodeType }
     *     
     */
    public TenderEnvelopeTypeCodeType getTenderEnvelopeTypeCode() {
        return tenderEnvelopeTypeCode;
    }

    /**
     * Imposta il valore della proprietà tenderEnvelopeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeTypeCodeType }
     *     
     */
    public void setTenderEnvelopeTypeCode(TenderEnvelopeTypeCodeType value) {
        this.tenderEnvelopeTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà procurementProjectLot.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public ProcurementProjectLotType getProcurementProjectLot() {
        return procurementProjectLot;
    }

    /**
     * Imposta il valore della proprietà procurementProjectLot.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public void setProcurementProjectLot(ProcurementProjectLotType value) {
        this.procurementProjectLot = value;
    }

    /**
     * Gets the value of the evidenceDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getEvidenceDocumentReference() {
        if (evidenceDocumentReference == null) {
            evidenceDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.evidenceDocumentReference;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotal() {
        if (taxTotal == null) {
            taxTotal = new ArrayList<TaxTotalType>();
        }
        return this.taxTotal;
    }

    /**
     * Recupera il valore della proprietà legalMonetaryTotal.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTotalType }
     *     
     */
    public MonetaryTotalType getLegalMonetaryTotal() {
        return legalMonetaryTotal;
    }

    /**
     * Imposta il valore della proprietà legalMonetaryTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTotalType }
     *     
     */
    public void setLegalMonetaryTotal(MonetaryTotalType value) {
        this.legalMonetaryTotal = value;
    }

    /**
     * Gets the value of the tenderLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderLineType }
     * 
     * 
     */
    public List<TenderLineType> getTenderLine() {
        if (tenderLine == null) {
            tenderLine = new ArrayList<TenderLineType>();
        }
        return this.tenderLine;
    }

    /**
     * Gets the value of the awardingCriterionResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardingCriterionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardingCriterionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionResponseType }
     * 
     * 
     */
    public List<AwardingCriterionResponseType> getAwardingCriterionResponse() {
        if (awardingCriterionResponse == null) {
            awardingCriterionResponse = new ArrayList<AwardingCriterionResponseType>();
        }
        return this.awardingCriterionResponse;
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
            VariantIDType theVariantID;
            theVariantID = this.getVariantID();
            strategy.appendField(locator, this, "variantID", buffer, theVariantID, (this.variantID!= null));
        }
        {
            FeeAmountType theFeeAmount;
            theFeeAmount = this.getFeeAmount();
            strategy.appendField(locator, this, "feeAmount", buffer, theFeeAmount, (this.feeAmount!= null));
        }
        {
            List<FeeDescriptionType> theFeeDescription;
            theFeeDescription = (((this.feeDescription!= null)&&(!this.feeDescription.isEmpty()))?this.getFeeDescription():null);
            strategy.appendField(locator, this, "feeDescription", buffer, theFeeDescription, ((this.feeDescription!= null)&&(!this.feeDescription.isEmpty())));
        }
        {
            TenderEnvelopeIDType theTenderEnvelopeID;
            theTenderEnvelopeID = this.getTenderEnvelopeID();
            strategy.appendField(locator, this, "tenderEnvelopeID", buffer, theTenderEnvelopeID, (this.tenderEnvelopeID!= null));
        }
        {
            TenderEnvelopeTypeCodeType theTenderEnvelopeTypeCode;
            theTenderEnvelopeTypeCode = this.getTenderEnvelopeTypeCode();
            strategy.appendField(locator, this, "tenderEnvelopeTypeCode", buffer, theTenderEnvelopeTypeCode, (this.tenderEnvelopeTypeCode!= null));
        }
        {
            ProcurementProjectLotType theProcurementProjectLot;
            theProcurementProjectLot = this.getProcurementProjectLot();
            strategy.appendField(locator, this, "procurementProjectLot", buffer, theProcurementProjectLot, (this.procurementProjectLot!= null));
        }
        {
            List<DocumentReferenceType> theEvidenceDocumentReference;
            theEvidenceDocumentReference = (((this.evidenceDocumentReference!= null)&&(!this.evidenceDocumentReference.isEmpty()))?this.getEvidenceDocumentReference():null);
            strategy.appendField(locator, this, "evidenceDocumentReference", buffer, theEvidenceDocumentReference, ((this.evidenceDocumentReference!= null)&&(!this.evidenceDocumentReference.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            strategy.appendField(locator, this, "taxTotal", buffer, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            MonetaryTotalType theLegalMonetaryTotal;
            theLegalMonetaryTotal = this.getLegalMonetaryTotal();
            strategy.appendField(locator, this, "legalMonetaryTotal", buffer, theLegalMonetaryTotal, (this.legalMonetaryTotal!= null));
        }
        {
            List<TenderLineType> theTenderLine;
            theTenderLine = (((this.tenderLine!= null)&&(!this.tenderLine.isEmpty()))?this.getTenderLine():null);
            strategy.appendField(locator, this, "tenderLine", buffer, theTenderLine, ((this.tenderLine!= null)&&(!this.tenderLine.isEmpty())));
        }
        {
            List<AwardingCriterionResponseType> theAwardingCriterionResponse;
            theAwardingCriterionResponse = (((this.awardingCriterionResponse!= null)&&(!this.awardingCriterionResponse.isEmpty()))?this.getAwardingCriterionResponse():null);
            strategy.appendField(locator, this, "awardingCriterionResponse", buffer, theAwardingCriterionResponse, ((this.awardingCriterionResponse!= null)&&(!this.awardingCriterionResponse.isEmpty())));
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
        final TenderedProjectType that = ((TenderedProjectType) object);
        {
            VariantIDType lhsVariantID;
            lhsVariantID = this.getVariantID();
            VariantIDType rhsVariantID;
            rhsVariantID = that.getVariantID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variantID", lhsVariantID), LocatorUtils.property(thatLocator, "variantID", rhsVariantID), lhsVariantID, rhsVariantID, (this.variantID!= null), (that.variantID!= null))) {
                return false;
            }
        }
        {
            FeeAmountType lhsFeeAmount;
            lhsFeeAmount = this.getFeeAmount();
            FeeAmountType rhsFeeAmount;
            rhsFeeAmount = that.getFeeAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeAmount", lhsFeeAmount), LocatorUtils.property(thatLocator, "feeAmount", rhsFeeAmount), lhsFeeAmount, rhsFeeAmount, (this.feeAmount!= null), (that.feeAmount!= null))) {
                return false;
            }
        }
        {
            List<FeeDescriptionType> lhsFeeDescription;
            lhsFeeDescription = (((this.feeDescription!= null)&&(!this.feeDescription.isEmpty()))?this.getFeeDescription():null);
            List<FeeDescriptionType> rhsFeeDescription;
            rhsFeeDescription = (((that.feeDescription!= null)&&(!that.feeDescription.isEmpty()))?that.getFeeDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeDescription", lhsFeeDescription), LocatorUtils.property(thatLocator, "feeDescription", rhsFeeDescription), lhsFeeDescription, rhsFeeDescription, ((this.feeDescription!= null)&&(!this.feeDescription.isEmpty())), ((that.feeDescription!= null)&&(!that.feeDescription.isEmpty())))) {
                return false;
            }
        }
        {
            TenderEnvelopeIDType lhsTenderEnvelopeID;
            lhsTenderEnvelopeID = this.getTenderEnvelopeID();
            TenderEnvelopeIDType rhsTenderEnvelopeID;
            rhsTenderEnvelopeID = that.getTenderEnvelopeID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderEnvelopeID", lhsTenderEnvelopeID), LocatorUtils.property(thatLocator, "tenderEnvelopeID", rhsTenderEnvelopeID), lhsTenderEnvelopeID, rhsTenderEnvelopeID, (this.tenderEnvelopeID!= null), (that.tenderEnvelopeID!= null))) {
                return false;
            }
        }
        {
            TenderEnvelopeTypeCodeType lhsTenderEnvelopeTypeCode;
            lhsTenderEnvelopeTypeCode = this.getTenderEnvelopeTypeCode();
            TenderEnvelopeTypeCodeType rhsTenderEnvelopeTypeCode;
            rhsTenderEnvelopeTypeCode = that.getTenderEnvelopeTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderEnvelopeTypeCode", lhsTenderEnvelopeTypeCode), LocatorUtils.property(thatLocator, "tenderEnvelopeTypeCode", rhsTenderEnvelopeTypeCode), lhsTenderEnvelopeTypeCode, rhsTenderEnvelopeTypeCode, (this.tenderEnvelopeTypeCode!= null), (that.tenderEnvelopeTypeCode!= null))) {
                return false;
            }
        }
        {
            ProcurementProjectLotType lhsProcurementProjectLot;
            lhsProcurementProjectLot = this.getProcurementProjectLot();
            ProcurementProjectLotType rhsProcurementProjectLot;
            rhsProcurementProjectLot = that.getProcurementProjectLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementProjectLot", lhsProcurementProjectLot), LocatorUtils.property(thatLocator, "procurementProjectLot", rhsProcurementProjectLot), lhsProcurementProjectLot, rhsProcurementProjectLot, (this.procurementProjectLot!= null), (that.procurementProjectLot!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsEvidenceDocumentReference;
            lhsEvidenceDocumentReference = (((this.evidenceDocumentReference!= null)&&(!this.evidenceDocumentReference.isEmpty()))?this.getEvidenceDocumentReference():null);
            List<DocumentReferenceType> rhsEvidenceDocumentReference;
            rhsEvidenceDocumentReference = (((that.evidenceDocumentReference!= null)&&(!that.evidenceDocumentReference.isEmpty()))?that.getEvidenceDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evidenceDocumentReference", lhsEvidenceDocumentReference), LocatorUtils.property(thatLocator, "evidenceDocumentReference", rhsEvidenceDocumentReference), lhsEvidenceDocumentReference, rhsEvidenceDocumentReference, ((this.evidenceDocumentReference!= null)&&(!this.evidenceDocumentReference.isEmpty())), ((that.evidenceDocumentReference!= null)&&(!that.evidenceDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<TaxTotalType> lhsTaxTotal;
            lhsTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            List<TaxTotalType> rhsTaxTotal;
            rhsTaxTotal = (((that.taxTotal!= null)&&(!that.taxTotal.isEmpty()))?that.getTaxTotal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTotal", lhsTaxTotal), LocatorUtils.property(thatLocator, "taxTotal", rhsTaxTotal), lhsTaxTotal, rhsTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())), ((that.taxTotal!= null)&&(!that.taxTotal.isEmpty())))) {
                return false;
            }
        }
        {
            MonetaryTotalType lhsLegalMonetaryTotal;
            lhsLegalMonetaryTotal = this.getLegalMonetaryTotal();
            MonetaryTotalType rhsLegalMonetaryTotal;
            rhsLegalMonetaryTotal = that.getLegalMonetaryTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legalMonetaryTotal", lhsLegalMonetaryTotal), LocatorUtils.property(thatLocator, "legalMonetaryTotal", rhsLegalMonetaryTotal), lhsLegalMonetaryTotal, rhsLegalMonetaryTotal, (this.legalMonetaryTotal!= null), (that.legalMonetaryTotal!= null))) {
                return false;
            }
        }
        {
            List<TenderLineType> lhsTenderLine;
            lhsTenderLine = (((this.tenderLine!= null)&&(!this.tenderLine.isEmpty()))?this.getTenderLine():null);
            List<TenderLineType> rhsTenderLine;
            rhsTenderLine = (((that.tenderLine!= null)&&(!that.tenderLine.isEmpty()))?that.getTenderLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderLine", lhsTenderLine), LocatorUtils.property(thatLocator, "tenderLine", rhsTenderLine), lhsTenderLine, rhsTenderLine, ((this.tenderLine!= null)&&(!this.tenderLine.isEmpty())), ((that.tenderLine!= null)&&(!that.tenderLine.isEmpty())))) {
                return false;
            }
        }
        {
            List<AwardingCriterionResponseType> lhsAwardingCriterionResponse;
            lhsAwardingCriterionResponse = (((this.awardingCriterionResponse!= null)&&(!this.awardingCriterionResponse.isEmpty()))?this.getAwardingCriterionResponse():null);
            List<AwardingCriterionResponseType> rhsAwardingCriterionResponse;
            rhsAwardingCriterionResponse = (((that.awardingCriterionResponse!= null)&&(!that.awardingCriterionResponse.isEmpty()))?that.getAwardingCriterionResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingCriterionResponse", lhsAwardingCriterionResponse), LocatorUtils.property(thatLocator, "awardingCriterionResponse", rhsAwardingCriterionResponse), lhsAwardingCriterionResponse, rhsAwardingCriterionResponse, ((this.awardingCriterionResponse!= null)&&(!this.awardingCriterionResponse.isEmpty())), ((that.awardingCriterionResponse!= null)&&(!that.awardingCriterionResponse.isEmpty())))) {
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
            VariantIDType theVariantID;
            theVariantID = this.getVariantID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variantID", theVariantID), currentHashCode, theVariantID, (this.variantID!= null));
        }
        {
            FeeAmountType theFeeAmount;
            theFeeAmount = this.getFeeAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeAmount", theFeeAmount), currentHashCode, theFeeAmount, (this.feeAmount!= null));
        }
        {
            List<FeeDescriptionType> theFeeDescription;
            theFeeDescription = (((this.feeDescription!= null)&&(!this.feeDescription.isEmpty()))?this.getFeeDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeDescription", theFeeDescription), currentHashCode, theFeeDescription, ((this.feeDescription!= null)&&(!this.feeDescription.isEmpty())));
        }
        {
            TenderEnvelopeIDType theTenderEnvelopeID;
            theTenderEnvelopeID = this.getTenderEnvelopeID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderEnvelopeID", theTenderEnvelopeID), currentHashCode, theTenderEnvelopeID, (this.tenderEnvelopeID!= null));
        }
        {
            TenderEnvelopeTypeCodeType theTenderEnvelopeTypeCode;
            theTenderEnvelopeTypeCode = this.getTenderEnvelopeTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderEnvelopeTypeCode", theTenderEnvelopeTypeCode), currentHashCode, theTenderEnvelopeTypeCode, (this.tenderEnvelopeTypeCode!= null));
        }
        {
            ProcurementProjectLotType theProcurementProjectLot;
            theProcurementProjectLot = this.getProcurementProjectLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementProjectLot", theProcurementProjectLot), currentHashCode, theProcurementProjectLot, (this.procurementProjectLot!= null));
        }
        {
            List<DocumentReferenceType> theEvidenceDocumentReference;
            theEvidenceDocumentReference = (((this.evidenceDocumentReference!= null)&&(!this.evidenceDocumentReference.isEmpty()))?this.getEvidenceDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evidenceDocumentReference", theEvidenceDocumentReference), currentHashCode, theEvidenceDocumentReference, ((this.evidenceDocumentReference!= null)&&(!this.evidenceDocumentReference.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTotal", theTaxTotal), currentHashCode, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            MonetaryTotalType theLegalMonetaryTotal;
            theLegalMonetaryTotal = this.getLegalMonetaryTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legalMonetaryTotal", theLegalMonetaryTotal), currentHashCode, theLegalMonetaryTotal, (this.legalMonetaryTotal!= null));
        }
        {
            List<TenderLineType> theTenderLine;
            theTenderLine = (((this.tenderLine!= null)&&(!this.tenderLine.isEmpty()))?this.getTenderLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderLine", theTenderLine), currentHashCode, theTenderLine, ((this.tenderLine!= null)&&(!this.tenderLine.isEmpty())));
        }
        {
            List<AwardingCriterionResponseType> theAwardingCriterionResponse;
            theAwardingCriterionResponse = (((this.awardingCriterionResponse!= null)&&(!this.awardingCriterionResponse.isEmpty()))?this.getAwardingCriterionResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingCriterionResponse", theAwardingCriterionResponse), currentHashCode, theAwardingCriterionResponse, ((this.awardingCriterionResponse!= null)&&(!this.awardingCriterionResponse.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
