
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args)
    {
        System.out.println("Cheak The Age Limit ");
        Scanner a = new Scanner(System.in);
        int Age;
        System.out.println("Write down Your Age :");
        Age = a.nextInt();
        if(Age>18){
            System.out.println("You Are Adult");
        }
        else{
            System.out.println("You Are Not Adult*");
        }

    }

}
