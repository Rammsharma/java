import java.util.Scanner;

public class Cheaking_number {
    public static void main(String[] args)
    {
        System.out.println("ENTER NUMBER a:");
        Scanner x = new Scanner(System.in);
        int a;
        int b;
        a = x.nextInt();
        System.out.println("ENTER NUMBER b:");
        b = x.nextInt();
        if(a==b){
            System.out.println("its equal");
        }
        else if(a>b){
        System.out.println("a is greater then b");
    }
        else{
        System.out.println("a is leeser then b");
    }

    }
}
