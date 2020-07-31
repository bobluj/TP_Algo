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
public class OutInteger {

    public static void main(String[] args) {
        double Nb;

        System.out.print("Entrer N reel: ");
        Scanner reader = new Scanner(System.in);
        Nb = reader.nextDouble();

        System.out.println("La partie entière vaut : " + entier(Nb));
    }
public static int entier(double Nb)
{
    int resu;
    resu = 0;

    {
        while(resu <= Nb)
            resu++;
        return(resu - 1);
    }
    }
}

