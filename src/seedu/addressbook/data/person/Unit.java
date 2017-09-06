package seedu.addressbook.data.person;

public class Unit {
    private String unitStr;

    public Unit(String s) {
        this.unitStr = s;
    }

    public void setStreetStr(String s) {
        this.unitStr = s;
    }

    public String getStreetStr() {
        return this.unitStr;
    }

    @Override
    public String toString() {
        return this.unitStr;
    }
}
