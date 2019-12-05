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
 * <p>Classe Java per SignerRoleV2Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignerRoleV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ClaimedRoles" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CertifiedRolesV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedAssertions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerRoleV2Type", propOrder = {
    "claimedRoles",
    "certifiedRolesV2",
    "signedAssertions"
})
public class SignerRoleV2Type implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ClaimedRoles")
    protected ClaimedRolesListType claimedRoles;
    @XmlElement(name = "CertifiedRolesV2")
    protected CertifiedRolesListTypeV2 certifiedRolesV2;
    @XmlElement(name = "SignedAssertions")
    protected SignedAssertionsListType signedAssertions;

    /**
     * Recupera il valore della proprietà claimedRoles.
     * 
     * @return
     *     possible object is
     *     {@link ClaimedRolesListType }
     *     
     */
    public ClaimedRolesListType getClaimedRoles() {
        return claimedRoles;
    }

    /**
     * Imposta il valore della proprietà claimedRoles.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimedRolesListType }
     *     
     */
    public void setClaimedRoles(ClaimedRolesListType value) {
        this.claimedRoles = value;
    }

    /**
     * Recupera il valore della proprietà certifiedRolesV2.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedRolesListTypeV2 }
     *     
     */
    public CertifiedRolesListTypeV2 getCertifiedRolesV2() {
        return certifiedRolesV2;
    }

    /**
     * Imposta il valore della proprietà certifiedRolesV2.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedRolesListTypeV2 }
     *     
     */
    public void setCertifiedRolesV2(CertifiedRolesListTypeV2 value) {
        this.certifiedRolesV2 = value;
    }

    /**
     * Recupera il valore della proprietà signedAssertions.
     * 
     * @return
     *     possible object is
     *     {@link SignedAssertionsListType }
     *     
     */
    public SignedAssertionsListType getSignedAssertions() {
        return signedAssertions;
    }

    /**
     * Imposta il valore della proprietà signedAssertions.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedAssertionsListType }
     *     
     */
    public void setSignedAssertions(SignedAssertionsListType value) {
        this.signedAssertions = value;
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
            ClaimedRolesListType theClaimedRoles;
            theClaimedRoles = this.getClaimedRoles();
            strategy.appendField(locator, this, "claimedRoles", buffer, theClaimedRoles, (this.claimedRoles!= null));
        }
        {
            CertifiedRolesListTypeV2 theCertifiedRolesV2;
            theCertifiedRolesV2 = this.getCertifiedRolesV2();
            strategy.appendField(locator, this, "certifiedRolesV2", buffer, theCertifiedRolesV2, (this.certifiedRolesV2 != null));
        }
        {
            SignedAssertionsListType theSignedAssertions;
            theSignedAssertions = this.getSignedAssertions();
            strategy.appendField(locator, this, "signedAssertions", buffer, theSignedAssertions, (this.signedAssertions!= null));
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
        final SignerRoleV2Type that = ((SignerRoleV2Type) object);
        {
            ClaimedRolesListType lhsClaimedRoles;
            lhsClaimedRoles = this.getClaimedRoles();
            ClaimedRolesListType rhsClaimedRoles;
            rhsClaimedRoles = that.getClaimedRoles();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimedRoles", lhsClaimedRoles), LocatorUtils.property(thatLocator, "claimedRoles", rhsClaimedRoles), lhsClaimedRoles, rhsClaimedRoles, (this.claimedRoles!= null), (that.claimedRoles!= null))) {
                return false;
            }
        }
        {
            CertifiedRolesListTypeV2 lhsCertifiedRolesV2;
            lhsCertifiedRolesV2 = this.getCertifiedRolesV2();
            CertifiedRolesListTypeV2 rhsCertifiedRolesV2;
            rhsCertifiedRolesV2 = that.getCertifiedRolesV2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certifiedRolesV2", lhsCertifiedRolesV2), LocatorUtils.property(thatLocator, "certifiedRolesV2", rhsCertifiedRolesV2), lhsCertifiedRolesV2, rhsCertifiedRolesV2, (this.certifiedRolesV2 != null), (that.certifiedRolesV2 != null))) {
                return false;
            }
        }
        {
            SignedAssertionsListType lhsSignedAssertions;
            lhsSignedAssertions = this.getSignedAssertions();
            SignedAssertionsListType rhsSignedAssertions;
            rhsSignedAssertions = that.getSignedAssertions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signedAssertions", lhsSignedAssertions), LocatorUtils.property(thatLocator, "signedAssertions", rhsSignedAssertions), lhsSignedAssertions, rhsSignedAssertions, (this.signedAssertions!= null), (that.signedAssertions!= null))) {
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
            ClaimedRolesListType theClaimedRoles;
            theClaimedRoles = this.getClaimedRoles();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimedRoles", theClaimedRoles), currentHashCode, theClaimedRoles, (this.claimedRoles!= null));
        }
        {
            CertifiedRolesListTypeV2 theCertifiedRolesV2;
            theCertifiedRolesV2 = this.getCertifiedRolesV2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certifiedRolesV2", theCertifiedRolesV2), currentHashCode, theCertifiedRolesV2, (this.certifiedRolesV2 != null));
        }
        {
            SignedAssertionsListType theSignedAssertions;
            theSignedAssertions = this.getSignedAssertions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signedAssertions", theSignedAssertions), currentHashCode, theSignedAssertions, (this.signedAssertions!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
