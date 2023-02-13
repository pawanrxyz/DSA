import java.util.Scanner;
public class Array_1 {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of array:");
        int n;
        n = sc.nextInt();
        int arr[] =  new int[n];
        for(int i=0;i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting array:");
        for(int i=0;i<n;i++) 
        {
            System.out.println(arr[i]);
        }
        sc.close();
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
    }    
}
