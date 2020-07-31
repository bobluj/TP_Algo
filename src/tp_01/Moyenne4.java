package tp_01;

import java.util.Scanner;

public class Moyenne4 {

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {
        
        //Constantes
        final int Max = 5;
        
        //Variable
        int I, Nb; 
        double Moyenne;
        
        I = 1;
        Moyenne = 0;
        Nb = 0;
        
        //
        while (I < Max)
        {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer le nombre %d:  ", I);
           /*  try {
                    Nb = reader.nextInt();
                    Moyenne += Nb;
                }
                    catch(e)
                            {}  */           
                Nb = 0;
                I++;
                            
        }
        
        Moyenne = Moyenne/(Max-1);
        System.out.println("Moyenne: " + Moyenne);
    }   
}
