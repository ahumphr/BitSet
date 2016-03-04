package local.bitset;

/**
 * Created by ahumphr on 11/02/16.
 */
public enum MyButtons {
    New(0,    0b10000),
    Edit(1,   0b01000),
    Delete(2, 0b00100),
    Apply(3,  0b00010),
    Cancel(4, 0b000001);

    int val;
    int ord;
    MyButtons(int ord, int i) {
        this.ord = ord;
        this.val = i;
    }

    public int val(){
        return val;
    }

    public int ord() {
        return ord;
    }
}
