package uz.pdp.spel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class LogicalOperation {

//    @Value("#{12 eq 2}")
    @Value("#{12 == 2}")
    private Boolean equal;

    @Value("#{12 > 2}")
    private Boolean grater;

    @Value("#{12 < 2}")
    private Boolean less;

    @Value("#{12 ge 2}")
    private Boolean graterOrEqual;

    @Value("#{12 le 2}")
    private Boolean lessOrEqual;
}
