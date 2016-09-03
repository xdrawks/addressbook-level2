package seedu.addressbook.data.person;

public class Tagging {
    
    private boolean isAdded; //If this value is false, it means the tag has been deleted.
    private Person person; //Person being associated with this tag
    private Tag tag; //Tag being associated with this person.
    
    public Tagging (Person person, Tag tag, boolean isAdded) {
        this.isAdded = isAdded;
        this.person = person;
        this.tag = tag;
    }

}
