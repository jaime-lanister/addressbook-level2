package seedu.addressbook.data.person;

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
