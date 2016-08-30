package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (unit) in the address book
 */
public class Unit {
    
    private String unitValue;
    
    /**
     * Constructs an address component, unit.
     */
    public Unit (String unitValue) {
        this.unitValue = unitValue;
    }
    
    /**
     * Gets the unit value
     */
    @Override
    public String toString() {
        return this.unitValue;
    }
    
    @Override
    public int hashCode() {
        return unitValue.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this //If they have same object
                || (obj instanceof Unit 
                        && this.unitValue.equals(((Unit)obj).unitValue)); //or check if they have same unit value.
        
    }
    
    
}
