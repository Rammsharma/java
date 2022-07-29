import java.util.Scanner;

public class Array_max_min {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array :");
        int size=sc.nextInt();
        int arr[]= new int[size];

        //Input
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for (int i=1;i<size;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=1;i>size;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("max =" +max);
        System.out.println("min="  +min);


    }
}
