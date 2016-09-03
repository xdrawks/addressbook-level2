package seedu.addressbook.common;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;

public class UtilsTest {
    
    @Test
    public void testNoNull() {   
        assertEquals(Utils.isAnyNull(1, 2, "Happy", 2.34, true, false, 3, 4, 5, 6, 7, 8, 9, 0), false);
    }
    
    @Test
    public void testOneNull() {   
        assertEquals(Utils.isAnyNull("well", 12, "well", "13", null, 15.6), true);
    }
    
    @Test
    public void testAllUnique() {      
        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 0; i < 100; i ++) {
            items.add(i);
        }
        assertEquals(Utils.elementsAreUnique(items), true);
    }
    
    @Test
    public void testOneUnique() {      
        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 0; i < 100; i ++) {
            items.add(i);
        }
        items.add(10);
        assertEquals(Utils.elementsAreUnique(items), false);
    }
    
}
