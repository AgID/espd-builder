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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AttributeIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PositionCodeType;
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
 * <p>Classe Java per PhysicalAttributeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PhysicalAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AttributeID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DescriptionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalAttributeType", propOrder = {
    "attributeID",
    "positionCode",
    "descriptionCode",
    "description"
})
public class PhysicalAttributeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AttributeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AttributeIDType attributeID;
    @XmlElement(name = "PositionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PositionCodeType positionCode;
    @XmlElement(name = "DescriptionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DescriptionCodeType descriptionCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;

    /**
     * Recupera il valore della proprietà attributeID.
     * 
     * @return
     *     possible object is
     *     {@link AttributeIDType }
     *     
     */
    public AttributeIDType getAttributeID() {
        return attributeID;
    }

    /**
     * Imposta il valore della proprietà attributeID.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeIDType }
     *     
     */
    public void setAttributeID(AttributeIDType value) {
        this.attributeID = value;
    }

    /**
     * Recupera il valore della proprietà positionCode.
     * 
     * @return
     *     possible object is
     *     {@link PositionCodeType }
     *     
     */
    public PositionCodeType getPositionCode() {
        return positionCode;
    }

    /**
     * Imposta il valore della proprietà positionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCodeType }
     *     
     */
    public void setPositionCode(PositionCodeType value) {
        this.positionCode = value;
    }

    /**
     * Recupera il valore della proprietà descriptionCode.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionCodeType }
     *     
     */
    public DescriptionCodeType getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Imposta il valore della proprietà descriptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionCodeType }
     *     
     */
    public void setDescriptionCode(DescriptionCodeType value) {
        this.descriptionCode = value;
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
            AttributeIDType theAttributeID;
            theAttributeID = this.getAttributeID();
            strategy.appendField(locator, this, "attributeID", buffer, theAttributeID, (this.attributeID!= null));
        }
        {
            PositionCodeType thePositionCode;
            thePositionCode = this.getPositionCode();
            strategy.appendField(locator, this, "positionCode", buffer, thePositionCode, (this.positionCode!= null));
        }
        {
            DescriptionCodeType theDescriptionCode;
            theDescriptionCode = this.getDescriptionCode();
            strategy.appendField(locator, this, "descriptionCode", buffer, theDescriptionCode, (this.descriptionCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
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
        final PhysicalAttributeType that = ((PhysicalAttributeType) object);
        {
            AttributeIDType lhsAttributeID;
            lhsAttributeID = this.getAttributeID();
            AttributeIDType rhsAttributeID;
            rhsAttributeID = that.getAttributeID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeID", lhsAttributeID), LocatorUtils.property(thatLocator, "attributeID", rhsAttributeID), lhsAttributeID, rhsAttributeID, (this.attributeID!= null), (that.attributeID!= null))) {
                return false;
            }
        }
        {
            PositionCodeType lhsPositionCode;
            lhsPositionCode = this.getPositionCode();
            PositionCodeType rhsPositionCode;
            rhsPositionCode = that.getPositionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "positionCode", lhsPositionCode), LocatorUtils.property(thatLocator, "positionCode", rhsPositionCode), lhsPositionCode, rhsPositionCode, (this.positionCode!= null), (that.positionCode!= null))) {
                return false;
            }
        }
        {
            DescriptionCodeType lhsDescriptionCode;
            lhsDescriptionCode = this.getDescriptionCode();
            DescriptionCodeType rhsDescriptionCode;
            rhsDescriptionCode = that.getDescriptionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptionCode", lhsDescriptionCode), LocatorUtils.property(thatLocator, "descriptionCode", rhsDescriptionCode), lhsDescriptionCode, rhsDescriptionCode, (this.descriptionCode!= null), (that.descriptionCode!= null))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            AttributeIDType theAttributeID;
            theAttributeID = this.getAttributeID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeID", theAttributeID), currentHashCode, theAttributeID, (this.attributeID!= null));
        }
        {
            PositionCodeType thePositionCode;
            thePositionCode = this.getPositionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "positionCode", thePositionCode), currentHashCode, thePositionCode, (this.positionCode!= null));
        }
        {
            DescriptionCodeType theDescriptionCode;
            theDescriptionCode = this.getDescriptionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "descriptionCode", theDescriptionCode), currentHashCode, theDescriptionCode, (this.descriptionCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
