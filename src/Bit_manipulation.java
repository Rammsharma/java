import java.util.*;
public class Bit_manipulation {
    public static void main(String[] args){
    int n=8;
    int pos=3;
    int bitMask=1<<pos;

    //Get bit*******
                                             //in the Get bit operator we use the
                                                // AND operator**************
    if ((bitMask & n)==0){
        System.out.println("bit was zero");
    }else{
        System.out.println("non zero");
    }

}

}
