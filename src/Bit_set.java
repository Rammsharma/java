import java.util.*;
public class Bit_set {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;                  //in the set bit operator we use the
                                                 // OR operator**************

        int newNumber=bitMask | n;
        System.out.println(newNumber);
    }
}
