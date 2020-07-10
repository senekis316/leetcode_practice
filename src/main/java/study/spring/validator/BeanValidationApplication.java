package study.spring.validator;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;


@Configuration
public class BeanValidationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(BeanValidationApplication.class);
        UserProcessor userProcessor = applicationContext.getBean(UserProcessor.class);
        userProcessor.processUser(new User());
        applicationContext.close();
    }

    @Bean
    public LocalValidatorFactoryBean getLocalValidatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor(LocalValidatorFactoryBean localValidatorFactoryBean) {
        MethodValidationPostProcessor methodValidationPostProcessor = new MethodValidationPostProcessor();
        methodValidationPostProcessor.setValidator(localValidatorFactoryBean);
        return methodValidationPostProcessor;
    }

    @Component
    @Validated
    static class UserProcessor {
        public void processUser(@Valid User user) {
            System.out.println(user);
        }
    }

    @Validated
    public static class User {

        @NotNull
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}

