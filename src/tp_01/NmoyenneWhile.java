package tp_01;

import java.util.Scanner;

public class NmoyenneWhile {

    // Calcule la moyenne de N Nombres rentrés par l'utilisateur.
    public static void main(String[] args) {

        //Constantes
        final double Max;

        //Variable
        int I, Nb;
        double Moyenne;

        I = 1;
        Moyenne = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Entrer le nombre de valeurs à additionner : ");
        // Nombre de valeur a ajouter + 1 pour que ma f string précise la Ième valeur en cours de traitement
        Max = 1 + reader.nextDouble();
        //Tant que mon compteur I n'atteint pas le nombre de valeur à additionner entrées par l'utilisateur
        while (I < Max)
        {
            System.out.printf("Entrer le nombre %d:  ", I);
            Nb = reader.nextInt();


            Moyenne = Moyenne + Nb;
            System.out.println("La moyenne vaut: " + Moyenne);
            I++;
        }

        Moyenne = Moyenne/(Max-1);
        System.out.println("Moyenne: " + Moyenne);
    }
}