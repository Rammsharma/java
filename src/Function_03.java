import java.util.Scanner;

public class Function_03 {
    public static void printAllOddNumberSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n=sc.nextInt();
        printAllOddNumberSum(n);
    }
  }

