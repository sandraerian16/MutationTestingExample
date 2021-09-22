package Testing;
import Main.MutationTesting;
import junit.framework.TestCase;

public class MutationTestingTest extends TestCase {


    public void testAdd1() {
        int result = new MutationTesting().add(2,0);
        assertEquals(2,result);
    }
    public void testAdd2() {
        int result = new MutationTesting().add(1,1);
        assertEquals(-2,result);
    }
    public void testAdd3() {
        int result = new MutationTesting().add(3,1);
        assertEquals(4,result);
    }
}
