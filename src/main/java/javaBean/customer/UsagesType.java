
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UsagesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UsagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Usage" type="{}UsageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsagesType", propOrder = {
    "usage"
})
public class UsagesType {

    @XmlElement(name = "Usage", required = true)
    protected UsageType usage;

    /**
     * 获取usage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UsageType }
     *     
     */
    public UsageType getUsage() {
        return usage;
    }

    /**
     * 设置usage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UsageType }
     *     
     */
    public void setUsage(UsageType value) {
        this.usage = value;
    }

}
