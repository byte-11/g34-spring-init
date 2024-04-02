package uz.pdp.javabasedconfig;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DatasourceConfigInJavaBased.class})
public class JavaBasedConfig {

    /*@Bean
    public BService bService(){
        return new BService(bDao());
    }*/

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BService bService(BDao bDao){
        return new BService(bDao);
    }

    @Bean
    public BDao bDao(){
        return new BDao();
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
