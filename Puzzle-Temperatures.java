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
        int N = in.nextInt(); // the number of temperatures to analyse
        if (N != 0)
        {
            in.nextLine();
            String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526
        
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println(TEMPS);
            String[] tab_temp = TEMPS.split(" ");
            //String[] my = {"15", "-7","9" ,"14","12", "7"};
        
            int max= Integer.parseInt(tab_temp[0]);
            int diff = 0 - max;
        
            for (int i=1; i < tab_temp.length; i++)
            {
                int dbuff = 0-Integer.parseInt(tab_temp[i]);
                int data = Integer.parseInt(tab_temp[i]);
                if (Math.abs(dbuff)<Math.abs(diff))
                {
                    max = data;
                    diff = 0-data;
                }
                else if (Math.abs(dbuff)==Math.abs(diff))
                {
                    if (data>0)
                        max = data;
                }
            }
            System.out.println(max);/*
            
            int max= Integer.parseInt(my[0]);
            int diff = 0 - max;
        
            for (int i=1; i < my.length; i++)
            {
                int dbuff = 0-Integer.parseInt(my[i]);
                int data = Integer.parseInt(my[i]);
                if (Math.abs(dbuff)<Math.abs(diff))
                {
                    max = data;
                    diff = 0-data;
                }
                else if (Math.abs(dbuff)==Math.abs(diff))
                {
                    if (data>0)
                        max = data;
                }
            }
            System.out.println(max);*/
        }
        else
            System.out.println("0");
    }
}