package uz.pdp.autoconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.component.AProvider;

import java.security.Provider;

public class AutoConfigMain {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(AutoConfig.class);
        AService aService = context.getBean(AService.class);
        System.out.println(System.identityHashCode(aService));
        aService.serve();

        AProvider aProvider = context.getBean(AProvider.class);
        aProvider.provide();

        /*ADao aDao = context.getBean(ADao.class);
        aDao.accessData();*/
    }
}
