package tp_01;

import java.util.Scanner;

public class SelecDep {
// Compare deux Variables Nb1 et Nb2
// Renvoi si Nb1 est plus petit plus grand ou égal à Nb2

    public static void main(String[] args) {

          String Bdr;
          String Var;
          String Vau;

          Bdr = "Bouches-du-Rhône";
          Var = "Var";
          Vau = "Vaucluse";


        //Variables
        int Nb;
        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer numéro département: ");

        switch(Nb = reader.nextInt())
                {
                case (13):
        System.out.printf("Le département est: %s ", Bdr);
                case (83):
        System.out.printf("Le département est %s:  ", Var);
                case (84):
        System.out.printf("Le département est %s:  ", Vau);
                    default:
                    System.out.printf("Département inconnu en Paca");
                }

    }
}
