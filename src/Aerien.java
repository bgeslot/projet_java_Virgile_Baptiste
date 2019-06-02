public class Aerien extends Vehicule {

    private int heureDeVol;

    public Aerien(String marque, String modele, int vitesseMax, int prixLocationJour, String etat, int heureDeVol) {
        super(marque, modele, vitesseMax, prixLocationJour, etat);
        this.heureDeVol = heureDeVol;
    }


    //set

    public void setHeureDeVol(int heureDeVol) {
        this.heureDeVol = heureDeVol;
    }

    //get

    public int getHeureDeVol() {
        return heureDeVol;
    }

    //other method


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
