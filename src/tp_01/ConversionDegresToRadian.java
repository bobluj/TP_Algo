package tp_01;

import java.util.Scanner;

public class ConversionDegresToRadian {
    
    // Converti des degés en radian 
    // Formule Pi * Angle / 180

    public static void main(String[] args) {
        
        /*Constantes*/
        
      final float PI = 3.1415926f;
        
        //Variable
        double angle; 
        double resultat;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Valeur de l'angle en degrè(s): ");
        angle = reader.nextDouble();
        resultat = Math.PI * angle / 180;
        System.out.println("Angle en radian : " + resultat);
        // TODO code application logic here
    }
    
}