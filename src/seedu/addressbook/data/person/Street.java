package seedu.addressbook.data.person;

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
