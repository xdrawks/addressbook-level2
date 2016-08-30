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
    public String getStreetValue() {
        return this.streetValue;
    }
    
    @Override
    public int hashCode() {
        return streetValue.hashCode();
    }
}
