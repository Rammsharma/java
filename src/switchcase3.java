import java.util.Scanner;
public class switchcase3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operators = sc.nextInt();

        switch (operators){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:if (b==0){
                System.out.println("invalid");
            }
            else{
                System.out.println(a/b);

            }
            break;
            case 5:if (b==0){
                System.out.println("invalid");
            }
            else{
                System.out.println(a%b);
                break;
            }
        }


    }


}
