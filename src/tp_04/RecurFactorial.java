/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_04;

import java.util.Scanner;

/**
 *
 * @author jules.rachet
 */
public class RecurFactorial {


    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int MonNombre = reader.nextInt();
        System.out.println(Factorial(MonNombre));
    }

    static int Factorial(int N)
{
    // double Factor = N * (N-1);

    if (N == 1)
    {
     return 1;
    }
    return (N * Factorial(N-1));
}

}
