package local.bitset;

/**
 * Created by ahumphr on 11/02/16.
 */
public class ButtonState {
    private String name;
    private boolean state;

    public ButtonState(String name) {
        this.name = name;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }
}
