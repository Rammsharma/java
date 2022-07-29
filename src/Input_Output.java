import java.util.Scanner;

public class Input_Output
{
    public static void main(String[] args)
    {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
       /* Float a = sc.nextFloat();
        System.out.println("Enter the second value");
        Float b = sc.nextFloat();
         Float sum = a + b;
        System.out.println("The Sum Of the Two Number");
        System.out.println(sum);*/
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
