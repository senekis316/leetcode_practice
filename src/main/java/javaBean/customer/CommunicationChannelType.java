
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommunicationChannelType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CommunicationChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsStandardIND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChannelTypeChoice" type="{}ChannelTypeChoiceType"/>
 *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannelType", propOrder = {
    "isStandardIND",
    "channelTypeChoice",
    "usage"
})
public class CommunicationChannelType {

    @XmlElement(name = "IsStandardIND", required = true)
    protected String isStandardIND;
    @XmlElement(name = "ChannelTypeChoice", required = true)
    protected ChannelTypeChoiceType channelTypeChoice;
    @XmlElement(name = "Usage", required = true)
    protected String usage;

    /**
     * 获取isStandardIND属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStandardIND() {
        return isStandardIND;
    }

    /**
     * 设置isStandardIND属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStandardIND(String value) {
        this.isStandardIND = value;
    }

    /**
     * 获取channelTypeChoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChannelTypeChoiceType }
     *     
     */
    public ChannelTypeChoiceType getChannelTypeChoice() {
        return channelTypeChoice;
    }

    /**
     * 设置channelTypeChoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelTypeChoiceType }
     *     
     */
    public void setChannelTypeChoice(ChannelTypeChoiceType value) {
        this.channelTypeChoice = value;
    }

    /**
     * 获取usage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * 设置usage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

}
