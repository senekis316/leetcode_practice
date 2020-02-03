
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProcessingInformationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timestamps" type="{}TimestampsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingInformationType", propOrder = {
    "timestamps"
})
public class ProcessingInformationType {

    @XmlElement(name = "Timestamps", required = true)
    protected TimestampsType timestamps;

    /**
     * 获取timestamps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimestampsType }
     *     
     */
    public TimestampsType getTimestamps() {
        return timestamps;
    }

    /**
     * 设置timestamps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampsType }
     *     
     */
    public void setTimestamps(TimestampsType value) {
        this.timestamps = value;
    }

}
