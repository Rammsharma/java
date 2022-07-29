import java.util.Scanner;
public class Table_by_Loop {
    public static void main(String[] args)

            //FOR LOOP*******
            /*
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=sc.nextInt();

    for(int i=1;i<11;i=i+1)
    {
        System.out.println(n*i);
    }
    }*/

    //WHILE LOOP*******
            /*
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=sc.nextInt();
        int i=1;
        while(i<11){
            System.out.println(n*i);
            i++;
        }
    }*/

    //DO WHILE LOOP*********
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(n*i);
            i++;
        }while(i<11);
    }
}