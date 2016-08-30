package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (block) in the address book.
 */
public class Block {
    
    private String blockValue;
    
    /**
     * Constructs an address component, block
     */
    public Block (String block){
        this.blockValue = block;
    }
    
    /**
     * Gets the block String in this class.
     */
    public String getBlockValue(){
        return this.blockValue;
    }
}
