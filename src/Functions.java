import java.util.Scanner;
public class Functions {

    public static void printMySum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a=sc.nextInt();
        System.out.println("Enter Second Number :");
        int b=sc.nextInt();
        System.out.println("The Sum Of Two No. :");
        printMySum(a,b);
    }
}
