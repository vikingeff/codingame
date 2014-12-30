import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int SX = in.nextInt();
            int SY = in.nextInt();
            int index=0;
            int fire =0;
            int max=0;
            for (int i = 0; i < 8; i++) {
                int MH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if (max < MH)
                {
                    max = MH;
                    index = i;
                }
                System.err.println("heigh : "+MH+" "+SX+" "+i+" "+index);
            }
            if (SX == index )
                    System.out.println("FIRE");
            else
                System.out.println("HOLD");

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            //System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
        }
    }
}