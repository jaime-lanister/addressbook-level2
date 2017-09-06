package seedu.addressbook.data.person;

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
