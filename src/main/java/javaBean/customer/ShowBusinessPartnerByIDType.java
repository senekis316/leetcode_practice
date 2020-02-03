
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShowBusinessPartnerByIDType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShowBusinessPartnerByIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessPartnerCompound" type="{}BusinessPartnerCompoundType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShowBusinessPartnerByIDType", propOrder = {
    "businessPartnerCompound"
})
public class ShowBusinessPartnerByIDType {

    @XmlElement(name = "BusinessPartnerCompound", required = true)
    protected BusinessPartnerCompoundType businessPartnerCompound;

    /**
     * 获取businessPartnerCompound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerCompoundType }
     *     
     */
    public BusinessPartnerCompoundType getBusinessPartnerCompound() {
        return businessPartnerCompound;
    }

    /**
     * 设置businessPartnerCompound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerCompoundType }
     *     
     */
    public void setBusinessPartnerCompound(BusinessPartnerCompoundType value) {
        this.businessPartnerCompound = value;
    }

}
