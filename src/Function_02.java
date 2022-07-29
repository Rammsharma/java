import java.util.Scanner;

public class Function_02 {
    public static void printAverage(int a,int b,int c){
        int Average=(a+b+c)/3;
        System.out.println(Average);
        return;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("Enter c value");
        int c=sc.nextInt();
        printAverage(a,b,c);
    }
}
