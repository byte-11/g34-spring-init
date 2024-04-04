package uz.pdp.javabasedconfig;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppJavaConfiguration {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public BService bService() {
        return new BService();
    }

    @Bean
    public BController bController(ApplicationContext applicationContext){
        return new BController(applicationContext);
    }
}
