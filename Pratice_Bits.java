import java.util.Scanner;
public class Pratice_Bits {
    public static void main(String [] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int t = n;
        String b = "";

        while(t>0)
        {
            int r = t%2;
            b = r+b;
            t = t/2;
        }
        System.out.println(b);
        sc.close();
     }
}
