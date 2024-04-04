package uz.pdp.autoconfig;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.component.AProvider;

import java.security.Provider;

public class AutoConfigMain {
    @SneakyThrows
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(AutoConfig.class);
        /*AService aService = context.getBean(AService.class);
        System.out.println(System.identityHashCode(aService));
        aService.serve();

        AProvider aProvider = context.getBean(AProvider.class);
        aProvider.provide();*/

        /*ADao aDao = context.getBean(ADao.class);
        aDao.accessData();*/
        /*var datasourceConfig = context.getBean(DatasourceConfig.class);
        System.out.println(datasourceConfig.getDriver());
        System.out.println(datasourceConfig.getUrl());
        System.out.println(datasourceConfig.getUsername());
        System.out.println(datasourceConfig.getPassword());

        Thread.sleep(5000);*/

        A3Service service = context.getBean(A3Service.class);

        context.close();
    }
}
