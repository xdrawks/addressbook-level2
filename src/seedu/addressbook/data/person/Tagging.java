package seedu.addressbook.data.person;

import seedu.addressbook.data.tag.Tag;

public class Tagging {
    
    private boolean isAdded; //If this value is false, it means the tag has been deleted.
    private Person person; //Person being associated with this tag
    private Tag tag; //Tag being associated with this person.
    
    public Tagging (Person person, Tag tag, boolean isAdded) {
        this.isAdded = isAdded;
        this.person = person;
        this.tag = tag;
    }

    /**
     * Returns a string in the following format:
     * + Jean Wong [client] for added tag
     * - Jake Woo [colleague] for deleted tag
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder
            .append(isAdded ? "+ " : "- ")
            .append(person.getName())
            .append(" [")
            .append(tag.tagName)
            .append("]");
        return builder.toString();        
    }
}
