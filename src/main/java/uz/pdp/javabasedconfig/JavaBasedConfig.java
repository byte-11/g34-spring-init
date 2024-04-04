package uz.pdp.javabasedconfig;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DatasourceConfigInJavaBased.class})
public class JavaBasedConfig {

    /*@Bean
    public BBasedService bService(){
        return new BBasedService(bDao());
    }*/

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BBasedService bService(BDao bDao){
        return new BBasedService(bDao);
    }

    @Bean
    public BDao bDao(){
        return new BDao();
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

    @Bean
    public B2BasedService b2Service() {
        return new B2BasedService();
    }

    /*@Bean
    public B3Service b3Service(@Qualifier("bService") JavaBasedService service){
        return new B3Service(service);
    }*/

    /*@Bean
    public B3Service b3Service(B2BasedService service){
        return new B3Service(service);
    }*/

    @Bean
    public B3Service b3Service(){
        return new B3Service(b2Service());
    }
}






















