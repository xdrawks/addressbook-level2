package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (block) in the address book.
 */
public class Block {
    
    private String blockValue;
    
    /**
     * Constructs an address component, block
     */
    public Block (String block) {
        this.blockValue = block;
    }
    
    /**
     * Gets the block String in this class.
     */
    public String getBlockValue() {
        return this.blockValue;
    }

    @Override
    public int hashCode() {
        return blockValue.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this //If they have same object
                || (obj instanceof Block 
                        && this.blockValue.equals(((Block)obj).blockValue)); //or check if they have same block value.
    }
    
    
}
