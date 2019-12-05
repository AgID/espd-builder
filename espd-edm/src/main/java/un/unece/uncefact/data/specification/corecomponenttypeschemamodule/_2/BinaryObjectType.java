//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.GraphicType;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.PictureType;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.SoundType;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.VideoType;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000002&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CCT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Binary Object. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A set of finite-length sequences of binary octets.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Binary Object&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;binary&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per BinaryObjectType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BinaryObjectType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mimeCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="encodingCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="characterSetCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="filename" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryObjectType", propOrder = {
    "value"
})
@XmlSeeAlso({
    oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.BinaryObjectType.class,
    GraphicType.class,
    PictureType.class,
    SoundType.class,
    VideoType.class
})
public class BinaryObjectType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "mimeCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mimeCode;
    @XmlAttribute(name = "encodingCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String encodingCode;
    @XmlAttribute(name = "characterSetCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String characterSetCode;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "filename")
    protected String filename;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Imposta il valore della proprietà format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Recupera il valore della proprietà mimeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * Imposta il valore della proprietà mimeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeCode(String value) {
        this.mimeCode = value;
    }

    /**
     * Recupera il valore della proprietà encodingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingCode() {
        return encodingCode;
    }

    /**
     * Imposta il valore della proprietà encodingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingCode(String value) {
        this.encodingCode = value;
    }

    /**
     * Recupera il valore della proprietà characterSetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Imposta il valore della proprietà characterSetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSetCode(String value) {
        this.characterSetCode = value;
    }

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Imposta il valore della proprietà uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Recupera il valore della proprietà filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Imposta il valore della proprietà filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
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
            byte[] theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            strategy.appendField(locator, this, "format", buffer, theFormat, (this.format!= null));
        }
        {
            String theMimeCode;
            theMimeCode = this.getMimeCode();
            strategy.appendField(locator, this, "mimeCode", buffer, theMimeCode, (this.mimeCode!= null));
        }
        {
            String theEncodingCode;
            theEncodingCode = this.getEncodingCode();
            strategy.appendField(locator, this, "encodingCode", buffer, theEncodingCode, (this.encodingCode!= null));
        }
        {
            String theCharacterSetCode;
            theCharacterSetCode = this.getCharacterSetCode();
            strategy.appendField(locator, this, "characterSetCode", buffer, theCharacterSetCode, (this.characterSetCode!= null));
        }
        {
            String theUri;
            theUri = this.getUri();
            strategy.appendField(locator, this, "uri", buffer, theUri, (this.uri!= null));
        }
        {
            String theFilename;
            theFilename = this.getFilename();
            strategy.appendField(locator, this, "filename", buffer, theFilename, (this.filename!= null));
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
        final BinaryObjectType that = ((BinaryObjectType) object);
        {
            byte[] lhsValue;
            lhsValue = this.getValue();
            byte[] rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            String lhsFormat;
            lhsFormat = this.getFormat();
            String rhsFormat;
            rhsFormat = that.getFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "format", lhsFormat), LocatorUtils.property(thatLocator, "format", rhsFormat), lhsFormat, rhsFormat, (this.format!= null), (that.format!= null))) {
                return false;
            }
        }
        {
            String lhsMimeCode;
            lhsMimeCode = this.getMimeCode();
            String rhsMimeCode;
            rhsMimeCode = that.getMimeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimeCode", lhsMimeCode), LocatorUtils.property(thatLocator, "mimeCode", rhsMimeCode), lhsMimeCode, rhsMimeCode, (this.mimeCode!= null), (that.mimeCode!= null))) {
                return false;
            }
        }
        {
            String lhsEncodingCode;
            lhsEncodingCode = this.getEncodingCode();
            String rhsEncodingCode;
            rhsEncodingCode = that.getEncodingCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encodingCode", lhsEncodingCode), LocatorUtils.property(thatLocator, "encodingCode", rhsEncodingCode), lhsEncodingCode, rhsEncodingCode, (this.encodingCode!= null), (that.encodingCode!= null))) {
                return false;
            }
        }
        {
            String lhsCharacterSetCode;
            lhsCharacterSetCode = this.getCharacterSetCode();
            String rhsCharacterSetCode;
            rhsCharacterSetCode = that.getCharacterSetCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characterSetCode", lhsCharacterSetCode), LocatorUtils.property(thatLocator, "characterSetCode", rhsCharacterSetCode), lhsCharacterSetCode, rhsCharacterSetCode, (this.characterSetCode!= null), (that.characterSetCode!= null))) {
                return false;
            }
        }
        {
            String lhsUri;
            lhsUri = this.getUri();
            String rhsUri;
            rhsUri = that.getUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsUri), LocatorUtils.property(thatLocator, "uri", rhsUri), lhsUri, rhsUri, (this.uri!= null), (that.uri!= null))) {
                return false;
            }
        }
        {
            String lhsFilename;
            lhsFilename = this.getFilename();
            String rhsFilename;
            rhsFilename = that.getFilename();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filename", lhsFilename), LocatorUtils.property(thatLocator, "filename", rhsFilename), lhsFilename, rhsFilename, (this.filename!= null), (that.filename!= null))) {
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
            byte[] theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "format", theFormat), currentHashCode, theFormat, (this.format!= null));
        }
        {
            String theMimeCode;
            theMimeCode = this.getMimeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimeCode", theMimeCode), currentHashCode, theMimeCode, (this.mimeCode!= null));
        }
        {
            String theEncodingCode;
            theEncodingCode = this.getEncodingCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encodingCode", theEncodingCode), currentHashCode, theEncodingCode, (this.encodingCode!= null));
        }
        {
            String theCharacterSetCode;
            theCharacterSetCode = this.getCharacterSetCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "characterSetCode", theCharacterSetCode), currentHashCode, theCharacterSetCode, (this.characterSetCode!= null));
        }
        {
            String theUri;
            theUri = this.getUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theUri), currentHashCode, theUri, (this.uri!= null));
        }
        {
            String theFilename;
            theFilename = this.getFilename();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filename", theFilename), currentHashCode, theFilename, (this.filename!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
