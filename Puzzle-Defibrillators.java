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
        String LON = in.next();
        in.nextLine();
        String LAT = in.next();
        in.nextLine();
        int N = in.nextInt();
        in.nextLine();
        LON=LON.replace(',','.');
        double longi = Double.parseDouble(LON);
        //BigDecimal longitud = new BigDecimal(Double.parseDouble(LON));
        //longitud.setScale(6,RoundingMode.HALF_UP);
        LAT=LAT.replace(',','.');
        double lati = Double.parseDouble(LAT);
        //DecimalFormat df = new DecimalFormat("0.000000");  
        //BigDecimal latit = new BigDecimal(Double.parseDouble(LAT));
        double dist = 1000;
        String closest="";
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String parts[] = DEFIB.split(";");
            //System.out.println(parts.length+"-"+parts[parts.length-2]+
            //"-"+parts[parts.length-1]);
            parts[parts.length-2]=parts[parts.length-2].replace(',','.');
            double longitud = Double.parseDouble(parts[parts.length-2]);
            //parts[parts.length-2]=Double.valueOf(df.format(parts[parts.length-2]));
            //parts[parts.length-2]=parts[parts.length-2].substring(0,8);
            //BigDecimal longitud = new BigDecimal(Double.parseDouble(parts[parts.length-2]));
            //longitud.setScale(6,RoundingMode.HALF_UP);
            parts[parts.length-1]=parts[parts.length-1].replace(',','.');
            double latitud = Double.parseDouble(parts[parts.length-1]);
            double x = (longi-longitud)* Math.cos((latitud+lati)/2);
            double y = lati-latitud;
            double d = Math.sqrt(Math.pow(x,2)*Math.pow(y,2))*6371;
            //System.out.println(d);
            //System.out.println(longitud);
            if (d<dist)
            {
                dist = d;
                closest=parts[1];
            }
        }
        System.out.println(closest);

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        //System.out.println("answer");
    }
}