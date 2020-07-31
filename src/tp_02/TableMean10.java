package tp_02;

//import java.util.Arrays;
import java.util.Scanner;

public class TableMean10 {

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {

        //Constantes
        final int Max = 10;

        // Tableau
        int[] Tab;
        Tab = new int[Max];

        //Variable
        int I;
        double Moyenne;

        Moyenne = 0;

       for (I = 0 ; I < Max; I++)
        {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer le nombre %d:  ", I+1);
            Tab[I] = reader.nextInt();
            Moyenne += Tab[I];
        }
                Moyenne =  Moyenne/Max;
                System.out.println("Moyenne: " + Moyenne);

        for (I = 0; I < Max; I++)
        {
            System.out.print(Tab[I]+ ", ");
        }
        //  System.out.println(Arrays.toString(Tab));

    }


    }