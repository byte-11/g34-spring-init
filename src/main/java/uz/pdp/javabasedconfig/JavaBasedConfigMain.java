package uz.pdp.javabasedconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppJavaConfiguration.class);
        /*System.out.println(System.identityHashCode(context.getBean(BService.class)));
        System.out.println(System.identityHashCode(context.getBean(BService.class)));
        System.out.println(System.identityHashCode(context.getBean(BService.class)));
        System.out.println(System.identityHashCode(context.getBean(BService.class)));
        System.out.println(System.identityHashCode(context.getBean(BService.class)));*/
        System.out.println(System.identityHashCode(context.getBean(BController.class).getBService()));
        System.out.println(System.identityHashCode(context.getBean(BController.class).getBService()));
        System.out.println(System.identityHashCode(context.getBean(BController.class).getBService()));
        System.out.println(System.identityHashCode(context.getBean(BController.class).getBService()));
        System.out.println(System.identityHashCode(context.getBean(BController.class).getBService()));
    }
}
