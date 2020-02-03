
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddressKindChoiceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddressKindChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StreetAddress" type="{}StreetAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressKindChoiceType", propOrder = {
    "addressKind",
    "streetAddress"
})
public class AddressKindChoiceType {

    @XmlElement(name = "AddressKind", required = true)
    protected String addressKind;
    @XmlElement(name = "StreetAddress", required = true)
    protected StreetAddressType streetAddress;

    /**
     * 获取addressKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressKind() {
        return addressKind;
    }

    /**
     * 设置addressKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressKind(String value) {
        this.addressKind = value;
    }

    /**
     * 获取streetAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StreetAddressType }
     *     
     */
    public StreetAddressType getStreetAddress() {
        return streetAddress;
    }

    /**
     * 设置streetAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddressType }
     *     
     */
    public void setStreetAddress(StreetAddressType value) {
        this.streetAddress = value;
    }

}
