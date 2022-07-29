import java.util.*;
public class CLEAR_BIT {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int Notbitmask=~(bitMask);

        int Newnumber=Notbitmask &  n;
        System.out.println(Newnumber);

    }
}
