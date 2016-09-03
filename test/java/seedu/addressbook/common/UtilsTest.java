package seedu.addressbook.common;

public class UtilsTest {
    
    @Test
    public void testNoNull() {   
        assertEquals(Utils.isAnyNull(1, 2, "Happy", 2.34, true, false, 3, 4, 5, 6, 7, 8, 9, 0), false);
    }
}
