import java.util.Scanner;

public class HAKER {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long i = scan.nextLong();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=   scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
       System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}