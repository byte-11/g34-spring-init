package uz.pdp.component;

import org.springframework.stereotype.Component;

@Component
public class AProvider {
    public void provide() {
        System.out.println("[" + AProvider.class.getName() + "] provide() method called");

    }

}
