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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmbeddedDocumentBinaryObjectType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmbeddedDocumentType;
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
 * <p>Classe Java per AttachmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmbeddedDocumentBinaryObject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmbeddedDocument" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExternalReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "embeddedDocumentBinaryObject",
    "embeddedDocument",
    "externalReference"
})
public class AttachmentType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "EmbeddedDocumentBinaryObject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmbeddedDocumentBinaryObjectType embeddedDocumentBinaryObject;
    @XmlElement(name = "EmbeddedDocument", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmbeddedDocumentType embeddedDocument;
    @XmlElement(name = "ExternalReference")
    protected ExternalReferenceType externalReference;

    /**
     * Recupera il valore della proprietà embeddedDocumentBinaryObject.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedDocumentBinaryObjectType }
     *     
     */
    public EmbeddedDocumentBinaryObjectType getEmbeddedDocumentBinaryObject() {
        return embeddedDocumentBinaryObject;
    }

    /**
     * Imposta il valore della proprietà embeddedDocumentBinaryObject.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedDocumentBinaryObjectType }
     *     
     */
    public void setEmbeddedDocumentBinaryObject(EmbeddedDocumentBinaryObjectType value) {
        this.embeddedDocumentBinaryObject = value;
    }

    /**
     * Recupera il valore della proprietà embeddedDocument.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedDocumentType }
     *     
     */
    public EmbeddedDocumentType getEmbeddedDocument() {
        return embeddedDocument;
    }

    /**
     * Imposta il valore della proprietà embeddedDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedDocumentType }
     *     
     */
    public void setEmbeddedDocument(EmbeddedDocumentType value) {
        this.embeddedDocument = value;
    }

    /**
     * Recupera il valore della proprietà externalReference.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReferenceType }
     *     
     */
    public ExternalReferenceType getExternalReference() {
        return externalReference;
    }

    /**
     * Imposta il valore della proprietà externalReference.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReferenceType }
     *     
     */
    public void setExternalReference(ExternalReferenceType value) {
        this.externalReference = value;
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
            EmbeddedDocumentBinaryObjectType theEmbeddedDocumentBinaryObject;
            theEmbeddedDocumentBinaryObject = this.getEmbeddedDocumentBinaryObject();
            strategy.appendField(locator, this, "embeddedDocumentBinaryObject", buffer, theEmbeddedDocumentBinaryObject, (this.embeddedDocumentBinaryObject!= null));
        }
        {
            EmbeddedDocumentType theEmbeddedDocument;
            theEmbeddedDocument = this.getEmbeddedDocument();
            strategy.appendField(locator, this, "embeddedDocument", buffer, theEmbeddedDocument, (this.embeddedDocument!= null));
        }
        {
            ExternalReferenceType theExternalReference;
            theExternalReference = this.getExternalReference();
            strategy.appendField(locator, this, "externalReference", buffer, theExternalReference, (this.externalReference!= null));
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
        final AttachmentType that = ((AttachmentType) object);
        {
            EmbeddedDocumentBinaryObjectType lhsEmbeddedDocumentBinaryObject;
            lhsEmbeddedDocumentBinaryObject = this.getEmbeddedDocumentBinaryObject();
            EmbeddedDocumentBinaryObjectType rhsEmbeddedDocumentBinaryObject;
            rhsEmbeddedDocumentBinaryObject = that.getEmbeddedDocumentBinaryObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "embeddedDocumentBinaryObject", lhsEmbeddedDocumentBinaryObject), LocatorUtils.property(thatLocator, "embeddedDocumentBinaryObject", rhsEmbeddedDocumentBinaryObject), lhsEmbeddedDocumentBinaryObject, rhsEmbeddedDocumentBinaryObject, (this.embeddedDocumentBinaryObject!= null), (that.embeddedDocumentBinaryObject!= null))) {
                return false;
            }
        }
        {
            EmbeddedDocumentType lhsEmbeddedDocument;
            lhsEmbeddedDocument = this.getEmbeddedDocument();
            EmbeddedDocumentType rhsEmbeddedDocument;
            rhsEmbeddedDocument = that.getEmbeddedDocument();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "embeddedDocument", lhsEmbeddedDocument), LocatorUtils.property(thatLocator, "embeddedDocument", rhsEmbeddedDocument), lhsEmbeddedDocument, rhsEmbeddedDocument, (this.embeddedDocument!= null), (that.embeddedDocument!= null))) {
                return false;
            }
        }
        {
            ExternalReferenceType lhsExternalReference;
            lhsExternalReference = this.getExternalReference();
            ExternalReferenceType rhsExternalReference;
            rhsExternalReference = that.getExternalReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalReference", lhsExternalReference), LocatorUtils.property(thatLocator, "externalReference", rhsExternalReference), lhsExternalReference, rhsExternalReference, (this.externalReference!= null), (that.externalReference!= null))) {
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
            EmbeddedDocumentBinaryObjectType theEmbeddedDocumentBinaryObject;
            theEmbeddedDocumentBinaryObject = this.getEmbeddedDocumentBinaryObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "embeddedDocumentBinaryObject", theEmbeddedDocumentBinaryObject), currentHashCode, theEmbeddedDocumentBinaryObject, (this.embeddedDocumentBinaryObject!= null));
        }
        {
            EmbeddedDocumentType theEmbeddedDocument;
            theEmbeddedDocument = this.getEmbeddedDocument();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "embeddedDocument", theEmbeddedDocument), currentHashCode, theEmbeddedDocument, (this.embeddedDocument!= null));
        }
        {
            ExternalReferenceType theExternalReference;
            theExternalReference = this.getExternalReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "externalReference", theExternalReference), currentHashCode, theExternalReference, (this.externalReference!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
