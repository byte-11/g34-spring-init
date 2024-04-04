package uz.pdp.autoconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoConfigMain {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(AppAutoConfiguration.class);
        /*System.out.println(System.identityHashCode(context.getBean(AService.class)));
        System.out.println(System.identityHashCode(context.getBean(AService.class)));
        System.out.println(System.identityHashCode(context.getBean(AService.class)));
        System.out.println(System.identityHashCode(context.getBean(AService.class)));
        System.out.println(System.identityHashCode(context.getBean(AService.class)));
        System.out.println(System.identityHashCode(context.getBean(AService.class)));*/
        System.out.println(System.identityHashCode(context.getBean(AController.class).getaService()));
        System.out.println(System.identityHashCode(context.getBean(AController.class).getaService()));
        System.out.println(System.identityHashCode(context.getBean(AController.class).getaService()));
        System.out.println(System.identityHashCode(context.getBean(AController.class).getaService()));
        System.out.println(System.identityHashCode(context.getBean(AController.class).getaService()));
    }
}
