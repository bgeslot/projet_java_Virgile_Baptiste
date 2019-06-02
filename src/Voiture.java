public class Voiture extends Terrestre {

    //new car


    public Voiture(String marque, String modele, int vitesseMax, int prixLocationJour, String etat, int km, int puissance, int nbPlace) {
        super(marque, modele, vitesseMax, prixLocationJour, etat, km, puissance);
        this.nbPlace = nbPlace;
    }

    private int nbPlace;

    //seter


    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    //geter


    public int getNbPlace() {
        return nbPlace;
    }

    //other methode


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
