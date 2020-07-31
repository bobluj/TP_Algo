/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_03;

import java.util.Scanner;

/**
 *
 * @author jules.rachet
 */
public class Isprime {
    public static void main(String[] args)
    {
        int Nb;


            Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer votre nombre (supérieur ou égal à trois):  ");
            Nb = reader.nextInt();

            System.out.println("Après vérification votre nombre est " + (FuncIsPrime(Nb)?" premier":" pas premier"));
    }

        public static boolean FuncIsPrime(int Nb)
    {
        boolean IsPrime;
        int i;
        i = 3;

          if((Nb % 2) == 0)
              return (false);
            while ((i*i <= Nb) && Nb % i != 0)
            {
                i = i+2;
            }
            return (i*i > Nb);
    }

}

