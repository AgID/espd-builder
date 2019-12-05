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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
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
 * <p>Classe Java per SupplierConsumptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SupplierConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilitySupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilityCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consumption"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierConsumptionType", propOrder = {
    "description",
    "utilitySupplierParty",
    "utilityCustomerParty",
    "consumption",
    "contract",
    "consumptionLine"
})
public class SupplierConsumptionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "UtilitySupplierParty")
    protected PartyType utilitySupplierParty;
    @XmlElement(name = "UtilityCustomerParty")
    protected PartyType utilityCustomerParty;
    @XmlElement(name = "Consumption", required = true)
    protected ConsumptionType consumption;
    @XmlElement(name = "Contract")
    protected ContractType contract;
    @XmlElement(name = "ConsumptionLine", required = true)
    protected List<ConsumptionLineType> consumptionLine;

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
     * Recupera il valore della proprietà utilitySupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getUtilitySupplierParty() {
        return utilitySupplierParty;
    }

    /**
     * Imposta il valore della proprietà utilitySupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setUtilitySupplierParty(PartyType value) {
        this.utilitySupplierParty = value;
    }

    /**
     * Recupera il valore della proprietà utilityCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getUtilityCustomerParty() {
        return utilityCustomerParty;
    }

    /**
     * Imposta il valore della proprietà utilityCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setUtilityCustomerParty(PartyType value) {
        this.utilityCustomerParty = value;
    }

    /**
     * Recupera il valore della proprietà consumption.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionType }
     *     
     */
    public ConsumptionType getConsumption() {
        return consumption;
    }

    /**
     * Imposta il valore della proprietà consumption.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionType }
     *     
     */
    public void setConsumption(ConsumptionType value) {
        this.consumption = value;
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
     * Gets the value of the consumptionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionLineType }
     * 
     * 
     */
    public List<ConsumptionLineType> getConsumptionLine() {
        if (consumptionLine == null) {
            consumptionLine = new ArrayList<ConsumptionLineType>();
        }
        return this.consumptionLine;
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PartyType theUtilitySupplierParty;
            theUtilitySupplierParty = this.getUtilitySupplierParty();
            strategy.appendField(locator, this, "utilitySupplierParty", buffer, theUtilitySupplierParty, (this.utilitySupplierParty!= null));
        }
        {
            PartyType theUtilityCustomerParty;
            theUtilityCustomerParty = this.getUtilityCustomerParty();
            strategy.appendField(locator, this, "utilityCustomerParty", buffer, theUtilityCustomerParty, (this.utilityCustomerParty!= null));
        }
        {
            ConsumptionType theConsumption;
            theConsumption = this.getConsumption();
            strategy.appendField(locator, this, "consumption", buffer, theConsumption, (this.consumption!= null));
        }
        {
            ContractType theContract;
            theContract = this.getContract();
            strategy.appendField(locator, this, "contract", buffer, theContract, (this.contract!= null));
        }
        {
            List<ConsumptionLineType> theConsumptionLine;
            theConsumptionLine = (((this.consumptionLine!= null)&&(!this.consumptionLine.isEmpty()))?this.getConsumptionLine():null);
            strategy.appendField(locator, this, "consumptionLine", buffer, theConsumptionLine, ((this.consumptionLine!= null)&&(!this.consumptionLine.isEmpty())));
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
        final SupplierConsumptionType that = ((SupplierConsumptionType) object);
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
            PartyType lhsUtilitySupplierParty;
            lhsUtilitySupplierParty = this.getUtilitySupplierParty();
            PartyType rhsUtilitySupplierParty;
            rhsUtilitySupplierParty = that.getUtilitySupplierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilitySupplierParty", lhsUtilitySupplierParty), LocatorUtils.property(thatLocator, "utilitySupplierParty", rhsUtilitySupplierParty), lhsUtilitySupplierParty, rhsUtilitySupplierParty, (this.utilitySupplierParty!= null), (that.utilitySupplierParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsUtilityCustomerParty;
            lhsUtilityCustomerParty = this.getUtilityCustomerParty();
            PartyType rhsUtilityCustomerParty;
            rhsUtilityCustomerParty = that.getUtilityCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilityCustomerParty", lhsUtilityCustomerParty), LocatorUtils.property(thatLocator, "utilityCustomerParty", rhsUtilityCustomerParty), lhsUtilityCustomerParty, rhsUtilityCustomerParty, (this.utilityCustomerParty!= null), (that.utilityCustomerParty!= null))) {
                return false;
            }
        }
        {
            ConsumptionType lhsConsumption;
            lhsConsumption = this.getConsumption();
            ConsumptionType rhsConsumption;
            rhsConsumption = that.getConsumption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumption", lhsConsumption), LocatorUtils.property(thatLocator, "consumption", rhsConsumption), lhsConsumption, rhsConsumption, (this.consumption!= null), (that.consumption!= null))) {
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
            List<ConsumptionLineType> lhsConsumptionLine;
            lhsConsumptionLine = (((this.consumptionLine!= null)&&(!this.consumptionLine.isEmpty()))?this.getConsumptionLine():null);
            List<ConsumptionLineType> rhsConsumptionLine;
            rhsConsumptionLine = (((that.consumptionLine!= null)&&(!that.consumptionLine.isEmpty()))?that.getConsumptionLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionLine", lhsConsumptionLine), LocatorUtils.property(thatLocator, "consumptionLine", rhsConsumptionLine), lhsConsumptionLine, rhsConsumptionLine, ((this.consumptionLine!= null)&&(!this.consumptionLine.isEmpty())), ((that.consumptionLine!= null)&&(!that.consumptionLine.isEmpty())))) {
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PartyType theUtilitySupplierParty;
            theUtilitySupplierParty = this.getUtilitySupplierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utilitySupplierParty", theUtilitySupplierParty), currentHashCode, theUtilitySupplierParty, (this.utilitySupplierParty!= null));
        }
        {
            PartyType theUtilityCustomerParty;
            theUtilityCustomerParty = this.getUtilityCustomerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utilityCustomerParty", theUtilityCustomerParty), currentHashCode, theUtilityCustomerParty, (this.utilityCustomerParty!= null));
        }
        {
            ConsumptionType theConsumption;
            theConsumption = this.getConsumption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumption", theConsumption), currentHashCode, theConsumption, (this.consumption!= null));
        }
        {
            ContractType theContract;
            theContract = this.getContract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contract", theContract), currentHashCode, theContract, (this.contract!= null));
        }
        {
            List<ConsumptionLineType> theConsumptionLine;
            theConsumptionLine = (((this.consumptionLine!= null)&&(!this.consumptionLine.isEmpty()))?this.getConsumptionLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionLine", theConsumptionLine), currentHashCode, theConsumptionLine, ((this.consumptionLine!= null)&&(!this.consumptionLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
