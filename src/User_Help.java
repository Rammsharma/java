import java.util.Scanner;

public class User_Help
{
    public static void main(String[] args)
    {
        System.out.println("Help Center***");
        Scanner myobj1 = new Scanner(System.in);
        String username;
        System.out.println("What's Your Good Name :");
        username = myobj1.nextLine();
        System.out.println("Hey! "+username);
        System.out.println("How Can I Help You!");
        String Query;
        Query = myobj1.nextLine();
        System.out.println("OK Sir! We Solve Your Problem shortly");

    }
}
