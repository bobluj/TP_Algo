package tp_01;

import java.util.Scanner;

public class IntCompImp {
// Compare deux Variables Nb1 et Nb2
// Renvoi si Nb1 est plus petit plus grand ou égal à Nb2

    public static void main(String[] args) {


        //Variables
        int Nb1;
        int Nb2;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer nombre 1: ");
        Nb1 = reader.nextInt();
        System.out.print("Entrer nombre 2: ");
        Nb2 = reader.nextInt();
        if (Nb1 < Nb2)
        {
            System.out.println("Nb1 est plus petit que Nb2");
        }
        else if (Nb1 == Nb2)
        {
            System.out.println("Les nombres sont égaux");
        }
        else
        {
            System.out.println("Nb1 est plus grand que Nb2");
        }
    }
}


