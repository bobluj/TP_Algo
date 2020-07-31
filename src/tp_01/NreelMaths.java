package tp_01;

import java.util.Scanner;


public class NreelMaths {
// additionne les nombre de 1 en 1 jusqu'a Nb

    public static void main(String[] args) {


        //Variable
        double Nb;
        double Somme;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer N reel: ");

        Nb = reader.nextDouble();
        Somme = (0.5*Nb) * (Nb+1);
        System.out.printf("L'addition des réels de votre Nombre vaut : %f ", Somme);
    }
}
