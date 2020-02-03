
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddressType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressID" type="{}AddressIDType"/>
 *         &lt;element name="IsStandardAddressIND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddressKindChoice" type="{}AddressKindChoiceType"/>
 *         &lt;element name="Usages" type="{}UsagesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressID",
    "isStandardAddressIND",
    "addressKindChoice",
    "usages"
})
public class AddressType {

    @XmlElement(name = "AddressID", required = true)
    protected AddressIDType addressID;
    @XmlElement(name = "IsStandardAddressIND", required = true)
    protected String isStandardAddressIND;
    @XmlElement(name = "AddressKindChoice", required = true)
    protected AddressKindChoiceType addressKindChoice;
    @XmlElement(name = "Usages", required = true)
    protected UsagesType usages;

    /**
     * 获取addressID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressIDType }
     *     
     */
    public AddressIDType getAddressID() {
        return addressID;
    }

    /**
     * 设置addressID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressIDType }
     *     
     */
    public void setAddressID(AddressIDType value) {
        this.addressID = value;
    }

    /**
     * 获取isStandardAddressIND属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStandardAddressIND() {
        return isStandardAddressIND;
    }

    /**
     * 设置isStandardAddressIND属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStandardAddressIND(String value) {
        this.isStandardAddressIND = value;
    }

    /**
     * 获取addressKindChoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressKindChoiceType }
     *     
     */
    public AddressKindChoiceType getAddressKindChoice() {
        return addressKindChoice;
    }

    /**
     * 设置addressKindChoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressKindChoiceType }
     *     
     */
    public void setAddressKindChoice(AddressKindChoiceType value) {
        this.addressKindChoice = value;
    }

    /**
     * 获取usages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UsagesType }
     *     
     */
    public UsagesType getUsages() {
        return usages;
    }

    /**
     * 设置usages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UsagesType }
     *     
     */
    public void setUsages(UsagesType value) {
        this.usages = value;
    }

}
