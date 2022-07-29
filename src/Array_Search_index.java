import java.util.Scanner;

public class Array_Search_index {
    public static  void main(String[] args){


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array :");
        int size=sc.nextInt();
        int number[]= new int[size];

        //Input
        for (int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        //output
        for (int i=0;i<number.length;i++){
            if (number[i]==x){
                System.out.println("x found at index :"+i);
            }
        }

    }
}
