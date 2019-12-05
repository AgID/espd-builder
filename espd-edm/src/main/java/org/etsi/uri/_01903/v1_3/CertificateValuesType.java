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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 * <p>Classe Java per CertificateValuesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="EncapsulatedX509Certificate" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType"/&gt;
 *         &lt;element name="OtherCertificate" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType"/&gt;
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
@XmlType(name = "CertificateValuesType", propOrder = {
    "encapsulatedX509CertificateOrOtherCertificate"
})
public class CertificateValuesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElements({
        @XmlElement(name = "EncapsulatedX509Certificate", type = EncapsulatedPKIDataType.class),
        @XmlElement(name = "OtherCertificate", type = AnyType.class)
    })
    protected List<Serializable> encapsulatedX509CertificateOrOtherCertificate;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the encapsulatedX509CertificateOrOtherCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encapsulatedX509CertificateOrOtherCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncapsulatedX509CertificateOrOtherCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedPKIDataType }
     * {@link AnyType }
     * 
     * 
     */
    public List<Serializable> getEncapsulatedX509CertificateOrOtherCertificate() {
        if (encapsulatedX509CertificateOrOtherCertificate == null) {
            encapsulatedX509CertificateOrOtherCertificate = new ArrayList<Serializable>();
        }
        return this.encapsulatedX509CertificateOrOtherCertificate;
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
            List<Serializable> theEncapsulatedX509CertificateOrOtherCertificate;
            theEncapsulatedX509CertificateOrOtherCertificate = (((this.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!this.encapsulatedX509CertificateOrOtherCertificate.isEmpty()))?this.getEncapsulatedX509CertificateOrOtherCertificate():null);
            strategy.appendField(locator, this, "encapsulatedX509CertificateOrOtherCertificate", buffer, theEncapsulatedX509CertificateOrOtherCertificate, ((this.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!this.encapsulatedX509CertificateOrOtherCertificate.isEmpty())));
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
        final CertificateValuesType that = ((CertificateValuesType) object);
        {
            List<Serializable> lhsEncapsulatedX509CertificateOrOtherCertificate;
            lhsEncapsulatedX509CertificateOrOtherCertificate = (((this.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!this.encapsulatedX509CertificateOrOtherCertificate.isEmpty()))?this.getEncapsulatedX509CertificateOrOtherCertificate():null);
            List<Serializable> rhsEncapsulatedX509CertificateOrOtherCertificate;
            rhsEncapsulatedX509CertificateOrOtherCertificate = (((that.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!that.encapsulatedX509CertificateOrOtherCertificate.isEmpty()))?that.getEncapsulatedX509CertificateOrOtherCertificate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encapsulatedX509CertificateOrOtherCertificate", lhsEncapsulatedX509CertificateOrOtherCertificate), LocatorUtils.property(thatLocator, "encapsulatedX509CertificateOrOtherCertificate", rhsEncapsulatedX509CertificateOrOtherCertificate), lhsEncapsulatedX509CertificateOrOtherCertificate, rhsEncapsulatedX509CertificateOrOtherCertificate, ((this.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!this.encapsulatedX509CertificateOrOtherCertificate.isEmpty())), ((that.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!that.encapsulatedX509CertificateOrOtherCertificate.isEmpty())))) {
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
            List<Serializable> theEncapsulatedX509CertificateOrOtherCertificate;
            theEncapsulatedX509CertificateOrOtherCertificate = (((this.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!this.encapsulatedX509CertificateOrOtherCertificate.isEmpty()))?this.getEncapsulatedX509CertificateOrOtherCertificate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encapsulatedX509CertificateOrOtherCertificate", theEncapsulatedX509CertificateOrOtherCertificate), currentHashCode, theEncapsulatedX509CertificateOrOtherCertificate, ((this.encapsulatedX509CertificateOrOtherCertificate!= null)&&(!this.encapsulatedX509CertificateOrOtherCertificate.isEmpty())));
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
