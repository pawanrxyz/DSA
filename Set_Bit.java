

public class Set_Bit {
    public static void main(String [] args) {
        int n = 7;
        int pos = 4;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
    
}
