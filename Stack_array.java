import java.util.Scanner;
class Stack 
{
    int n = 10;
    int top = -1;
    int a[] = new int[n];

    void push()
    {
        if(top == (n-1))
        {
            System.out.println("Stack Overflow:");
        }
        else
        {
            System.out.println("Enter a data:");
            Scanner s= new Scanner(System.in);
            int data = s.nextInt();
            top = top++;
            a[top] = data;
            System.out.println("Element are inserted:");
            s.close();
        }
    }
    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack are Underflow:");
        }
        else
        {
            top = top--;
            System.out.println("Element successfully deleted from the stack");
        }
    }
    void display()
    {
        System.out.println("Elements are:");
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
public class Stack_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack t = new Stack();
        int l;
        
        do
        {
            System.out.println("PRESS 1 TO push:");
            System.out.println("PRESS 2 TO pop:");
            System.out.println("PRESS 3 TO display:");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    t.push();
                    break;
                }
                case 2:
                {
                    t.pop();
                    break;
                }
                case 3:
                t.display();
                break;
                
            }
            System.out.println("ENTER ANY KEY TO EXIT:");
            System.out .println("PRESS 0 TO GO BACK MAIN SECTION");
            l  = sc.nextInt();
        }while(l==0);    
        sc.close();
    }    
}
