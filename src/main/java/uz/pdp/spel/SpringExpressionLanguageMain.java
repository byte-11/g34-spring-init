package uz.pdp.spel;

import lombok.val;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringExpressionLanguageMain {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'My first Expression'.toUpperCase");;
        Object value = expression.getValue();
        System.out.println(value);

        var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationConfig applicationConfig = context.getBean(ApplicationConfig.class);
        System.out.println(applicationConfig.getApplicationName());

        var arithmeticOperation = context.getBean(ArithmeticOperation.class);
        System.out.println(arithmeticOperation.toString());

        System.out.println(context.getBean(LogicalOperation.class).toString());
    }
}
