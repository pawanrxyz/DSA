import java.util.Scanner;
public class Plindrome_No {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter any digits:");
        int n = sc.nextInt();
        int temp = n;
        while(n!=0) {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(temp==rev)
        System.out.println("plindrome number:");
        else
        System.out.println("not plindrome number:");
        sc.close();
        // System.out.println("Reverse no:" +rev);
    }
}
