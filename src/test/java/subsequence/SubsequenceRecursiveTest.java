package subsequence;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subhash
 */
public class SubsequenceRecursiveTest {
    
    public SubsequenceRecursiveTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllSubsequence method, of class SubsequenceRecursive.
     */
    @Test
    public void testGetAllSubsequence() {
        System.out.println("getAllSubsequence");
        String input = "abcdef";
        SubsequenceRecursive instance = new SubsequenceRecursive();
        List<String> result = instance.getAllSubsequence(input);
        System.out.println(result);
    }
    
}
