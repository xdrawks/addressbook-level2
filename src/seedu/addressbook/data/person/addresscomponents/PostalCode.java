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

    @Override
    public boolean equals(Object obj) {
        return obj == this //If they have same object
                || (obj instanceof PostalCode 
                        && this.postalCodeValue.equals(((PostalCode)obj).postalCodeValue)); //or check if they have same postal code value.
    }
    
}
