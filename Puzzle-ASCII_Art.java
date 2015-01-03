import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        in.nextLine();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        String ROW ="";
        for (int i = 0; i < H; i++) {
            ROW = in.nextLine();
            //(int)T.charAt(0)-64
            for (int h=0; h<T.length(); h++)
            {
                T=T.toUpperCase();
                if ((int)T.charAt(h)-64<=26 && (int)T.charAt(h)-64>=1)
                {
                    for (int j=((int)T.charAt(h)-64)*L-L; j < ((int)T.charAt(h)-64)*L; j++)
                        System.out.print(ROW.charAt(j));
                }
                else
                {
                    for (int j=27*L-L; j < 27*L; j++)
                        System.out.print(ROW.charAt(j));
                }
            }
            System.out.println();
        }
        //System.out.println(((int)T.charAt(0)-64)*L-L);
        

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println((int)T.charAt(0)-64);
    }
}