import java.util.*;
public class Array_Name_founder {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE:");
        int size=sc.nextInt();
        String name[]=new String[size];


        for (int i=0;i<size;i++) {
            name[i] = sc.next();
        }
        System.out.println("x");
            String x= sc.next();

            for (int i=0;i<name.length;i++){
                if (name[i]==x){
                    System.out.println("INDEX:"+name[i]);
                }
            }
        }
    }

