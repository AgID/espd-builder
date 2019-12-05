//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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


/**
 * <p>Classe Java per NoticeReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NoticeReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoticeNumbers" type="{http://uri.etsi.org/01903/v1.3.2#}IntegerListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeReferenceType", propOrder = {
    "organization",
    "noticeNumbers"
})
public class NoticeReferenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Organization", required = true)
    protected String organization;
    @XmlElement(name = "NoticeNumbers", required = true)
    protected IntegerListType noticeNumbers;

    /**
     * Recupera il valore della proprietà organization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Imposta il valore della proprietà organization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Recupera il valore della proprietà noticeNumbers.
     * 
     * @return
     *     possible object is
     *     {@link IntegerListType }
     *     
     */
    public IntegerListType getNoticeNumbers() {
        return noticeNumbers;
    }

    /**
     * Imposta il valore della proprietà noticeNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerListType }
     *     
     */
    public void setNoticeNumbers(IntegerListType value) {
        this.noticeNumbers = value;
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
            String theOrganization;
            theOrganization = this.getOrganization();
            strategy.appendField(locator, this, "organization", buffer, theOrganization, (this.organization!= null));
        }
        {
            IntegerListType theNoticeNumbers;
            theNoticeNumbers = this.getNoticeNumbers();
            strategy.appendField(locator, this, "noticeNumbers", buffer, theNoticeNumbers, (this.noticeNumbers!= null));
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
        final NoticeReferenceType that = ((NoticeReferenceType) object);
        {
            String lhsOrganization;
            lhsOrganization = this.getOrganization();
            String rhsOrganization;
            rhsOrganization = that.getOrganization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organization", lhsOrganization), LocatorUtils.property(thatLocator, "organization", rhsOrganization), lhsOrganization, rhsOrganization, (this.organization!= null), (that.organization!= null))) {
                return false;
            }
        }
        {
            IntegerListType lhsNoticeNumbers;
            lhsNoticeNumbers = this.getNoticeNumbers();
            IntegerListType rhsNoticeNumbers;
            rhsNoticeNumbers = that.getNoticeNumbers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noticeNumbers", lhsNoticeNumbers), LocatorUtils.property(thatLocator, "noticeNumbers", rhsNoticeNumbers), lhsNoticeNumbers, rhsNoticeNumbers, (this.noticeNumbers!= null), (that.noticeNumbers!= null))) {
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
            String theOrganization;
            theOrganization = this.getOrganization();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organization", theOrganization), currentHashCode, theOrganization, (this.organization!= null));
        }
        {
            IntegerListType theNoticeNumbers;
            theNoticeNumbers = this.getNoticeNumbers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noticeNumbers", theNoticeNumbers), currentHashCode, theNoticeNumbers, (this.noticeNumbers!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
