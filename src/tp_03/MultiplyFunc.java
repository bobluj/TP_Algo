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
public class MultiplyFunc {


    public static void main(String[] args)
    {
        int Nb;
        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer la table à multiplier : ");
        Nb = reader.nextInt();
        multipl(Nb);
    }

public static void multipl(int Nb)
{
    int resu;
        for(resu = 1 ; resu <= 10 ; resu++)
            System.out.printf("%d * %d = %d \n" ,Nb, resu, resu * Nb);
}
}
