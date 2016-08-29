package seedu.addressbook.data.person.addresscomponents;

/**
 * Represents a Person's address component (block) in the address book.
 */
public class Block {
	
	private String block;
	
	/**
	 * Constructs an address component, block
	 */
	public Block (String block){
		this.block = block;
	}
	
	/**
	 * Gets the block String in this class.
	 */
	public String getBlock(){
		return this.block;
	}
}
