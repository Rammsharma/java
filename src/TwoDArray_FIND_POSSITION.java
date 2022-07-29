import java.util.Scanner;

public class TwoDArray_FIND_POSSITION {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ROWS  :");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int [][] numbers=new int[rows][cols];

        //input
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Which no. u find");
        int x=sc.nextInt();
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("index found in :" + (i  + j));
                }
            }
        }
    }
}

