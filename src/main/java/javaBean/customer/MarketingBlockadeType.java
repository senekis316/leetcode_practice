
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MarketingBlockadeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MarketingBlockadeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlockType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BlockedIND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingBlockadeType", propOrder = {
    "blockType",
    "blockedIND"
})
public class MarketingBlockadeType {

    @XmlElement(name = "BlockType", required = true)
    protected String blockType;
    @XmlElement(name = "BlockedIND", required = true)
    protected String blockedIND;

    /**
     * 获取blockType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockType() {
        return blockType;
    }

    /**
     * 设置blockType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockType(String value) {
        this.blockType = value;
    }

    /**
     * 获取blockedIND属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedIND() {
        return blockedIND;
    }

    /**
     * 设置blockedIND属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedIND(String value) {
        this.blockedIND = value;
    }

}
