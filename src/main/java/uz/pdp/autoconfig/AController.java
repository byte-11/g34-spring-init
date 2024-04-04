package uz.pdp.autoconfig;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
@Getter
public class AController {

    private AService aService;

    @Autowired
    public void setAService(AService aService) {
        this.aService = aService;
    }

    @Lookup
    public AService getaService() {
        return aService;
    }
}
