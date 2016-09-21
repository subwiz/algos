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
public class CharSwappingPermutationTest {
    
    public CharSwappingPermutationTest() {
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
     * Test of dispPermutes method, of class CharSwappingPermutation.
     */
    @Test
    public void testDispPermutes() {
        System.out.println("CharSwappingPermutation.dispPermutes()");
        String input = "abc";
        CharSwappingPermutation instance = new CharSwappingPermutation();
        instance.dispPermutes(input);
    }
    
}
