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
public class Cercle extends Figure2D {
    private final double rayon;

    public Cercle(double X, double Y, double rayon)
    {
        super(X, Y);
        this.rayon = rayon;

    }
   @Override
    public double calcSurface()
    {
        return(rayon*rayon*Math.PI );
    }

    public double getRayon() {
        return rayon;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
    }

}
