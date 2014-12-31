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
        String MESSAGE = in.nextLine();

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        byte[] bytes = MESSAGE.getBytes();
        int loading =-1;
        for (int x=0; x<bytes.length; x++)
        {
            String temp=Integer.toBinaryString(bytes[x]);
            //System.err.println("string: "+MESSAGE.charAt(x)+" ascii: "+bytes[x]+" binary: "+temp+" size: "+temp.length());
            int index =1;
            for (int i=0; i<temp.length();i++)
            {
                if (i == 0 && temp.length()==6)
                {
                    System.err.println(""+loading+"."+temp.charAt(i));
                    if (loading == 0)
                    {
                        if (Character.getNumericValue(temp.charAt(i)) == 0)
                            System.out.print("0");
                        else
                        {
                            System.out.print("0");
                            loading = -1;
                        }
                    }
                    else if (loading == 1)
                    {
                        if (Character.getNumericValue(temp.charAt(i)) == 0)
                        {
                            System.out.print(" 00 0");
                            loading = 0;
                        }
                        else
                        {
                            System.out.print(" 00 0");
                            loading =-1;
                        }
                    }
                    else
                    {
                        if (Character.getNumericValue(temp.charAt(i)) == 1)
                            System.out.print("00 0 ");
                        else
                        {
                            System.out.print("00 0");
                            loading = 0;
                        }
                    }
                }
                if (loading == -1)
                {
                    if (i>0 || x>0)
                        System.out.print(" ");
                    if (Character.getNumericValue(temp.charAt(i)) == 1)
                    {
                        System.out.print("0 ");
                        loading =1;
                    }
                    else
                    {
                        System.out.print("00 ");
                        loading = 0;
                    }
                }
                while (i+index < temp.length() && Character.getNumericValue(temp.charAt(i+index)) == Character.getNumericValue(temp.charAt(i)))
                    index++;
                //System.err.println(""+index+" "+i);
                for (int j=0; j<index; j++)
                    System.out.print("0");
                i=i+index-1;
                //System.err.println("index "+index+" i "+i);
                index=1;
                if (i+index != temp.length())
                    loading = -1;
            }
            //System.out.println("0 0 00 0000 0 00");//C
            //System.out.println("0 0 00 0000 0 000 00 0000 0 00");//CC
            //System.out.println("00 0 0 0 00 00 0 0 00 0 0 0");//%
        }
    }
}