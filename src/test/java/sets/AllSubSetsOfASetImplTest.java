package sets;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
public class AllSubSetsOfASetImplTest {
    
    public AllSubSetsOfASetImplTest() {
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
     * Test of subSetsOf method, of class AllSubSetsOfASetImpl.
     */
    @Test
    public void testSubSetsOf() {
        System.out.println("subSetsOf");
        List<Integer> input = Arrays.asList(new Integer[]{1,2,3,4,5});;
        AllSubSetsOfASet instance = new AllSubSetsOfASetImpl();
        Set<List<Integer>> result = instance.subSetsOf(input);
        int i = 1;
        for(List<Integer> l: result) {
            System.out.println(i + ": " + l);
            i++;
        }
    }
    
}
