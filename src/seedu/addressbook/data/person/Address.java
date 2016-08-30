package seedu.addressbook.data.person;

import java.util.ArrayList;
import java.util.Objects;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.addresscomponents.Block;
import seedu.addressbook.data.person.addresscomponents.PostalCode;
import seedu.addressbook.data.person.addresscomponents.Street;
import seedu.addressbook.data.person.addresscomponents.Unit;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private boolean isPrivate;
    private Block block;
    private PostalCode postalCode;
    private Street street;
    private Unit unit;

    /**
     * Constructs address object with address components
     */
    public Address(Block block, Street street, Unit unit, PostalCode postalCode, boolean isPrivate) {
        this.block = block;
        this.postalCode = postalCode;
        this.street = street;
        this.unit = unit;
        this.isPrivate = isPrivate;
    }
    
    
    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        
        //We assume the following input format: BLOCK, STREET, UNIT, POSTAL_CODE
        String[] addressComponent = address.split(", ");
        
        switch (addressComponent.length){
            case (4):
                this.postalCode = new PostalCode(addressComponent[3]);
            case (3):
                this.unit = new Unit(addressComponent[2]);
            case (2):
                this.street = new Street(addressComponent[1]);
            case (1):
                this.block = new Block(addressComponent[0]);
                break;
            default:
                //The address does not meet the assumption above, throw an exception.
                throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        
        ArrayList<String> addressComponents = new ArrayList<>();
        
        if (block != null) {
            addressComponents.add(block.toString());
        }
        
        if (street != null) {
            addressComponents.add(street.toString());
        }
        
        if (unit != null) {
            addressComponents.add(unit.toString());
        }
        
        if (postalCode != null) {
            addressComponents.add(postalCode.toString());
        }
        
        StringBuilder addressValue = new StringBuilder();
        String divider = ", ";
        
        for (int i = 0; i < addressComponents.size(); i++){
            addressValue.append(addressComponents.get(i));
            if (i != addressComponents.size() - 1) {
                addressValue.append(divider);
            }
        }
        
        return addressValue.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && Objects.equals(this.block, ((Address) other).block)
                    && Objects.equals(this.street, ((Address) other).street)
                            && Objects.equals(this.street, ((Address) other).street)
                                    && Objects.equals(this.postalCode, ((Address) other).postalCode)); // state every single address component.
    }

    @Override
    public int hashCode() {
        return new int[] {Objects.hashCode(block), Objects.hashCode(unit), Objects.hashCode(street), Objects.hashCode(postalCode)}.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}