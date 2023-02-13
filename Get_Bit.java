

import java.util.Scanner;
public class Get_Bit {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n  =sc.nextInt();
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0 ) {
            System.out.println("bit was zero:");
        }
        else{

            System.out.println("bit was one:");
        }
        sc.close();

    }
}