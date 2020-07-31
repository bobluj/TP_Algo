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
public class Carre extends Figure2D {
    private final double cote;

    public Carre(double X, double Y, double cote)
    {
        super(X, Y);
        this.cote = cote;

    }
    @Override
    public double calcSurface()
    {
        return(cote * cote);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
