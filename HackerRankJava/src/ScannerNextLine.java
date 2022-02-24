import java.util.*;

public class ScannerNextLine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        int i = scan.nextInt();
        System.out.println("Enter next number:");
        double d = scan.nextDouble();
        /* In Scanner class if we call nextLine() method after any one of the seven nextXXX() method
        then the nextLine() does not read values from console and cursor will not come into
        console it will skip that step. The nextXXX() methods are nextInt(), nextFloat(), nextByte(),
        nextShort(), nextDouble(), nextLong(), next().That's because the Scanner class' nextInt()
        method does not consume the last newline character of your input, and thus that newline is
        consumed in the next call to Scanner class' nextLine(). You can fire a blank Scanner
        class' nextLine() call after Scanner#nextInt to consume the rest of that line including
        newline */
        scan.nextLine();
        System.out.println("Enter string:");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
