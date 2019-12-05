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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CallBaseAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CallDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CallExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CallTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MovieTitleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PayPerViewType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoamingPartnerNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ServiceNumberCalledType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelecommunicationsServiceCallCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelecommunicationsServiceCallType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelecommunicationsServiceCategoryCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelecommunicationsServiceCategoryType;
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
 * <p>Classe Java per TelecommunicationsServiceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationsServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallTime"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceNumberCalled"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCategoryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MovieTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoamingPartnerName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayPerView" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCall" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCallCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallBaseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallDuty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TimeDuty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationsServiceType", propOrder = {
    "id",
    "callDate",
    "callTime",
    "serviceNumberCalled",
    "telecommunicationsServiceCategory",
    "telecommunicationsServiceCategoryCode",
    "movieTitle",
    "roamingPartnerName",
    "payPerView",
    "quantity",
    "telecommunicationsServiceCall",
    "telecommunicationsServiceCallCode",
    "callBaseAmount",
    "callExtensionAmount",
    "price",
    "country",
    "exchangeRate",
    "allowanceCharge",
    "taxTotal",
    "callDuty",
    "timeDuty"
})
public class TelecommunicationsServiceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "CallDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected CallDateType callDate;
    @XmlElement(name = "CallTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected CallTimeType callTime;
    @XmlElement(name = "ServiceNumberCalled", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ServiceNumberCalledType serviceNumberCalled;
    @XmlElement(name = "TelecommunicationsServiceCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCategoryType telecommunicationsServiceCategory;
    @XmlElement(name = "TelecommunicationsServiceCategoryCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCategoryCodeType telecommunicationsServiceCategoryCode;
    @XmlElement(name = "MovieTitle", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MovieTitleType movieTitle;
    @XmlElement(name = "RoamingPartnerName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoamingPartnerNameType roamingPartnerName;
    @XmlElement(name = "PayPerView", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PayPerViewType payPerView;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "TelecommunicationsServiceCall", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCallType telecommunicationsServiceCall;
    @XmlElement(name = "TelecommunicationsServiceCallCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCallCodeType telecommunicationsServiceCallCode;
    @XmlElement(name = "CallBaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CallBaseAmountType callBaseAmount;
    @XmlElement(name = "CallExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CallExtensionAmountType callExtensionAmount;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "ExchangeRate")
    protected List<ExchangeRateType> exchangeRate;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharge;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "CallDuty")
    protected List<DutyType> callDuty;
    @XmlElement(name = "TimeDuty")
    protected List<DutyType> timeDuty;

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
     * Recupera il valore della proprietà callDate.
     * 
     * @return
     *     possible object is
     *     {@link CallDateType }
     *     
     */
    public CallDateType getCallDate() {
        return callDate;
    }

    /**
     * Imposta il valore della proprietà callDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CallDateType }
     *     
     */
    public void setCallDate(CallDateType value) {
        this.callDate = value;
    }

    /**
     * Recupera il valore della proprietà callTime.
     * 
     * @return
     *     possible object is
     *     {@link CallTimeType }
     *     
     */
    public CallTimeType getCallTime() {
        return callTime;
    }

    /**
     * Imposta il valore della proprietà callTime.
     * 
     * @param value
     *     allowed object is
     *     {@link CallTimeType }
     *     
     */
    public void setCallTime(CallTimeType value) {
        this.callTime = value;
    }

    /**
     * Recupera il valore della proprietà serviceNumberCalled.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNumberCalledType }
     *     
     */
    public ServiceNumberCalledType getServiceNumberCalled() {
        return serviceNumberCalled;
    }

    /**
     * Imposta il valore della proprietà serviceNumberCalled.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNumberCalledType }
     *     
     */
    public void setServiceNumberCalled(ServiceNumberCalledType value) {
        this.serviceNumberCalled = value;
    }

    /**
     * Recupera il valore della proprietà telecommunicationsServiceCategory.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCategoryType }
     *     
     */
    public TelecommunicationsServiceCategoryType getTelecommunicationsServiceCategory() {
        return telecommunicationsServiceCategory;
    }

    /**
     * Imposta il valore della proprietà telecommunicationsServiceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCategoryType }
     *     
     */
    public void setTelecommunicationsServiceCategory(TelecommunicationsServiceCategoryType value) {
        this.telecommunicationsServiceCategory = value;
    }

    /**
     * Recupera il valore della proprietà telecommunicationsServiceCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCategoryCodeType }
     *     
     */
    public TelecommunicationsServiceCategoryCodeType getTelecommunicationsServiceCategoryCode() {
        return telecommunicationsServiceCategoryCode;
    }

    /**
     * Imposta il valore della proprietà telecommunicationsServiceCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCategoryCodeType }
     *     
     */
    public void setTelecommunicationsServiceCategoryCode(TelecommunicationsServiceCategoryCodeType value) {
        this.telecommunicationsServiceCategoryCode = value;
    }

    /**
     * Recupera il valore della proprietà movieTitle.
     * 
     * @return
     *     possible object is
     *     {@link MovieTitleType }
     *     
     */
    public MovieTitleType getMovieTitle() {
        return movieTitle;
    }

    /**
     * Imposta il valore della proprietà movieTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieTitleType }
     *     
     */
    public void setMovieTitle(MovieTitleType value) {
        this.movieTitle = value;
    }

    /**
     * Recupera il valore della proprietà roamingPartnerName.
     * 
     * @return
     *     possible object is
     *     {@link RoamingPartnerNameType }
     *     
     */
    public RoamingPartnerNameType getRoamingPartnerName() {
        return roamingPartnerName;
    }

    /**
     * Imposta il valore della proprietà roamingPartnerName.
     * 
     * @param value
     *     allowed object is
     *     {@link RoamingPartnerNameType }
     *     
     */
    public void setRoamingPartnerName(RoamingPartnerNameType value) {
        this.roamingPartnerName = value;
    }

    /**
     * Recupera il valore della proprietà payPerView.
     * 
     * @return
     *     possible object is
     *     {@link PayPerViewType }
     *     
     */
    public PayPerViewType getPayPerView() {
        return payPerView;
    }

    /**
     * Imposta il valore della proprietà payPerView.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPerViewType }
     *     
     */
    public void setPayPerView(PayPerViewType value) {
        this.payPerView = value;
    }

    /**
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Recupera il valore della proprietà telecommunicationsServiceCall.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCallType }
     *     
     */
    public TelecommunicationsServiceCallType getTelecommunicationsServiceCall() {
        return telecommunicationsServiceCall;
    }

    /**
     * Imposta il valore della proprietà telecommunicationsServiceCall.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCallType }
     *     
     */
    public void setTelecommunicationsServiceCall(TelecommunicationsServiceCallType value) {
        this.telecommunicationsServiceCall = value;
    }

    /**
     * Recupera il valore della proprietà telecommunicationsServiceCallCode.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCallCodeType }
     *     
     */
    public TelecommunicationsServiceCallCodeType getTelecommunicationsServiceCallCode() {
        return telecommunicationsServiceCallCode;
    }

    /**
     * Imposta il valore della proprietà telecommunicationsServiceCallCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCallCodeType }
     *     
     */
    public void setTelecommunicationsServiceCallCode(TelecommunicationsServiceCallCodeType value) {
        this.telecommunicationsServiceCallCode = value;
    }

    /**
     * Recupera il valore della proprietà callBaseAmount.
     * 
     * @return
     *     possible object is
     *     {@link CallBaseAmountType }
     *     
     */
    public CallBaseAmountType getCallBaseAmount() {
        return callBaseAmount;
    }

    /**
     * Imposta il valore della proprietà callBaseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBaseAmountType }
     *     
     */
    public void setCallBaseAmount(CallBaseAmountType value) {
        this.callBaseAmount = value;
    }

    /**
     * Recupera il valore della proprietà callExtensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link CallExtensionAmountType }
     *     
     */
    public CallExtensionAmountType getCallExtensionAmount() {
        return callExtensionAmount;
    }

    /**
     * Imposta il valore della proprietà callExtensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CallExtensionAmountType }
     *     
     */
    public void setCallExtensionAmount(CallExtensionAmountType value) {
        this.callExtensionAmount = value;
    }

    /**
     * Recupera il valore della proprietà price.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Imposta il valore della proprietà price.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRateType }
     * 
     * 
     */
    public List<ExchangeRateType> getExchangeRate() {
        if (exchangeRate == null) {
            exchangeRate = new ArrayList<ExchangeRateType>();
        }
        return this.exchangeRate;
    }

    /**
     * Gets the value of the allowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharge() {
        if (allowanceCharge == null) {
            allowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharge;
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
     * Gets the value of the callDuty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callDuty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallDuty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyType }
     * 
     * 
     */
    public List<DutyType> getCallDuty() {
        if (callDuty == null) {
            callDuty = new ArrayList<DutyType>();
        }
        return this.callDuty;
    }

    /**
     * Gets the value of the timeDuty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeDuty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeDuty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyType }
     * 
     * 
     */
    public List<DutyType> getTimeDuty() {
        if (timeDuty == null) {
            timeDuty = new ArrayList<DutyType>();
        }
        return this.timeDuty;
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
            CallDateType theCallDate;
            theCallDate = this.getCallDate();
            strategy.appendField(locator, this, "callDate", buffer, theCallDate, (this.callDate!= null));
        }
        {
            CallTimeType theCallTime;
            theCallTime = this.getCallTime();
            strategy.appendField(locator, this, "callTime", buffer, theCallTime, (this.callTime!= null));
        }
        {
            ServiceNumberCalledType theServiceNumberCalled;
            theServiceNumberCalled = this.getServiceNumberCalled();
            strategy.appendField(locator, this, "serviceNumberCalled", buffer, theServiceNumberCalled, (this.serviceNumberCalled!= null));
        }
        {
            TelecommunicationsServiceCategoryType theTelecommunicationsServiceCategory;
            theTelecommunicationsServiceCategory = this.getTelecommunicationsServiceCategory();
            strategy.appendField(locator, this, "telecommunicationsServiceCategory", buffer, theTelecommunicationsServiceCategory, (this.telecommunicationsServiceCategory!= null));
        }
        {
            TelecommunicationsServiceCategoryCodeType theTelecommunicationsServiceCategoryCode;
            theTelecommunicationsServiceCategoryCode = this.getTelecommunicationsServiceCategoryCode();
            strategy.appendField(locator, this, "telecommunicationsServiceCategoryCode", buffer, theTelecommunicationsServiceCategoryCode, (this.telecommunicationsServiceCategoryCode!= null));
        }
        {
            MovieTitleType theMovieTitle;
            theMovieTitle = this.getMovieTitle();
            strategy.appendField(locator, this, "movieTitle", buffer, theMovieTitle, (this.movieTitle!= null));
        }
        {
            RoamingPartnerNameType theRoamingPartnerName;
            theRoamingPartnerName = this.getRoamingPartnerName();
            strategy.appendField(locator, this, "roamingPartnerName", buffer, theRoamingPartnerName, (this.roamingPartnerName!= null));
        }
        {
            PayPerViewType thePayPerView;
            thePayPerView = this.getPayPerView();
            strategy.appendField(locator, this, "payPerView", buffer, thePayPerView, (this.payPerView!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            TelecommunicationsServiceCallType theTelecommunicationsServiceCall;
            theTelecommunicationsServiceCall = this.getTelecommunicationsServiceCall();
            strategy.appendField(locator, this, "telecommunicationsServiceCall", buffer, theTelecommunicationsServiceCall, (this.telecommunicationsServiceCall!= null));
        }
        {
            TelecommunicationsServiceCallCodeType theTelecommunicationsServiceCallCode;
            theTelecommunicationsServiceCallCode = this.getTelecommunicationsServiceCallCode();
            strategy.appendField(locator, this, "telecommunicationsServiceCallCode", buffer, theTelecommunicationsServiceCallCode, (this.telecommunicationsServiceCallCode!= null));
        }
        {
            CallBaseAmountType theCallBaseAmount;
            theCallBaseAmount = this.getCallBaseAmount();
            strategy.appendField(locator, this, "callBaseAmount", buffer, theCallBaseAmount, (this.callBaseAmount!= null));
        }
        {
            CallExtensionAmountType theCallExtensionAmount;
            theCallExtensionAmount = this.getCallExtensionAmount();
            strategy.appendField(locator, this, "callExtensionAmount", buffer, theCallExtensionAmount, (this.callExtensionAmount!= null));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            CountryType theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
        }
        {
            List<ExchangeRateType> theExchangeRate;
            theExchangeRate = (((this.exchangeRate!= null)&&(!this.exchangeRate.isEmpty()))?this.getExchangeRate():null);
            strategy.appendField(locator, this, "exchangeRate", buffer, theExchangeRate, ((this.exchangeRate!= null)&&(!this.exchangeRate.isEmpty())));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            strategy.appendField(locator, this, "taxTotal", buffer, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            List<DutyType> theCallDuty;
            theCallDuty = (((this.callDuty!= null)&&(!this.callDuty.isEmpty()))?this.getCallDuty():null);
            strategy.appendField(locator, this, "callDuty", buffer, theCallDuty, ((this.callDuty!= null)&&(!this.callDuty.isEmpty())));
        }
        {
            List<DutyType> theTimeDuty;
            theTimeDuty = (((this.timeDuty!= null)&&(!this.timeDuty.isEmpty()))?this.getTimeDuty():null);
            strategy.appendField(locator, this, "timeDuty", buffer, theTimeDuty, ((this.timeDuty!= null)&&(!this.timeDuty.isEmpty())));
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
        final TelecommunicationsServiceType that = ((TelecommunicationsServiceType) object);
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
            CallDateType lhsCallDate;
            lhsCallDate = this.getCallDate();
            CallDateType rhsCallDate;
            rhsCallDate = that.getCallDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callDate", lhsCallDate), LocatorUtils.property(thatLocator, "callDate", rhsCallDate), lhsCallDate, rhsCallDate, (this.callDate!= null), (that.callDate!= null))) {
                return false;
            }
        }
        {
            CallTimeType lhsCallTime;
            lhsCallTime = this.getCallTime();
            CallTimeType rhsCallTime;
            rhsCallTime = that.getCallTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callTime", lhsCallTime), LocatorUtils.property(thatLocator, "callTime", rhsCallTime), lhsCallTime, rhsCallTime, (this.callTime!= null), (that.callTime!= null))) {
                return false;
            }
        }
        {
            ServiceNumberCalledType lhsServiceNumberCalled;
            lhsServiceNumberCalled = this.getServiceNumberCalled();
            ServiceNumberCalledType rhsServiceNumberCalled;
            rhsServiceNumberCalled = that.getServiceNumberCalled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceNumberCalled", lhsServiceNumberCalled), LocatorUtils.property(thatLocator, "serviceNumberCalled", rhsServiceNumberCalled), lhsServiceNumberCalled, rhsServiceNumberCalled, (this.serviceNumberCalled!= null), (that.serviceNumberCalled!= null))) {
                return false;
            }
        }
        {
            TelecommunicationsServiceCategoryType lhsTelecommunicationsServiceCategory;
            lhsTelecommunicationsServiceCategory = this.getTelecommunicationsServiceCategory();
            TelecommunicationsServiceCategoryType rhsTelecommunicationsServiceCategory;
            rhsTelecommunicationsServiceCategory = that.getTelecommunicationsServiceCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsServiceCategory", lhsTelecommunicationsServiceCategory), LocatorUtils.property(thatLocator, "telecommunicationsServiceCategory", rhsTelecommunicationsServiceCategory), lhsTelecommunicationsServiceCategory, rhsTelecommunicationsServiceCategory, (this.telecommunicationsServiceCategory!= null), (that.telecommunicationsServiceCategory!= null))) {
                return false;
            }
        }
        {
            TelecommunicationsServiceCategoryCodeType lhsTelecommunicationsServiceCategoryCode;
            lhsTelecommunicationsServiceCategoryCode = this.getTelecommunicationsServiceCategoryCode();
            TelecommunicationsServiceCategoryCodeType rhsTelecommunicationsServiceCategoryCode;
            rhsTelecommunicationsServiceCategoryCode = that.getTelecommunicationsServiceCategoryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsServiceCategoryCode", lhsTelecommunicationsServiceCategoryCode), LocatorUtils.property(thatLocator, "telecommunicationsServiceCategoryCode", rhsTelecommunicationsServiceCategoryCode), lhsTelecommunicationsServiceCategoryCode, rhsTelecommunicationsServiceCategoryCode, (this.telecommunicationsServiceCategoryCode!= null), (that.telecommunicationsServiceCategoryCode!= null))) {
                return false;
            }
        }
        {
            MovieTitleType lhsMovieTitle;
            lhsMovieTitle = this.getMovieTitle();
            MovieTitleType rhsMovieTitle;
            rhsMovieTitle = that.getMovieTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "movieTitle", lhsMovieTitle), LocatorUtils.property(thatLocator, "movieTitle", rhsMovieTitle), lhsMovieTitle, rhsMovieTitle, (this.movieTitle!= null), (that.movieTitle!= null))) {
                return false;
            }
        }
        {
            RoamingPartnerNameType lhsRoamingPartnerName;
            lhsRoamingPartnerName = this.getRoamingPartnerName();
            RoamingPartnerNameType rhsRoamingPartnerName;
            rhsRoamingPartnerName = that.getRoamingPartnerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roamingPartnerName", lhsRoamingPartnerName), LocatorUtils.property(thatLocator, "roamingPartnerName", rhsRoamingPartnerName), lhsRoamingPartnerName, rhsRoamingPartnerName, (this.roamingPartnerName!= null), (that.roamingPartnerName!= null))) {
                return false;
            }
        }
        {
            PayPerViewType lhsPayPerView;
            lhsPayPerView = this.getPayPerView();
            PayPerViewType rhsPayPerView;
            rhsPayPerView = that.getPayPerView();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payPerView", lhsPayPerView), LocatorUtils.property(thatLocator, "payPerView", rhsPayPerView), lhsPayPerView, rhsPayPerView, (this.payPerView!= null), (that.payPerView!= null))) {
                return false;
            }
        }
        {
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            TelecommunicationsServiceCallType lhsTelecommunicationsServiceCall;
            lhsTelecommunicationsServiceCall = this.getTelecommunicationsServiceCall();
            TelecommunicationsServiceCallType rhsTelecommunicationsServiceCall;
            rhsTelecommunicationsServiceCall = that.getTelecommunicationsServiceCall();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsServiceCall", lhsTelecommunicationsServiceCall), LocatorUtils.property(thatLocator, "telecommunicationsServiceCall", rhsTelecommunicationsServiceCall), lhsTelecommunicationsServiceCall, rhsTelecommunicationsServiceCall, (this.telecommunicationsServiceCall!= null), (that.telecommunicationsServiceCall!= null))) {
                return false;
            }
        }
        {
            TelecommunicationsServiceCallCodeType lhsTelecommunicationsServiceCallCode;
            lhsTelecommunicationsServiceCallCode = this.getTelecommunicationsServiceCallCode();
            TelecommunicationsServiceCallCodeType rhsTelecommunicationsServiceCallCode;
            rhsTelecommunicationsServiceCallCode = that.getTelecommunicationsServiceCallCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsServiceCallCode", lhsTelecommunicationsServiceCallCode), LocatorUtils.property(thatLocator, "telecommunicationsServiceCallCode", rhsTelecommunicationsServiceCallCode), lhsTelecommunicationsServiceCallCode, rhsTelecommunicationsServiceCallCode, (this.telecommunicationsServiceCallCode!= null), (that.telecommunicationsServiceCallCode!= null))) {
                return false;
            }
        }
        {
            CallBaseAmountType lhsCallBaseAmount;
            lhsCallBaseAmount = this.getCallBaseAmount();
            CallBaseAmountType rhsCallBaseAmount;
            rhsCallBaseAmount = that.getCallBaseAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callBaseAmount", lhsCallBaseAmount), LocatorUtils.property(thatLocator, "callBaseAmount", rhsCallBaseAmount), lhsCallBaseAmount, rhsCallBaseAmount, (this.callBaseAmount!= null), (that.callBaseAmount!= null))) {
                return false;
            }
        }
        {
            CallExtensionAmountType lhsCallExtensionAmount;
            lhsCallExtensionAmount = this.getCallExtensionAmount();
            CallExtensionAmountType rhsCallExtensionAmount;
            rhsCallExtensionAmount = that.getCallExtensionAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callExtensionAmount", lhsCallExtensionAmount), LocatorUtils.property(thatLocator, "callExtensionAmount", rhsCallExtensionAmount), lhsCallExtensionAmount, rhsCallExtensionAmount, (this.callExtensionAmount!= null), (that.callExtensionAmount!= null))) {
                return false;
            }
        }
        {
            PriceType lhsPrice;
            lhsPrice = this.getPrice();
            PriceType rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            CountryType lhsCountry;
            lhsCountry = this.getCountry();
            CountryType rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
                return false;
            }
        }
        {
            List<ExchangeRateType> lhsExchangeRate;
            lhsExchangeRate = (((this.exchangeRate!= null)&&(!this.exchangeRate.isEmpty()))?this.getExchangeRate():null);
            List<ExchangeRateType> rhsExchangeRate;
            rhsExchangeRate = (((that.exchangeRate!= null)&&(!that.exchangeRate.isEmpty()))?that.getExchangeRate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeRate", lhsExchangeRate), LocatorUtils.property(thatLocator, "exchangeRate", rhsExchangeRate), lhsExchangeRate, rhsExchangeRate, ((this.exchangeRate!= null)&&(!this.exchangeRate.isEmpty())), ((that.exchangeRate!= null)&&(!that.exchangeRate.isEmpty())))) {
                return false;
            }
        }
        {
            List<AllowanceChargeType> lhsAllowanceCharge;
            lhsAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            List<AllowanceChargeType> rhsAllowanceCharge;
            rhsAllowanceCharge = (((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty()))?that.getAllowanceCharge():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceCharge", lhsAllowanceCharge), LocatorUtils.property(thatLocator, "allowanceCharge", rhsAllowanceCharge), lhsAllowanceCharge, rhsAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())), ((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty())))) {
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
            List<DutyType> lhsCallDuty;
            lhsCallDuty = (((this.callDuty!= null)&&(!this.callDuty.isEmpty()))?this.getCallDuty():null);
            List<DutyType> rhsCallDuty;
            rhsCallDuty = (((that.callDuty!= null)&&(!that.callDuty.isEmpty()))?that.getCallDuty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callDuty", lhsCallDuty), LocatorUtils.property(thatLocator, "callDuty", rhsCallDuty), lhsCallDuty, rhsCallDuty, ((this.callDuty!= null)&&(!this.callDuty.isEmpty())), ((that.callDuty!= null)&&(!that.callDuty.isEmpty())))) {
                return false;
            }
        }
        {
            List<DutyType> lhsTimeDuty;
            lhsTimeDuty = (((this.timeDuty!= null)&&(!this.timeDuty.isEmpty()))?this.getTimeDuty():null);
            List<DutyType> rhsTimeDuty;
            rhsTimeDuty = (((that.timeDuty!= null)&&(!that.timeDuty.isEmpty()))?that.getTimeDuty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeDuty", lhsTimeDuty), LocatorUtils.property(thatLocator, "timeDuty", rhsTimeDuty), lhsTimeDuty, rhsTimeDuty, ((this.timeDuty!= null)&&(!this.timeDuty.isEmpty())), ((that.timeDuty!= null)&&(!that.timeDuty.isEmpty())))) {
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
            CallDateType theCallDate;
            theCallDate = this.getCallDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callDate", theCallDate), currentHashCode, theCallDate, (this.callDate!= null));
        }
        {
            CallTimeType theCallTime;
            theCallTime = this.getCallTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callTime", theCallTime), currentHashCode, theCallTime, (this.callTime!= null));
        }
        {
            ServiceNumberCalledType theServiceNumberCalled;
            theServiceNumberCalled = this.getServiceNumberCalled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceNumberCalled", theServiceNumberCalled), currentHashCode, theServiceNumberCalled, (this.serviceNumberCalled!= null));
        }
        {
            TelecommunicationsServiceCategoryType theTelecommunicationsServiceCategory;
            theTelecommunicationsServiceCategory = this.getTelecommunicationsServiceCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsServiceCategory", theTelecommunicationsServiceCategory), currentHashCode, theTelecommunicationsServiceCategory, (this.telecommunicationsServiceCategory!= null));
        }
        {
            TelecommunicationsServiceCategoryCodeType theTelecommunicationsServiceCategoryCode;
            theTelecommunicationsServiceCategoryCode = this.getTelecommunicationsServiceCategoryCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsServiceCategoryCode", theTelecommunicationsServiceCategoryCode), currentHashCode, theTelecommunicationsServiceCategoryCode, (this.telecommunicationsServiceCategoryCode!= null));
        }
        {
            MovieTitleType theMovieTitle;
            theMovieTitle = this.getMovieTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "movieTitle", theMovieTitle), currentHashCode, theMovieTitle, (this.movieTitle!= null));
        }
        {
            RoamingPartnerNameType theRoamingPartnerName;
            theRoamingPartnerName = this.getRoamingPartnerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roamingPartnerName", theRoamingPartnerName), currentHashCode, theRoamingPartnerName, (this.roamingPartnerName!= null));
        }
        {
            PayPerViewType thePayPerView;
            thePayPerView = this.getPayPerView();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payPerView", thePayPerView), currentHashCode, thePayPerView, (this.payPerView!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            TelecommunicationsServiceCallType theTelecommunicationsServiceCall;
            theTelecommunicationsServiceCall = this.getTelecommunicationsServiceCall();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsServiceCall", theTelecommunicationsServiceCall), currentHashCode, theTelecommunicationsServiceCall, (this.telecommunicationsServiceCall!= null));
        }
        {
            TelecommunicationsServiceCallCodeType theTelecommunicationsServiceCallCode;
            theTelecommunicationsServiceCallCode = this.getTelecommunicationsServiceCallCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsServiceCallCode", theTelecommunicationsServiceCallCode), currentHashCode, theTelecommunicationsServiceCallCode, (this.telecommunicationsServiceCallCode!= null));
        }
        {
            CallBaseAmountType theCallBaseAmount;
            theCallBaseAmount = this.getCallBaseAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callBaseAmount", theCallBaseAmount), currentHashCode, theCallBaseAmount, (this.callBaseAmount!= null));
        }
        {
            CallExtensionAmountType theCallExtensionAmount;
            theCallExtensionAmount = this.getCallExtensionAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callExtensionAmount", theCallExtensionAmount), currentHashCode, theCallExtensionAmount, (this.callExtensionAmount!= null));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice, (this.price!= null));
        }
        {
            CountryType theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, (this.country!= null));
        }
        {
            List<ExchangeRateType> theExchangeRate;
            theExchangeRate = (((this.exchangeRate!= null)&&(!this.exchangeRate.isEmpty()))?this.getExchangeRate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeRate", theExchangeRate), currentHashCode, theExchangeRate, ((this.exchangeRate!= null)&&(!this.exchangeRate.isEmpty())));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTotal", theTaxTotal), currentHashCode, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            List<DutyType> theCallDuty;
            theCallDuty = (((this.callDuty!= null)&&(!this.callDuty.isEmpty()))?this.getCallDuty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callDuty", theCallDuty), currentHashCode, theCallDuty, ((this.callDuty!= null)&&(!this.callDuty.isEmpty())));
        }
        {
            List<DutyType> theTimeDuty;
            theTimeDuty = (((this.timeDuty!= null)&&(!this.timeDuty.isEmpty()))?this.getTimeDuty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeDuty", theTimeDuty), currentHashCode, theTimeDuty, ((this.timeDuty!= null)&&(!this.timeDuty.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
