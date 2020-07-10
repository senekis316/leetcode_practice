package practice;

import java.lang.reflect.Method;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}

//@Configuration
//public class PracticeApplication {
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext =
//            new AnnotationConfigApplicationContext(PracticeApplication.class);
//        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
//        System.out.println("getUserServiceBean:" + userService);
//
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(UserService.class);
//        enhancer.setUseFactory(false);
//        enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//        enhancer.setCallback(new CustomMethodInterceptor());
//        userService = (UserService) enhancer.create();
//        System.out.println("cglibUserService:" + userService);
//
//    }
//
//    @Bean
//    public UserService userService() {
//        return new UserService();
//    }
//
//    @Bean
//    public OrderService orderService() {
//        return new OrderService();
//    }
//
//    public static class UserService {
//        public UserService() {
//            System.out.println("Init UserService");
//        }
//    }
//
//    public static class OrderService {
//        public OrderService() {
//            System.out.println("Init OrderService");
//        }
//    }
//
//    public static class CustomMethodInterceptor implements MethodInterceptor {
//        @Override
//        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
//            throws Throwable {
//            System.out.println("interceptor method!");
//            return methodProxy.invokeSuper(o, objects);
//        }
//    }
//
//
//}

