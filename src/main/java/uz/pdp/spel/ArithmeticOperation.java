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
public class ArithmeticOperation {

    @Value("#{2 + 2}")
    private Integer add;

    @Value("#{12 * 2}")
    private Integer multiply;

    @Value("#{12 - 2}")
    private Integer subtract;

    @Value("#{12 ^ 2}")
    private Integer power;

    @Value("#{12 / 2}")
    private Integer divide;

    @Value("#{2 % 2}")
    private Integer module;
}
