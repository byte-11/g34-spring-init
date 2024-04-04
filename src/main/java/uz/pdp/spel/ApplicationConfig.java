package uz.pdp.spel;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("uz.pdp")
@Getter
@Setter
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Value("#{'${application.name}'.toUpperCase}")
    public String applicationName;
}
