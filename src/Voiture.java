/**
 * Permet de definire un vehicule terestre de type Voiture
 */
public class Voiture extends Terrestre {

    private String nbPlace;

    //new car

    /**
     * permet la serialisation
     */
    public Voiture()
    {
    }

    /**
     * nessecaire pour implementer les vehicule dans le programe
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param prixLocationJour
     * @param etat
     * @param km
     * @param puissance
     * @param nbPlace
     */
    public Voiture(String marque, String modele, String vitesseMax, String prixLocationJour, String etat, String km, String puissance, String nbPlace) {
        super(marque, modele, vitesseMax, prixLocationJour, etat, km, puissance);
        this.nbPlace = nbPlace;
    }

    //seter


    public void setNbPlace(String nbPlace) {
        this.nbPlace = nbPlace;
    }

    //geter


    public String getNbPlace() {
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
