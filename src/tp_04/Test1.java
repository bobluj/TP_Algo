/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_04;

/**
 *
 * @author jules.rachet
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Figure2D[] TabFig = new Figure2D[2];
        double SommeAire;

        SommeAire=0;

        Carre Fig1 = new Carre(0,0,10);
        Cercle Fig2 = new Cercle (15,10,10);

       TabFig[0] = Fig1;
       TabFig[1] = Fig2;

      for(Figure2D f: TabFig)
       {

             SommeAire += f.calcSurface();
       }
        System.out.printf("Surface totale : %5.2f %n", SommeAire);
    }

}
