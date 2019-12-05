//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SalesOrderLineIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
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
 * <p>Classe Java per OrderLineReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OrderLineReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SalesOrderLineID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLineReferenceType", propOrder = {
    "lineID",
    "salesOrderLineID",
    "uuid",
    "lineStatusCode",
    "orderReference"
})
public class OrderLineReferenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "LineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LineIDType lineID;
    @XmlElement(name = "SalesOrderLineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SalesOrderLineIDType salesOrderLineID;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "LineStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineStatusCodeType lineStatusCode;
    @XmlElement(name = "OrderReference")
    protected OrderReferenceType orderReference;

    /**
     * Recupera il valore della proprietà lineID.
     * 
     * @return
     *     possible object is
     *     {@link LineIDType }
     *     
     */
    public LineIDType getLineID() {
        return lineID;
    }

    /**
     * Imposta il valore della proprietà lineID.
     * 
     * @param value
     *     allowed object is
     *     {@link LineIDType }
     *     
     */
    public void setLineID(LineIDType value) {
        this.lineID = value;
    }

    /**
     * Recupera il valore della proprietà salesOrderLineID.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderLineIDType }
     *     
     */
    public SalesOrderLineIDType getSalesOrderLineID() {
        return salesOrderLineID;
    }

    /**
     * Imposta il valore della proprietà salesOrderLineID.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderLineIDType }
     *     
     */
    public void setSalesOrderLineID(SalesOrderLineIDType value) {
        this.salesOrderLineID = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUIDType }
     *     
     */
    public UUIDType getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDType }
     *     
     */
    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà lineStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusCodeType }
     *     
     */
    public LineStatusCodeType getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Imposta il valore della proprietà lineStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusCodeType }
     *     
     */
    public void setLineStatusCode(LineStatusCodeType value) {
        this.lineStatusCode = value;
    }

    /**
     * Recupera il valore della proprietà orderReference.
     * 
     * @return
     *     possible object is
     *     {@link OrderReferenceType }
     *     
     */
    public OrderReferenceType getOrderReference() {
        return orderReference;
    }

    /**
     * Imposta il valore della proprietà orderReference.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReferenceType }
     *     
     */
    public void setOrderReference(OrderReferenceType value) {
        this.orderReference = value;
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
            LineIDType theLineID;
            theLineID = this.getLineID();
            strategy.appendField(locator, this, "lineID", buffer, theLineID, (this.lineID!= null));
        }
        {
            SalesOrderLineIDType theSalesOrderLineID;
            theSalesOrderLineID = this.getSalesOrderLineID();
            strategy.appendField(locator, this, "salesOrderLineID", buffer, theSalesOrderLineID, (this.salesOrderLineID!= null));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            strategy.appendField(locator, this, "uuid", buffer, theUUID, (this.uuid!= null));
        }
        {
            LineStatusCodeType theLineStatusCode;
            theLineStatusCode = this.getLineStatusCode();
            strategy.appendField(locator, this, "lineStatusCode", buffer, theLineStatusCode, (this.lineStatusCode!= null));
        }
        {
            OrderReferenceType theOrderReference;
            theOrderReference = this.getOrderReference();
            strategy.appendField(locator, this, "orderReference", buffer, theOrderReference, (this.orderReference!= null));
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
        final OrderLineReferenceType that = ((OrderLineReferenceType) object);
        {
            LineIDType lhsLineID;
            lhsLineID = this.getLineID();
            LineIDType rhsLineID;
            rhsLineID = that.getLineID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineID", lhsLineID), LocatorUtils.property(thatLocator, "lineID", rhsLineID), lhsLineID, rhsLineID, (this.lineID!= null), (that.lineID!= null))) {
                return false;
            }
        }
        {
            SalesOrderLineIDType lhsSalesOrderLineID;
            lhsSalesOrderLineID = this.getSalesOrderLineID();
            SalesOrderLineIDType rhsSalesOrderLineID;
            rhsSalesOrderLineID = that.getSalesOrderLineID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOrderLineID", lhsSalesOrderLineID), LocatorUtils.property(thatLocator, "salesOrderLineID", rhsSalesOrderLineID), lhsSalesOrderLineID, rhsSalesOrderLineID, (this.salesOrderLineID!= null), (that.salesOrderLineID!= null))) {
                return false;
            }
        }
        {
            UUIDType lhsUUID;
            lhsUUID = this.getUUID();
            UUIDType rhsUUID;
            rhsUUID = that.getUUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uuid", lhsUUID), LocatorUtils.property(thatLocator, "uuid", rhsUUID), lhsUUID, rhsUUID, (this.uuid!= null), (that.uuid!= null))) {
                return false;
            }
        }
        {
            LineStatusCodeType lhsLineStatusCode;
            lhsLineStatusCode = this.getLineStatusCode();
            LineStatusCodeType rhsLineStatusCode;
            rhsLineStatusCode = that.getLineStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineStatusCode", lhsLineStatusCode), LocatorUtils.property(thatLocator, "lineStatusCode", rhsLineStatusCode), lhsLineStatusCode, rhsLineStatusCode, (this.lineStatusCode!= null), (that.lineStatusCode!= null))) {
                return false;
            }
        }
        {
            OrderReferenceType lhsOrderReference;
            lhsOrderReference = this.getOrderReference();
            OrderReferenceType rhsOrderReference;
            rhsOrderReference = that.getOrderReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderReference", lhsOrderReference), LocatorUtils.property(thatLocator, "orderReference", rhsOrderReference), lhsOrderReference, rhsOrderReference, (this.orderReference!= null), (that.orderReference!= null))) {
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
            LineIDType theLineID;
            theLineID = this.getLineID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineID", theLineID), currentHashCode, theLineID, (this.lineID!= null));
        }
        {
            SalesOrderLineIDType theSalesOrderLineID;
            theSalesOrderLineID = this.getSalesOrderLineID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesOrderLineID", theSalesOrderLineID), currentHashCode, theSalesOrderLineID, (this.salesOrderLineID!= null));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uuid", theUUID), currentHashCode, theUUID, (this.uuid!= null));
        }
        {
            LineStatusCodeType theLineStatusCode;
            theLineStatusCode = this.getLineStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineStatusCode", theLineStatusCode), currentHashCode, theLineStatusCode, (this.lineStatusCode!= null));
        }
        {
            OrderReferenceType theOrderReference;
            theOrderReference = this.getOrderReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderReference", theOrderReference), currentHashCode, theOrderReference, (this.orderReference!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
