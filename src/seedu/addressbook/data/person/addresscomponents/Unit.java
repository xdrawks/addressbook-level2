package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (unit) in the address book
 * Where unit contains both level and door number.
 */
public class Unit {
    
    private String levelValue;
    private String doorNumberValue;
    
    /**
     * Constructs an address component, unit, with level and doorNumber.
     */
    public Unit (String level, String doorNumber) {
        this.levelValue = level;
        this.doorNumberValue = doorNumber;
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
}
