
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessPartnerCompoundType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessPartnerCompoundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerIdentifier" type="{}PartnerIdentifierType"/>
 *         &lt;element name="Partner" type="{}PartnerType"/>
 *         &lt;element name="CustomerDetails" type="{}CustomerDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartnerCompoundType", propOrder = {
    "partnerIdentifier",
    "partner",
    "customerDetails"
})
public class BusinessPartnerCompoundType {

    @XmlElement(name = "PartnerIdentifier", required = true)
    protected PartnerIdentifierType partnerIdentifier;
    @XmlElement(name = "Partner", required = true)
    protected PartnerType partner;
    @XmlElement(name = "CustomerDetails", required = true)
    protected CustomerDetailsType customerDetails;

    /**
     * 获取partnerIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentifierType }
     *     
     */
    public PartnerIdentifierType getPartnerIdentifier() {
        return partnerIdentifier;
    }

    /**
     * 设置partnerIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentifierType }
     *     
     */
    public void setPartnerIdentifier(PartnerIdentifierType value) {
        this.partnerIdentifier = value;
    }

    /**
     * 获取partner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerType }
     *     
     */
    public PartnerType getPartner() {
        return partner;
    }

    /**
     * 设置partner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerType }
     *     
     */
    public void setPartner(PartnerType value) {
        this.partner = value;
    }

    /**
     * 获取customerDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetailsType }
     *     
     */
    public CustomerDetailsType getCustomerDetails() {
        return customerDetails;
    }

    /**
     * 设置customerDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetailsType }
     *     
     */
    public void setCustomerDetails(CustomerDetailsType value) {
        this.customerDetails = value;
    }

}
