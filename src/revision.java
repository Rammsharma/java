import java.util.Scanner;
public class revision {
    public static void main(String[] args)
    {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a= sc.nextInt();
        System.out.println("Enter the value of b :");
        int b= sc.nextInt();


        if (a==b){
            System.out.println("its equal");
        }
        else if(a>b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is leeser then b");

        }*/

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=sc.nextInt();

        if (age>18){
            System.out.println("You are Adult");
        }
        else {
            System.out.println("you are not adult");
        }*/

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO.");
        int n=sc.nextInt();

        if (n%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }*/


       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO.");
        int n=sc.nextInt();

        for (int i=0;i<11;i++){
            System.out.println(n+i);
        }*/


       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO.");
        int n=sc.nextInt();
        int i=1;
        while (i<11){
            System.out.println(n+i);
            i++;
        }*/

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO.");
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(n+i);
            i++;
        }while (i<10);*/
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Value :");
        int n=sc.nextInt();
        System.out.println("Enter M Value");
        int m=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

     /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Value :");
        int n=sc.nextInt();
        System.out.println("Enter M Value");
        int m=sc.nextInt();


        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= m; j++) {

                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/

      /* int n=4;

       for (int i=1;i<=n;i++){
           for (int j=1;j<=i;j++){
               System.out.print("*");
           }System.out.println();
       }*/


       /* int n=4;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

      /*  int n=5;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=i;j++){

                int sum=i+j;
                if (sum % 2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/

       /* int n=5;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n+i;j++){
                System.out.print(" ");
            }for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
/*
        int n=5;
        for (int i=1;i<=n;i++){
            //First PART
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACES
            int spaces=2 * (n-i);

            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //second part
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //LOWER PART
        for (int i=n;i>=1;i--){
            //First PART
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACES
            int spaces=2 * (n-i);

            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //second part
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
/*
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
    }

 */

/*
        int n=4;
        for (int i=1;i<=n;i++){
            //space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for (int i=n;i>=1;i--){
            //space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/



        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:");
        int size=sc.nextInt();
        int[] numbers=new int[size];

        //input
        for (int i=0;i<size;i++){
            System.out.println("Enter Arrays :");
            numbers[i]=sc.nextInt();
        }
        System.out.println("Which array you found:");
        int x= sc.nextInt();

        //output
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]==x) {
                System.out.println("the index is :" + i);
            }
        }

    }
}
