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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BudgetYearNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
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
 * <p>Classe Java per BudgetAccountType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BudgetAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BudgetYearNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredClassificationScheme" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetAccountType", propOrder = {
    "id",
    "budgetYearNumeric",
    "requiredClassificationScheme"
})
public class BudgetAccountType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "BudgetYearNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BudgetYearNumericType budgetYearNumeric;
    @XmlElement(name = "RequiredClassificationScheme")
    protected ClassificationSchemeType requiredClassificationScheme;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà budgetYearNumeric.
     * 
     * @return
     *     possible object is
     *     {@link BudgetYearNumericType }
     *     
     */
    public BudgetYearNumericType getBudgetYearNumeric() {
        return budgetYearNumeric;
    }

    /**
     * Imposta il valore della proprietà budgetYearNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetYearNumericType }
     *     
     */
    public void setBudgetYearNumeric(BudgetYearNumericType value) {
        this.budgetYearNumeric = value;
    }

    /**
     * Recupera il valore della proprietà requiredClassificationScheme.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public ClassificationSchemeType getRequiredClassificationScheme() {
        return requiredClassificationScheme;
    }

    /**
     * Imposta il valore della proprietà requiredClassificationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public void setRequiredClassificationScheme(ClassificationSchemeType value) {
        this.requiredClassificationScheme = value;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            BudgetYearNumericType theBudgetYearNumeric;
            theBudgetYearNumeric = this.getBudgetYearNumeric();
            strategy.appendField(locator, this, "budgetYearNumeric", buffer, theBudgetYearNumeric, (this.budgetYearNumeric!= null));
        }
        {
            ClassificationSchemeType theRequiredClassificationScheme;
            theRequiredClassificationScheme = this.getRequiredClassificationScheme();
            strategy.appendField(locator, this, "requiredClassificationScheme", buffer, theRequiredClassificationScheme, (this.requiredClassificationScheme!= null));
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
        final BudgetAccountType that = ((BudgetAccountType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            BudgetYearNumericType lhsBudgetYearNumeric;
            lhsBudgetYearNumeric = this.getBudgetYearNumeric();
            BudgetYearNumericType rhsBudgetYearNumeric;
            rhsBudgetYearNumeric = that.getBudgetYearNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "budgetYearNumeric", lhsBudgetYearNumeric), LocatorUtils.property(thatLocator, "budgetYearNumeric", rhsBudgetYearNumeric), lhsBudgetYearNumeric, rhsBudgetYearNumeric, (this.budgetYearNumeric!= null), (that.budgetYearNumeric!= null))) {
                return false;
            }
        }
        {
            ClassificationSchemeType lhsRequiredClassificationScheme;
            lhsRequiredClassificationScheme = this.getRequiredClassificationScheme();
            ClassificationSchemeType rhsRequiredClassificationScheme;
            rhsRequiredClassificationScheme = that.getRequiredClassificationScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredClassificationScheme", lhsRequiredClassificationScheme), LocatorUtils.property(thatLocator, "requiredClassificationScheme", rhsRequiredClassificationScheme), lhsRequiredClassificationScheme, rhsRequiredClassificationScheme, (this.requiredClassificationScheme!= null), (that.requiredClassificationScheme!= null))) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            BudgetYearNumericType theBudgetYearNumeric;
            theBudgetYearNumeric = this.getBudgetYearNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "budgetYearNumeric", theBudgetYearNumeric), currentHashCode, theBudgetYearNumeric, (this.budgetYearNumeric!= null));
        }
        {
            ClassificationSchemeType theRequiredClassificationScheme;
            theRequiredClassificationScheme = this.getRequiredClassificationScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredClassificationScheme", theRequiredClassificationScheme), currentHashCode, theRequiredClassificationScheme, (this.requiredClassificationScheme!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
