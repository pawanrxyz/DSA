import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {
        int[] a1 = new int[]{3,4,6,2,1,7,8};
        // int count = 1;
        // for(int i=0;i<a1.length;i++) {
            // a1[i] = count;
            // count++;
        // }
        for(int i=0;i<a1.length;i++) {
            System.out.print(a1[i]+ " ");
        }
        System.out.println();
        Arrays.sort(a1);
        for(int i=0;i<a1.length;i++) {
            System.out.print(a1[i]+" "); 
        }
    }
}