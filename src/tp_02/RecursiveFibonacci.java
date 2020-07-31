package tp_02;

import java.util.Scanner;

/**
 *
 * @author jules.rachet
 */
public class RecursiveFibonacci {

static int Fibo(int N)
{
    if (N == 1)
    {
     return 1;
    }
    return (Fibo(N-1)+ N);
}
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int MonNombre = reader.nextInt();
        System.out.println(Fibo(MonNombre));
    }

}
