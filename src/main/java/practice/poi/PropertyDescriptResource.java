package practice.poi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Collection;

@JsonInclude(Include.NON_NULL)
public class PropertyDescriptResource {

    private String fieldName;
    private String fieldValue;
    private String chineseName;
    private PropertyFieldTypeEnum fieldType;
    private Collection<String> options;

    public PropertyDescriptResource() {

    }

    public PropertyDescriptResource(String fieldName, String chineseName, PropertyFieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        this.fieldName = fieldName;
        this.chineseName = chineseName;
    }

    public PropertyDescriptResource(String fieldName, String chineseName, PropertyFieldTypeEnum fieldType, Collection<String> options) {
        this(fieldName, chineseName, fieldType);
        this.options = options;
    }

    public PropertyFieldTypeEnum getFieldType() {
        return fieldType;
    }

    public void setFieldType(PropertyFieldTypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Collection<String> getOptions() {
        return options;
    }

    public void setOptions(Collection<String> options) {
        this.options = options;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

}