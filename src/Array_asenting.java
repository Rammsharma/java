import java.util.*;
public class Array_asenting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        //input
        for (int i=0;i<size;i++){
            System.out.println("enter array");
            arr[i]=sc.nextInt();
        }
        boolean Ascending=true;
        for (int i=0;i<size;i++) {
            if (arr[i] > i + 1) {
                Ascending = false;
            }
        }
            if (Ascending){
                System.out.println("index no. is in Ascending order");
            }
            else{
                System.out.println("index no. is not in Ascending order");
            }
    }
}
