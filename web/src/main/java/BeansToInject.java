import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansToInject{
    @Bean
    public MyType beanName(){ //this is not navigated to
        return new MyType();
    }
}