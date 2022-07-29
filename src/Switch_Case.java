import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args)
    {
        System.out.println("Enter the button");
        Scanner sc= new Scanner(System.in);
        int Button = sc.nextInt();
        switch(Button){
            case 1:
                System.out.println("namaste");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("welcome");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
