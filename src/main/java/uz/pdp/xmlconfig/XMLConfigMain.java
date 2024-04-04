package uz.pdp.xmlconfig;

import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigMain {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("app-context.xml");
        System.out.println(System.identityHashCode(System.identityHashCode(context.getBean(CController.class).getCService())));
        System.out.println(System.identityHashCode(System.identityHashCode(context.getBean(CController.class).getCService())));
        System.out.println(System.identityHashCode(System.identityHashCode(context.getBean(CController.class).getCService())));
        System.out.println(System.identityHashCode(System.identityHashCode(context.getBean(CController.class).getCService())));
        System.out.println(System.identityHashCode(System.identityHashCode(context.getBean(CController.class).getCService())));
    }
}
