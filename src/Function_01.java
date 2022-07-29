import java.util.Scanner;

public class Function_01 {
    public static void factorialTheNumber(int n){

        int factorial=1;
        //loop
        for (int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n=sc.nextInt();
        factorialTheNumber(n);
    }
}
