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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CharacterSetCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentHashType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EncodingCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpiryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpiryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FileNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FormatCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HashAlgorithmMethodType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MimeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.URIType;
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
 * <p>Classe Java per ExternalReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}URI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentHash" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HashAlgorithmMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MimeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EncodingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CharacterSetCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FileName" minOccurs="0"/&gt;
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
@XmlType(name = "ExternalReferenceType", propOrder = {
    "uri",
    "documentHash",
    "hashAlgorithmMethod",
    "expiryDate",
    "expiryTime",
    "mimeCode",
    "formatCode",
    "encodingCode",
    "characterSetCode",
    "fileName",
    "description"
})
public class ExternalReferenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "URI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected URIType uri;
    @XmlElement(name = "DocumentHash", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentHashType documentHash;
    @XmlElement(name = "HashAlgorithmMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HashAlgorithmMethodType hashAlgorithmMethod;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpiryDateType expiryDate;
    @XmlElement(name = "ExpiryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpiryTimeType expiryTime;
    @XmlElement(name = "MimeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MimeCodeType mimeCode;
    @XmlElement(name = "FormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FormatCodeType formatCode;
    @XmlElement(name = "EncodingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EncodingCodeType encodingCode;
    @XmlElement(name = "CharacterSetCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CharacterSetCodeType characterSetCode;
    @XmlElement(name = "FileName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FileNameType fileName;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link URIType }
     *     
     */
    public URIType getURI() {
        return uri;
    }

    /**
     * Imposta il valore della proprietà uri.
     * 
     * @param value
     *     allowed object is
     *     {@link URIType }
     *     
     */
    public void setURI(URIType value) {
        this.uri = value;
    }

    /**
     * Recupera il valore della proprietà documentHash.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHashType }
     *     
     */
    public DocumentHashType getDocumentHash() {
        return documentHash;
    }

    /**
     * Imposta il valore della proprietà documentHash.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHashType }
     *     
     */
    public void setDocumentHash(DocumentHashType value) {
        this.documentHash = value;
    }

    /**
     * Recupera il valore della proprietà hashAlgorithmMethod.
     * 
     * @return
     *     possible object is
     *     {@link HashAlgorithmMethodType }
     *     
     */
    public HashAlgorithmMethodType getHashAlgorithmMethod() {
        return hashAlgorithmMethod;
    }

    /**
     * Imposta il valore della proprietà hashAlgorithmMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link HashAlgorithmMethodType }
     *     
     */
    public void setHashAlgorithmMethod(HashAlgorithmMethodType value) {
        this.hashAlgorithmMethod = value;
    }

    /**
     * Recupera il valore della proprietà expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDateType }
     *     
     */
    public ExpiryDateType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Imposta il valore della proprietà expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDateType }
     *     
     */
    public void setExpiryDate(ExpiryDateType value) {
        this.expiryDate = value;
    }

    /**
     * Recupera il valore della proprietà expiryTime.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryTimeType }
     *     
     */
    public ExpiryTimeType getExpiryTime() {
        return expiryTime;
    }

    /**
     * Imposta il valore della proprietà expiryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryTimeType }
     *     
     */
    public void setExpiryTime(ExpiryTimeType value) {
        this.expiryTime = value;
    }

    /**
     * Recupera il valore della proprietà mimeCode.
     * 
     * @return
     *     possible object is
     *     {@link MimeCodeType }
     *     
     */
    public MimeCodeType getMimeCode() {
        return mimeCode;
    }

    /**
     * Imposta il valore della proprietà mimeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeCodeType }
     *     
     */
    public void setMimeCode(MimeCodeType value) {
        this.mimeCode = value;
    }

    /**
     * Recupera il valore della proprietà formatCode.
     * 
     * @return
     *     possible object is
     *     {@link FormatCodeType }
     *     
     */
    public FormatCodeType getFormatCode() {
        return formatCode;
    }

    /**
     * Imposta il valore della proprietà formatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatCodeType }
     *     
     */
    public void setFormatCode(FormatCodeType value) {
        this.formatCode = value;
    }

    /**
     * Recupera il valore della proprietà encodingCode.
     * 
     * @return
     *     possible object is
     *     {@link EncodingCodeType }
     *     
     */
    public EncodingCodeType getEncodingCode() {
        return encodingCode;
    }

    /**
     * Imposta il valore della proprietà encodingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodingCodeType }
     *     
     */
    public void setEncodingCode(EncodingCodeType value) {
        this.encodingCode = value;
    }

    /**
     * Recupera il valore della proprietà characterSetCode.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSetCodeType }
     *     
     */
    public CharacterSetCodeType getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Imposta il valore della proprietà characterSetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSetCodeType }
     *     
     */
    public void setCharacterSetCode(CharacterSetCodeType value) {
        this.characterSetCode = value;
    }

    /**
     * Recupera il valore della proprietà fileName.
     * 
     * @return
     *     possible object is
     *     {@link FileNameType }
     *     
     */
    public FileNameType getFileName() {
        return fileName;
    }

    /**
     * Imposta il valore della proprietà fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link FileNameType }
     *     
     */
    public void setFileName(FileNameType value) {
        this.fileName = value;
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
            URIType theURI;
            theURI = this.getURI();
            strategy.appendField(locator, this, "uri", buffer, theURI, (this.uri!= null));
        }
        {
            DocumentHashType theDocumentHash;
            theDocumentHash = this.getDocumentHash();
            strategy.appendField(locator, this, "documentHash", buffer, theDocumentHash, (this.documentHash!= null));
        }
        {
            HashAlgorithmMethodType theHashAlgorithmMethod;
            theHashAlgorithmMethod = this.getHashAlgorithmMethod();
            strategy.appendField(locator, this, "hashAlgorithmMethod", buffer, theHashAlgorithmMethod, (this.hashAlgorithmMethod!= null));
        }
        {
            ExpiryDateType theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            strategy.appendField(locator, this, "expiryDate", buffer, theExpiryDate, (this.expiryDate!= null));
        }
        {
            ExpiryTimeType theExpiryTime;
            theExpiryTime = this.getExpiryTime();
            strategy.appendField(locator, this, "expiryTime", buffer, theExpiryTime, (this.expiryTime!= null));
        }
        {
            MimeCodeType theMimeCode;
            theMimeCode = this.getMimeCode();
            strategy.appendField(locator, this, "mimeCode", buffer, theMimeCode, (this.mimeCode!= null));
        }
        {
            FormatCodeType theFormatCode;
            theFormatCode = this.getFormatCode();
            strategy.appendField(locator, this, "formatCode", buffer, theFormatCode, (this.formatCode!= null));
        }
        {
            EncodingCodeType theEncodingCode;
            theEncodingCode = this.getEncodingCode();
            strategy.appendField(locator, this, "encodingCode", buffer, theEncodingCode, (this.encodingCode!= null));
        }
        {
            CharacterSetCodeType theCharacterSetCode;
            theCharacterSetCode = this.getCharacterSetCode();
            strategy.appendField(locator, this, "characterSetCode", buffer, theCharacterSetCode, (this.characterSetCode!= null));
        }
        {
            FileNameType theFileName;
            theFileName = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theFileName, (this.fileName!= null));
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
        final ExternalReferenceType that = ((ExternalReferenceType) object);
        {
            URIType lhsURI;
            lhsURI = this.getURI();
            URIType rhsURI;
            rhsURI = that.getURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsURI), LocatorUtils.property(thatLocator, "uri", rhsURI), lhsURI, rhsURI, (this.uri!= null), (that.uri!= null))) {
                return false;
            }
        }
        {
            DocumentHashType lhsDocumentHash;
            lhsDocumentHash = this.getDocumentHash();
            DocumentHashType rhsDocumentHash;
            rhsDocumentHash = that.getDocumentHash();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentHash", lhsDocumentHash), LocatorUtils.property(thatLocator, "documentHash", rhsDocumentHash), lhsDocumentHash, rhsDocumentHash, (this.documentHash!= null), (that.documentHash!= null))) {
                return false;
            }
        }
        {
            HashAlgorithmMethodType lhsHashAlgorithmMethod;
            lhsHashAlgorithmMethod = this.getHashAlgorithmMethod();
            HashAlgorithmMethodType rhsHashAlgorithmMethod;
            rhsHashAlgorithmMethod = that.getHashAlgorithmMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hashAlgorithmMethod", lhsHashAlgorithmMethod), LocatorUtils.property(thatLocator, "hashAlgorithmMethod", rhsHashAlgorithmMethod), lhsHashAlgorithmMethod, rhsHashAlgorithmMethod, (this.hashAlgorithmMethod!= null), (that.hashAlgorithmMethod!= null))) {
                return false;
            }
        }
        {
            ExpiryDateType lhsExpiryDate;
            lhsExpiryDate = this.getExpiryDate();
            ExpiryDateType rhsExpiryDate;
            rhsExpiryDate = that.getExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiryDate", lhsExpiryDate), LocatorUtils.property(thatLocator, "expiryDate", rhsExpiryDate), lhsExpiryDate, rhsExpiryDate, (this.expiryDate!= null), (that.expiryDate!= null))) {
                return false;
            }
        }
        {
            ExpiryTimeType lhsExpiryTime;
            lhsExpiryTime = this.getExpiryTime();
            ExpiryTimeType rhsExpiryTime;
            rhsExpiryTime = that.getExpiryTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiryTime", lhsExpiryTime), LocatorUtils.property(thatLocator, "expiryTime", rhsExpiryTime), lhsExpiryTime, rhsExpiryTime, (this.expiryTime!= null), (that.expiryTime!= null))) {
                return false;
            }
        }
        {
            MimeCodeType lhsMimeCode;
            lhsMimeCode = this.getMimeCode();
            MimeCodeType rhsMimeCode;
            rhsMimeCode = that.getMimeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimeCode", lhsMimeCode), LocatorUtils.property(thatLocator, "mimeCode", rhsMimeCode), lhsMimeCode, rhsMimeCode, (this.mimeCode!= null), (that.mimeCode!= null))) {
                return false;
            }
        }
        {
            FormatCodeType lhsFormatCode;
            lhsFormatCode = this.getFormatCode();
            FormatCodeType rhsFormatCode;
            rhsFormatCode = that.getFormatCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formatCode", lhsFormatCode), LocatorUtils.property(thatLocator, "formatCode", rhsFormatCode), lhsFormatCode, rhsFormatCode, (this.formatCode!= null), (that.formatCode!= null))) {
                return false;
            }
        }
        {
            EncodingCodeType lhsEncodingCode;
            lhsEncodingCode = this.getEncodingCode();
            EncodingCodeType rhsEncodingCode;
            rhsEncodingCode = that.getEncodingCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encodingCode", lhsEncodingCode), LocatorUtils.property(thatLocator, "encodingCode", rhsEncodingCode), lhsEncodingCode, rhsEncodingCode, (this.encodingCode!= null), (that.encodingCode!= null))) {
                return false;
            }
        }
        {
            CharacterSetCodeType lhsCharacterSetCode;
            lhsCharacterSetCode = this.getCharacterSetCode();
            CharacterSetCodeType rhsCharacterSetCode;
            rhsCharacterSetCode = that.getCharacterSetCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characterSetCode", lhsCharacterSetCode), LocatorUtils.property(thatLocator, "characterSetCode", rhsCharacterSetCode), lhsCharacterSetCode, rhsCharacterSetCode, (this.characterSetCode!= null), (that.characterSetCode!= null))) {
                return false;
            }
        }
        {
            FileNameType lhsFileName;
            lhsFileName = this.getFileName();
            FileNameType rhsFileName;
            rhsFileName = that.getFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileName", lhsFileName), LocatorUtils.property(thatLocator, "fileName", rhsFileName), lhsFileName, rhsFileName, (this.fileName!= null), (that.fileName!= null))) {
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
            URIType theURI;
            theURI = this.getURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theURI), currentHashCode, theURI, (this.uri!= null));
        }
        {
            DocumentHashType theDocumentHash;
            theDocumentHash = this.getDocumentHash();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentHash", theDocumentHash), currentHashCode, theDocumentHash, (this.documentHash!= null));
        }
        {
            HashAlgorithmMethodType theHashAlgorithmMethod;
            theHashAlgorithmMethod = this.getHashAlgorithmMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hashAlgorithmMethod", theHashAlgorithmMethod), currentHashCode, theHashAlgorithmMethod, (this.hashAlgorithmMethod!= null));
        }
        {
            ExpiryDateType theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiryDate", theExpiryDate), currentHashCode, theExpiryDate, (this.expiryDate!= null));
        }
        {
            ExpiryTimeType theExpiryTime;
            theExpiryTime = this.getExpiryTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiryTime", theExpiryTime), currentHashCode, theExpiryTime, (this.expiryTime!= null));
        }
        {
            MimeCodeType theMimeCode;
            theMimeCode = this.getMimeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimeCode", theMimeCode), currentHashCode, theMimeCode, (this.mimeCode!= null));
        }
        {
            FormatCodeType theFormatCode;
            theFormatCode = this.getFormatCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formatCode", theFormatCode), currentHashCode, theFormatCode, (this.formatCode!= null));
        }
        {
            EncodingCodeType theEncodingCode;
            theEncodingCode = this.getEncodingCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encodingCode", theEncodingCode), currentHashCode, theEncodingCode, (this.encodingCode!= null));
        }
        {
            CharacterSetCodeType theCharacterSetCode;
            theCharacterSetCode = this.getCharacterSetCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "characterSetCode", theCharacterSetCode), currentHashCode, theCharacterSetCode, (this.characterSetCode!= null));
        }
        {
            FileNameType theFileName;
            theFileName = this.getFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileName", theFileName), currentHashCode, theFileName, (this.fileName!= null));
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
