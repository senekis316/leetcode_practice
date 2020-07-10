package practice.poi;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WXPFDocumentExtendReader {

    private static final String REGEX = "\\$\\{(?<fieldName>[a-zA-Z]+)\\}";

    private static final Pattern PATTERN = Pattern.compile(REGEX);

    private WXPFDocumentExtendReader() {

    }

    public static Collection<String> readPropertyNames(XWPFDocumentExtend document) {
        Matcher matcher = PATTERN.matcher(document.getAllParagraphText());
        return readPropertyNames(matcher);
    }

    private static Collection<String> readPropertyNames(
        Matcher matcher) {
        Set<String> propertyNames = new HashSet<>();
        while (matcher.find()) {
            String fieldName = matcher.group("fieldName");
            propertyNames.add(fieldName);
        }
        return propertyNames;
    }

}
