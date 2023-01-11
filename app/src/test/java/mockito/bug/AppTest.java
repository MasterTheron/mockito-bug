package mockito.bug;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class AppTest {
    @Test
    public void testFormatNotWorking() {
        when(true).thenReturn(false);
            App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testFormatWorking() {
        App classUnderTest = new App();
        when(true).thenReturn(false);
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
