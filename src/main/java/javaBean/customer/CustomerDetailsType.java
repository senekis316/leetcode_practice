
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketingAllowances" type="{}MarketingAllowancesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetailsType", propOrder = {
    "marketingAllowances"
})
public class CustomerDetailsType {

    @XmlElement(name = "MarketingAllowances", required = true)
    protected MarketingAllowancesType marketingAllowances;

    /**
     * 获取marketingAllowances属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MarketingAllowancesType }
     *     
     */
    public MarketingAllowancesType getMarketingAllowances() {
        return marketingAllowances;
    }

    /**
     * 设置marketingAllowances属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingAllowancesType }
     *     
     */
    public void setMarketingAllowances(MarketingAllowancesType value) {
        this.marketingAllowances = value;
    }

}
