//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2000._09.xmldsig_;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
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
import org.w3c.dom.Element;


/**
 * <p>Classe Java per X509DataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="X509DataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;choice&gt;
 *           &lt;element name="X509IssuerSerial" type="{http://www.w3.org/2000/09/xmldsig#}X509IssuerSerialType"/&gt;
 *           &lt;element name="X509SKI" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="X509SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="X509CRL" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;any processContents='lax' namespace='##other'/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509DataType", propOrder = {
    "x509IssuerSerialOrX509SKIOrX509SubjectName"
})
public class X509DataType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElementRefs({
        @XmlElementRef(name = "X509SubjectName", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509SKI", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509CRL", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509IssuerSerial", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509Certificate", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> x509IssuerSerialOrX509SKIOrX509SubjectName;

    /**
     * Gets the value of the x509IssuerSerialOrX509SKIOrX509SubjectName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x509IssuerSerialOrX509SKIOrX509SubjectName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX509IssuerSerialOrX509SKIOrX509SubjectName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * 
     */
    public List<Object> getX509IssuerSerialOrX509SKIOrX509SubjectName() {
        if (x509IssuerSerialOrX509SKIOrX509SubjectName == null) {
            x509IssuerSerialOrX509SKIOrX509SubjectName = new ArrayList<Object>();
        }
        return this.x509IssuerSerialOrX509SKIOrX509SubjectName;
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
            List<Object> theX509IssuerSerialOrX509SKIOrX509SubjectName;
            theX509IssuerSerialOrX509SKIOrX509SubjectName = (((this.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!this.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty()))?this.getX509IssuerSerialOrX509SKIOrX509SubjectName():null);
            strategy.appendField(locator, this, "x509IssuerSerialOrX509SKIOrX509SubjectName", buffer, theX509IssuerSerialOrX509SKIOrX509SubjectName, ((this.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!this.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty())));
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
        final X509DataType that = ((X509DataType) object);
        {
            List<Object> lhsX509IssuerSerialOrX509SKIOrX509SubjectName;
            lhsX509IssuerSerialOrX509SKIOrX509SubjectName = (((this.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!this.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty()))?this.getX509IssuerSerialOrX509SKIOrX509SubjectName():null);
            List<Object> rhsX509IssuerSerialOrX509SKIOrX509SubjectName;
            rhsX509IssuerSerialOrX509SKIOrX509SubjectName = (((that.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!that.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty()))?that.getX509IssuerSerialOrX509SKIOrX509SubjectName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x509IssuerSerialOrX509SKIOrX509SubjectName", lhsX509IssuerSerialOrX509SKIOrX509SubjectName), LocatorUtils.property(thatLocator, "x509IssuerSerialOrX509SKIOrX509SubjectName", rhsX509IssuerSerialOrX509SKIOrX509SubjectName), lhsX509IssuerSerialOrX509SKIOrX509SubjectName, rhsX509IssuerSerialOrX509SKIOrX509SubjectName, ((this.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!this.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty())), ((that.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!that.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty())))) {
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
            List<Object> theX509IssuerSerialOrX509SKIOrX509SubjectName;
            theX509IssuerSerialOrX509SKIOrX509SubjectName = (((this.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!this.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty()))?this.getX509IssuerSerialOrX509SKIOrX509SubjectName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x509IssuerSerialOrX509SKIOrX509SubjectName", theX509IssuerSerialOrX509SKIOrX509SubjectName), currentHashCode, theX509IssuerSerialOrX509SKIOrX509SubjectName, ((this.x509IssuerSerialOrX509SKIOrX509SubjectName!= null)&&(!this.x509IssuerSerialOrX509SKIOrX509SubjectName.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
