package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (postal code) in this address book
 */
public class PostalCode {
    
    private String postalCodeValue;
    
    /**
     * Constructs an address component, postal code
     */
    public PostalCode (String postalCode) {
        this.postalCodeValue = postalCode;
    }
    
    /**
     * Gets the postal code value in this class
     */
    public String getPostalCodeValue() {
        return this.postalCodeValue;
    }
    
    @Override
    public int hashCode() {
        return postalCodeValue.hashCode();
    }

}
