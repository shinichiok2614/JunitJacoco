package junittest;

import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class GreaterTest {
//    private String name;
    @Test
    public void it_should_say_hello_properly(){
        Main main=new Main();
        Assert.assertEquals("Hellonull", main.hello());
    }
}
