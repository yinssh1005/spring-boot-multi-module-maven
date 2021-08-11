import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsingBeans {
    @Autowired
    MyType beanName; //GoTo action only navigates to usage below

    public void useBean() {
        beanName.doStuff(); //this is the place that is navigated to
    }
}