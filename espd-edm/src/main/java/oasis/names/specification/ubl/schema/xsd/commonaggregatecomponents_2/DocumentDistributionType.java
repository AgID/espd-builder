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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumCopiesNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumOriginalsNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrintQualifierType;
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
 * <p>Classe Java per DocumentDistributionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrintQualifier"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumCopiesNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOriginalsNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentDistributionType", propOrder = {
    "documentTypeCode",
    "printQualifier",
    "maximumCopiesNumeric",
    "maximumOriginalsNumeric",
    "party"
})
public class DocumentDistributionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentTypeCodeType documentTypeCode;
    @XmlElement(name = "PrintQualifier", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PrintQualifierType printQualifier;
    @XmlElement(name = "MaximumCopiesNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumCopiesNumericType maximumCopiesNumeric;
    @XmlElement(name = "MaximumOriginalsNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumOriginalsNumericType maximumOriginalsNumeric;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;

    /**
     * Recupera il valore della proprietà documentTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeCodeType }
     *     
     */
    public DocumentTypeCodeType getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Imposta il valore della proprietà documentTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeCodeType }
     *     
     */
    public void setDocumentTypeCode(DocumentTypeCodeType value) {
        this.documentTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà printQualifier.
     * 
     * @return
     *     possible object is
     *     {@link PrintQualifierType }
     *     
     */
    public PrintQualifierType getPrintQualifier() {
        return printQualifier;
    }

    /**
     * Imposta il valore della proprietà printQualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintQualifierType }
     *     
     */
    public void setPrintQualifier(PrintQualifierType value) {
        this.printQualifier = value;
    }

    /**
     * Recupera il valore della proprietà maximumCopiesNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumCopiesNumericType }
     *     
     */
    public MaximumCopiesNumericType getMaximumCopiesNumeric() {
        return maximumCopiesNumeric;
    }

    /**
     * Imposta il valore della proprietà maximumCopiesNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumCopiesNumericType }
     *     
     */
    public void setMaximumCopiesNumeric(MaximumCopiesNumericType value) {
        this.maximumCopiesNumeric = value;
    }

    /**
     * Recupera il valore della proprietà maximumOriginalsNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOriginalsNumericType }
     *     
     */
    public MaximumOriginalsNumericType getMaximumOriginalsNumeric() {
        return maximumOriginalsNumeric;
    }

    /**
     * Imposta il valore della proprietà maximumOriginalsNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOriginalsNumericType }
     *     
     */
    public void setMaximumOriginalsNumeric(MaximumOriginalsNumericType value) {
        this.maximumOriginalsNumeric = value;
    }

    /**
     * Recupera il valore della proprietà party.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Imposta il valore della proprietà party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
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
            DocumentTypeCodeType theDocumentTypeCode;
            theDocumentTypeCode = this.getDocumentTypeCode();
            strategy.appendField(locator, this, "documentTypeCode", buffer, theDocumentTypeCode, (this.documentTypeCode!= null));
        }
        {
            PrintQualifierType thePrintQualifier;
            thePrintQualifier = this.getPrintQualifier();
            strategy.appendField(locator, this, "printQualifier", buffer, thePrintQualifier, (this.printQualifier!= null));
        }
        {
            MaximumCopiesNumericType theMaximumCopiesNumeric;
            theMaximumCopiesNumeric = this.getMaximumCopiesNumeric();
            strategy.appendField(locator, this, "maximumCopiesNumeric", buffer, theMaximumCopiesNumeric, (this.maximumCopiesNumeric!= null));
        }
        {
            MaximumOriginalsNumericType theMaximumOriginalsNumeric;
            theMaximumOriginalsNumeric = this.getMaximumOriginalsNumeric();
            strategy.appendField(locator, this, "maximumOriginalsNumeric", buffer, theMaximumOriginalsNumeric, (this.maximumOriginalsNumeric!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty, (this.party!= null));
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
        final DocumentDistributionType that = ((DocumentDistributionType) object);
        {
            DocumentTypeCodeType lhsDocumentTypeCode;
            lhsDocumentTypeCode = this.getDocumentTypeCode();
            DocumentTypeCodeType rhsDocumentTypeCode;
            rhsDocumentTypeCode = that.getDocumentTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentTypeCode", lhsDocumentTypeCode), LocatorUtils.property(thatLocator, "documentTypeCode", rhsDocumentTypeCode), lhsDocumentTypeCode, rhsDocumentTypeCode, (this.documentTypeCode!= null), (that.documentTypeCode!= null))) {
                return false;
            }
        }
        {
            PrintQualifierType lhsPrintQualifier;
            lhsPrintQualifier = this.getPrintQualifier();
            PrintQualifierType rhsPrintQualifier;
            rhsPrintQualifier = that.getPrintQualifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "printQualifier", lhsPrintQualifier), LocatorUtils.property(thatLocator, "printQualifier", rhsPrintQualifier), lhsPrintQualifier, rhsPrintQualifier, (this.printQualifier!= null), (that.printQualifier!= null))) {
                return false;
            }
        }
        {
            MaximumCopiesNumericType lhsMaximumCopiesNumeric;
            lhsMaximumCopiesNumeric = this.getMaximumCopiesNumeric();
            MaximumCopiesNumericType rhsMaximumCopiesNumeric;
            rhsMaximumCopiesNumeric = that.getMaximumCopiesNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumCopiesNumeric", lhsMaximumCopiesNumeric), LocatorUtils.property(thatLocator, "maximumCopiesNumeric", rhsMaximumCopiesNumeric), lhsMaximumCopiesNumeric, rhsMaximumCopiesNumeric, (this.maximumCopiesNumeric!= null), (that.maximumCopiesNumeric!= null))) {
                return false;
            }
        }
        {
            MaximumOriginalsNumericType lhsMaximumOriginalsNumeric;
            lhsMaximumOriginalsNumeric = this.getMaximumOriginalsNumeric();
            MaximumOriginalsNumericType rhsMaximumOriginalsNumeric;
            rhsMaximumOriginalsNumeric = that.getMaximumOriginalsNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumOriginalsNumeric", lhsMaximumOriginalsNumeric), LocatorUtils.property(thatLocator, "maximumOriginalsNumeric", rhsMaximumOriginalsNumeric), lhsMaximumOriginalsNumeric, rhsMaximumOriginalsNumeric, (this.maximumOriginalsNumeric!= null), (that.maximumOriginalsNumeric!= null))) {
                return false;
            }
        }
        {
            PartyType lhsParty;
            lhsParty = this.getParty();
            PartyType rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty, (this.party!= null), (that.party!= null))) {
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
            DocumentTypeCodeType theDocumentTypeCode;
            theDocumentTypeCode = this.getDocumentTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentTypeCode", theDocumentTypeCode), currentHashCode, theDocumentTypeCode, (this.documentTypeCode!= null));
        }
        {
            PrintQualifierType thePrintQualifier;
            thePrintQualifier = this.getPrintQualifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "printQualifier", thePrintQualifier), currentHashCode, thePrintQualifier, (this.printQualifier!= null));
        }
        {
            MaximumCopiesNumericType theMaximumCopiesNumeric;
            theMaximumCopiesNumeric = this.getMaximumCopiesNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumCopiesNumeric", theMaximumCopiesNumeric), currentHashCode, theMaximumCopiesNumeric, (this.maximumCopiesNumeric!= null));
        }
        {
            MaximumOriginalsNumericType theMaximumOriginalsNumeric;
            theMaximumOriginalsNumeric = this.getMaximumOriginalsNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumOriginalsNumeric", theMaximumOriginalsNumeric), currentHashCode, theMaximumOriginalsNumeric, (this.maximumOriginalsNumeric!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty, (this.party!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
