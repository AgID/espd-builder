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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardingCriterionDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardingCriterionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
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
 * <p>Classe Java per AwardingCriterionResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AwardingCriterionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingCriterionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingCriterionDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubordinateAwardingCriterionResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardingCriterionResponseType", propOrder = {
    "id",
    "awardingCriterionID",
    "awardingCriterionDescription",
    "description",
    "quantity",
    "amount",
    "subordinateAwardingCriterionResponse"
})
public class AwardingCriterionResponseType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "AwardingCriterionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardingCriterionIDType awardingCriterionID;
    @XmlElement(name = "AwardingCriterionDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AwardingCriterionDescriptionType> awardingCriterionDescription;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountType amount;
    @XmlElement(name = "SubordinateAwardingCriterionResponse")
    protected List<AwardingCriterionResponseType> subordinateAwardingCriterionResponse;

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
     * Recupera il valore della proprietà awardingCriterionID.
     * 
     * @return
     *     possible object is
     *     {@link AwardingCriterionIDType }
     *     
     */
    public AwardingCriterionIDType getAwardingCriterionID() {
        return awardingCriterionID;
    }

    /**
     * Imposta il valore della proprietà awardingCriterionID.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingCriterionIDType }
     *     
     */
    public void setAwardingCriterionID(AwardingCriterionIDType value) {
        this.awardingCriterionID = value;
    }

    /**
     * Gets the value of the awardingCriterionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardingCriterionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardingCriterionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionDescriptionType }
     * 
     * 
     */
    public List<AwardingCriterionDescriptionType> getAwardingCriterionDescription() {
        if (awardingCriterionDescription == null) {
            awardingCriterionDescription = new ArrayList<AwardingCriterionDescriptionType>();
        }
        return this.awardingCriterionDescription;
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
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the subordinateAwardingCriterionResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinateAwardingCriterionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinateAwardingCriterionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionResponseType }
     * 
     * 
     */
    public List<AwardingCriterionResponseType> getSubordinateAwardingCriterionResponse() {
        if (subordinateAwardingCriterionResponse == null) {
            subordinateAwardingCriterionResponse = new ArrayList<AwardingCriterionResponseType>();
        }
        return this.subordinateAwardingCriterionResponse;
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
            AwardingCriterionIDType theAwardingCriterionID;
            theAwardingCriterionID = this.getAwardingCriterionID();
            strategy.appendField(locator, this, "awardingCriterionID", buffer, theAwardingCriterionID, (this.awardingCriterionID!= null));
        }
        {
            List<AwardingCriterionDescriptionType> theAwardingCriterionDescription;
            theAwardingCriterionDescription = (((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty()))?this.getAwardingCriterionDescription():null);
            strategy.appendField(locator, this, "awardingCriterionDescription", buffer, theAwardingCriterionDescription, ((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            List<AwardingCriterionResponseType> theSubordinateAwardingCriterionResponse;
            theSubordinateAwardingCriterionResponse = (((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty()))?this.getSubordinateAwardingCriterionResponse():null);
            strategy.appendField(locator, this, "subordinateAwardingCriterionResponse", buffer, theSubordinateAwardingCriterionResponse, ((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty())));
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
        final AwardingCriterionResponseType that = ((AwardingCriterionResponseType) object);
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
            AwardingCriterionIDType lhsAwardingCriterionID;
            lhsAwardingCriterionID = this.getAwardingCriterionID();
            AwardingCriterionIDType rhsAwardingCriterionID;
            rhsAwardingCriterionID = that.getAwardingCriterionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingCriterionID", lhsAwardingCriterionID), LocatorUtils.property(thatLocator, "awardingCriterionID", rhsAwardingCriterionID), lhsAwardingCriterionID, rhsAwardingCriterionID, (this.awardingCriterionID!= null), (that.awardingCriterionID!= null))) {
                return false;
            }
        }
        {
            List<AwardingCriterionDescriptionType> lhsAwardingCriterionDescription;
            lhsAwardingCriterionDescription = (((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty()))?this.getAwardingCriterionDescription():null);
            List<AwardingCriterionDescriptionType> rhsAwardingCriterionDescription;
            rhsAwardingCriterionDescription = (((that.awardingCriterionDescription!= null)&&(!that.awardingCriterionDescription.isEmpty()))?that.getAwardingCriterionDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingCriterionDescription", lhsAwardingCriterionDescription), LocatorUtils.property(thatLocator, "awardingCriterionDescription", rhsAwardingCriterionDescription), lhsAwardingCriterionDescription, rhsAwardingCriterionDescription, ((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty())), ((that.awardingCriterionDescription!= null)&&(!that.awardingCriterionDescription.isEmpty())))) {
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
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            AmountType lhsAmount;
            lhsAmount = this.getAmount();
            AmountType rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (this.amount!= null), (that.amount!= null))) {
                return false;
            }
        }
        {
            List<AwardingCriterionResponseType> lhsSubordinateAwardingCriterionResponse;
            lhsSubordinateAwardingCriterionResponse = (((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty()))?this.getSubordinateAwardingCriterionResponse():null);
            List<AwardingCriterionResponseType> rhsSubordinateAwardingCriterionResponse;
            rhsSubordinateAwardingCriterionResponse = (((that.subordinateAwardingCriterionResponse!= null)&&(!that.subordinateAwardingCriterionResponse.isEmpty()))?that.getSubordinateAwardingCriterionResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subordinateAwardingCriterionResponse", lhsSubordinateAwardingCriterionResponse), LocatorUtils.property(thatLocator, "subordinateAwardingCriterionResponse", rhsSubordinateAwardingCriterionResponse), lhsSubordinateAwardingCriterionResponse, rhsSubordinateAwardingCriterionResponse, ((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty())), ((that.subordinateAwardingCriterionResponse!= null)&&(!that.subordinateAwardingCriterionResponse.isEmpty())))) {
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
            AwardingCriterionIDType theAwardingCriterionID;
            theAwardingCriterionID = this.getAwardingCriterionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingCriterionID", theAwardingCriterionID), currentHashCode, theAwardingCriterionID, (this.awardingCriterionID!= null));
        }
        {
            List<AwardingCriterionDescriptionType> theAwardingCriterionDescription;
            theAwardingCriterionDescription = (((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty()))?this.getAwardingCriterionDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingCriterionDescription", theAwardingCriterionDescription), currentHashCode, theAwardingCriterionDescription, ((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            List<AwardingCriterionResponseType> theSubordinateAwardingCriterionResponse;
            theSubordinateAwardingCriterionResponse = (((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty()))?this.getSubordinateAwardingCriterionResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subordinateAwardingCriterionResponse", theSubordinateAwardingCriterionResponse), currentHashCode, theSubordinateAwardingCriterionResponse, ((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
