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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RailCarIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TrainIDType;
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
 * <p>Classe Java per RailTransportType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RailTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TrainID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RailCarID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailTransportType", propOrder = {
    "trainID",
    "railCarID"
})
public class RailTransportType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TrainID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TrainIDType trainID;
    @XmlElement(name = "RailCarID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RailCarIDType railCarID;

    /**
     * Recupera il valore della proprietà trainID.
     * 
     * @return
     *     possible object is
     *     {@link TrainIDType }
     *     
     */
    public TrainIDType getTrainID() {
        return trainID;
    }

    /**
     * Imposta il valore della proprietà trainID.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainIDType }
     *     
     */
    public void setTrainID(TrainIDType value) {
        this.trainID = value;
    }

    /**
     * Recupera il valore della proprietà railCarID.
     * 
     * @return
     *     possible object is
     *     {@link RailCarIDType }
     *     
     */
    public RailCarIDType getRailCarID() {
        return railCarID;
    }

    /**
     * Imposta il valore della proprietà railCarID.
     * 
     * @param value
     *     allowed object is
     *     {@link RailCarIDType }
     *     
     */
    public void setRailCarID(RailCarIDType value) {
        this.railCarID = value;
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
            TrainIDType theTrainID;
            theTrainID = this.getTrainID();
            strategy.appendField(locator, this, "trainID", buffer, theTrainID, (this.trainID!= null));
        }
        {
            RailCarIDType theRailCarID;
            theRailCarID = this.getRailCarID();
            strategy.appendField(locator, this, "railCarID", buffer, theRailCarID, (this.railCarID!= null));
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
        final RailTransportType that = ((RailTransportType) object);
        {
            TrainIDType lhsTrainID;
            lhsTrainID = this.getTrainID();
            TrainIDType rhsTrainID;
            rhsTrainID = that.getTrainID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trainID", lhsTrainID), LocatorUtils.property(thatLocator, "trainID", rhsTrainID), lhsTrainID, rhsTrainID, (this.trainID!= null), (that.trainID!= null))) {
                return false;
            }
        }
        {
            RailCarIDType lhsRailCarID;
            lhsRailCarID = this.getRailCarID();
            RailCarIDType rhsRailCarID;
            rhsRailCarID = that.getRailCarID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "railCarID", lhsRailCarID), LocatorUtils.property(thatLocator, "railCarID", rhsRailCarID), lhsRailCarID, rhsRailCarID, (this.railCarID!= null), (that.railCarID!= null))) {
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
            TrainIDType theTrainID;
            theTrainID = this.getTrainID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trainID", theTrainID), currentHashCode, theTrainID, (this.trainID!= null));
        }
        {
            RailCarIDType theRailCarID;
            theRailCarID = this.getRailCarID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "railCarID", theRailCarID), currentHashCode, theRailCarID, (this.railCarID!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
