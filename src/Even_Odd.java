import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        System.out.println("Cheak Even Odd");
        Scanner a = new Scanner(System.in);
        int x;
        System.out.println("Write The Number :");
        x = a.nextInt();
        if(x % 2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
