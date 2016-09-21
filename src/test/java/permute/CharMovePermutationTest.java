package permute;

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
public class CharMovePermutationTest {
    
    public CharMovePermutationTest() {
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
     * Test of dispPermutes method, of class CharMovePermutation.
     */
    @Test
    public void testDispPermutes() {
        System.out.println("CharMovePermutation.dispPermutes()");
        String input = "abc";
        CharMovePermutation instance = new CharMovePermutation();
        instance.dispPermutes(input);
    }
    
}
