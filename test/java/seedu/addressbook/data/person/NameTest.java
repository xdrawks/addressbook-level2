package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    @Test
    public void testIdenticalName() throws IllegalValueException {
        Name name = new Name("Jason");
        Name other = new Name("Jason");
        assertEquals(name.isSimilar(other), true);
    }
    
    @Test
    public void testDifferentName() throws IllegalValueException {
        Name name = new Name("Jason");
        Name other = new Name("Mary");
        assertEquals(name.isSimilar(other), false);
    }

}
