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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MessageFormatType;
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
 * <p>Classe Java per EncryptionDataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EncryptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MessageFormat"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EncryptionCertificateAttachment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EncryptionCertificatePathChain" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EncryptionSymmetricAlgorithm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionDataType", propOrder = {
    "messageFormat",
    "encryptionCertificateAttachment",
    "encryptionCertificatePathChain",
    "encryptionSymmetricAlgorithm"
})
public class EncryptionDataType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "MessageFormat", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected MessageFormatType messageFormat;
    @XmlElement(name = "EncryptionCertificateAttachment")
    protected AttachmentType encryptionCertificateAttachment;
    @XmlElement(name = "EncryptionCertificatePathChain")
    protected List<EncryptionCertificatePathChainType> encryptionCertificatePathChain;
    @XmlElement(name = "EncryptionSymmetricAlgorithm")
    protected List<EncryptionSymmetricAlgorithmType> encryptionSymmetricAlgorithm;

    /**
     * Recupera il valore della proprietà messageFormat.
     * 
     * @return
     *     possible object is
     *     {@link MessageFormatType }
     *     
     */
    public MessageFormatType getMessageFormat() {
        return messageFormat;
    }

    /**
     * Imposta il valore della proprietà messageFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFormatType }
     *     
     */
    public void setMessageFormat(MessageFormatType value) {
        this.messageFormat = value;
    }

    /**
     * Recupera il valore della proprietà encryptionCertificateAttachment.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getEncryptionCertificateAttachment() {
        return encryptionCertificateAttachment;
    }

    /**
     * Imposta il valore della proprietà encryptionCertificateAttachment.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setEncryptionCertificateAttachment(AttachmentType value) {
        this.encryptionCertificateAttachment = value;
    }

    /**
     * Gets the value of the encryptionCertificatePathChain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionCertificatePathChain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionCertificatePathChain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionCertificatePathChainType }
     * 
     * 
     */
    public List<EncryptionCertificatePathChainType> getEncryptionCertificatePathChain() {
        if (encryptionCertificatePathChain == null) {
            encryptionCertificatePathChain = new ArrayList<EncryptionCertificatePathChainType>();
        }
        return this.encryptionCertificatePathChain;
    }

    /**
     * Gets the value of the encryptionSymmetricAlgorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionSymmetricAlgorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionSymmetricAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionSymmetricAlgorithmType }
     * 
     * 
     */
    public List<EncryptionSymmetricAlgorithmType> getEncryptionSymmetricAlgorithm() {
        if (encryptionSymmetricAlgorithm == null) {
            encryptionSymmetricAlgorithm = new ArrayList<EncryptionSymmetricAlgorithmType>();
        }
        return this.encryptionSymmetricAlgorithm;
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
            MessageFormatType theMessageFormat;
            theMessageFormat = this.getMessageFormat();
            strategy.appendField(locator, this, "messageFormat", buffer, theMessageFormat, (this.messageFormat!= null));
        }
        {
            AttachmentType theEncryptionCertificateAttachment;
            theEncryptionCertificateAttachment = this.getEncryptionCertificateAttachment();
            strategy.appendField(locator, this, "encryptionCertificateAttachment", buffer, theEncryptionCertificateAttachment, (this.encryptionCertificateAttachment!= null));
        }
        {
            List<EncryptionCertificatePathChainType> theEncryptionCertificatePathChain;
            theEncryptionCertificatePathChain = (((this.encryptionCertificatePathChain!= null)&&(!this.encryptionCertificatePathChain.isEmpty()))?this.getEncryptionCertificatePathChain():null);
            strategy.appendField(locator, this, "encryptionCertificatePathChain", buffer, theEncryptionCertificatePathChain, ((this.encryptionCertificatePathChain!= null)&&(!this.encryptionCertificatePathChain.isEmpty())));
        }
        {
            List<EncryptionSymmetricAlgorithmType> theEncryptionSymmetricAlgorithm;
            theEncryptionSymmetricAlgorithm = (((this.encryptionSymmetricAlgorithm!= null)&&(!this.encryptionSymmetricAlgorithm.isEmpty()))?this.getEncryptionSymmetricAlgorithm():null);
            strategy.appendField(locator, this, "encryptionSymmetricAlgorithm", buffer, theEncryptionSymmetricAlgorithm, ((this.encryptionSymmetricAlgorithm!= null)&&(!this.encryptionSymmetricAlgorithm.isEmpty())));
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
        final EncryptionDataType that = ((EncryptionDataType) object);
        {
            MessageFormatType lhsMessageFormat;
            lhsMessageFormat = this.getMessageFormat();
            MessageFormatType rhsMessageFormat;
            rhsMessageFormat = that.getMessageFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageFormat", lhsMessageFormat), LocatorUtils.property(thatLocator, "messageFormat", rhsMessageFormat), lhsMessageFormat, rhsMessageFormat, (this.messageFormat!= null), (that.messageFormat!= null))) {
                return false;
            }
        }
        {
            AttachmentType lhsEncryptionCertificateAttachment;
            lhsEncryptionCertificateAttachment = this.getEncryptionCertificateAttachment();
            AttachmentType rhsEncryptionCertificateAttachment;
            rhsEncryptionCertificateAttachment = that.getEncryptionCertificateAttachment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encryptionCertificateAttachment", lhsEncryptionCertificateAttachment), LocatorUtils.property(thatLocator, "encryptionCertificateAttachment", rhsEncryptionCertificateAttachment), lhsEncryptionCertificateAttachment, rhsEncryptionCertificateAttachment, (this.encryptionCertificateAttachment!= null), (that.encryptionCertificateAttachment!= null))) {
                return false;
            }
        }
        {
            List<EncryptionCertificatePathChainType> lhsEncryptionCertificatePathChain;
            lhsEncryptionCertificatePathChain = (((this.encryptionCertificatePathChain!= null)&&(!this.encryptionCertificatePathChain.isEmpty()))?this.getEncryptionCertificatePathChain():null);
            List<EncryptionCertificatePathChainType> rhsEncryptionCertificatePathChain;
            rhsEncryptionCertificatePathChain = (((that.encryptionCertificatePathChain!= null)&&(!that.encryptionCertificatePathChain.isEmpty()))?that.getEncryptionCertificatePathChain():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encryptionCertificatePathChain", lhsEncryptionCertificatePathChain), LocatorUtils.property(thatLocator, "encryptionCertificatePathChain", rhsEncryptionCertificatePathChain), lhsEncryptionCertificatePathChain, rhsEncryptionCertificatePathChain, ((this.encryptionCertificatePathChain!= null)&&(!this.encryptionCertificatePathChain.isEmpty())), ((that.encryptionCertificatePathChain!= null)&&(!that.encryptionCertificatePathChain.isEmpty())))) {
                return false;
            }
        }
        {
            List<EncryptionSymmetricAlgorithmType> lhsEncryptionSymmetricAlgorithm;
            lhsEncryptionSymmetricAlgorithm = (((this.encryptionSymmetricAlgorithm!= null)&&(!this.encryptionSymmetricAlgorithm.isEmpty()))?this.getEncryptionSymmetricAlgorithm():null);
            List<EncryptionSymmetricAlgorithmType> rhsEncryptionSymmetricAlgorithm;
            rhsEncryptionSymmetricAlgorithm = (((that.encryptionSymmetricAlgorithm!= null)&&(!that.encryptionSymmetricAlgorithm.isEmpty()))?that.getEncryptionSymmetricAlgorithm():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encryptionSymmetricAlgorithm", lhsEncryptionSymmetricAlgorithm), LocatorUtils.property(thatLocator, "encryptionSymmetricAlgorithm", rhsEncryptionSymmetricAlgorithm), lhsEncryptionSymmetricAlgorithm, rhsEncryptionSymmetricAlgorithm, ((this.encryptionSymmetricAlgorithm!= null)&&(!this.encryptionSymmetricAlgorithm.isEmpty())), ((that.encryptionSymmetricAlgorithm!= null)&&(!that.encryptionSymmetricAlgorithm.isEmpty())))) {
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
            MessageFormatType theMessageFormat;
            theMessageFormat = this.getMessageFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageFormat", theMessageFormat), currentHashCode, theMessageFormat, (this.messageFormat!= null));
        }
        {
            AttachmentType theEncryptionCertificateAttachment;
            theEncryptionCertificateAttachment = this.getEncryptionCertificateAttachment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encryptionCertificateAttachment", theEncryptionCertificateAttachment), currentHashCode, theEncryptionCertificateAttachment, (this.encryptionCertificateAttachment!= null));
        }
        {
            List<EncryptionCertificatePathChainType> theEncryptionCertificatePathChain;
            theEncryptionCertificatePathChain = (((this.encryptionCertificatePathChain!= null)&&(!this.encryptionCertificatePathChain.isEmpty()))?this.getEncryptionCertificatePathChain():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encryptionCertificatePathChain", theEncryptionCertificatePathChain), currentHashCode, theEncryptionCertificatePathChain, ((this.encryptionCertificatePathChain!= null)&&(!this.encryptionCertificatePathChain.isEmpty())));
        }
        {
            List<EncryptionSymmetricAlgorithmType> theEncryptionSymmetricAlgorithm;
            theEncryptionSymmetricAlgorithm = (((this.encryptionSymmetricAlgorithm!= null)&&(!this.encryptionSymmetricAlgorithm.isEmpty()))?this.getEncryptionSymmetricAlgorithm():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encryptionSymmetricAlgorithm", theEncryptionSymmetricAlgorithm), currentHashCode, theEncryptionSymmetricAlgorithm, ((this.encryptionSymmetricAlgorithm!= null)&&(!this.encryptionSymmetricAlgorithm.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
