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
    public class Ticket{
        private int h_arr;
        private int h_dep;
        private int mn1;
        private int mn2;
        private int nbk;
        private double prix_km;
        private int duree_trajet;
        private double prix_ticket;

    public Ticket(){}

    public Ticket(int h1, int mn1, int h2, int mn2, int nbk, double prix_km)
    {
        h1 = h_arr;
        h2 = h_dep;
        this.mn1 = mn1;
        this.mn2 = mn2;
        this.nbk = nbk;
        this.prix_km = prix_km;
    }


public void calcul_prix()
{
 this.prix_ticket = prix_km * nbk;
}
    public void calcul_duree()
    {
        this.duree_trajet = (h_arr - h_dep)*60;
        this.duree_trajet += mn2 - mn1;
    }

    public String calcul_duree(int duree)
    {
        return(duree / 60 + "h" + duree % 60 + "min");
    }


    public void affiche()
    {
        System.out.printf("Départ : %02d %02dmin \n Arrivée %02dh %02dmin\n"
                + "Distance %dkm\n Prix du km %fcts\n "
                + "Durée: %s\n Prix du ticket : %2.2f",this.h_dep, this.mn1, this.h_arr, this.mn2, this.nbk, nbk/prix_ticket, calcul_duree(this.duree_trajet),this.prix_ticket);
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ticket t1 = new Ticket(8, 8, 8, 45, 60, 0.20);
        t1.calcul_duree();
        t1.calcul_prix();
        t1.affiche();
    }
}
