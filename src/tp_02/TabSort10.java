package tp_02;

//import java.util.Arrays;
import java.util.Scanner;

public class TabSort10 {

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {

        //Constantes
        final int Lim = 10;

        // Tableau
        int[] Tab;

        Tab = new int[Lim];

        //Variable
        int I;
        long Max;

       for (I = 0; I < Lim ; I++)
        {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer le nombre [%d]:  ", I+1);
            Tab[I] = reader.nextInt();
        }
        Max = Tab[0];
             for (I = 1; I < Lim; I++)
            {
                if (Tab[I]> Max)
                    Max = Tab[I];
            }
             System.out.print( Max + "\n");
        }
}

