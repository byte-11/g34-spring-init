package uz.pdp.xmlbasedconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBasedConfigMain {
    public static void main(String[] args) {
//        final var context = new ClassPathXmlApplicationContext("classpath:app-context.xml");
        final var context = new ClassPathXmlApplicationContext("app-context.xml");
        CService cService = context.getBean(CService.class);
        cService.serve();

        /*CDao cDao = context.getBean(CDao.class);
        cDao.accessData();*/
    }
}
