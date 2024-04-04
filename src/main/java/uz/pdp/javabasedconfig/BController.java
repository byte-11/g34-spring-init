package uz.pdp.javabasedconfig;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;

import java.util.function.Supplier;

public class BController {

    private final ApplicationContext applicationContext;

    public BController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    public BService getBService() {
        return applicationContext.getBean(BService.class);
    }
}
