//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Classe Java per CRLIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CRLIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IssueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRLIdentifierType", propOrder = {
    "issuer",
    "issueTime",
    "number"
})
public class CRLIdentifierType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Issuer", required = true)
    protected String issuer;
    @XmlElement(name = "IssueTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueTime;
    @XmlElement(name = "Number")
    protected BigInteger number;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Recupera il valore della proprietà issuer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Imposta il valore della proprietà issuer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Recupera il valore della proprietà issueTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueTime() {
        return issueTime;
    }

    /**
     * Imposta il valore della proprietà issueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueTime(XMLGregorianCalendar value) {
        this.issueTime = value;
    }

    /**
     * Recupera il valore della proprietà number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Imposta il valore della proprietà number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
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
    public void setURI(String value) {
        this.uri = value;
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
            String theIssuer;
            theIssuer = this.getIssuer();
            strategy.appendField(locator, this, "issuer", buffer, theIssuer, (this.issuer!= null));
        }
        {
            XMLGregorianCalendar theIssueTime;
            theIssueTime = this.getIssueTime();
            strategy.appendField(locator, this, "issueTime", buffer, theIssueTime, (this.issueTime!= null));
        }
        {
            BigInteger theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
        }
        {
            String theURI;
            theURI = this.getURI();
            strategy.appendField(locator, this, "uri", buffer, theURI, (this.uri!= null));
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
        final CRLIdentifierType that = ((CRLIdentifierType) object);
        {
            String lhsIssuer;
            lhsIssuer = this.getIssuer();
            String rhsIssuer;
            rhsIssuer = that.getIssuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuer", lhsIssuer), LocatorUtils.property(thatLocator, "issuer", rhsIssuer), lhsIssuer, rhsIssuer, (this.issuer!= null), (that.issuer!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsIssueTime;
            lhsIssueTime = this.getIssueTime();
            XMLGregorianCalendar rhsIssueTime;
            rhsIssueTime = that.getIssueTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issueTime", lhsIssueTime), LocatorUtils.property(thatLocator, "issueTime", rhsIssueTime), lhsIssueTime, rhsIssueTime, (this.issueTime!= null), (that.issueTime!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsNumber;
            lhsNumber = this.getNumber();
            BigInteger rhsNumber;
            rhsNumber = that.getNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber, (this.number!= null), (that.number!= null))) {
                return false;
            }
        }
        {
            String lhsURI;
            lhsURI = this.getURI();
            String rhsURI;
            rhsURI = that.getURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsURI), LocatorUtils.property(thatLocator, "uri", rhsURI), lhsURI, rhsURI, (this.uri!= null), (that.uri!= null))) {
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
            String theIssuer;
            theIssuer = this.getIssuer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuer", theIssuer), currentHashCode, theIssuer, (this.issuer!= null));
        }
        {
            XMLGregorianCalendar theIssueTime;
            theIssueTime = this.getIssueTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueTime", theIssueTime), currentHashCode, theIssueTime, (this.issueTime!= null));
        }
        {
            BigInteger theNumber;
            theNumber = this.getNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "number", theNumber), currentHashCode, theNumber, (this.number!= null));
        }
        {
            String theURI;
            theURI = this.getURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theURI), currentHashCode, theURI, (this.uri!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
