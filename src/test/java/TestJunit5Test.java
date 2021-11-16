import Junit5Testing.TestJunit5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJunit5Test {
    TestJunit5 testJunit5 = new TestJunit5();
    @Test
    void testAdd(){
        int expected = 4;
        int actual = testJunit5.add(2, 2);
        assertEquals(expected, actual);
    }
}
