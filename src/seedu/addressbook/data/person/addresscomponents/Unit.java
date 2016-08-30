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
     * Gets the level value in this class.
     */
    public String getLevelValue() {
        return this.levelValue;
    }
    
    /**
     * Gets the door number value in thic class
     */
    public String getDoorNumberValue() {
        return this.doorNumberValue;
    }
    
    @Override
    public int hashCode() {
        //X added to partition level and door number.
        return (levelValue + "X" + doorNumberValue).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this //If they have same object
                || (obj instanceof Unit 
                        && this.levelValue.equals(((Unit)obj).levelValue)
                        && this.doorNumberValue.equals(((Unit)obj).doorNumberValue)); //or check if they have same level and door value.
        
    }
    
    
}
