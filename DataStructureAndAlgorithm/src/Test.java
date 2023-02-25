import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        byte a = (byte)0x80;
        byte b = (byte)0xFFFFFFFF;
        byte c = (byte)0x0100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        char[] number = new char[10];
        for (int i = 0; i < 10 ; i++) {
            number[i] = '0';
        }
//        for (char ch : number) {
//            ch = '1';
//        }
        System.out.println(Arrays.toString(number));

    }
}