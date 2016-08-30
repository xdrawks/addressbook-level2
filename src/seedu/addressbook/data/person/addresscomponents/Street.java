package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (street) in the address book.
 */
public class Street {
    
    private String streetValue;
    
    /**
     * Constructs an address component, Street
     */
    public Street (String street){
        this.streetValue = street;    
    }
    
    /**
     * Gets the street String in this class
     */
    public String getStreet(){
        return this.streetValue;
    }
}
