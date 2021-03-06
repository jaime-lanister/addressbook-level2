package seedu.addressbook.data.person;

//import javafx.geometry.Pos;
import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;
    private boolean isPrivate;

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {

        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = trimmedAddress;

        String[] tokens = address.split(", ");

        Block block = new Block(tokens[0]);
        Street street = new Street(tokens[1]);
        Unit unit = new Unit(tokens[2]);
        PostalCode postalCode = new PostalCode(tokens[3]);
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }



    public class Block {

        private String blockStr;

        public Block(String s) {
            this.blockStr = s;
        }

        public void setBlockStr(String s) {
            this.blockStr = s;
        }

        public String getBlockStr() {
            return this.blockStr;
        }

        @Override
        public String toString() {
            return this.blockStr;
        }

    }

    public class Street {
        private String streetStr;

        public Street(String s) {
            this.streetStr = s;
        }

        public void setStreetStr(String s) {
            this.streetStr = s;
        }

        public String getStreetStr() {
            return this.streetStr;
        }

        @Override
        public String toString() {
            return this.streetStr;
        }
    }


    public class Unit {
        private String unitStr;

        public Unit(String s) {
            this.unitStr = s;
        }

        public void setUnitStr(String s) {
            this.unitStr = s;
        }

        public String getUnitStr() {
            return this.unitStr;
        }

        @Override
        public String toString() {
            return this.unitStr;
        }
    }

    public class PostalCode {
        private String postalCodeStr;

        public PostalCode(String s) {
            this.postalCodeStr = s;
        }

        public void setPostalCodeStr(String s) {
            this.postalCodeStr = s;
        }

        public String getPostalCodeStr() {
            return this.postalCodeStr;
        }

        @Override
        public String toString() {
            return this.postalCodeStr;
        }
    }
}

