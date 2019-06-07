/**
 * Permet de definire un vehicule terrestre
 */
public abstract class Terrestre extends Vehicule {

    private String km;
    private String puissance;

    /**
     * nessecaire pour implementer les vehicule terrestre dans le programe
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param prixLocationJour
     * @param etat
     * @param km
     * @param puissance
     */
    public Terrestre(String marque, String modele, String vitesseMax, String prixLocationJour, String etat, String km, String puissance) {
        super(marque, modele, vitesseMax, prixLocationJour, etat);
        this.km = km;
        this.puissance = puissance;
    }

    /**
     * permet la serialisation
     */
    public Terrestre() {
    }
// seter

    public void setKm(String km) {
        this.km = km;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    // geter


    public String getKm() {
        return km;
    }

    public String getPuissance() {
        return puissance;
    }

    //other methode

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
