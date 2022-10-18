package Hello;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreeterTest {
    private Greeter greeter=new Greeter();

    @Test
    public void greeterSaysHello(){
        assertThat(greeter.sayHello(),containsString("Aloha"));
    }




}
