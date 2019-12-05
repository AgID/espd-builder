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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
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
 * <p>Classe Java per DigitalCollaborationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DigitalCollaborationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SendingDigitalService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceivingDigitalService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalCollaborationType", propOrder = {
    "id",
    "sendingDigitalService",
    "receivingDigitalService"
})
public class DigitalCollaborationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "SendingDigitalService")
    protected DigitalServiceType sendingDigitalService;
    @XmlElement(name = "ReceivingDigitalService")
    protected DigitalServiceType receivingDigitalService;

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
     * Recupera il valore della proprietà sendingDigitalService.
     * 
     * @return
     *     possible object is
     *     {@link DigitalServiceType }
     *     
     */
    public DigitalServiceType getSendingDigitalService() {
        return sendingDigitalService;
    }

    /**
     * Imposta il valore della proprietà sendingDigitalService.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalServiceType }
     *     
     */
    public void setSendingDigitalService(DigitalServiceType value) {
        this.sendingDigitalService = value;
    }

    /**
     * Recupera il valore della proprietà receivingDigitalService.
     * 
     * @return
     *     possible object is
     *     {@link DigitalServiceType }
     *     
     */
    public DigitalServiceType getReceivingDigitalService() {
        return receivingDigitalService;
    }

    /**
     * Imposta il valore della proprietà receivingDigitalService.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalServiceType }
     *     
     */
    public void setReceivingDigitalService(DigitalServiceType value) {
        this.receivingDigitalService = value;
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
            DigitalServiceType theSendingDigitalService;
            theSendingDigitalService = this.getSendingDigitalService();
            strategy.appendField(locator, this, "sendingDigitalService", buffer, theSendingDigitalService, (this.sendingDigitalService!= null));
        }
        {
            DigitalServiceType theReceivingDigitalService;
            theReceivingDigitalService = this.getReceivingDigitalService();
            strategy.appendField(locator, this, "receivingDigitalService", buffer, theReceivingDigitalService, (this.receivingDigitalService!= null));
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
        final DigitalCollaborationType that = ((DigitalCollaborationType) object);
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
            DigitalServiceType lhsSendingDigitalService;
            lhsSendingDigitalService = this.getSendingDigitalService();
            DigitalServiceType rhsSendingDigitalService;
            rhsSendingDigitalService = that.getSendingDigitalService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendingDigitalService", lhsSendingDigitalService), LocatorUtils.property(thatLocator, "sendingDigitalService", rhsSendingDigitalService), lhsSendingDigitalService, rhsSendingDigitalService, (this.sendingDigitalService!= null), (that.sendingDigitalService!= null))) {
                return false;
            }
        }
        {
            DigitalServiceType lhsReceivingDigitalService;
            lhsReceivingDigitalService = this.getReceivingDigitalService();
            DigitalServiceType rhsReceivingDigitalService;
            rhsReceivingDigitalService = that.getReceivingDigitalService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivingDigitalService", lhsReceivingDigitalService), LocatorUtils.property(thatLocator, "receivingDigitalService", rhsReceivingDigitalService), lhsReceivingDigitalService, rhsReceivingDigitalService, (this.receivingDigitalService!= null), (that.receivingDigitalService!= null))) {
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
            DigitalServiceType theSendingDigitalService;
            theSendingDigitalService = this.getSendingDigitalService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendingDigitalService", theSendingDigitalService), currentHashCode, theSendingDigitalService, (this.sendingDigitalService!= null));
        }
        {
            DigitalServiceType theReceivingDigitalService;
            theReceivingDigitalService = this.getReceivingDigitalService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivingDigitalService", theReceivingDigitalService), currentHashCode, theReceivingDigitalService, (this.receivingDigitalService!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
