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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ArticleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CardinalityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.JurisdictionLevelType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TitleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.URIType;
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
 * <p>Classe Java per LegislationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LegislationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Title" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Cardinality" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JurisdictionLevel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Article" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}URI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}JurisdictionRegionAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislationType", propOrder = {
    "id",
    "title",
    "description",
    "cardinality",
    "jurisdictionLevel",
    "article",
    "uri",
    "language",
    "jurisdictionRegionAddress"
})
public class LegislationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Title", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TitleType> title;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Cardinality", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardinalityType cardinality;
    @XmlElement(name = "JurisdictionLevel", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<JurisdictionLevelType> jurisdictionLevel;
    @XmlElement(name = "Article", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ArticleType> article;
    @XmlElement(name = "URI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<URIType> uri;
    @XmlElement(name = "Language")
    protected List<LanguageType> language;
    @XmlElement(name = "JurisdictionRegionAddress")
    protected List<AddressType> jurisdictionRegionAddress;

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
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleType }
     * 
     * 
     */
    public List<TitleType> getTitle() {
        if (title == null) {
            title = new ArrayList<TitleType>();
        }
        return this.title;
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
     * Recupera il valore della proprietà cardinality.
     * 
     * @return
     *     possible object is
     *     {@link CardinalityType }
     *     
     */
    public CardinalityType getCardinality() {
        return cardinality;
    }

    /**
     * Imposta il valore della proprietà cardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link CardinalityType }
     *     
     */
    public void setCardinality(CardinalityType value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the jurisdictionLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JurisdictionLevelType }
     * 
     * 
     */
    public List<JurisdictionLevelType> getJurisdictionLevel() {
        if (jurisdictionLevel == null) {
            jurisdictionLevel = new ArrayList<JurisdictionLevelType>();
        }
        return this.jurisdictionLevel;
    }

    /**
     * Gets the value of the article property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the article property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleType }
     * 
     * 
     */
    public List<ArticleType> getArticle() {
        if (article == null) {
            article = new ArrayList<ArticleType>();
        }
        return this.article;
    }

    /**
     * Gets the value of the uri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URIType }
     * 
     * 
     */
    public List<URIType> getURI() {
        if (uri == null) {
            uri = new ArrayList<URIType>();
        }
        return this.uri;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the jurisdictionRegionAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionRegionAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionRegionAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getJurisdictionRegionAddress() {
        if (jurisdictionRegionAddress == null) {
            jurisdictionRegionAddress = new ArrayList<AddressType>();
        }
        return this.jurisdictionRegionAddress;
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
            List<TitleType> theTitle;
            theTitle = (((this.title!= null)&&(!this.title.isEmpty()))?this.getTitle():null);
            strategy.appendField(locator, this, "title", buffer, theTitle, ((this.title!= null)&&(!this.title.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CardinalityType theCardinality;
            theCardinality = this.getCardinality();
            strategy.appendField(locator, this, "cardinality", buffer, theCardinality, (this.cardinality!= null));
        }
        {
            List<JurisdictionLevelType> theJurisdictionLevel;
            theJurisdictionLevel = (((this.jurisdictionLevel!= null)&&(!this.jurisdictionLevel.isEmpty()))?this.getJurisdictionLevel():null);
            strategy.appendField(locator, this, "jurisdictionLevel", buffer, theJurisdictionLevel, ((this.jurisdictionLevel!= null)&&(!this.jurisdictionLevel.isEmpty())));
        }
        {
            List<ArticleType> theArticle;
            theArticle = (((this.article!= null)&&(!this.article.isEmpty()))?this.getArticle():null);
            strategy.appendField(locator, this, "article", buffer, theArticle, ((this.article!= null)&&(!this.article.isEmpty())));
        }
        {
            List<URIType> theURI;
            theURI = (((this.uri!= null)&&(!this.uri.isEmpty()))?this.getURI():null);
            strategy.appendField(locator, this, "uri", buffer, theURI, ((this.uri!= null)&&(!this.uri.isEmpty())));
        }
        {
            List<LanguageType> theLanguage;
            theLanguage = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            strategy.appendField(locator, this, "language", buffer, theLanguage, ((this.language!= null)&&(!this.language.isEmpty())));
        }
        {
            List<AddressType> theJurisdictionRegionAddress;
            theJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            strategy.appendField(locator, this, "jurisdictionRegionAddress", buffer, theJurisdictionRegionAddress, ((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty())));
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
        final LegislationType that = ((LegislationType) object);
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
            List<TitleType> lhsTitle;
            lhsTitle = (((this.title!= null)&&(!this.title.isEmpty()))?this.getTitle():null);
            List<TitleType> rhsTitle;
            rhsTitle = (((that.title!= null)&&(!that.title.isEmpty()))?that.getTitle():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, ((this.title!= null)&&(!this.title.isEmpty())), ((that.title!= null)&&(!that.title.isEmpty())))) {
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
            CardinalityType lhsCardinality;
            lhsCardinality = this.getCardinality();
            CardinalityType rhsCardinality;
            rhsCardinality = that.getCardinality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardinality", lhsCardinality), LocatorUtils.property(thatLocator, "cardinality", rhsCardinality), lhsCardinality, rhsCardinality, (this.cardinality!= null), (that.cardinality!= null))) {
                return false;
            }
        }
        {
            List<JurisdictionLevelType> lhsJurisdictionLevel;
            lhsJurisdictionLevel = (((this.jurisdictionLevel!= null)&&(!this.jurisdictionLevel.isEmpty()))?this.getJurisdictionLevel():null);
            List<JurisdictionLevelType> rhsJurisdictionLevel;
            rhsJurisdictionLevel = (((that.jurisdictionLevel!= null)&&(!that.jurisdictionLevel.isEmpty()))?that.getJurisdictionLevel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jurisdictionLevel", lhsJurisdictionLevel), LocatorUtils.property(thatLocator, "jurisdictionLevel", rhsJurisdictionLevel), lhsJurisdictionLevel, rhsJurisdictionLevel, ((this.jurisdictionLevel!= null)&&(!this.jurisdictionLevel.isEmpty())), ((that.jurisdictionLevel!= null)&&(!that.jurisdictionLevel.isEmpty())))) {
                return false;
            }
        }
        {
            List<ArticleType> lhsArticle;
            lhsArticle = (((this.article!= null)&&(!this.article.isEmpty()))?this.getArticle():null);
            List<ArticleType> rhsArticle;
            rhsArticle = (((that.article!= null)&&(!that.article.isEmpty()))?that.getArticle():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "article", lhsArticle), LocatorUtils.property(thatLocator, "article", rhsArticle), lhsArticle, rhsArticle, ((this.article!= null)&&(!this.article.isEmpty())), ((that.article!= null)&&(!that.article.isEmpty())))) {
                return false;
            }
        }
        {
            List<URIType> lhsURI;
            lhsURI = (((this.uri!= null)&&(!this.uri.isEmpty()))?this.getURI():null);
            List<URIType> rhsURI;
            rhsURI = (((that.uri!= null)&&(!that.uri.isEmpty()))?that.getURI():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsURI), LocatorUtils.property(thatLocator, "uri", rhsURI), lhsURI, rhsURI, ((this.uri!= null)&&(!this.uri.isEmpty())), ((that.uri!= null)&&(!that.uri.isEmpty())))) {
                return false;
            }
        }
        {
            List<LanguageType> lhsLanguage;
            lhsLanguage = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            List<LanguageType> rhsLanguage;
            rhsLanguage = (((that.language!= null)&&(!that.language.isEmpty()))?that.getLanguage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, ((this.language!= null)&&(!this.language.isEmpty())), ((that.language!= null)&&(!that.language.isEmpty())))) {
                return false;
            }
        }
        {
            List<AddressType> lhsJurisdictionRegionAddress;
            lhsJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            List<AddressType> rhsJurisdictionRegionAddress;
            rhsJurisdictionRegionAddress = (((that.jurisdictionRegionAddress!= null)&&(!that.jurisdictionRegionAddress.isEmpty()))?that.getJurisdictionRegionAddress():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jurisdictionRegionAddress", lhsJurisdictionRegionAddress), LocatorUtils.property(thatLocator, "jurisdictionRegionAddress", rhsJurisdictionRegionAddress), lhsJurisdictionRegionAddress, rhsJurisdictionRegionAddress, ((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty())), ((that.jurisdictionRegionAddress!= null)&&(!that.jurisdictionRegionAddress.isEmpty())))) {
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
            List<TitleType> theTitle;
            theTitle = (((this.title!= null)&&(!this.title.isEmpty()))?this.getTitle():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, ((this.title!= null)&&(!this.title.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CardinalityType theCardinality;
            theCardinality = this.getCardinality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardinality", theCardinality), currentHashCode, theCardinality, (this.cardinality!= null));
        }
        {
            List<JurisdictionLevelType> theJurisdictionLevel;
            theJurisdictionLevel = (((this.jurisdictionLevel!= null)&&(!this.jurisdictionLevel.isEmpty()))?this.getJurisdictionLevel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jurisdictionLevel", theJurisdictionLevel), currentHashCode, theJurisdictionLevel, ((this.jurisdictionLevel!= null)&&(!this.jurisdictionLevel.isEmpty())));
        }
        {
            List<ArticleType> theArticle;
            theArticle = (((this.article!= null)&&(!this.article.isEmpty()))?this.getArticle():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "article", theArticle), currentHashCode, theArticle, ((this.article!= null)&&(!this.article.isEmpty())));
        }
        {
            List<URIType> theURI;
            theURI = (((this.uri!= null)&&(!this.uri.isEmpty()))?this.getURI():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theURI), currentHashCode, theURI, ((this.uri!= null)&&(!this.uri.isEmpty())));
        }
        {
            List<LanguageType> theLanguage;
            theLanguage = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage, ((this.language!= null)&&(!this.language.isEmpty())));
        }
        {
            List<AddressType> theJurisdictionRegionAddress;
            theJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jurisdictionRegionAddress", theJurisdictionRegionAddress), currentHashCode, theJurisdictionRegionAddress, ((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
