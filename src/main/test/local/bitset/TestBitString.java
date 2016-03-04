package local.bitset;

import java.util.BitSet;

/**
 * Created by ahumphr on 11/02/16.
 */
public class TestBitString {


    private static BitSet bs = new BitSet(5);
    private static String fmt = "%d%d%d%d%d";

    public static void main(String[] args) {

        String sbs = String.format(fmt, 1, 0, 0, 1, 0);

        setButtonsFromString(Integer.parseInt(sbs, 2));
    }

    private static void setButtonsFromString(int bState) {

        System.out.println("New:   " + ((bState & 0b10000) > 0));
        System.out.println("Edit;  " + ((bState & 0b01000) > 0));
        System.out.println("Delete:" + ((bState & 0b00100) > 0));
        System.out.println("Uodate:" + ((bState & 0b00010) > 0));
        System.out.println("Cancel:" + ((bState & 0b00001) > 0));

    }
}
