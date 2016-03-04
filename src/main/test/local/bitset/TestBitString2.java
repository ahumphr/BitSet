package local.bitset;

import java.util.BitSet;

import static java.lang.Boolean.*;
import static local.bitset.MyButtons.*;

/**
 * Created by ahumphr on 11/02/16.
 */
public class TestBitString2 {

    static <T> T[] array(T... elems)
    {
        return elems;
    }

    private static Boolean[] ba;

    public static void main(String[] args) {
        ba = array(TRUE, FALSE, FALSE, FALSE, FALSE);
        setButtonsFromArray(ba);
    }


    private static void setButtonsFromArray(Boolean[] bState) {
        System.out.println("New:   " + bState[New.ord()]);
        System.out.println("Edit;  " + bState[Edit.ord()]);
        System.out.println("Delete:" + bState[Delete.ord()]);
        System.out.println("Apply:"  + bState[Apply.ord()]);
        System.out.println("Cancel:" + bState[Cancel.ord()]);
    }

}
