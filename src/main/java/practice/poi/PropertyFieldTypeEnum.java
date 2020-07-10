package practice.poi;

import java.util.EnumSet;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.StringUtils;

public enum PropertyFieldTypeEnum {

    TEXT, OPTION, DATE, CDATE, YEAR, MONTH, DAY, PRE_VALUE;

    private static final Map<String, PropertyFieldTypeEnum> ENUM_MAP = new ConcurrentHashMap<>();

    static {
        for (PropertyFieldTypeEnum type : EnumSet.allOf(PropertyFieldTypeEnum.class)) {
            ENUM_MAP.put(type.name(), type);
        }
    }

    public static PropertyFieldTypeEnum fromValue(String val) {
        if (StringUtils.isBlank(val)) {
            return PropertyFieldTypeEnum.TEXT;
        }
        return Optional
            .ofNullable(ENUM_MAP.get(StringUtils.upperCase(val)))
            .orElseThrow(
                () -> new EnumConstantNotPresentException(PropertyFieldTypeEnum.class, val));
    }

}