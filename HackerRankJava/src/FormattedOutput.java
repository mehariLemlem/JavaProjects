import java.util.*;
public class FormattedOutput {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Input: ");

        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("Output: %n%-15.5s%03d%n",s1,x);

            /* "% [flags] [width] [.precision] conversion-character"
            1) %-15s:-in this(-) is a [flag] variable indicates left-justify(default is right-justify)
             15 is [width] which defines the width of 15 places and s is the [Conversion-Characters]
             which is used for string
            2) %03d:- in this (0) is a [flag] variable which forces numerical values to be zero-padded
            ( default is blank padding ) 3 is [width] which defines to be zero for 3 places and d is
            for decimal integer [byte, short, int, long]
            3) %n is for new line 4) s1 is for string s and x is for d which defines selection of format */
        }
        System.out.println("================================");
    }
}
