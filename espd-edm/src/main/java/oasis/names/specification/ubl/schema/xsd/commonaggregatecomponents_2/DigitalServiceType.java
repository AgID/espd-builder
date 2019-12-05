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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
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
 * <p>Classe Java per DigitalServiceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DigitalServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomizationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalDocumentMetadata" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalDeliveryChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CertificationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalServiceType", propOrder = {
    "id",
    "customizationID",
    "digitalDocumentMetadata",
    "digitalDeliveryChannel",
    "certificationDocumentReference"
})
public class DigitalServiceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomizationIDType customizationID;
    @XmlElement(name = "DigitalDocumentMetadata", required = true)
    protected List<DocumentMetadataType> digitalDocumentMetadata;
    @XmlElement(name = "DigitalDeliveryChannel")
    protected List<DeliveryChannelType> digitalDeliveryChannel;
    @XmlElement(name = "CertificationDocumentReference")
    protected List<DocumentReferenceType> certificationDocumentReference;

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
     * Recupera il valore della proprietà customizationID.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIDType }
     *     
     */
    public CustomizationIDType getCustomizationID() {
        return customizationID;
    }

    /**
     * Imposta il valore della proprietà customizationID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIDType }
     *     
     */
    public void setCustomizationID(CustomizationIDType value) {
        this.customizationID = value;
    }

    /**
     * Gets the value of the digitalDocumentMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalDocumentMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalDocumentMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentMetadataType }
     * 
     * 
     */
    public List<DocumentMetadataType> getDigitalDocumentMetadata() {
        if (digitalDocumentMetadata == null) {
            digitalDocumentMetadata = new ArrayList<DocumentMetadataType>();
        }
        return this.digitalDocumentMetadata;
    }

    /**
     * Gets the value of the digitalDeliveryChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalDeliveryChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalDeliveryChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryChannelType }
     * 
     * 
     */
    public List<DeliveryChannelType> getDigitalDeliveryChannel() {
        if (digitalDeliveryChannel == null) {
            digitalDeliveryChannel = new ArrayList<DeliveryChannelType>();
        }
        return this.digitalDeliveryChannel;
    }

    /**
     * Gets the value of the certificationDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getCertificationDocumentReference() {
        if (certificationDocumentReference == null) {
            certificationDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.certificationDocumentReference;
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
            CustomizationIDType theCustomizationID;
            theCustomizationID = this.getCustomizationID();
            strategy.appendField(locator, this, "customizationID", buffer, theCustomizationID, (this.customizationID!= null));
        }
        {
            List<DocumentMetadataType> theDigitalDocumentMetadata;
            theDigitalDocumentMetadata = (((this.digitalDocumentMetadata!= null)&&(!this.digitalDocumentMetadata.isEmpty()))?this.getDigitalDocumentMetadata():null);
            strategy.appendField(locator, this, "digitalDocumentMetadata", buffer, theDigitalDocumentMetadata, ((this.digitalDocumentMetadata!= null)&&(!this.digitalDocumentMetadata.isEmpty())));
        }
        {
            List<DeliveryChannelType> theDigitalDeliveryChannel;
            theDigitalDeliveryChannel = (((this.digitalDeliveryChannel!= null)&&(!this.digitalDeliveryChannel.isEmpty()))?this.getDigitalDeliveryChannel():null);
            strategy.appendField(locator, this, "digitalDeliveryChannel", buffer, theDigitalDeliveryChannel, ((this.digitalDeliveryChannel!= null)&&(!this.digitalDeliveryChannel.isEmpty())));
        }
        {
            List<DocumentReferenceType> theCertificationDocumentReference;
            theCertificationDocumentReference = (((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty()))?this.getCertificationDocumentReference():null);
            strategy.appendField(locator, this, "certificationDocumentReference", buffer, theCertificationDocumentReference, ((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty())));
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
        final DigitalServiceType that = ((DigitalServiceType) object);
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
            CustomizationIDType lhsCustomizationID;
            lhsCustomizationID = this.getCustomizationID();
            CustomizationIDType rhsCustomizationID;
            rhsCustomizationID = that.getCustomizationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customizationID", lhsCustomizationID), LocatorUtils.property(thatLocator, "customizationID", rhsCustomizationID), lhsCustomizationID, rhsCustomizationID, (this.customizationID!= null), (that.customizationID!= null))) {
                return false;
            }
        }
        {
            List<DocumentMetadataType> lhsDigitalDocumentMetadata;
            lhsDigitalDocumentMetadata = (((this.digitalDocumentMetadata!= null)&&(!this.digitalDocumentMetadata.isEmpty()))?this.getDigitalDocumentMetadata():null);
            List<DocumentMetadataType> rhsDigitalDocumentMetadata;
            rhsDigitalDocumentMetadata = (((that.digitalDocumentMetadata!= null)&&(!that.digitalDocumentMetadata.isEmpty()))?that.getDigitalDocumentMetadata():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digitalDocumentMetadata", lhsDigitalDocumentMetadata), LocatorUtils.property(thatLocator, "digitalDocumentMetadata", rhsDigitalDocumentMetadata), lhsDigitalDocumentMetadata, rhsDigitalDocumentMetadata, ((this.digitalDocumentMetadata!= null)&&(!this.digitalDocumentMetadata.isEmpty())), ((that.digitalDocumentMetadata!= null)&&(!that.digitalDocumentMetadata.isEmpty())))) {
                return false;
            }
        }
        {
            List<DeliveryChannelType> lhsDigitalDeliveryChannel;
            lhsDigitalDeliveryChannel = (((this.digitalDeliveryChannel!= null)&&(!this.digitalDeliveryChannel.isEmpty()))?this.getDigitalDeliveryChannel():null);
            List<DeliveryChannelType> rhsDigitalDeliveryChannel;
            rhsDigitalDeliveryChannel = (((that.digitalDeliveryChannel!= null)&&(!that.digitalDeliveryChannel.isEmpty()))?that.getDigitalDeliveryChannel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digitalDeliveryChannel", lhsDigitalDeliveryChannel), LocatorUtils.property(thatLocator, "digitalDeliveryChannel", rhsDigitalDeliveryChannel), lhsDigitalDeliveryChannel, rhsDigitalDeliveryChannel, ((this.digitalDeliveryChannel!= null)&&(!this.digitalDeliveryChannel.isEmpty())), ((that.digitalDeliveryChannel!= null)&&(!that.digitalDeliveryChannel.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsCertificationDocumentReference;
            lhsCertificationDocumentReference = (((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty()))?this.getCertificationDocumentReference():null);
            List<DocumentReferenceType> rhsCertificationDocumentReference;
            rhsCertificationDocumentReference = (((that.certificationDocumentReference!= null)&&(!that.certificationDocumentReference.isEmpty()))?that.getCertificationDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificationDocumentReference", lhsCertificationDocumentReference), LocatorUtils.property(thatLocator, "certificationDocumentReference", rhsCertificationDocumentReference), lhsCertificationDocumentReference, rhsCertificationDocumentReference, ((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty())), ((that.certificationDocumentReference!= null)&&(!that.certificationDocumentReference.isEmpty())))) {
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
            CustomizationIDType theCustomizationID;
            theCustomizationID = this.getCustomizationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customizationID", theCustomizationID), currentHashCode, theCustomizationID, (this.customizationID!= null));
        }
        {
            List<DocumentMetadataType> theDigitalDocumentMetadata;
            theDigitalDocumentMetadata = (((this.digitalDocumentMetadata!= null)&&(!this.digitalDocumentMetadata.isEmpty()))?this.getDigitalDocumentMetadata():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digitalDocumentMetadata", theDigitalDocumentMetadata), currentHashCode, theDigitalDocumentMetadata, ((this.digitalDocumentMetadata!= null)&&(!this.digitalDocumentMetadata.isEmpty())));
        }
        {
            List<DeliveryChannelType> theDigitalDeliveryChannel;
            theDigitalDeliveryChannel = (((this.digitalDeliveryChannel!= null)&&(!this.digitalDeliveryChannel.isEmpty()))?this.getDigitalDeliveryChannel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digitalDeliveryChannel", theDigitalDeliveryChannel), currentHashCode, theDigitalDeliveryChannel, ((this.digitalDeliveryChannel!= null)&&(!this.digitalDeliveryChannel.isEmpty())));
        }
        {
            List<DocumentReferenceType> theCertificationDocumentReference;
            theCertificationDocumentReference = (((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty()))?this.getCertificationDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificationDocumentReference", theCertificationDocumentReference), currentHashCode, theCertificationDocumentReference, ((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
