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
public class FuncTabMaxIndex {
    public static void main(String[] args)
    {
        final int Lim;
        int[] tab;
        int I;
        Lim = 10;
        tab = new int[Lim];

         for (I = 0; I < Lim ; I++)
        {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer le nombre [%d]:  ", I+1);
            tab[I] = reader.nextInt();
        }
         System.out.println(TabMaxIndex(tab));
    }

    public static int TabMaxIndex(int[] Tab)
    {
        int Maxindex;
        int Max;
        int i;
        int n;

        Max = Tab[0];
        Maxindex = 0;
        n = Tab.length;

        for(i = 1; i < n; i++)
        {
            if (Tab[i] > Tab[Maxindex])
            {
                Maxindex = i;
            }
        }
            return(Maxindex);
    }
}