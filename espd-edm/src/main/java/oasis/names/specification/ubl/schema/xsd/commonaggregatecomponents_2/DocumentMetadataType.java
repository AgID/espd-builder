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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FormatIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SchemaURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VersionIDType;
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
 * <p>Classe Java per DocumentMetadataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FormatID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SchemaURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentMetadataType", propOrder = {
    "id",
    "formatID",
    "versionID",
    "schemaURI",
    "documentTypeCode"
})
public class DocumentMetadataType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "FormatID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected FormatIDType formatID;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected VersionIDType versionID;
    @XmlElement(name = "SchemaURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SchemaURIType schemaURI;
    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentTypeCodeType documentTypeCode;

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
     * Recupera il valore della proprietà formatID.
     * 
     * @return
     *     possible object is
     *     {@link FormatIDType }
     *     
     */
    public FormatIDType getFormatID() {
        return formatID;
    }

    /**
     * Imposta il valore della proprietà formatID.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatIDType }
     *     
     */
    public void setFormatID(FormatIDType value) {
        this.formatID = value;
    }

    /**
     * Recupera il valore della proprietà versionID.
     * 
     * @return
     *     possible object is
     *     {@link VersionIDType }
     *     
     */
    public VersionIDType getVersionID() {
        return versionID;
    }

    /**
     * Imposta il valore della proprietà versionID.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionIDType }
     *     
     */
    public void setVersionID(VersionIDType value) {
        this.versionID = value;
    }

    /**
     * Recupera il valore della proprietà schemaURI.
     * 
     * @return
     *     possible object is
     *     {@link SchemaURIType }
     *     
     */
    public SchemaURIType getSchemaURI() {
        return schemaURI;
    }

    /**
     * Imposta il valore della proprietà schemaURI.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaURIType }
     *     
     */
    public void setSchemaURI(SchemaURIType value) {
        this.schemaURI = value;
    }

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
            FormatIDType theFormatID;
            theFormatID = this.getFormatID();
            strategy.appendField(locator, this, "formatID", buffer, theFormatID, (this.formatID!= null));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            strategy.appendField(locator, this, "versionID", buffer, theVersionID, (this.versionID!= null));
        }
        {
            SchemaURIType theSchemaURI;
            theSchemaURI = this.getSchemaURI();
            strategy.appendField(locator, this, "schemaURI", buffer, theSchemaURI, (this.schemaURI!= null));
        }
        {
            DocumentTypeCodeType theDocumentTypeCode;
            theDocumentTypeCode = this.getDocumentTypeCode();
            strategy.appendField(locator, this, "documentTypeCode", buffer, theDocumentTypeCode, (this.documentTypeCode!= null));
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
        final DocumentMetadataType that = ((DocumentMetadataType) object);
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
            FormatIDType lhsFormatID;
            lhsFormatID = this.getFormatID();
            FormatIDType rhsFormatID;
            rhsFormatID = that.getFormatID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formatID", lhsFormatID), LocatorUtils.property(thatLocator, "formatID", rhsFormatID), lhsFormatID, rhsFormatID, (this.formatID!= null), (that.formatID!= null))) {
                return false;
            }
        }
        {
            VersionIDType lhsVersionID;
            lhsVersionID = this.getVersionID();
            VersionIDType rhsVersionID;
            rhsVersionID = that.getVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionID", lhsVersionID), LocatorUtils.property(thatLocator, "versionID", rhsVersionID), lhsVersionID, rhsVersionID, (this.versionID!= null), (that.versionID!= null))) {
                return false;
            }
        }
        {
            SchemaURIType lhsSchemaURI;
            lhsSchemaURI = this.getSchemaURI();
            SchemaURIType rhsSchemaURI;
            rhsSchemaURI = that.getSchemaURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaURI", lhsSchemaURI), LocatorUtils.property(thatLocator, "schemaURI", rhsSchemaURI), lhsSchemaURI, rhsSchemaURI, (this.schemaURI!= null), (that.schemaURI!= null))) {
                return false;
            }
        }
        {
            DocumentTypeCodeType lhsDocumentTypeCode;
            lhsDocumentTypeCode = this.getDocumentTypeCode();
            DocumentTypeCodeType rhsDocumentTypeCode;
            rhsDocumentTypeCode = that.getDocumentTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentTypeCode", lhsDocumentTypeCode), LocatorUtils.property(thatLocator, "documentTypeCode", rhsDocumentTypeCode), lhsDocumentTypeCode, rhsDocumentTypeCode, (this.documentTypeCode!= null), (that.documentTypeCode!= null))) {
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
            FormatIDType theFormatID;
            theFormatID = this.getFormatID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formatID", theFormatID), currentHashCode, theFormatID, (this.formatID!= null));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionID", theVersionID), currentHashCode, theVersionID, (this.versionID!= null));
        }
        {
            SchemaURIType theSchemaURI;
            theSchemaURI = this.getSchemaURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaURI", theSchemaURI), currentHashCode, theSchemaURI, (this.schemaURI!= null));
        }
        {
            DocumentTypeCodeType theDocumentTypeCode;
            theDocumentTypeCode = this.getDocumentTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentTypeCode", theDocumentTypeCode), currentHashCode, theDocumentTypeCode, (this.documentTypeCode!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
