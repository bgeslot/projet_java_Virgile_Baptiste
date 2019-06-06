/**
 *
 */
public class Aerien extends Vehicule {

    private String heureDeVol;

    /**
     *
     */
 public Aerien()
    {
    }

    /**
     *
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

    /**
     *
     * @param heureDeVol
     */
    public void setHeureDeVol(String heureDeVol) {
        this.heureDeVol = heureDeVol;
    }

    //get

    /**
     *
     * @return
     */
    public String getHeureDeVol() {
        return heureDeVol;
    }

    //other method

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
