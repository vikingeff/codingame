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
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            //while (TX != LX && TY != LY)
            //{
            System.err.println("thor x : "+TX+" thor y : "+TY);
                if (TX == LX && TY > LY)
                {
                    System.out.println("N");
                    TY--;
                }
                else if (TX > LX && TY == LY)
                {
                    System.out.println("W");
                    TX--;
                }
                else if (TX < LX && TY == LY)
                {
                    System.out.println("E");
                    TX++;
                }
                else if (TX == LX && TY < LY)
                {
                    System.out.println("S");
                    TY++;
                }
                else if (TX > LX && TY > LY)
                {
                    
                    System.out.println("NW"); // A single line providing the move to be made: N NE E SE S SW W or NW
                    TX--;
                    TY--;
                }
                else if (TX > LX && TY < LY)
                {
                    System.out.println("SW");
                    TY++;
                    TX--;
                }
                else if (TX < LX && TY > LY)
                {
                    System.out.println("NE"); // A single line providing the move to be made: N NE E SE S SW W or NW
                    TY--;
                    TX++;
                }
                else //(TX < LX && TY < LY)
                {
                    System.out.println("SE");
                    TY++;
                    TX++;
                }
            //}
        }
    }
}