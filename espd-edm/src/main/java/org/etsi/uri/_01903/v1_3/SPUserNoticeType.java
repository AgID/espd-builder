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
 * <p>Classe Java per SPUserNoticeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SPUserNoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoticeRef" type="{http://uri.etsi.org/01903/v1.3.2#}NoticeReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ExplicitText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPUserNoticeType", propOrder = {
    "noticeRef",
    "explicitText"
})
public class SPUserNoticeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "NoticeRef")
    protected NoticeReferenceType noticeRef;
    @XmlElement(name = "ExplicitText")
    protected String explicitText;

    /**
     * Recupera il valore della proprietà noticeRef.
     * 
     * @return
     *     possible object is
     *     {@link NoticeReferenceType }
     *     
     */
    public NoticeReferenceType getNoticeRef() {
        return noticeRef;
    }

    /**
     * Imposta il valore della proprietà noticeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeReferenceType }
     *     
     */
    public void setNoticeRef(NoticeReferenceType value) {
        this.noticeRef = value;
    }

    /**
     * Recupera il valore della proprietà explicitText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplicitText() {
        return explicitText;
    }

    /**
     * Imposta il valore della proprietà explicitText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplicitText(String value) {
        this.explicitText = value;
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
            NoticeReferenceType theNoticeRef;
            theNoticeRef = this.getNoticeRef();
            strategy.appendField(locator, this, "noticeRef", buffer, theNoticeRef, (this.noticeRef!= null));
        }
        {
            String theExplicitText;
            theExplicitText = this.getExplicitText();
            strategy.appendField(locator, this, "explicitText", buffer, theExplicitText, (this.explicitText!= null));
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
        final SPUserNoticeType that = ((SPUserNoticeType) object);
        {
            NoticeReferenceType lhsNoticeRef;
            lhsNoticeRef = this.getNoticeRef();
            NoticeReferenceType rhsNoticeRef;
            rhsNoticeRef = that.getNoticeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noticeRef", lhsNoticeRef), LocatorUtils.property(thatLocator, "noticeRef", rhsNoticeRef), lhsNoticeRef, rhsNoticeRef, (this.noticeRef!= null), (that.noticeRef!= null))) {
                return false;
            }
        }
        {
            String lhsExplicitText;
            lhsExplicitText = this.getExplicitText();
            String rhsExplicitText;
            rhsExplicitText = that.getExplicitText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "explicitText", lhsExplicitText), LocatorUtils.property(thatLocator, "explicitText", rhsExplicitText), lhsExplicitText, rhsExplicitText, (this.explicitText!= null), (that.explicitText!= null))) {
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
            NoticeReferenceType theNoticeRef;
            theNoticeRef = this.getNoticeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noticeRef", theNoticeRef), currentHashCode, theNoticeRef, (this.noticeRef!= null));
        }
        {
            String theExplicitText;
            theExplicitText = this.getExplicitText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "explicitText", theExplicitText), currentHashCode, theExplicitText, (this.explicitText!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
