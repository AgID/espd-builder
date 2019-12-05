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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChangeConditionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportServiceProviderSpecialTermsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportUserSpecialTermsType;
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
 * <p>Classe Java per TransportExecutionTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransportExecutionTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportUserSpecialTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportServiceProviderSpecialTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChangeConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BonusPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommissionPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceChargePaymentTerms" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportExecutionTermsType", propOrder = {
    "transportUserSpecialTerms",
    "transportServiceProviderSpecialTerms",
    "changeConditions",
    "paymentTerms",
    "deliveryTerms",
    "bonusPaymentTerms",
    "commissionPaymentTerms",
    "penaltyPaymentTerms",
    "environmentalEmission",
    "notificationRequirement",
    "serviceChargePaymentTerms"
})
public class TransportExecutionTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TransportUserSpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TransportUserSpecialTermsType> transportUserSpecialTerms;
    @XmlElement(name = "TransportServiceProviderSpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TransportServiceProviderSpecialTermsType> transportServiceProviderSpecialTerms;
    @XmlElement(name = "ChangeConditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ChangeConditionsType> changeConditions;
    @XmlElement(name = "PaymentTerms")
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "DeliveryTerms")
    protected List<DeliveryTermsType> deliveryTerms;
    @XmlElement(name = "BonusPaymentTerms")
    protected PaymentTermsType bonusPaymentTerms;
    @XmlElement(name = "CommissionPaymentTerms")
    protected PaymentTermsType commissionPaymentTerms;
    @XmlElement(name = "PenaltyPaymentTerms")
    protected PaymentTermsType penaltyPaymentTerms;
    @XmlElement(name = "EnvironmentalEmission")
    protected List<EnvironmentalEmissionType> environmentalEmission;
    @XmlElement(name = "NotificationRequirement")
    protected List<NotificationRequirementType> notificationRequirement;
    @XmlElement(name = "ServiceChargePaymentTerms")
    protected PaymentTermsType serviceChargePaymentTerms;

    /**
     * Gets the value of the transportUserSpecialTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportUserSpecialTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportUserSpecialTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportUserSpecialTermsType }
     * 
     * 
     */
    public List<TransportUserSpecialTermsType> getTransportUserSpecialTerms() {
        if (transportUserSpecialTerms == null) {
            transportUserSpecialTerms = new ArrayList<TransportUserSpecialTermsType>();
        }
        return this.transportUserSpecialTerms;
    }

    /**
     * Gets the value of the transportServiceProviderSpecialTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportServiceProviderSpecialTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportServiceProviderSpecialTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportServiceProviderSpecialTermsType }
     * 
     * 
     */
    public List<TransportServiceProviderSpecialTermsType> getTransportServiceProviderSpecialTerms() {
        if (transportServiceProviderSpecialTerms == null) {
            transportServiceProviderSpecialTerms = new ArrayList<TransportServiceProviderSpecialTermsType>();
        }
        return this.transportServiceProviderSpecialTerms;
    }

    /**
     * Gets the value of the changeConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeConditionsType }
     * 
     * 
     */
    public List<ChangeConditionsType> getChangeConditions() {
        if (changeConditions == null) {
            changeConditions = new ArrayList<ChangeConditionsType>();
        }
        return this.changeConditions;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryTermsType }
     * 
     * 
     */
    public List<DeliveryTermsType> getDeliveryTerms() {
        if (deliveryTerms == null) {
            deliveryTerms = new ArrayList<DeliveryTermsType>();
        }
        return this.deliveryTerms;
    }

    /**
     * Recupera il valore della proprietà bonusPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getBonusPaymentTerms() {
        return bonusPaymentTerms;
    }

    /**
     * Imposta il valore della proprietà bonusPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setBonusPaymentTerms(PaymentTermsType value) {
        this.bonusPaymentTerms = value;
    }

    /**
     * Recupera il valore della proprietà commissionPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getCommissionPaymentTerms() {
        return commissionPaymentTerms;
    }

    /**
     * Imposta il valore della proprietà commissionPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setCommissionPaymentTerms(PaymentTermsType value) {
        this.commissionPaymentTerms = value;
    }

    /**
     * Recupera il valore della proprietà penaltyPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPenaltyPaymentTerms() {
        return penaltyPaymentTerms;
    }

    /**
     * Imposta il valore della proprietà penaltyPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPenaltyPaymentTerms(PaymentTermsType value) {
        this.penaltyPaymentTerms = value;
    }

    /**
     * Gets the value of the environmentalEmission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalEmission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalEmission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalEmissionType }
     * 
     * 
     */
    public List<EnvironmentalEmissionType> getEnvironmentalEmission() {
        if (environmentalEmission == null) {
            environmentalEmission = new ArrayList<EnvironmentalEmissionType>();
        }
        return this.environmentalEmission;
    }

    /**
     * Gets the value of the notificationRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationRequirementType }
     * 
     * 
     */
    public List<NotificationRequirementType> getNotificationRequirement() {
        if (notificationRequirement == null) {
            notificationRequirement = new ArrayList<NotificationRequirementType>();
        }
        return this.notificationRequirement;
    }

    /**
     * Recupera il valore della proprietà serviceChargePaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getServiceChargePaymentTerms() {
        return serviceChargePaymentTerms;
    }

    /**
     * Imposta il valore della proprietà serviceChargePaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setServiceChargePaymentTerms(PaymentTermsType value) {
        this.serviceChargePaymentTerms = value;
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
            List<TransportUserSpecialTermsType> theTransportUserSpecialTerms;
            theTransportUserSpecialTerms = (((this.transportUserSpecialTerms!= null)&&(!this.transportUserSpecialTerms.isEmpty()))?this.getTransportUserSpecialTerms():null);
            strategy.appendField(locator, this, "transportUserSpecialTerms", buffer, theTransportUserSpecialTerms, ((this.transportUserSpecialTerms!= null)&&(!this.transportUserSpecialTerms.isEmpty())));
        }
        {
            List<TransportServiceProviderSpecialTermsType> theTransportServiceProviderSpecialTerms;
            theTransportServiceProviderSpecialTerms = (((this.transportServiceProviderSpecialTerms!= null)&&(!this.transportServiceProviderSpecialTerms.isEmpty()))?this.getTransportServiceProviderSpecialTerms():null);
            strategy.appendField(locator, this, "transportServiceProviderSpecialTerms", buffer, theTransportServiceProviderSpecialTerms, ((this.transportServiceProviderSpecialTerms!= null)&&(!this.transportServiceProviderSpecialTerms.isEmpty())));
        }
        {
            List<ChangeConditionsType> theChangeConditions;
            theChangeConditions = (((this.changeConditions!= null)&&(!this.changeConditions.isEmpty()))?this.getChangeConditions():null);
            strategy.appendField(locator, this, "changeConditions", buffer, theChangeConditions, ((this.changeConditions!= null)&&(!this.changeConditions.isEmpty())));
        }
        {
            List<PaymentTermsType> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            strategy.appendField(locator, this, "paymentTerms", buffer, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
        }
        {
            List<DeliveryTermsType> theDeliveryTerms;
            theDeliveryTerms = (((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty()))?this.getDeliveryTerms():null);
            strategy.appendField(locator, this, "deliveryTerms", buffer, theDeliveryTerms, ((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty())));
        }
        {
            PaymentTermsType theBonusPaymentTerms;
            theBonusPaymentTerms = this.getBonusPaymentTerms();
            strategy.appendField(locator, this, "bonusPaymentTerms", buffer, theBonusPaymentTerms, (this.bonusPaymentTerms!= null));
        }
        {
            PaymentTermsType theCommissionPaymentTerms;
            theCommissionPaymentTerms = this.getCommissionPaymentTerms();
            strategy.appendField(locator, this, "commissionPaymentTerms", buffer, theCommissionPaymentTerms, (this.commissionPaymentTerms!= null));
        }
        {
            PaymentTermsType thePenaltyPaymentTerms;
            thePenaltyPaymentTerms = this.getPenaltyPaymentTerms();
            strategy.appendField(locator, this, "penaltyPaymentTerms", buffer, thePenaltyPaymentTerms, (this.penaltyPaymentTerms!= null));
        }
        {
            List<EnvironmentalEmissionType> theEnvironmentalEmission;
            theEnvironmentalEmission = (((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty()))?this.getEnvironmentalEmission():null);
            strategy.appendField(locator, this, "environmentalEmission", buffer, theEnvironmentalEmission, ((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty())));
        }
        {
            List<NotificationRequirementType> theNotificationRequirement;
            theNotificationRequirement = (((this.notificationRequirement!= null)&&(!this.notificationRequirement.isEmpty()))?this.getNotificationRequirement():null);
            strategy.appendField(locator, this, "notificationRequirement", buffer, theNotificationRequirement, ((this.notificationRequirement!= null)&&(!this.notificationRequirement.isEmpty())));
        }
        {
            PaymentTermsType theServiceChargePaymentTerms;
            theServiceChargePaymentTerms = this.getServiceChargePaymentTerms();
            strategy.appendField(locator, this, "serviceChargePaymentTerms", buffer, theServiceChargePaymentTerms, (this.serviceChargePaymentTerms!= null));
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
        final TransportExecutionTermsType that = ((TransportExecutionTermsType) object);
        {
            List<TransportUserSpecialTermsType> lhsTransportUserSpecialTerms;
            lhsTransportUserSpecialTerms = (((this.transportUserSpecialTerms!= null)&&(!this.transportUserSpecialTerms.isEmpty()))?this.getTransportUserSpecialTerms():null);
            List<TransportUserSpecialTermsType> rhsTransportUserSpecialTerms;
            rhsTransportUserSpecialTerms = (((that.transportUserSpecialTerms!= null)&&(!that.transportUserSpecialTerms.isEmpty()))?that.getTransportUserSpecialTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportUserSpecialTerms", lhsTransportUserSpecialTerms), LocatorUtils.property(thatLocator, "transportUserSpecialTerms", rhsTransportUserSpecialTerms), lhsTransportUserSpecialTerms, rhsTransportUserSpecialTerms, ((this.transportUserSpecialTerms!= null)&&(!this.transportUserSpecialTerms.isEmpty())), ((that.transportUserSpecialTerms!= null)&&(!that.transportUserSpecialTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportServiceProviderSpecialTermsType> lhsTransportServiceProviderSpecialTerms;
            lhsTransportServiceProviderSpecialTerms = (((this.transportServiceProviderSpecialTerms!= null)&&(!this.transportServiceProviderSpecialTerms.isEmpty()))?this.getTransportServiceProviderSpecialTerms():null);
            List<TransportServiceProviderSpecialTermsType> rhsTransportServiceProviderSpecialTerms;
            rhsTransportServiceProviderSpecialTerms = (((that.transportServiceProviderSpecialTerms!= null)&&(!that.transportServiceProviderSpecialTerms.isEmpty()))?that.getTransportServiceProviderSpecialTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportServiceProviderSpecialTerms", lhsTransportServiceProviderSpecialTerms), LocatorUtils.property(thatLocator, "transportServiceProviderSpecialTerms", rhsTransportServiceProviderSpecialTerms), lhsTransportServiceProviderSpecialTerms, rhsTransportServiceProviderSpecialTerms, ((this.transportServiceProviderSpecialTerms!= null)&&(!this.transportServiceProviderSpecialTerms.isEmpty())), ((that.transportServiceProviderSpecialTerms!= null)&&(!that.transportServiceProviderSpecialTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<ChangeConditionsType> lhsChangeConditions;
            lhsChangeConditions = (((this.changeConditions!= null)&&(!this.changeConditions.isEmpty()))?this.getChangeConditions():null);
            List<ChangeConditionsType> rhsChangeConditions;
            rhsChangeConditions = (((that.changeConditions!= null)&&(!that.changeConditions.isEmpty()))?that.getChangeConditions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeConditions", lhsChangeConditions), LocatorUtils.property(thatLocator, "changeConditions", rhsChangeConditions), lhsChangeConditions, rhsChangeConditions, ((this.changeConditions!= null)&&(!this.changeConditions.isEmpty())), ((that.changeConditions!= null)&&(!that.changeConditions.isEmpty())))) {
                return false;
            }
        }
        {
            List<PaymentTermsType> lhsPaymentTerms;
            lhsPaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            List<PaymentTermsType> rhsPaymentTerms;
            rhsPaymentTerms = (((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty()))?that.getPaymentTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTerms", lhsPaymentTerms), LocatorUtils.property(thatLocator, "paymentTerms", rhsPaymentTerms), lhsPaymentTerms, rhsPaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())), ((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<DeliveryTermsType> lhsDeliveryTerms;
            lhsDeliveryTerms = (((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty()))?this.getDeliveryTerms():null);
            List<DeliveryTermsType> rhsDeliveryTerms;
            rhsDeliveryTerms = (((that.deliveryTerms!= null)&&(!that.deliveryTerms.isEmpty()))?that.getDeliveryTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryTerms", lhsDeliveryTerms), LocatorUtils.property(thatLocator, "deliveryTerms", rhsDeliveryTerms), lhsDeliveryTerms, rhsDeliveryTerms, ((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty())), ((that.deliveryTerms!= null)&&(!that.deliveryTerms.isEmpty())))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsBonusPaymentTerms;
            lhsBonusPaymentTerms = this.getBonusPaymentTerms();
            PaymentTermsType rhsBonusPaymentTerms;
            rhsBonusPaymentTerms = that.getBonusPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bonusPaymentTerms", lhsBonusPaymentTerms), LocatorUtils.property(thatLocator, "bonusPaymentTerms", rhsBonusPaymentTerms), lhsBonusPaymentTerms, rhsBonusPaymentTerms, (this.bonusPaymentTerms!= null), (that.bonusPaymentTerms!= null))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsCommissionPaymentTerms;
            lhsCommissionPaymentTerms = this.getCommissionPaymentTerms();
            PaymentTermsType rhsCommissionPaymentTerms;
            rhsCommissionPaymentTerms = that.getCommissionPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commissionPaymentTerms", lhsCommissionPaymentTerms), LocatorUtils.property(thatLocator, "commissionPaymentTerms", rhsCommissionPaymentTerms), lhsCommissionPaymentTerms, rhsCommissionPaymentTerms, (this.commissionPaymentTerms!= null), (that.commissionPaymentTerms!= null))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsPenaltyPaymentTerms;
            lhsPenaltyPaymentTerms = this.getPenaltyPaymentTerms();
            PaymentTermsType rhsPenaltyPaymentTerms;
            rhsPenaltyPaymentTerms = that.getPenaltyPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "penaltyPaymentTerms", lhsPenaltyPaymentTerms), LocatorUtils.property(thatLocator, "penaltyPaymentTerms", rhsPenaltyPaymentTerms), lhsPenaltyPaymentTerms, rhsPenaltyPaymentTerms, (this.penaltyPaymentTerms!= null), (that.penaltyPaymentTerms!= null))) {
                return false;
            }
        }
        {
            List<EnvironmentalEmissionType> lhsEnvironmentalEmission;
            lhsEnvironmentalEmission = (((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty()))?this.getEnvironmentalEmission():null);
            List<EnvironmentalEmissionType> rhsEnvironmentalEmission;
            rhsEnvironmentalEmission = (((that.environmentalEmission!= null)&&(!that.environmentalEmission.isEmpty()))?that.getEnvironmentalEmission():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "environmentalEmission", lhsEnvironmentalEmission), LocatorUtils.property(thatLocator, "environmentalEmission", rhsEnvironmentalEmission), lhsEnvironmentalEmission, rhsEnvironmentalEmission, ((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty())), ((that.environmentalEmission!= null)&&(!that.environmentalEmission.isEmpty())))) {
                return false;
            }
        }
        {
            List<NotificationRequirementType> lhsNotificationRequirement;
            lhsNotificationRequirement = (((this.notificationRequirement!= null)&&(!this.notificationRequirement.isEmpty()))?this.getNotificationRequirement():null);
            List<NotificationRequirementType> rhsNotificationRequirement;
            rhsNotificationRequirement = (((that.notificationRequirement!= null)&&(!that.notificationRequirement.isEmpty()))?that.getNotificationRequirement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notificationRequirement", lhsNotificationRequirement), LocatorUtils.property(thatLocator, "notificationRequirement", rhsNotificationRequirement), lhsNotificationRequirement, rhsNotificationRequirement, ((this.notificationRequirement!= null)&&(!this.notificationRequirement.isEmpty())), ((that.notificationRequirement!= null)&&(!that.notificationRequirement.isEmpty())))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsServiceChargePaymentTerms;
            lhsServiceChargePaymentTerms = this.getServiceChargePaymentTerms();
            PaymentTermsType rhsServiceChargePaymentTerms;
            rhsServiceChargePaymentTerms = that.getServiceChargePaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceChargePaymentTerms", lhsServiceChargePaymentTerms), LocatorUtils.property(thatLocator, "serviceChargePaymentTerms", rhsServiceChargePaymentTerms), lhsServiceChargePaymentTerms, rhsServiceChargePaymentTerms, (this.serviceChargePaymentTerms!= null), (that.serviceChargePaymentTerms!= null))) {
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
            List<TransportUserSpecialTermsType> theTransportUserSpecialTerms;
            theTransportUserSpecialTerms = (((this.transportUserSpecialTerms!= null)&&(!this.transportUserSpecialTerms.isEmpty()))?this.getTransportUserSpecialTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportUserSpecialTerms", theTransportUserSpecialTerms), currentHashCode, theTransportUserSpecialTerms, ((this.transportUserSpecialTerms!= null)&&(!this.transportUserSpecialTerms.isEmpty())));
        }
        {
            List<TransportServiceProviderSpecialTermsType> theTransportServiceProviderSpecialTerms;
            theTransportServiceProviderSpecialTerms = (((this.transportServiceProviderSpecialTerms!= null)&&(!this.transportServiceProviderSpecialTerms.isEmpty()))?this.getTransportServiceProviderSpecialTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportServiceProviderSpecialTerms", theTransportServiceProviderSpecialTerms), currentHashCode, theTransportServiceProviderSpecialTerms, ((this.transportServiceProviderSpecialTerms!= null)&&(!this.transportServiceProviderSpecialTerms.isEmpty())));
        }
        {
            List<ChangeConditionsType> theChangeConditions;
            theChangeConditions = (((this.changeConditions!= null)&&(!this.changeConditions.isEmpty()))?this.getChangeConditions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeConditions", theChangeConditions), currentHashCode, theChangeConditions, ((this.changeConditions!= null)&&(!this.changeConditions.isEmpty())));
        }
        {
            List<PaymentTermsType> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTerms", thePaymentTerms), currentHashCode, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
        }
        {
            List<DeliveryTermsType> theDeliveryTerms;
            theDeliveryTerms = (((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty()))?this.getDeliveryTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryTerms", theDeliveryTerms), currentHashCode, theDeliveryTerms, ((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty())));
        }
        {
            PaymentTermsType theBonusPaymentTerms;
            theBonusPaymentTerms = this.getBonusPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bonusPaymentTerms", theBonusPaymentTerms), currentHashCode, theBonusPaymentTerms, (this.bonusPaymentTerms!= null));
        }
        {
            PaymentTermsType theCommissionPaymentTerms;
            theCommissionPaymentTerms = this.getCommissionPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commissionPaymentTerms", theCommissionPaymentTerms), currentHashCode, theCommissionPaymentTerms, (this.commissionPaymentTerms!= null));
        }
        {
            PaymentTermsType thePenaltyPaymentTerms;
            thePenaltyPaymentTerms = this.getPenaltyPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "penaltyPaymentTerms", thePenaltyPaymentTerms), currentHashCode, thePenaltyPaymentTerms, (this.penaltyPaymentTerms!= null));
        }
        {
            List<EnvironmentalEmissionType> theEnvironmentalEmission;
            theEnvironmentalEmission = (((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty()))?this.getEnvironmentalEmission():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "environmentalEmission", theEnvironmentalEmission), currentHashCode, theEnvironmentalEmission, ((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty())));
        }
        {
            List<NotificationRequirementType> theNotificationRequirement;
            theNotificationRequirement = (((this.notificationRequirement!= null)&&(!this.notificationRequirement.isEmpty()))?this.getNotificationRequirement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationRequirement", theNotificationRequirement), currentHashCode, theNotificationRequirement, ((this.notificationRequirement!= null)&&(!this.notificationRequirement.isEmpty())));
        }
        {
            PaymentTermsType theServiceChargePaymentTerms;
            theServiceChargePaymentTerms = this.getServiceChargePaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceChargePaymentTerms", theServiceChargePaymentTerms), currentHashCode, theServiceChargePaymentTerms, (this.serviceChargePaymentTerms!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
