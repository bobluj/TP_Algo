package tp_01;

import java.util.Scanner;

public class Bissextilev3 {
// Verifie si un nombre est pair ou non
// Si Nb modulo 2 vaut 0 alors le nombre est pair sinon il est impair

    public static void main(String[] args) {

final long START = System.nanoTime();
        //Variable
        int Annee;

        Scanner reader = new Scanner(System.in);

        do
        {
            System.out.println("Entrer une année comprise entre 1900 et 2100");
            Annee = reader.nextInt();

        }
        while(Annee < 1900 || Annee > 2100);

         if (Annee % 400 == 0 || ( Annee % 100 != 0 && Annee % 4 == 0))
         {
             System.out.println("L'année est bissextile(^_^')");
         }
        else {
             System.out.println("L'année n'est pas bissextile(-_-') ");
         }
          final long END = System.nanoTime();
   System.out.println("Time taken : " + ((END - START) / 1e+9) + " seconds");
    }

}