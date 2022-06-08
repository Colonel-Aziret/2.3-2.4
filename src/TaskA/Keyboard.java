package TaskA;

import java.util.Arrays;

public class Keyboard {
    private String[] KeyboardLayouts;
    private boolean backlit;
    private boolean additionalDigits;

    public Keyboard(boolean backlit, boolean additionalDigits) {
        this.KeyboardLayouts = new String[]{"RUS", "ENG"};
        this.backlit = backlit;
        this.additionalDigits = additionalDigits;
    }

    public Keyboard() {
        this.KeyboardLayouts = new String[]{"RUS", "ENG"};
        this.backlit = true;
        this.additionalDigits = false;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "KeyboardLayouts=" + Arrays.toString(KeyboardLayouts) +
                ", backlit=" + backlit +
                ", additionalDigits=" + additionalDigits +
                '}';
    }
}
