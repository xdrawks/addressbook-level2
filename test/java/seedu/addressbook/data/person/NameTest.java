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
    
    @Test
    public void testIdenticalNameObject() throws IllegalValueException {
        Name name = new Name("Jason");
        assertEquals(name.isSimilar(name), true);
    }
    
    @Test
    public void testNullNameObject() throws IllegalValueException {
        Name name = new Name("Jason");
        assertEquals(name.isSimilar(null), false);
    }
    
    @Test
    public void testdifferentCaseName() throws IllegalValueException {
        Name name = new Name("Pikachu RAICHU");
        Name other = new Name("pIKACHU rAiChU");
        assertEquals(name.isSimilar(other), true);
    }
    
    @Test
    public void testdifferentOrderingName() throws IllegalValueException {
        Name name = new Name("Pikachu RAICHU piChu");
        Name other = new Name("pIKACHU pIChu rAiChU");
        assertEquals(name.isSimilar(other), true);
    }
    
    @Test
    public void testDifferentComplexName() throws IllegalValueException {
        Name name = new Name("Pikachu RAiICHU piChu");
        Name other = new Name("pIKACHU pIChu rAiChU");
        assertEquals(name.isSimilar(other), true);
    }

}
