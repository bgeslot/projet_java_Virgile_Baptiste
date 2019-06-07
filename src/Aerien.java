/**
 * permet de definir un vehicule aerien
 */
public class Aerien extends Vehicule {

    private String heureDeVol;

    /**
     *permet la serialisation
     */
 public Aerien()
    {
    }

    /**
     * nessecaire pour implementer les vehicule aerien dans le programe
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param prixLocationJour
     * @param etat
     * @param heureDeVol
     */
    public Aerien(String marque, String modele, String vitesseMax, String prixLocationJour, String etat, String heureDeVol) {
        super(marque, modele, vitesseMax, prixLocationJour, etat);
        this.heureDeVol = heureDeVol;
    }


    //set


    public void setHeureDeVol(String heureDeVol) {
        this.heureDeVol = heureDeVol;
    }

    //get


    public String getHeureDeVol() {
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
