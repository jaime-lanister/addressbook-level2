package seedu.addressbook.data.person;

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
