package mockito.bug;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        when(true).thenReturn(false);
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
