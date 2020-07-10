package study.spring.validator;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.DataBinder;


@Configuration
public class DataBinderApplication {

    public static void main(String[] args) {
        Map<String, Object> source = new HashMap<>();
        source.put("id", 1);
        source.put("age", 18);
        source.put("name", "yfx");
        source.put("company.name", "geekTime");

        User user = new User();
        PropertyValues propertyValues = new MutablePropertyValues(source);

        DataBinder binder = new DataBinder(user, "");
        binder.setIgnoreUnknownFields(false);
        binder.bind(propertyValues);

        System.out.println(user);
    }

    @Data
    public static class User {
        private Integer id;
        private Integer age;
        private String name;
        private Company company;
    }

    @Data
    public static class Company {
        private String name;
    }

}
