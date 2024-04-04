package uz.pdp.autoconfig;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A3Service {
    private final AutoConfigBasedService service;

    public A3Service(AService service) {
        this.service = service;
    }

    /*public A3Service(@Qualifier("a2Service") AutoConfigBasedService service) {
        this.service = service;
    }*/


}
