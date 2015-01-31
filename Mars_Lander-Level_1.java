class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < N; i++) {
            int LAND_X = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int LAND_Y = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int HS = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int VS = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int F = in.nextInt(); // the quantity of remaining fuel in liters.
            int R = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int P = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println(" "+Y);
            while (Y>500)
                System.out.println("0 0"); // R P. R is the desired rotation angle. P is the desired thrust power.
            while (300>Y && Y>500)
                System.out.println("0 3");
            while (200>Y && Y>300)
                System.out.println("0 3");
            while (100>Y && Y>200)
                System.out.println("0 3");
            while (0>Y && Y>100)
                System.out.println("0 3");
        }
    }

    class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        Integer x[] = new Integer[n];
        Integer y[] = new Integer[n];
        for(int i=0; i< n; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        
        int xMax = 0;
        int xMin = x[0];
        int yPlat = y[0];
        
        int xTemp =0;
        int yTemp = 0;
        
        for(int i=1; i< n; i++){
           xTemp =x[i];
           yTemp = y[i];
           if(yPlat == yTemp){
               xMax = xTemp;
               break;
           }else{
               xMin = xTemp;
               yPlat = yTemp;
           }
        }
        xMin += 100;
        xMax -= 100;
        in.nextLine();
        
        double g = -3.711;
        int vHMax = 20;
        int vVMax = 40;
        
        while (true) {
            int xPos = in.nextInt();
            int yPos = in.nextInt();
            int vHorizontale = in.nextInt();
            int vVerticale = in.nextInt();
            int fuel = in.nextInt();
            int teta = in.nextInt();
            int puissance = in.nextInt();
            String messageDiffX = diffPosX(xPos, xMin, xMax);
            String[] messageSplit = messageDiffX.split(";");
            String diffXMot = messageSplit[0];
            Integer diffX = Integer.valueOf(messageSplit[1]);
            // Calcul distance restant
            int diffY = yPos - yPlat;
            // Calcul temps en seconde
            int tempsAtterissage = 0;
            if(vVerticale !=0 ){
                tempsAtterissage = diffY/(Math.abs(vVerticale));
            }
            // Fuel OK
            Boolean fuelOk = true;
            int fuelrestant = fuel - (tempsAtterissage*4);
            if(fuelrestant > 0){
                fuelOk = true;
            }else{
                fuelOk = false;
            }
            int tetaRes = 0;
            int puissanceRes = 0;
            if(diffX <= 0 &&  diffXMot.equalsIgnoreCase("Max")){
               tetaRes = 20;
               if (teta < 0){
                   puissanceRes = 4;
               }else{
                   puissanceRes = 3;
               }
            }else if(diffX <= 0 &&  diffXMot.equalsIgnoreCase("Min")){
                tetaRes = -20;
               if (teta > 0){
                   puissanceRes = 4;
               }else{
                   if(fuelOk){
                        puissanceRes = 3;
                   }else{
                       puissanceRes = 0;
                   }
               }
            }else if(diffXMot.equalsIgnoreCase("E")){
                tetaRes = 0;
               if (Math.abs(vHorizontale) > 18 || Math.abs(vVerticale) > 38){
                   puissanceRes = 4;
               }else{
                   puissanceRes = 3;
               }
            }

            // Write action to standard output
            System.out.println(tetaRes + " " +puissanceRes);
        }
    }
    
    public static String diffPosX(int xPos, int xMin, int xMax){
        if(xPos < xMax && xPos > xMin){
            return "E;"+(xMax-xPos);
        }else if(xPos >= xMax){
            return "Max;"+(xMax-xPos);
        }else if(xPos <= xMin){
            return "Min;"+(xPos-xMin);
        }
        return "Erreur;"+0;
    }
}