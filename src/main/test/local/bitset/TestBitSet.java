package local.bitset;

import java.util.BitSet;

/**
 * Created by ahumphr on 11/02/16.
 */
public class TestBitSet {


    private static BitSet bs = new BitSet(5);
    private static String fmt = "%d%d%d%d%d";

    public static void main(String[] args) {

        BitSet bits1 = new BitSet(5);
        BitSet bits2 = new BitSet(5);

        // set some bits
        for(int i=0; i<16; i++) {
            if((i%2) == 0) bits1.set(i);
            if((i%5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }


    private static void setButtonsFromBitSet(BitSet bState) {

        System.out.println("New:   " + (bState.get(4)));
        System.out.println("Edit;  " + (bState.get(3)));
        System.out.println("Delete:" + (bState.get(2)));
        System.out.println("Uodate:" + (bState.get(1)));
        System.out.println("Cancel:" + (bState.get(0)));

    }

    private static void setButtonsFromString(int bState) {

        System.out.println("New:   " + ((bState & 0b10000) > 0));
        System.out.println("Edit;  " + ((bState & 0b01000) > 0));
        System.out.println("Delete:" + ((bState & 0b00100) > 0));
        System.out.println("Uodate:" + ((bState & 0b00010) > 0));
        System.out.println("Cancel:" + ((bState & 0b00001) > 0));

    }
}
