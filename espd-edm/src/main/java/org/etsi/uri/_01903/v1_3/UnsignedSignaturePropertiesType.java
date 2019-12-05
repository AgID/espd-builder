//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Classe Java per UnsignedSignaturePropertiesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnsignedSignaturePropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CounterSignature"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureTimeStamp"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CompleteCertificateRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CompleteRevocationRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttributeCertificateRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttributeRevocationRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigAndRefsTimeStamp"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}RefsOnlyTimeStamp"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CertificateValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}RevocationValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttrAuthoritiesCertValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttributeRevocationValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ArchiveTimeStamp"/&gt;
 *         &lt;any namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsignedSignaturePropertiesType", propOrder = {
    "counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs"
})
public class UnsignedSignaturePropertiesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElementRefs({
        @XmlElementRef(name = "ArchiveTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttrAuthoritiesCertValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeRevocationRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CompleteRevocationRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CertificateValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CompleteCertificateRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeCertificateRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SignatureTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeRevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SigAndRefsTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CounterSignature", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefsOnlyTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link CounterSignatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * 
     */
    public List<Object> getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs() {
        if (counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs == null) {
            counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs = new ArrayList<Object>();
        }
        return this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
            List<Object> theCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
            theCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs = (((this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty()))?this.getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs():null);
            strategy.appendField(locator, this, "counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs", buffer, theCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs, ((this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty())));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        final UnsignedSignaturePropertiesType that = ((UnsignedSignaturePropertiesType) object);
        {
            List<Object> lhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
            lhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs = (((this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty()))?this.getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs():null);
            List<Object> rhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
            rhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs = (((that.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!that.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty()))?that.getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs", lhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs), LocatorUtils.property(thatLocator, "counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs", rhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs), lhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs, rhsCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs, ((this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty())), ((that.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!that.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
            List<Object> theCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
            theCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs = (((this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty()))?this.getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs", theCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs), currentHashCode, theCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs, ((this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs!= null)&&(!this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs.isEmpty())));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
