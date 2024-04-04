package uz.pdp.javabasedconfig;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigMain {
    @SneakyThrows
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
        /*BBasedService bService = context.getBean(BBasedService.class);
        bService.serve();

        BDao bDao = context.getBean(BDao.class);
        bDao.accessData();*/
        /*var datasourceConfig = context.getBean(DatasourceConfigInJavaBased.class);
        System.out.println(datasourceConfig.getDriver());
        System.out.println(datasourceConfig.getUrl());
        System.out.println(datasourceConfig.getUsername());
        System.out.println(datasourceConfig.getPassword());
        Thread.sleep(5000);*/

        B3Service b3Service = context.getBean(B3Service.class);

        context.close();
    }
}
