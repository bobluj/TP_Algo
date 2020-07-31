package tp_01;

import java.util.Scanner;

public class NmoyenneFor {

    // Calcule la moyenne de N Nombres rentrés par l'utilisateur.
    public static void main(String[] args) {


        double Max;

        //Variable
        int I, Nb;
        double Moyenne;

        Moyenne = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer le nombre de valeurs à additionner : ");

        Max = reader.nextDouble();

        for (I = 1 ; I <= Max; I++)
        {
            System.out.printf("Entrer le nombre %d:  ", I);
            Nb = reader.nextInt();

            Moyenne += Nb;
            System.out.printf("La moyenne vaut actuellement %f/%f  \n \n",Moyenne, Max);
        }

        Moyenne = Moyenne/(Max);
        System.out.printf("Moyenne: %f \n", Moyenne);
    }
}