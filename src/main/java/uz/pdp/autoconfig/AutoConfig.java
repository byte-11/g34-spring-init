package uz.pdp.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = {"uz.pdp.autoconfig", "uz.pdp.component"})
@Configuration
public class AutoConfig {
}
