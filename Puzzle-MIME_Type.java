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
        int N = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();
        String[] tab_ext=new String[N];
        String[] tab_mt=new String[N];
        ;
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            tab_ext[i]=EXT.toUpperCase();
            String MT = in.next(); // MIME type.
            tab_mt[i]=MT;
            in.nextLine();
            //System.out.println(""+tab_ext[i]+" "+tab_mt[i]);
        }
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            int index=-1;
            //String buff= new String(FNAME.substring(FNAME.indexOf(".")+1));
            //System.out.println(buff);
            //ystem.out.println(parts.length+" "+parts[parts.length-1]);
            if (!FNAME.contains(".") || FNAME.charAt(FNAME.length()-1)=='.')
                System.out.println("UNKNOWN");
            else
            {
                String[] parts = FNAME.split("\\.");
                //System.out.println(parts[0]);
                for (int j=0; j<tab_ext.length; j++)
                {
                    //System.out.println(tab_ext[j]+ " "+parts[parts.length-1]);
                    if (tab_ext[j].equals(parts[parts.length-1].toUpperCase()))
                    {
                        //System.out.println(tab_ext[j]);
                        System.out.println(tab_mt[j]);
                        index = j;
                        //System.out.println(tab_ext[j].equals(parts[parts.length-1]));
                        break;
                    }//System.out.println(tab_ext[j]);
                }
                /*if (index != -1)
                {
                    System.out.println(tab_mt[index]);
                    index =-1;
                }
                else*/
                if (index == -1)
                    System.out.println("UNKNOWN");
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("UNKNOWN"); // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    }
}