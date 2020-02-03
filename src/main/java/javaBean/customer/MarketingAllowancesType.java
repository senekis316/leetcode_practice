
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MarketingAllowancesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MarketingAllowancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketingAllowance" type="{}MarketingAllowanceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingAllowancesType", propOrder = {
    "marketingAllowance"
})
public class MarketingAllowancesType {

    @XmlElement(name = "MarketingAllowance", required = true)
    protected MarketingAllowanceType marketingAllowance;

    /**
     * 获取marketingAllowance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MarketingAllowanceType }
     *     
     */
    public MarketingAllowanceType getMarketingAllowance() {
        return marketingAllowance;
    }

    /**
     * 设置marketingAllowance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingAllowanceType }
     *     
     */
    public void setMarketingAllowance(MarketingAllowanceType value) {
        this.marketingAllowance = value;
    }

}
