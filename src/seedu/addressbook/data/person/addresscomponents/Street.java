package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (street) in the address book.
 */
public class Street {
    
    private String streetValue;
    
    /**
     * Constructs an address component, Street
     */
    public Street (String street) {
        this.streetValue = street;    
    }
    
    /**
     * Gets the street value in this class
     */
    @Override
    public String toString() {
        return this.streetValue;
    }
    
    @Override
    public int hashCode() {
        return streetValue.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this //If they have same object
                || (obj instanceof Street 
                        && this.streetValue.equals(((Street)obj).streetValue)); //or check if they have same street value.
    }
}
