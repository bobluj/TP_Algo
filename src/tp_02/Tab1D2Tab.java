package tp_02;

//import java.util.Arrays;
import java.util.Scanner;

public class Tab1D2Tab {

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {

        //Constantes
        final int Max = 10;

        // Tableau
        int[] Tab;
        int[] Tab2;

        Tab = new int[Max];
        Tab2 = new int[Max];

        //Variable
        int I;

       for (I = 0; I < Max ; I++)
        {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer le nombre %d:  ", I+1);
            Tab[I] = Tab2[Max-1-I] = reader.nextInt();
        }

      for (I = 0; I < Max; I++)
       {
            System.out.print(Tab[I] + " " + Tab2[I]+ "\n");
       }




        //  System.out.println(Arrays.toString(Tab));

    }


    }