package uz.pdp.xmlbasedconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.javabasedconfig.DatasourceConfigInJavaBased;

public class XMLBasedConfigMain {
    public static void main(String[] args) throws InterruptedException {
//        final var context = new ClassPathXmlApplicationContext("classpath:app-context.xml");
        final var context = new ClassPathXmlApplicationContext("app-context.xml");
        /*CService cService = context.getBean(CService.class);
        cService.serve();*/

        /*MailConfigProperties mailConfigProperties = context.getBean(MailConfigProperties.class);
        System.out.println(mailConfigProperties);*/

        /*C3Service c3Service = context.getBean(C3Service.class);
        System.out.println(c3Service.toString());*/

        /*CDao cDao = context.getBean(CDao.class);
        cDao.accessData();*/
        var datasourceConfig = context.getBean(DatasourceConfigXmlBased.class);
        System.out.println(datasourceConfig.getDriver());
        System.out.println(datasourceConfig.getUrl());
        System.out.println(datasourceConfig.getUsername());
        System.out.println(datasourceConfig.getPassword());
        Thread.sleep(5000);
        context.close();
    }
}
