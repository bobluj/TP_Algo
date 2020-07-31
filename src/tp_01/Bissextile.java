package tp_01;

import java.util.Scanner;

public class Bissextile {
// Verifie si un nombre est pair ou non
// Si Nb modulo 2 vaut 0 alors le nombre est pair sinon il est impair

    public static void main(String[] args) {


        //Variable
        int Annee;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer l'année à vérifier: ");
        Annee = reader.nextInt();

        if (Annee % 400 == 0)
        {
            System.out.println("L'année est bissextile(^_^')");
        }
        else if (Annee % 100 == 0)
        {
            System.out.println("L'année n'est pas bissextile(-_-')");
        }
        else if (Annee % 4 == 0)
            System.out.println("L'année n'est pas bissextile(-_-') ");
        else {
            System.out.println("L'année est bissextile(^_^')");
        }
    }
}