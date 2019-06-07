/**
 * Permet de definire un vehicule terestre de type Moto
 */
public class Moto extends Terrestre {

    //new bike

    /**
     * permet la serialisation
     */
    public Moto() {
    }

    /**
     * nessecaire pour implementer les motos dans le programe
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param prixLocationJour
     * @param etat
     * @param km
     * @param puissance
     */
    public Moto(String marque, String modele, String vitesseMax, String prixLocationJour, String etat, String km, String puissance) {
        super(marque, modele, vitesseMax, prixLocationJour, etat, km, puissance);
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