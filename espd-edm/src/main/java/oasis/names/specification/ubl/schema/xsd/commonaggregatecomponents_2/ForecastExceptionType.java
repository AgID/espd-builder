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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ComparisonDataCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ComparisonForecastIssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ComparisonForecastIssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DataSourceCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ForecastPurposeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ForecastTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
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
 * <p>Classe Java per ForecastExceptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ForecastExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastPurposeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DataSourceCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonDataCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonForecastIssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonForecastIssueDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastExceptionType", propOrder = {
    "forecastPurposeCode",
    "forecastTypeCode",
    "issueDate",
    "issueTime",
    "dataSourceCode",
    "comparisonDataCode",
    "comparisonForecastIssueTime",
    "comparisonForecastIssueDate"
})
public class ForecastExceptionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ForecastPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastPurposeCodeType forecastPurposeCode;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastTypeCodeType forecastTypeCode;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IssueDateType issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueTimeType issueTime;
    @XmlElement(name = "DataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected DataSourceCodeType dataSourceCode;
    @XmlElement(name = "ComparisonDataCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonDataCodeType comparisonDataCode;
    @XmlElement(name = "ComparisonForecastIssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonForecastIssueTimeType comparisonForecastIssueTime;
    @XmlElement(name = "ComparisonForecastIssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonForecastIssueDateType comparisonForecastIssueDate;

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
     * Recupera il valore della proprietà issueDate.
     * 
     * @return
     *     possible object is
     *     {@link IssueDateType }
     *     
     */
    public IssueDateType getIssueDate() {
        return issueDate;
    }

    /**
     * Imposta il valore della proprietà issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDateType }
     *     
     */
    public void setIssueDate(IssueDateType value) {
        this.issueDate = value;
    }

    /**
     * Recupera il valore della proprietà issueTime.
     * 
     * @return
     *     possible object is
     *     {@link IssueTimeType }
     *     
     */
    public IssueTimeType getIssueTime() {
        return issueTime;
    }

    /**
     * Imposta il valore della proprietà issueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTimeType }
     *     
     */
    public void setIssueTime(IssueTimeType value) {
        this.issueTime = value;
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
     * Recupera il valore della proprietà comparisonDataCode.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDataCodeType }
     *     
     */
    public ComparisonDataCodeType getComparisonDataCode() {
        return comparisonDataCode;
    }

    /**
     * Imposta il valore della proprietà comparisonDataCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDataCodeType }
     *     
     */
    public void setComparisonDataCode(ComparisonDataCodeType value) {
        this.comparisonDataCode = value;
    }

    /**
     * Recupera il valore della proprietà comparisonForecastIssueTime.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonForecastIssueTimeType }
     *     
     */
    public ComparisonForecastIssueTimeType getComparisonForecastIssueTime() {
        return comparisonForecastIssueTime;
    }

    /**
     * Imposta il valore della proprietà comparisonForecastIssueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonForecastIssueTimeType }
     *     
     */
    public void setComparisonForecastIssueTime(ComparisonForecastIssueTimeType value) {
        this.comparisonForecastIssueTime = value;
    }

    /**
     * Recupera il valore della proprietà comparisonForecastIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonForecastIssueDateType }
     *     
     */
    public ComparisonForecastIssueDateType getComparisonForecastIssueDate() {
        return comparisonForecastIssueDate;
    }

    /**
     * Imposta il valore della proprietà comparisonForecastIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonForecastIssueDateType }
     *     
     */
    public void setComparisonForecastIssueDate(ComparisonForecastIssueDateType value) {
        this.comparisonForecastIssueDate = value;
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
            IssueDateType theIssueDate;
            theIssueDate = this.getIssueDate();
            strategy.appendField(locator, this, "issueDate", buffer, theIssueDate, (this.issueDate!= null));
        }
        {
            IssueTimeType theIssueTime;
            theIssueTime = this.getIssueTime();
            strategy.appendField(locator, this, "issueTime", buffer, theIssueTime, (this.issueTime!= null));
        }
        {
            DataSourceCodeType theDataSourceCode;
            theDataSourceCode = this.getDataSourceCode();
            strategy.appendField(locator, this, "dataSourceCode", buffer, theDataSourceCode, (this.dataSourceCode!= null));
        }
        {
            ComparisonDataCodeType theComparisonDataCode;
            theComparisonDataCode = this.getComparisonDataCode();
            strategy.appendField(locator, this, "comparisonDataCode", buffer, theComparisonDataCode, (this.comparisonDataCode!= null));
        }
        {
            ComparisonForecastIssueTimeType theComparisonForecastIssueTime;
            theComparisonForecastIssueTime = this.getComparisonForecastIssueTime();
            strategy.appendField(locator, this, "comparisonForecastIssueTime", buffer, theComparisonForecastIssueTime, (this.comparisonForecastIssueTime!= null));
        }
        {
            ComparisonForecastIssueDateType theComparisonForecastIssueDate;
            theComparisonForecastIssueDate = this.getComparisonForecastIssueDate();
            strategy.appendField(locator, this, "comparisonForecastIssueDate", buffer, theComparisonForecastIssueDate, (this.comparisonForecastIssueDate!= null));
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
        final ForecastExceptionType that = ((ForecastExceptionType) object);
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
            IssueDateType lhsIssueDate;
            lhsIssueDate = this.getIssueDate();
            IssueDateType rhsIssueDate;
            rhsIssueDate = that.getIssueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issueDate", lhsIssueDate), LocatorUtils.property(thatLocator, "issueDate", rhsIssueDate), lhsIssueDate, rhsIssueDate, (this.issueDate!= null), (that.issueDate!= null))) {
                return false;
            }
        }
        {
            IssueTimeType lhsIssueTime;
            lhsIssueTime = this.getIssueTime();
            IssueTimeType rhsIssueTime;
            rhsIssueTime = that.getIssueTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issueTime", lhsIssueTime), LocatorUtils.property(thatLocator, "issueTime", rhsIssueTime), lhsIssueTime, rhsIssueTime, (this.issueTime!= null), (that.issueTime!= null))) {
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
            ComparisonDataCodeType lhsComparisonDataCode;
            lhsComparisonDataCode = this.getComparisonDataCode();
            ComparisonDataCodeType rhsComparisonDataCode;
            rhsComparisonDataCode = that.getComparisonDataCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comparisonDataCode", lhsComparisonDataCode), LocatorUtils.property(thatLocator, "comparisonDataCode", rhsComparisonDataCode), lhsComparisonDataCode, rhsComparisonDataCode, (this.comparisonDataCode!= null), (that.comparisonDataCode!= null))) {
                return false;
            }
        }
        {
            ComparisonForecastIssueTimeType lhsComparisonForecastIssueTime;
            lhsComparisonForecastIssueTime = this.getComparisonForecastIssueTime();
            ComparisonForecastIssueTimeType rhsComparisonForecastIssueTime;
            rhsComparisonForecastIssueTime = that.getComparisonForecastIssueTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comparisonForecastIssueTime", lhsComparisonForecastIssueTime), LocatorUtils.property(thatLocator, "comparisonForecastIssueTime", rhsComparisonForecastIssueTime), lhsComparisonForecastIssueTime, rhsComparisonForecastIssueTime, (this.comparisonForecastIssueTime!= null), (that.comparisonForecastIssueTime!= null))) {
                return false;
            }
        }
        {
            ComparisonForecastIssueDateType lhsComparisonForecastIssueDate;
            lhsComparisonForecastIssueDate = this.getComparisonForecastIssueDate();
            ComparisonForecastIssueDateType rhsComparisonForecastIssueDate;
            rhsComparisonForecastIssueDate = that.getComparisonForecastIssueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comparisonForecastIssueDate", lhsComparisonForecastIssueDate), LocatorUtils.property(thatLocator, "comparisonForecastIssueDate", rhsComparisonForecastIssueDate), lhsComparisonForecastIssueDate, rhsComparisonForecastIssueDate, (this.comparisonForecastIssueDate!= null), (that.comparisonForecastIssueDate!= null))) {
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
            IssueDateType theIssueDate;
            theIssueDate = this.getIssueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueDate", theIssueDate), currentHashCode, theIssueDate, (this.issueDate!= null));
        }
        {
            IssueTimeType theIssueTime;
            theIssueTime = this.getIssueTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueTime", theIssueTime), currentHashCode, theIssueTime, (this.issueTime!= null));
        }
        {
            DataSourceCodeType theDataSourceCode;
            theDataSourceCode = this.getDataSourceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSourceCode", theDataSourceCode), currentHashCode, theDataSourceCode, (this.dataSourceCode!= null));
        }
        {
            ComparisonDataCodeType theComparisonDataCode;
            theComparisonDataCode = this.getComparisonDataCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comparisonDataCode", theComparisonDataCode), currentHashCode, theComparisonDataCode, (this.comparisonDataCode!= null));
        }
        {
            ComparisonForecastIssueTimeType theComparisonForecastIssueTime;
            theComparisonForecastIssueTime = this.getComparisonForecastIssueTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comparisonForecastIssueTime", theComparisonForecastIssueTime), currentHashCode, theComparisonForecastIssueTime, (this.comparisonForecastIssueTime!= null));
        }
        {
            ComparisonForecastIssueDateType theComparisonForecastIssueDate;
            theComparisonForecastIssueDate = this.getComparisonForecastIssueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comparisonForecastIssueDate", theComparisonForecastIssueDate), currentHashCode, theComparisonForecastIssueDate, (this.comparisonForecastIssueDate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
