package seedu.addressbook.data.person;

public class PostalCode {
    private String postalCodeStr;

    public PostalCode(String s) {
        this.postalCodeStr = s;
    }

    public void setStreetStr(String s) {
        this.postalCodeStr = s;
    }

    public String getStreetStr() {
        return this.postalCodeStr;
    }

    @Override
    public String toString() {
        return this.postalCodeStr;
    }
}
