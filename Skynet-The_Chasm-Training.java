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
        int R = in.nextInt(); // the length of the road before the gap.
        int G = in.nextInt(); // the length of the gap.
        int L = in.nextInt(); // the length of the landing platform.

        // game loop
        R=R-1;
        int jump=0;
        while (true) {
            int S = in.nextInt(); // the motorbike's speed.
            int X = in.nextInt(); // the position on the road of the motorbike.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println("gap size:"+G+" speed:"+S+" gap in :"+R+" end:"+L+" jump:"+jump);
            if (R==0 && jump ==0)//(G==S-1 && R-S<=0 && jump !=1)
            {
                System.out.println("JUMP");
                jump=1;
            }
            if (jump == 0 && S <= G)
            {
                System.out.println("SPEED"); // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
                R=R-S-1;
            }
            else if (jump==1 || S > G+1)
            {
                System.out.println("SLOW");
                R=R-S+1;
                if (jump==1)
                    L=L-S;
            }
            else //if (jump ==0 && S>R)
            {
                System.out.println("WAIT");
                R=R-S;
            }
            
            
        }
    }
}