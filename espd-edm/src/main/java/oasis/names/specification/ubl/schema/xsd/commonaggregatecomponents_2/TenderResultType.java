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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdvertisementAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HigherTenderAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LowerTenderAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReceivedElectronicTenderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReceivedForeignTenderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReceivedTenderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TenderResultCodeType;
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
 * <p>Classe Java per TenderResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderResultCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdvertisementAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowerTenderAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HigherTenderAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedElectronicTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedForeignTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardedTenderedProject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractFormalizationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubcontractTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WinningParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderResultType", propOrder = {
    "awardID",
    "tenderResultCode",
    "description",
    "advertisementAmount",
    "awardDate",
    "awardTime",
    "receivedTenderQuantity",
    "lowerTenderAmount",
    "higherTenderAmount",
    "startDate",
    "receivedElectronicTenderQuantity",
    "receivedForeignTenderQuantity",
    "contract",
    "awardedTenderedProject",
    "contractFormalizationPeriod",
    "subcontractTerms",
    "winningParty"
})
public class TenderResultType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AwardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardIDType awardID;
    @XmlElement(name = "TenderResultCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderResultCodeType tenderResultCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "AdvertisementAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdvertisementAmountType advertisementAmount;
    @XmlElement(name = "AwardDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AwardDateType awardDate;
    @XmlElement(name = "AwardTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardTimeType awardTime;
    @XmlElement(name = "ReceivedTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedTenderQuantityType receivedTenderQuantity;
    @XmlElement(name = "LowerTenderAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LowerTenderAmountType lowerTenderAmount;
    @XmlElement(name = "HigherTenderAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HigherTenderAmountType higherTenderAmount;
    @XmlElement(name = "StartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StartDateType startDate;
    @XmlElement(name = "ReceivedElectronicTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedElectronicTenderQuantityType receivedElectronicTenderQuantity;
    @XmlElement(name = "ReceivedForeignTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedForeignTenderQuantityType receivedForeignTenderQuantity;
    @XmlElement(name = "Contract")
    protected ContractType contract;
    @XmlElement(name = "AwardedTenderedProject")
    protected TenderedProjectType awardedTenderedProject;
    @XmlElement(name = "ContractFormalizationPeriod")
    protected PeriodType contractFormalizationPeriod;
    @XmlElement(name = "SubcontractTerms")
    protected List<SubcontractTermsType> subcontractTerms;
    @XmlElement(name = "WinningParty")
    protected List<WinningPartyType> winningParty;

    /**
     * Recupera il valore della proprietà awardID.
     * 
     * @return
     *     possible object is
     *     {@link AwardIDType }
     *     
     */
    public AwardIDType getAwardID() {
        return awardID;
    }

    /**
     * Imposta il valore della proprietà awardID.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardIDType }
     *     
     */
    public void setAwardID(AwardIDType value) {
        this.awardID = value;
    }

    /**
     * Recupera il valore della proprietà tenderResultCode.
     * 
     * @return
     *     possible object is
     *     {@link TenderResultCodeType }
     *     
     */
    public TenderResultCodeType getTenderResultCode() {
        return tenderResultCode;
    }

    /**
     * Imposta il valore della proprietà tenderResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderResultCodeType }
     *     
     */
    public void setTenderResultCode(TenderResultCodeType value) {
        this.tenderResultCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Recupera il valore della proprietà advertisementAmount.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementAmountType }
     *     
     */
    public AdvertisementAmountType getAdvertisementAmount() {
        return advertisementAmount;
    }

    /**
     * Imposta il valore della proprietà advertisementAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementAmountType }
     *     
     */
    public void setAdvertisementAmount(AdvertisementAmountType value) {
        this.advertisementAmount = value;
    }

    /**
     * Recupera il valore della proprietà awardDate.
     * 
     * @return
     *     possible object is
     *     {@link AwardDateType }
     *     
     */
    public AwardDateType getAwardDate() {
        return awardDate;
    }

    /**
     * Imposta il valore della proprietà awardDate.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardDateType }
     *     
     */
    public void setAwardDate(AwardDateType value) {
        this.awardDate = value;
    }

    /**
     * Recupera il valore della proprietà awardTime.
     * 
     * @return
     *     possible object is
     *     {@link AwardTimeType }
     *     
     */
    public AwardTimeType getAwardTime() {
        return awardTime;
    }

    /**
     * Imposta il valore della proprietà awardTime.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardTimeType }
     *     
     */
    public void setAwardTime(AwardTimeType value) {
        this.awardTime = value;
    }

    /**
     * Recupera il valore della proprietà receivedTenderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedTenderQuantityType }
     *     
     */
    public ReceivedTenderQuantityType getReceivedTenderQuantity() {
        return receivedTenderQuantity;
    }

    /**
     * Imposta il valore della proprietà receivedTenderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedTenderQuantityType }
     *     
     */
    public void setReceivedTenderQuantity(ReceivedTenderQuantityType value) {
        this.receivedTenderQuantity = value;
    }

    /**
     * Recupera il valore della proprietà lowerTenderAmount.
     * 
     * @return
     *     possible object is
     *     {@link LowerTenderAmountType }
     *     
     */
    public LowerTenderAmountType getLowerTenderAmount() {
        return lowerTenderAmount;
    }

    /**
     * Imposta il valore della proprietà lowerTenderAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerTenderAmountType }
     *     
     */
    public void setLowerTenderAmount(LowerTenderAmountType value) {
        this.lowerTenderAmount = value;
    }

    /**
     * Recupera il valore della proprietà higherTenderAmount.
     * 
     * @return
     *     possible object is
     *     {@link HigherTenderAmountType }
     *     
     */
    public HigherTenderAmountType getHigherTenderAmount() {
        return higherTenderAmount;
    }

    /**
     * Imposta il valore della proprietà higherTenderAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link HigherTenderAmountType }
     *     
     */
    public void setHigherTenderAmount(HigherTenderAmountType value) {
        this.higherTenderAmount = value;
    }

    /**
     * Recupera il valore della proprietà startDate.
     * 
     * @return
     *     possible object is
     *     {@link StartDateType }
     *     
     */
    public StartDateType getStartDate() {
        return startDate;
    }

    /**
     * Imposta il valore della proprietà startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateType }
     *     
     */
    public void setStartDate(StartDateType value) {
        this.startDate = value;
    }

    /**
     * Recupera il valore della proprietà receivedElectronicTenderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedElectronicTenderQuantityType }
     *     
     */
    public ReceivedElectronicTenderQuantityType getReceivedElectronicTenderQuantity() {
        return receivedElectronicTenderQuantity;
    }

    /**
     * Imposta il valore della proprietà receivedElectronicTenderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedElectronicTenderQuantityType }
     *     
     */
    public void setReceivedElectronicTenderQuantity(ReceivedElectronicTenderQuantityType value) {
        this.receivedElectronicTenderQuantity = value;
    }

    /**
     * Recupera il valore della proprietà receivedForeignTenderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedForeignTenderQuantityType }
     *     
     */
    public ReceivedForeignTenderQuantityType getReceivedForeignTenderQuantity() {
        return receivedForeignTenderQuantity;
    }

    /**
     * Imposta il valore della proprietà receivedForeignTenderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedForeignTenderQuantityType }
     *     
     */
    public void setReceivedForeignTenderQuantity(ReceivedForeignTenderQuantityType value) {
        this.receivedForeignTenderQuantity = value;
    }

    /**
     * Recupera il valore della proprietà contract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Imposta il valore della proprietà contract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
    }

    /**
     * Recupera il valore della proprietà awardedTenderedProject.
     * 
     * @return
     *     possible object is
     *     {@link TenderedProjectType }
     *     
     */
    public TenderedProjectType getAwardedTenderedProject() {
        return awardedTenderedProject;
    }

    /**
     * Imposta il valore della proprietà awardedTenderedProject.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderedProjectType }
     *     
     */
    public void setAwardedTenderedProject(TenderedProjectType value) {
        this.awardedTenderedProject = value;
    }

    /**
     * Recupera il valore della proprietà contractFormalizationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getContractFormalizationPeriod() {
        return contractFormalizationPeriod;
    }

    /**
     * Imposta il valore della proprietà contractFormalizationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setContractFormalizationPeriod(PeriodType value) {
        this.contractFormalizationPeriod = value;
    }

    /**
     * Gets the value of the subcontractTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcontractTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcontractTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcontractTermsType }
     * 
     * 
     */
    public List<SubcontractTermsType> getSubcontractTerms() {
        if (subcontractTerms == null) {
            subcontractTerms = new ArrayList<SubcontractTermsType>();
        }
        return this.subcontractTerms;
    }

    /**
     * Gets the value of the winningParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the winningParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWinningParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WinningPartyType }
     * 
     * 
     */
    public List<WinningPartyType> getWinningParty() {
        if (winningParty == null) {
            winningParty = new ArrayList<WinningPartyType>();
        }
        return this.winningParty;
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
            AwardIDType theAwardID;
            theAwardID = this.getAwardID();
            strategy.appendField(locator, this, "awardID", buffer, theAwardID, (this.awardID!= null));
        }
        {
            TenderResultCodeType theTenderResultCode;
            theTenderResultCode = this.getTenderResultCode();
            strategy.appendField(locator, this, "tenderResultCode", buffer, theTenderResultCode, (this.tenderResultCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            AdvertisementAmountType theAdvertisementAmount;
            theAdvertisementAmount = this.getAdvertisementAmount();
            strategy.appendField(locator, this, "advertisementAmount", buffer, theAdvertisementAmount, (this.advertisementAmount!= null));
        }
        {
            AwardDateType theAwardDate;
            theAwardDate = this.getAwardDate();
            strategy.appendField(locator, this, "awardDate", buffer, theAwardDate, (this.awardDate!= null));
        }
        {
            AwardTimeType theAwardTime;
            theAwardTime = this.getAwardTime();
            strategy.appendField(locator, this, "awardTime", buffer, theAwardTime, (this.awardTime!= null));
        }
        {
            ReceivedTenderQuantityType theReceivedTenderQuantity;
            theReceivedTenderQuantity = this.getReceivedTenderQuantity();
            strategy.appendField(locator, this, "receivedTenderQuantity", buffer, theReceivedTenderQuantity, (this.receivedTenderQuantity!= null));
        }
        {
            LowerTenderAmountType theLowerTenderAmount;
            theLowerTenderAmount = this.getLowerTenderAmount();
            strategy.appendField(locator, this, "lowerTenderAmount", buffer, theLowerTenderAmount, (this.lowerTenderAmount!= null));
        }
        {
            HigherTenderAmountType theHigherTenderAmount;
            theHigherTenderAmount = this.getHigherTenderAmount();
            strategy.appendField(locator, this, "higherTenderAmount", buffer, theHigherTenderAmount, (this.higherTenderAmount!= null));
        }
        {
            StartDateType theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate, (this.startDate!= null));
        }
        {
            ReceivedElectronicTenderQuantityType theReceivedElectronicTenderQuantity;
            theReceivedElectronicTenderQuantity = this.getReceivedElectronicTenderQuantity();
            strategy.appendField(locator, this, "receivedElectronicTenderQuantity", buffer, theReceivedElectronicTenderQuantity, (this.receivedElectronicTenderQuantity!= null));
        }
        {
            ReceivedForeignTenderQuantityType theReceivedForeignTenderQuantity;
            theReceivedForeignTenderQuantity = this.getReceivedForeignTenderQuantity();
            strategy.appendField(locator, this, "receivedForeignTenderQuantity", buffer, theReceivedForeignTenderQuantity, (this.receivedForeignTenderQuantity!= null));
        }
        {
            ContractType theContract;
            theContract = this.getContract();
            strategy.appendField(locator, this, "contract", buffer, theContract, (this.contract!= null));
        }
        {
            TenderedProjectType theAwardedTenderedProject;
            theAwardedTenderedProject = this.getAwardedTenderedProject();
            strategy.appendField(locator, this, "awardedTenderedProject", buffer, theAwardedTenderedProject, (this.awardedTenderedProject!= null));
        }
        {
            PeriodType theContractFormalizationPeriod;
            theContractFormalizationPeriod = this.getContractFormalizationPeriod();
            strategy.appendField(locator, this, "contractFormalizationPeriod", buffer, theContractFormalizationPeriod, (this.contractFormalizationPeriod!= null));
        }
        {
            List<SubcontractTermsType> theSubcontractTerms;
            theSubcontractTerms = (((this.subcontractTerms!= null)&&(!this.subcontractTerms.isEmpty()))?this.getSubcontractTerms():null);
            strategy.appendField(locator, this, "subcontractTerms", buffer, theSubcontractTerms, ((this.subcontractTerms!= null)&&(!this.subcontractTerms.isEmpty())));
        }
        {
            List<WinningPartyType> theWinningParty;
            theWinningParty = (((this.winningParty!= null)&&(!this.winningParty.isEmpty()))?this.getWinningParty():null);
            strategy.appendField(locator, this, "winningParty", buffer, theWinningParty, ((this.winningParty!= null)&&(!this.winningParty.isEmpty())));
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
        final TenderResultType that = ((TenderResultType) object);
        {
            AwardIDType lhsAwardID;
            lhsAwardID = this.getAwardID();
            AwardIDType rhsAwardID;
            rhsAwardID = that.getAwardID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardID", lhsAwardID), LocatorUtils.property(thatLocator, "awardID", rhsAwardID), lhsAwardID, rhsAwardID, (this.awardID!= null), (that.awardID!= null))) {
                return false;
            }
        }
        {
            TenderResultCodeType lhsTenderResultCode;
            lhsTenderResultCode = this.getTenderResultCode();
            TenderResultCodeType rhsTenderResultCode;
            rhsTenderResultCode = that.getTenderResultCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderResultCode", lhsTenderResultCode), LocatorUtils.property(thatLocator, "tenderResultCode", rhsTenderResultCode), lhsTenderResultCode, rhsTenderResultCode, (this.tenderResultCode!= null), (that.tenderResultCode!= null))) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            AdvertisementAmountType lhsAdvertisementAmount;
            lhsAdvertisementAmount = this.getAdvertisementAmount();
            AdvertisementAmountType rhsAdvertisementAmount;
            rhsAdvertisementAmount = that.getAdvertisementAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advertisementAmount", lhsAdvertisementAmount), LocatorUtils.property(thatLocator, "advertisementAmount", rhsAdvertisementAmount), lhsAdvertisementAmount, rhsAdvertisementAmount, (this.advertisementAmount!= null), (that.advertisementAmount!= null))) {
                return false;
            }
        }
        {
            AwardDateType lhsAwardDate;
            lhsAwardDate = this.getAwardDate();
            AwardDateType rhsAwardDate;
            rhsAwardDate = that.getAwardDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardDate", lhsAwardDate), LocatorUtils.property(thatLocator, "awardDate", rhsAwardDate), lhsAwardDate, rhsAwardDate, (this.awardDate!= null), (that.awardDate!= null))) {
                return false;
            }
        }
        {
            AwardTimeType lhsAwardTime;
            lhsAwardTime = this.getAwardTime();
            AwardTimeType rhsAwardTime;
            rhsAwardTime = that.getAwardTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardTime", lhsAwardTime), LocatorUtils.property(thatLocator, "awardTime", rhsAwardTime), lhsAwardTime, rhsAwardTime, (this.awardTime!= null), (that.awardTime!= null))) {
                return false;
            }
        }
        {
            ReceivedTenderQuantityType lhsReceivedTenderQuantity;
            lhsReceivedTenderQuantity = this.getReceivedTenderQuantity();
            ReceivedTenderQuantityType rhsReceivedTenderQuantity;
            rhsReceivedTenderQuantity = that.getReceivedTenderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedTenderQuantity", lhsReceivedTenderQuantity), LocatorUtils.property(thatLocator, "receivedTenderQuantity", rhsReceivedTenderQuantity), lhsReceivedTenderQuantity, rhsReceivedTenderQuantity, (this.receivedTenderQuantity!= null), (that.receivedTenderQuantity!= null))) {
                return false;
            }
        }
        {
            LowerTenderAmountType lhsLowerTenderAmount;
            lhsLowerTenderAmount = this.getLowerTenderAmount();
            LowerTenderAmountType rhsLowerTenderAmount;
            rhsLowerTenderAmount = that.getLowerTenderAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowerTenderAmount", lhsLowerTenderAmount), LocatorUtils.property(thatLocator, "lowerTenderAmount", rhsLowerTenderAmount), lhsLowerTenderAmount, rhsLowerTenderAmount, (this.lowerTenderAmount!= null), (that.lowerTenderAmount!= null))) {
                return false;
            }
        }
        {
            HigherTenderAmountType lhsHigherTenderAmount;
            lhsHigherTenderAmount = this.getHigherTenderAmount();
            HigherTenderAmountType rhsHigherTenderAmount;
            rhsHigherTenderAmount = that.getHigherTenderAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "higherTenderAmount", lhsHigherTenderAmount), LocatorUtils.property(thatLocator, "higherTenderAmount", rhsHigherTenderAmount), lhsHigherTenderAmount, rhsHigherTenderAmount, (this.higherTenderAmount!= null), (that.higherTenderAmount!= null))) {
                return false;
            }
        }
        {
            StartDateType lhsStartDate;
            lhsStartDate = this.getStartDate();
            StartDateType rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            ReceivedElectronicTenderQuantityType lhsReceivedElectronicTenderQuantity;
            lhsReceivedElectronicTenderQuantity = this.getReceivedElectronicTenderQuantity();
            ReceivedElectronicTenderQuantityType rhsReceivedElectronicTenderQuantity;
            rhsReceivedElectronicTenderQuantity = that.getReceivedElectronicTenderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedElectronicTenderQuantity", lhsReceivedElectronicTenderQuantity), LocatorUtils.property(thatLocator, "receivedElectronicTenderQuantity", rhsReceivedElectronicTenderQuantity), lhsReceivedElectronicTenderQuantity, rhsReceivedElectronicTenderQuantity, (this.receivedElectronicTenderQuantity!= null), (that.receivedElectronicTenderQuantity!= null))) {
                return false;
            }
        }
        {
            ReceivedForeignTenderQuantityType lhsReceivedForeignTenderQuantity;
            lhsReceivedForeignTenderQuantity = this.getReceivedForeignTenderQuantity();
            ReceivedForeignTenderQuantityType rhsReceivedForeignTenderQuantity;
            rhsReceivedForeignTenderQuantity = that.getReceivedForeignTenderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedForeignTenderQuantity", lhsReceivedForeignTenderQuantity), LocatorUtils.property(thatLocator, "receivedForeignTenderQuantity", rhsReceivedForeignTenderQuantity), lhsReceivedForeignTenderQuantity, rhsReceivedForeignTenderQuantity, (this.receivedForeignTenderQuantity!= null), (that.receivedForeignTenderQuantity!= null))) {
                return false;
            }
        }
        {
            ContractType lhsContract;
            lhsContract = this.getContract();
            ContractType rhsContract;
            rhsContract = that.getContract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contract", lhsContract), LocatorUtils.property(thatLocator, "contract", rhsContract), lhsContract, rhsContract, (this.contract!= null), (that.contract!= null))) {
                return false;
            }
        }
        {
            TenderedProjectType lhsAwardedTenderedProject;
            lhsAwardedTenderedProject = this.getAwardedTenderedProject();
            TenderedProjectType rhsAwardedTenderedProject;
            rhsAwardedTenderedProject = that.getAwardedTenderedProject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardedTenderedProject", lhsAwardedTenderedProject), LocatorUtils.property(thatLocator, "awardedTenderedProject", rhsAwardedTenderedProject), lhsAwardedTenderedProject, rhsAwardedTenderedProject, (this.awardedTenderedProject!= null), (that.awardedTenderedProject!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsContractFormalizationPeriod;
            lhsContractFormalizationPeriod = this.getContractFormalizationPeriod();
            PeriodType rhsContractFormalizationPeriod;
            rhsContractFormalizationPeriod = that.getContractFormalizationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractFormalizationPeriod", lhsContractFormalizationPeriod), LocatorUtils.property(thatLocator, "contractFormalizationPeriod", rhsContractFormalizationPeriod), lhsContractFormalizationPeriod, rhsContractFormalizationPeriod, (this.contractFormalizationPeriod!= null), (that.contractFormalizationPeriod!= null))) {
                return false;
            }
        }
        {
            List<SubcontractTermsType> lhsSubcontractTerms;
            lhsSubcontractTerms = (((this.subcontractTerms!= null)&&(!this.subcontractTerms.isEmpty()))?this.getSubcontractTerms():null);
            List<SubcontractTermsType> rhsSubcontractTerms;
            rhsSubcontractTerms = (((that.subcontractTerms!= null)&&(!that.subcontractTerms.isEmpty()))?that.getSubcontractTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subcontractTerms", lhsSubcontractTerms), LocatorUtils.property(thatLocator, "subcontractTerms", rhsSubcontractTerms), lhsSubcontractTerms, rhsSubcontractTerms, ((this.subcontractTerms!= null)&&(!this.subcontractTerms.isEmpty())), ((that.subcontractTerms!= null)&&(!that.subcontractTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<WinningPartyType> lhsWinningParty;
            lhsWinningParty = (((this.winningParty!= null)&&(!this.winningParty.isEmpty()))?this.getWinningParty():null);
            List<WinningPartyType> rhsWinningParty;
            rhsWinningParty = (((that.winningParty!= null)&&(!that.winningParty.isEmpty()))?that.getWinningParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "winningParty", lhsWinningParty), LocatorUtils.property(thatLocator, "winningParty", rhsWinningParty), lhsWinningParty, rhsWinningParty, ((this.winningParty!= null)&&(!this.winningParty.isEmpty())), ((that.winningParty!= null)&&(!that.winningParty.isEmpty())))) {
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
            AwardIDType theAwardID;
            theAwardID = this.getAwardID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardID", theAwardID), currentHashCode, theAwardID, (this.awardID!= null));
        }
        {
            TenderResultCodeType theTenderResultCode;
            theTenderResultCode = this.getTenderResultCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderResultCode", theTenderResultCode), currentHashCode, theTenderResultCode, (this.tenderResultCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            AdvertisementAmountType theAdvertisementAmount;
            theAdvertisementAmount = this.getAdvertisementAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advertisementAmount", theAdvertisementAmount), currentHashCode, theAdvertisementAmount, (this.advertisementAmount!= null));
        }
        {
            AwardDateType theAwardDate;
            theAwardDate = this.getAwardDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardDate", theAwardDate), currentHashCode, theAwardDate, (this.awardDate!= null));
        }
        {
            AwardTimeType theAwardTime;
            theAwardTime = this.getAwardTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardTime", theAwardTime), currentHashCode, theAwardTime, (this.awardTime!= null));
        }
        {
            ReceivedTenderQuantityType theReceivedTenderQuantity;
            theReceivedTenderQuantity = this.getReceivedTenderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedTenderQuantity", theReceivedTenderQuantity), currentHashCode, theReceivedTenderQuantity, (this.receivedTenderQuantity!= null));
        }
        {
            LowerTenderAmountType theLowerTenderAmount;
            theLowerTenderAmount = this.getLowerTenderAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lowerTenderAmount", theLowerTenderAmount), currentHashCode, theLowerTenderAmount, (this.lowerTenderAmount!= null));
        }
        {
            HigherTenderAmountType theHigherTenderAmount;
            theHigherTenderAmount = this.getHigherTenderAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "higherTenderAmount", theHigherTenderAmount), currentHashCode, theHigherTenderAmount, (this.higherTenderAmount!= null));
        }
        {
            StartDateType theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate, (this.startDate!= null));
        }
        {
            ReceivedElectronicTenderQuantityType theReceivedElectronicTenderQuantity;
            theReceivedElectronicTenderQuantity = this.getReceivedElectronicTenderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedElectronicTenderQuantity", theReceivedElectronicTenderQuantity), currentHashCode, theReceivedElectronicTenderQuantity, (this.receivedElectronicTenderQuantity!= null));
        }
        {
            ReceivedForeignTenderQuantityType theReceivedForeignTenderQuantity;
            theReceivedForeignTenderQuantity = this.getReceivedForeignTenderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedForeignTenderQuantity", theReceivedForeignTenderQuantity), currentHashCode, theReceivedForeignTenderQuantity, (this.receivedForeignTenderQuantity!= null));
        }
        {
            ContractType theContract;
            theContract = this.getContract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contract", theContract), currentHashCode, theContract, (this.contract!= null));
        }
        {
            TenderedProjectType theAwardedTenderedProject;
            theAwardedTenderedProject = this.getAwardedTenderedProject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardedTenderedProject", theAwardedTenderedProject), currentHashCode, theAwardedTenderedProject, (this.awardedTenderedProject!= null));
        }
        {
            PeriodType theContractFormalizationPeriod;
            theContractFormalizationPeriod = this.getContractFormalizationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractFormalizationPeriod", theContractFormalizationPeriod), currentHashCode, theContractFormalizationPeriod, (this.contractFormalizationPeriod!= null));
        }
        {
            List<SubcontractTermsType> theSubcontractTerms;
            theSubcontractTerms = (((this.subcontractTerms!= null)&&(!this.subcontractTerms.isEmpty()))?this.getSubcontractTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subcontractTerms", theSubcontractTerms), currentHashCode, theSubcontractTerms, ((this.subcontractTerms!= null)&&(!this.subcontractTerms.isEmpty())));
        }
        {
            List<WinningPartyType> theWinningParty;
            theWinningParty = (((this.winningParty!= null)&&(!this.winningParty.isEmpty()))?this.getWinningParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "winningParty", theWinningParty), currentHashCode, theWinningParty, ((this.winningParty!= null)&&(!this.winningParty.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
