/**
 * Permet de definire un vehicule aérient de type Avion
 */
public class Avion extends Aerien {

    private String nbMoteur;

    /**
     * permet la serialisation
     */
    public Avion()
    {
    }

    /**
     * nessecaire pour implementer les avion dans le programe
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param prixLocationJour
     * @param etat
     * @param heureDeVol
     * @param nbMoteur
     */
    public Avion(String marque, String modele, String vitesseMax, String prixLocationJour, String etat, String heureDeVol, String nbMoteur) {
        super(marque, modele, vitesseMax, prixLocationJour, etat, heureDeVol);
        this.nbMoteur = nbMoteur;
    }

    //set

    public void setNbMoteur(String nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    //get

    public String getNbMoteur()
    {
        return nbMoteur;
    }

    //other

    @Override
    public String toString()
    {
        return super.toString();
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
