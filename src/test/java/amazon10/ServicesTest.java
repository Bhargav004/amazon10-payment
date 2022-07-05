
package amazon10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ServicesTest {
    @Test
    public void testJavaFactorial() {
        Number n = Services.getDefault().algorithms.java(3);
        assertEquals("Factorial of 3", 6, n.intValue());
    }

    @Test
    public void testJavaScriptFactorial() {
        Number n = Services.getDefault().algorithms.js(3);
        assertEquals("Factorial of 3", 6, n.intValue());
    }


}
