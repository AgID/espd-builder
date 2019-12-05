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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ComparisonDataSourceCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DataSourceCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ForecastPurposeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ForecastTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TimeDeltaDaysQuantityType;
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
 * <p>Classe Java per ForecastExceptionCriterionLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ForecastExceptionCriterionLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastPurposeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonDataSourceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DataSourceCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeDeltaDaysQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastExceptionCriterionLineType", propOrder = {
    "forecastPurposeCode",
    "forecastTypeCode",
    "comparisonDataSourceCode",
    "dataSourceCode",
    "timeDeltaDaysQuantity"
})
public class ForecastExceptionCriterionLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ForecastPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastPurposeCodeType forecastPurposeCode;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastTypeCodeType forecastTypeCode;
    @XmlElement(name = "ComparisonDataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonDataSourceCodeType comparisonDataSourceCode;
    @XmlElement(name = "DataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected DataSourceCodeType dataSourceCode;
    @XmlElement(name = "TimeDeltaDaysQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimeDeltaDaysQuantityType timeDeltaDaysQuantity;

    /**
     * Recupera il valore della proprietà forecastPurposeCode.
     * 
     * @return
     *     possible object is
     *     {@link ForecastPurposeCodeType }
     *     
     */
    public ForecastPurposeCodeType getForecastPurposeCode() {
        return forecastPurposeCode;
    }

    /**
     * Imposta il valore della proprietà forecastPurposeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastPurposeCodeType }
     *     
     */
    public void setForecastPurposeCode(ForecastPurposeCodeType value) {
        this.forecastPurposeCode = value;
    }

    /**
     * Recupera il valore della proprietà forecastTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ForecastTypeCodeType }
     *     
     */
    public ForecastTypeCodeType getForecastTypeCode() {
        return forecastTypeCode;
    }

    /**
     * Imposta il valore della proprietà forecastTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastTypeCodeType }
     *     
     */
    public void setForecastTypeCode(ForecastTypeCodeType value) {
        this.forecastTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà comparisonDataSourceCode.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDataSourceCodeType }
     *     
     */
    public ComparisonDataSourceCodeType getComparisonDataSourceCode() {
        return comparisonDataSourceCode;
    }

    /**
     * Imposta il valore della proprietà comparisonDataSourceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDataSourceCodeType }
     *     
     */
    public void setComparisonDataSourceCode(ComparisonDataSourceCodeType value) {
        this.comparisonDataSourceCode = value;
    }

    /**
     * Recupera il valore della proprietà dataSourceCode.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceCodeType }
     *     
     */
    public DataSourceCodeType getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * Imposta il valore della proprietà dataSourceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceCodeType }
     *     
     */
    public void setDataSourceCode(DataSourceCodeType value) {
        this.dataSourceCode = value;
    }

    /**
     * Recupera il valore della proprietà timeDeltaDaysQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TimeDeltaDaysQuantityType }
     *     
     */
    public TimeDeltaDaysQuantityType getTimeDeltaDaysQuantity() {
        return timeDeltaDaysQuantity;
    }

    /**
     * Imposta il valore della proprietà timeDeltaDaysQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDeltaDaysQuantityType }
     *     
     */
    public void setTimeDeltaDaysQuantity(TimeDeltaDaysQuantityType value) {
        this.timeDeltaDaysQuantity = value;
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
            ForecastPurposeCodeType theForecastPurposeCode;
            theForecastPurposeCode = this.getForecastPurposeCode();
            strategy.appendField(locator, this, "forecastPurposeCode", buffer, theForecastPurposeCode, (this.forecastPurposeCode!= null));
        }
        {
            ForecastTypeCodeType theForecastTypeCode;
            theForecastTypeCode = this.getForecastTypeCode();
            strategy.appendField(locator, this, "forecastTypeCode", buffer, theForecastTypeCode, (this.forecastTypeCode!= null));
        }
        {
            ComparisonDataSourceCodeType theComparisonDataSourceCode;
            theComparisonDataSourceCode = this.getComparisonDataSourceCode();
            strategy.appendField(locator, this, "comparisonDataSourceCode", buffer, theComparisonDataSourceCode, (this.comparisonDataSourceCode!= null));
        }
        {
            DataSourceCodeType theDataSourceCode;
            theDataSourceCode = this.getDataSourceCode();
            strategy.appendField(locator, this, "dataSourceCode", buffer, theDataSourceCode, (this.dataSourceCode!= null));
        }
        {
            TimeDeltaDaysQuantityType theTimeDeltaDaysQuantity;
            theTimeDeltaDaysQuantity = this.getTimeDeltaDaysQuantity();
            strategy.appendField(locator, this, "timeDeltaDaysQuantity", buffer, theTimeDeltaDaysQuantity, (this.timeDeltaDaysQuantity!= null));
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
        final ForecastExceptionCriterionLineType that = ((ForecastExceptionCriterionLineType) object);
        {
            ForecastPurposeCodeType lhsForecastPurposeCode;
            lhsForecastPurposeCode = this.getForecastPurposeCode();
            ForecastPurposeCodeType rhsForecastPurposeCode;
            rhsForecastPurposeCode = that.getForecastPurposeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastPurposeCode", lhsForecastPurposeCode), LocatorUtils.property(thatLocator, "forecastPurposeCode", rhsForecastPurposeCode), lhsForecastPurposeCode, rhsForecastPurposeCode, (this.forecastPurposeCode!= null), (that.forecastPurposeCode!= null))) {
                return false;
            }
        }
        {
            ForecastTypeCodeType lhsForecastTypeCode;
            lhsForecastTypeCode = this.getForecastTypeCode();
            ForecastTypeCodeType rhsForecastTypeCode;
            rhsForecastTypeCode = that.getForecastTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastTypeCode", lhsForecastTypeCode), LocatorUtils.property(thatLocator, "forecastTypeCode", rhsForecastTypeCode), lhsForecastTypeCode, rhsForecastTypeCode, (this.forecastTypeCode!= null), (that.forecastTypeCode!= null))) {
                return false;
            }
        }
        {
            ComparisonDataSourceCodeType lhsComparisonDataSourceCode;
            lhsComparisonDataSourceCode = this.getComparisonDataSourceCode();
            ComparisonDataSourceCodeType rhsComparisonDataSourceCode;
            rhsComparisonDataSourceCode = that.getComparisonDataSourceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comparisonDataSourceCode", lhsComparisonDataSourceCode), LocatorUtils.property(thatLocator, "comparisonDataSourceCode", rhsComparisonDataSourceCode), lhsComparisonDataSourceCode, rhsComparisonDataSourceCode, (this.comparisonDataSourceCode!= null), (that.comparisonDataSourceCode!= null))) {
                return false;
            }
        }
        {
            DataSourceCodeType lhsDataSourceCode;
            lhsDataSourceCode = this.getDataSourceCode();
            DataSourceCodeType rhsDataSourceCode;
            rhsDataSourceCode = that.getDataSourceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSourceCode", lhsDataSourceCode), LocatorUtils.property(thatLocator, "dataSourceCode", rhsDataSourceCode), lhsDataSourceCode, rhsDataSourceCode, (this.dataSourceCode!= null), (that.dataSourceCode!= null))) {
                return false;
            }
        }
        {
            TimeDeltaDaysQuantityType lhsTimeDeltaDaysQuantity;
            lhsTimeDeltaDaysQuantity = this.getTimeDeltaDaysQuantity();
            TimeDeltaDaysQuantityType rhsTimeDeltaDaysQuantity;
            rhsTimeDeltaDaysQuantity = that.getTimeDeltaDaysQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeDeltaDaysQuantity", lhsTimeDeltaDaysQuantity), LocatorUtils.property(thatLocator, "timeDeltaDaysQuantity", rhsTimeDeltaDaysQuantity), lhsTimeDeltaDaysQuantity, rhsTimeDeltaDaysQuantity, (this.timeDeltaDaysQuantity!= null), (that.timeDeltaDaysQuantity!= null))) {
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
            ForecastPurposeCodeType theForecastPurposeCode;
            theForecastPurposeCode = this.getForecastPurposeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastPurposeCode", theForecastPurposeCode), currentHashCode, theForecastPurposeCode, (this.forecastPurposeCode!= null));
        }
        {
            ForecastTypeCodeType theForecastTypeCode;
            theForecastTypeCode = this.getForecastTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastTypeCode", theForecastTypeCode), currentHashCode, theForecastTypeCode, (this.forecastTypeCode!= null));
        }
        {
            ComparisonDataSourceCodeType theComparisonDataSourceCode;
            theComparisonDataSourceCode = this.getComparisonDataSourceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comparisonDataSourceCode", theComparisonDataSourceCode), currentHashCode, theComparisonDataSourceCode, (this.comparisonDataSourceCode!= null));
        }
        {
            DataSourceCodeType theDataSourceCode;
            theDataSourceCode = this.getDataSourceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSourceCode", theDataSourceCode), currentHashCode, theDataSourceCode, (this.dataSourceCode!= null));
        }
        {
            TimeDeltaDaysQuantityType theTimeDeltaDaysQuantity;
            theTimeDeltaDaysQuantity = this.getTimeDeltaDaysQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeDeltaDaysQuantity", theTimeDeltaDaysQuantity), currentHashCode, theTimeDeltaDaysQuantity, (this.timeDeltaDaysQuantity!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
