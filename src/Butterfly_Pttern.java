public class Butterfly_Pttern {

    public static void main(String[] args){

        int n=5;
    //First Part
        for (int i=1;i<=n;i++){
            //First Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2 * (n-i);

            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //Second Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
           //lower part
            for (int i=n;i>=1;i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                //space
                int space = 2 * (n - i
                );

                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                //Second Part
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
