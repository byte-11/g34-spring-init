package uz.pdp.javabasedconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigMain {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
        BService bService = context.getBean(BService.class);
        bService.serve();

        BDao bDao = context.getBean(BDao.class);
        bDao.accessData();
    }
}
