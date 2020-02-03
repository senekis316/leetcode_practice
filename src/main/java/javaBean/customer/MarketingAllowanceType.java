
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MarketingAllowanceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MarketingAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralMarketingAllowanceIND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketingBlockades" type="{}MarketingBlockadesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingAllowanceType", propOrder = {
    "generalMarketingAllowanceIND",
    "marketingBlockades"
})
public class MarketingAllowanceType {

    @XmlElement(name = "GeneralMarketingAllowanceIND", required = true)
    protected String generalMarketingAllowanceIND;
    @XmlElement(name = "MarketingBlockades", required = true)
    protected MarketingBlockadesType marketingBlockades;

    /**
     * 获取generalMarketingAllowanceIND属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralMarketingAllowanceIND() {
        return generalMarketingAllowanceIND;
    }

    /**
     * 设置generalMarketingAllowanceIND属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralMarketingAllowanceIND(String value) {
        this.generalMarketingAllowanceIND = value;
    }

    /**
     * 获取marketingBlockades属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MarketingBlockadesType }
     *     
     */
    public MarketingBlockadesType getMarketingBlockades() {
        return marketingBlockades;
    }

    /**
     * 设置marketingBlockades属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingBlockadesType }
     *     
     */
    public void setMarketingBlockades(MarketingBlockadesType value) {
        this.marketingBlockades = value;
    }

}
