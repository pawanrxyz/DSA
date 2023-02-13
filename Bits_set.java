public class Bits_set {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitMask = pos<<2;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
    
}
