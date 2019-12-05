//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseBinaryObjectType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseURIType;
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
 * <p>Classe Java per ResponseValueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Response" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseBinaryObject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseValueType", propOrder = {
    "id",
    "description",
    "response",
    "responseAmount",
    "responseBinaryObject",
    "responseCode",
    "responseDate",
    "responseID",
    "responseIndicator",
    "responseMeasure",
    "responseNumeric",
    "responseQuantity",
    "responseTime",
    "responseURI"
})
public class ResponseValueType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Response", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ResponseType> response;
    @XmlElement(name = "ResponseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseAmountType responseAmount;
    @XmlElement(name = "ResponseBinaryObject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseBinaryObjectType responseBinaryObject;
    @XmlElement(name = "ResponseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseCodeType responseCode;
    @XmlElement(name = "ResponseDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseDateType responseDate;
    @XmlElement(name = "ResponseID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseIDType responseID;
    @XmlElement(name = "ResponseIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseIndicatorType responseIndicator;
    @XmlElement(name = "ResponseMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseMeasureType responseMeasure;
    @XmlElement(name = "ResponseNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseNumericType responseNumeric;
    @XmlElement(name = "ResponseQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseQuantityType responseQuantity;
    @XmlElement(name = "ResponseTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseTimeType responseTime;
    @XmlElement(name = "ResponseURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseURIType responseURI;

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
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType }
     * 
     * 
     */
    public List<ResponseType> getResponse() {
        if (response == null) {
            response = new ArrayList<ResponseType>();
        }
        return this.response;
    }

    /**
     * Recupera il valore della proprietà responseAmount.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAmountType }
     *     
     */
    public ResponseAmountType getResponseAmount() {
        return responseAmount;
    }

    /**
     * Imposta il valore della proprietà responseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAmountType }
     *     
     */
    public void setResponseAmount(ResponseAmountType value) {
        this.responseAmount = value;
    }

    /**
     * Recupera il valore della proprietà responseBinaryObject.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBinaryObjectType }
     *     
     */
    public ResponseBinaryObjectType getResponseBinaryObject() {
        return responseBinaryObject;
    }

    /**
     * Imposta il valore della proprietà responseBinaryObject.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBinaryObjectType }
     *     
     */
    public void setResponseBinaryObject(ResponseBinaryObjectType value) {
        this.responseBinaryObject = value;
    }

    /**
     * Recupera il valore della proprietà responseCode.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeType }
     *     
     */
    public ResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Imposta il valore della proprietà responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeType }
     *     
     */
    public void setResponseCode(ResponseCodeType value) {
        this.responseCode = value;
    }

    /**
     * Recupera il valore della proprietà responseDate.
     * 
     * @return
     *     possible object is
     *     {@link ResponseDateType }
     *     
     */
    public ResponseDateType getResponseDate() {
        return responseDate;
    }

    /**
     * Imposta il valore della proprietà responseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDateType }
     *     
     */
    public void setResponseDate(ResponseDateType value) {
        this.responseDate = value;
    }

    /**
     * Recupera il valore della proprietà responseID.
     * 
     * @return
     *     possible object is
     *     {@link ResponseIDType }
     *     
     */
    public ResponseIDType getResponseID() {
        return responseID;
    }

    /**
     * Imposta il valore della proprietà responseID.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseIDType }
     *     
     */
    public void setResponseID(ResponseIDType value) {
        this.responseID = value;
    }

    /**
     * Recupera il valore della proprietà responseIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ResponseIndicatorType }
     *     
     */
    public ResponseIndicatorType getResponseIndicator() {
        return responseIndicator;
    }

    /**
     * Imposta il valore della proprietà responseIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseIndicatorType }
     *     
     */
    public void setResponseIndicator(ResponseIndicatorType value) {
        this.responseIndicator = value;
    }

    /**
     * Recupera il valore della proprietà responseMeasure.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMeasureType }
     *     
     */
    public ResponseMeasureType getResponseMeasure() {
        return responseMeasure;
    }

    /**
     * Imposta il valore della proprietà responseMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMeasureType }
     *     
     */
    public void setResponseMeasure(ResponseMeasureType value) {
        this.responseMeasure = value;
    }

    /**
     * Recupera il valore della proprietà responseNumeric.
     * 
     * @return
     *     possible object is
     *     {@link ResponseNumericType }
     *     
     */
    public ResponseNumericType getResponseNumeric() {
        return responseNumeric;
    }

    /**
     * Imposta il valore della proprietà responseNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseNumericType }
     *     
     */
    public void setResponseNumeric(ResponseNumericType value) {
        this.responseNumeric = value;
    }

    /**
     * Recupera il valore della proprietà responseQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ResponseQuantityType }
     *     
     */
    public ResponseQuantityType getResponseQuantity() {
        return responseQuantity;
    }

    /**
     * Imposta il valore della proprietà responseQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseQuantityType }
     *     
     */
    public void setResponseQuantity(ResponseQuantityType value) {
        this.responseQuantity = value;
    }

    /**
     * Recupera il valore della proprietà responseTime.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTimeType }
     *     
     */
    public ResponseTimeType getResponseTime() {
        return responseTime;
    }

    /**
     * Imposta il valore della proprietà responseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTimeType }
     *     
     */
    public void setResponseTime(ResponseTimeType value) {
        this.responseTime = value;
    }

    /**
     * Recupera il valore della proprietà responseURI.
     * 
     * @return
     *     possible object is
     *     {@link ResponseURIType }
     *     
     */
    public ResponseURIType getResponseURI() {
        return responseURI;
    }

    /**
     * Imposta il valore della proprietà responseURI.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseURIType }
     *     
     */
    public void setResponseURI(ResponseURIType value) {
        this.responseURI = value;
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ResponseType> theResponse;
            theResponse = (((this.response!= null)&&(!this.response.isEmpty()))?this.getResponse():null);
            strategy.appendField(locator, this, "response", buffer, theResponse, ((this.response!= null)&&(!this.response.isEmpty())));
        }
        {
            ResponseAmountType theResponseAmount;
            theResponseAmount = this.getResponseAmount();
            strategy.appendField(locator, this, "responseAmount", buffer, theResponseAmount, (this.responseAmount!= null));
        }
        {
            ResponseBinaryObjectType theResponseBinaryObject;
            theResponseBinaryObject = this.getResponseBinaryObject();
            strategy.appendField(locator, this, "responseBinaryObject", buffer, theResponseBinaryObject, (this.responseBinaryObject!= null));
        }
        {
            ResponseCodeType theResponseCode;
            theResponseCode = this.getResponseCode();
            strategy.appendField(locator, this, "responseCode", buffer, theResponseCode, (this.responseCode!= null));
        }
        {
            ResponseDateType theResponseDate;
            theResponseDate = this.getResponseDate();
            strategy.appendField(locator, this, "responseDate", buffer, theResponseDate, (this.responseDate!= null));
        }
        {
            ResponseIDType theResponseID;
            theResponseID = this.getResponseID();
            strategy.appendField(locator, this, "responseID", buffer, theResponseID, (this.responseID!= null));
        }
        {
            ResponseIndicatorType theResponseIndicator;
            theResponseIndicator = this.getResponseIndicator();
            strategy.appendField(locator, this, "responseIndicator", buffer, theResponseIndicator, (this.responseIndicator!= null));
        }
        {
            ResponseMeasureType theResponseMeasure;
            theResponseMeasure = this.getResponseMeasure();
            strategy.appendField(locator, this, "responseMeasure", buffer, theResponseMeasure, (this.responseMeasure!= null));
        }
        {
            ResponseNumericType theResponseNumeric;
            theResponseNumeric = this.getResponseNumeric();
            strategy.appendField(locator, this, "responseNumeric", buffer, theResponseNumeric, (this.responseNumeric!= null));
        }
        {
            ResponseQuantityType theResponseQuantity;
            theResponseQuantity = this.getResponseQuantity();
            strategy.appendField(locator, this, "responseQuantity", buffer, theResponseQuantity, (this.responseQuantity!= null));
        }
        {
            ResponseTimeType theResponseTime;
            theResponseTime = this.getResponseTime();
            strategy.appendField(locator, this, "responseTime", buffer, theResponseTime, (this.responseTime!= null));
        }
        {
            ResponseURIType theResponseURI;
            theResponseURI = this.getResponseURI();
            strategy.appendField(locator, this, "responseURI", buffer, theResponseURI, (this.responseURI!= null));
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
        final ResponseValueType that = ((ResponseValueType) object);
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
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            List<ResponseType> lhsResponse;
            lhsResponse = (((this.response!= null)&&(!this.response.isEmpty()))?this.getResponse():null);
            List<ResponseType> rhsResponse;
            rhsResponse = (((that.response!= null)&&(!that.response.isEmpty()))?that.getResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "response", lhsResponse), LocatorUtils.property(thatLocator, "response", rhsResponse), lhsResponse, rhsResponse, ((this.response!= null)&&(!this.response.isEmpty())), ((that.response!= null)&&(!that.response.isEmpty())))) {
                return false;
            }
        }
        {
            ResponseAmountType lhsResponseAmount;
            lhsResponseAmount = this.getResponseAmount();
            ResponseAmountType rhsResponseAmount;
            rhsResponseAmount = that.getResponseAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseAmount", lhsResponseAmount), LocatorUtils.property(thatLocator, "responseAmount", rhsResponseAmount), lhsResponseAmount, rhsResponseAmount, (this.responseAmount!= null), (that.responseAmount!= null))) {
                return false;
            }
        }
        {
            ResponseBinaryObjectType lhsResponseBinaryObject;
            lhsResponseBinaryObject = this.getResponseBinaryObject();
            ResponseBinaryObjectType rhsResponseBinaryObject;
            rhsResponseBinaryObject = that.getResponseBinaryObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseBinaryObject", lhsResponseBinaryObject), LocatorUtils.property(thatLocator, "responseBinaryObject", rhsResponseBinaryObject), lhsResponseBinaryObject, rhsResponseBinaryObject, (this.responseBinaryObject!= null), (that.responseBinaryObject!= null))) {
                return false;
            }
        }
        {
            ResponseCodeType lhsResponseCode;
            lhsResponseCode = this.getResponseCode();
            ResponseCodeType rhsResponseCode;
            rhsResponseCode = that.getResponseCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseCode", lhsResponseCode), LocatorUtils.property(thatLocator, "responseCode", rhsResponseCode), lhsResponseCode, rhsResponseCode, (this.responseCode!= null), (that.responseCode!= null))) {
                return false;
            }
        }
        {
            ResponseDateType lhsResponseDate;
            lhsResponseDate = this.getResponseDate();
            ResponseDateType rhsResponseDate;
            rhsResponseDate = that.getResponseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseDate", lhsResponseDate), LocatorUtils.property(thatLocator, "responseDate", rhsResponseDate), lhsResponseDate, rhsResponseDate, (this.responseDate!= null), (that.responseDate!= null))) {
                return false;
            }
        }
        {
            ResponseIDType lhsResponseID;
            lhsResponseID = this.getResponseID();
            ResponseIDType rhsResponseID;
            rhsResponseID = that.getResponseID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseID", lhsResponseID), LocatorUtils.property(thatLocator, "responseID", rhsResponseID), lhsResponseID, rhsResponseID, (this.responseID!= null), (that.responseID!= null))) {
                return false;
            }
        }
        {
            ResponseIndicatorType lhsResponseIndicator;
            lhsResponseIndicator = this.getResponseIndicator();
            ResponseIndicatorType rhsResponseIndicator;
            rhsResponseIndicator = that.getResponseIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseIndicator", lhsResponseIndicator), LocatorUtils.property(thatLocator, "responseIndicator", rhsResponseIndicator), lhsResponseIndicator, rhsResponseIndicator, (this.responseIndicator!= null), (that.responseIndicator!= null))) {
                return false;
            }
        }
        {
            ResponseMeasureType lhsResponseMeasure;
            lhsResponseMeasure = this.getResponseMeasure();
            ResponseMeasureType rhsResponseMeasure;
            rhsResponseMeasure = that.getResponseMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseMeasure", lhsResponseMeasure), LocatorUtils.property(thatLocator, "responseMeasure", rhsResponseMeasure), lhsResponseMeasure, rhsResponseMeasure, (this.responseMeasure!= null), (that.responseMeasure!= null))) {
                return false;
            }
        }
        {
            ResponseNumericType lhsResponseNumeric;
            lhsResponseNumeric = this.getResponseNumeric();
            ResponseNumericType rhsResponseNumeric;
            rhsResponseNumeric = that.getResponseNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseNumeric", lhsResponseNumeric), LocatorUtils.property(thatLocator, "responseNumeric", rhsResponseNumeric), lhsResponseNumeric, rhsResponseNumeric, (this.responseNumeric!= null), (that.responseNumeric!= null))) {
                return false;
            }
        }
        {
            ResponseQuantityType lhsResponseQuantity;
            lhsResponseQuantity = this.getResponseQuantity();
            ResponseQuantityType rhsResponseQuantity;
            rhsResponseQuantity = that.getResponseQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseQuantity", lhsResponseQuantity), LocatorUtils.property(thatLocator, "responseQuantity", rhsResponseQuantity), lhsResponseQuantity, rhsResponseQuantity, (this.responseQuantity!= null), (that.responseQuantity!= null))) {
                return false;
            }
        }
        {
            ResponseTimeType lhsResponseTime;
            lhsResponseTime = this.getResponseTime();
            ResponseTimeType rhsResponseTime;
            rhsResponseTime = that.getResponseTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseTime", lhsResponseTime), LocatorUtils.property(thatLocator, "responseTime", rhsResponseTime), lhsResponseTime, rhsResponseTime, (this.responseTime!= null), (that.responseTime!= null))) {
                return false;
            }
        }
        {
            ResponseURIType lhsResponseURI;
            lhsResponseURI = this.getResponseURI();
            ResponseURIType rhsResponseURI;
            rhsResponseURI = that.getResponseURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseURI", lhsResponseURI), LocatorUtils.property(thatLocator, "responseURI", rhsResponseURI), lhsResponseURI, rhsResponseURI, (this.responseURI!= null), (that.responseURI!= null))) {
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ResponseType> theResponse;
            theResponse = (((this.response!= null)&&(!this.response.isEmpty()))?this.getResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "response", theResponse), currentHashCode, theResponse, ((this.response!= null)&&(!this.response.isEmpty())));
        }
        {
            ResponseAmountType theResponseAmount;
            theResponseAmount = this.getResponseAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseAmount", theResponseAmount), currentHashCode, theResponseAmount, (this.responseAmount!= null));
        }
        {
            ResponseBinaryObjectType theResponseBinaryObject;
            theResponseBinaryObject = this.getResponseBinaryObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseBinaryObject", theResponseBinaryObject), currentHashCode, theResponseBinaryObject, (this.responseBinaryObject!= null));
        }
        {
            ResponseCodeType theResponseCode;
            theResponseCode = this.getResponseCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseCode", theResponseCode), currentHashCode, theResponseCode, (this.responseCode!= null));
        }
        {
            ResponseDateType theResponseDate;
            theResponseDate = this.getResponseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDate", theResponseDate), currentHashCode, theResponseDate, (this.responseDate!= null));
        }
        {
            ResponseIDType theResponseID;
            theResponseID = this.getResponseID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseID", theResponseID), currentHashCode, theResponseID, (this.responseID!= null));
        }
        {
            ResponseIndicatorType theResponseIndicator;
            theResponseIndicator = this.getResponseIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseIndicator", theResponseIndicator), currentHashCode, theResponseIndicator, (this.responseIndicator!= null));
        }
        {
            ResponseMeasureType theResponseMeasure;
            theResponseMeasure = this.getResponseMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseMeasure", theResponseMeasure), currentHashCode, theResponseMeasure, (this.responseMeasure!= null));
        }
        {
            ResponseNumericType theResponseNumeric;
            theResponseNumeric = this.getResponseNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseNumeric", theResponseNumeric), currentHashCode, theResponseNumeric, (this.responseNumeric!= null));
        }
        {
            ResponseQuantityType theResponseQuantity;
            theResponseQuantity = this.getResponseQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseQuantity", theResponseQuantity), currentHashCode, theResponseQuantity, (this.responseQuantity!= null));
        }
        {
            ResponseTimeType theResponseTime;
            theResponseTime = this.getResponseTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseTime", theResponseTime), currentHashCode, theResponseTime, (this.responseTime!= null));
        }
        {
            ResponseURIType theResponseURI;
            theResponseURI = this.getResponseURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseURI", theResponseURI), currentHashCode, theResponseURI, (this.responseURI!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
