
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InactiveStatusType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InactiveStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InactiveIND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InactiveStatusType", propOrder = {
    "inactiveIND"
})
public class InactiveStatusType {

    @XmlElement(name = "InactiveIND", required = true)
    protected String inactiveIND;

    /**
     * 获取inactiveIND属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveIND() {
        return inactiveIND;
    }

    /**
     * 设置inactiveIND属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveIND(String value) {
        this.inactiveIND = value;
    }

}
