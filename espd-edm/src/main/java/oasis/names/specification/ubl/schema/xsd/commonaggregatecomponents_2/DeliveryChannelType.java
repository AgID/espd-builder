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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetworkIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ParticipantIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TestIndicatorType;
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
 * <p>Classe Java per DeliveryChannelType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryChannelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetworkID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ParticipantID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TestIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalCertificate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalMessageDelivery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryChannelType", propOrder = {
    "networkID",
    "participantID",
    "testIndicator",
    "digitalCertificate",
    "digitalMessageDelivery"
})
public class DeliveryChannelType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "NetworkID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetworkIDType networkID;
    @XmlElement(name = "ParticipantID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ParticipantIDType participantID;
    @XmlElement(name = "TestIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TestIndicatorType testIndicator;
    @XmlElement(name = "DigitalCertificate")
    protected CertificateType digitalCertificate;
    @XmlElement(name = "DigitalMessageDelivery")
    protected MessageDeliveryType digitalMessageDelivery;

    /**
     * Recupera il valore della proprietà networkID.
     * 
     * @return
     *     possible object is
     *     {@link NetworkIDType }
     *     
     */
    public NetworkIDType getNetworkID() {
        return networkID;
    }

    /**
     * Imposta il valore della proprietà networkID.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkIDType }
     *     
     */
    public void setNetworkID(NetworkIDType value) {
        this.networkID = value;
    }

    /**
     * Recupera il valore della proprietà participantID.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantIDType }
     *     
     */
    public ParticipantIDType getParticipantID() {
        return participantID;
    }

    /**
     * Imposta il valore della proprietà participantID.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantIDType }
     *     
     */
    public void setParticipantID(ParticipantIDType value) {
        this.participantID = value;
    }

    /**
     * Recupera il valore della proprietà testIndicator.
     * 
     * @return
     *     possible object is
     *     {@link TestIndicatorType }
     *     
     */
    public TestIndicatorType getTestIndicator() {
        return testIndicator;
    }

    /**
     * Imposta il valore della proprietà testIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link TestIndicatorType }
     *     
     */
    public void setTestIndicator(TestIndicatorType value) {
        this.testIndicator = value;
    }

    /**
     * Recupera il valore della proprietà digitalCertificate.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getDigitalCertificate() {
        return digitalCertificate;
    }

    /**
     * Imposta il valore della proprietà digitalCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setDigitalCertificate(CertificateType value) {
        this.digitalCertificate = value;
    }

    /**
     * Recupera il valore della proprietà digitalMessageDelivery.
     * 
     * @return
     *     possible object is
     *     {@link MessageDeliveryType }
     *     
     */
    public MessageDeliveryType getDigitalMessageDelivery() {
        return digitalMessageDelivery;
    }

    /**
     * Imposta il valore della proprietà digitalMessageDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDeliveryType }
     *     
     */
    public void setDigitalMessageDelivery(MessageDeliveryType value) {
        this.digitalMessageDelivery = value;
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
            NetworkIDType theNetworkID;
            theNetworkID = this.getNetworkID();
            strategy.appendField(locator, this, "networkID", buffer, theNetworkID, (this.networkID!= null));
        }
        {
            ParticipantIDType theParticipantID;
            theParticipantID = this.getParticipantID();
            strategy.appendField(locator, this, "participantID", buffer, theParticipantID, (this.participantID!= null));
        }
        {
            TestIndicatorType theTestIndicator;
            theTestIndicator = this.getTestIndicator();
            strategy.appendField(locator, this, "testIndicator", buffer, theTestIndicator, (this.testIndicator!= null));
        }
        {
            CertificateType theDigitalCertificate;
            theDigitalCertificate = this.getDigitalCertificate();
            strategy.appendField(locator, this, "digitalCertificate", buffer, theDigitalCertificate, (this.digitalCertificate!= null));
        }
        {
            MessageDeliveryType theDigitalMessageDelivery;
            theDigitalMessageDelivery = this.getDigitalMessageDelivery();
            strategy.appendField(locator, this, "digitalMessageDelivery", buffer, theDigitalMessageDelivery, (this.digitalMessageDelivery!= null));
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
        final DeliveryChannelType that = ((DeliveryChannelType) object);
        {
            NetworkIDType lhsNetworkID;
            lhsNetworkID = this.getNetworkID();
            NetworkIDType rhsNetworkID;
            rhsNetworkID = that.getNetworkID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkID", lhsNetworkID), LocatorUtils.property(thatLocator, "networkID", rhsNetworkID), lhsNetworkID, rhsNetworkID, (this.networkID!= null), (that.networkID!= null))) {
                return false;
            }
        }
        {
            ParticipantIDType lhsParticipantID;
            lhsParticipantID = this.getParticipantID();
            ParticipantIDType rhsParticipantID;
            rhsParticipantID = that.getParticipantID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participantID", lhsParticipantID), LocatorUtils.property(thatLocator, "participantID", rhsParticipantID), lhsParticipantID, rhsParticipantID, (this.participantID!= null), (that.participantID!= null))) {
                return false;
            }
        }
        {
            TestIndicatorType lhsTestIndicator;
            lhsTestIndicator = this.getTestIndicator();
            TestIndicatorType rhsTestIndicator;
            rhsTestIndicator = that.getTestIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testIndicator", lhsTestIndicator), LocatorUtils.property(thatLocator, "testIndicator", rhsTestIndicator), lhsTestIndicator, rhsTestIndicator, (this.testIndicator!= null), (that.testIndicator!= null))) {
                return false;
            }
        }
        {
            CertificateType lhsDigitalCertificate;
            lhsDigitalCertificate = this.getDigitalCertificate();
            CertificateType rhsDigitalCertificate;
            rhsDigitalCertificate = that.getDigitalCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digitalCertificate", lhsDigitalCertificate), LocatorUtils.property(thatLocator, "digitalCertificate", rhsDigitalCertificate), lhsDigitalCertificate, rhsDigitalCertificate, (this.digitalCertificate!= null), (that.digitalCertificate!= null))) {
                return false;
            }
        }
        {
            MessageDeliveryType lhsDigitalMessageDelivery;
            lhsDigitalMessageDelivery = this.getDigitalMessageDelivery();
            MessageDeliveryType rhsDigitalMessageDelivery;
            rhsDigitalMessageDelivery = that.getDigitalMessageDelivery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digitalMessageDelivery", lhsDigitalMessageDelivery), LocatorUtils.property(thatLocator, "digitalMessageDelivery", rhsDigitalMessageDelivery), lhsDigitalMessageDelivery, rhsDigitalMessageDelivery, (this.digitalMessageDelivery!= null), (that.digitalMessageDelivery!= null))) {
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
            NetworkIDType theNetworkID;
            theNetworkID = this.getNetworkID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkID", theNetworkID), currentHashCode, theNetworkID, (this.networkID!= null));
        }
        {
            ParticipantIDType theParticipantID;
            theParticipantID = this.getParticipantID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participantID", theParticipantID), currentHashCode, theParticipantID, (this.participantID!= null));
        }
        {
            TestIndicatorType theTestIndicator;
            theTestIndicator = this.getTestIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testIndicator", theTestIndicator), currentHashCode, theTestIndicator, (this.testIndicator!= null));
        }
        {
            CertificateType theDigitalCertificate;
            theDigitalCertificate = this.getDigitalCertificate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digitalCertificate", theDigitalCertificate), currentHashCode, theDigitalCertificate, (this.digitalCertificate!= null));
        }
        {
            MessageDeliveryType theDigitalMessageDelivery;
            theDigitalMessageDelivery = this.getDigitalMessageDelivery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digitalMessageDelivery", theDigitalMessageDelivery), currentHashCode, theDigitalMessageDelivery, (this.digitalMessageDelivery!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
