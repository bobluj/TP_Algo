package tp_02;

//import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare{

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {


        // Tableau
        int[][] Tab;



        //Variable
        int I;
        int J;
        int N;
        int Compteur;

        Compteur = 0;
            Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer le rang du carré magico (nombre impair)");
            N = reader.nextInt();
            Tab = new int[N][N];
            I = N/2 +2;
            System.out.println(I);
            J = N/2 +1;

      while( Compteur != N*N)
      {
          if (Tab[I][J] = )
          Compteur++;

          if  (5 % N == 0)
          {
            if (I > N-2)
                I = -1;
            I = I + 2;
          }
          else
          {
              if (J > N-2)
          {
              J = 0;
              I++;
          }
              else if (I > N-2)
              {
                I = -1;
                I = I + 2;
              }
            }
                    Tab[I][J] = Compteur;
      }
                for(I = 0; I < N; I++)
            {
                System.out.print("\n");
                for (J = 0; J < N; J++)
                {
                    System.out.print( Tab[I][J]+ "\t");
                }
        }
}
}