/**
 * Cette classe permet de definir un vehicule que ce soit un vehicule tereste ou aerien
 */
public abstract class Vehicule {

    private String marque;
    private String modele;
    private String vitesseMax;
    private String prixLocationJour;
    private String etat;
    private boolean disponible;

    /**
     * permet la serialisation
     */
    public Vehicule() {
    }

    /**
     * nessecaire pour implementer les vehicule dans le programe
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param prixLocationJour
     * @param etat
     */
    public Vehicule(String marque, String modele, String vitesseMax, String prixLocationJour, String etat) {
        this.marque = marque;
        this.modele = modele;
        this.vitesseMax = vitesseMax;
        this.prixLocationJour = prixLocationJour;
        this.etat = etat;
        this.disponible=true;
    }

    //set

    public void setMarque(String aMarque){
        marque=aMarque;
    }
    public void setModele(String aModele){
        modele=aModele;
    }
    public void setVitesseMax(String aVitesseMax){
        vitesseMax=aVitesseMax;
    }
    public void setPrixLocationJour(String aPrix){
        prixLocationJour=aPrix;
    }
    public void setEtat(String aEtat){
        etat=aEtat;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
// get

    public String getMarque(){
        return marque;
    }
    public String getModele(){
        return modele;
    }
    public String getVitesseMax(){
        return vitesseMax;
    }
    public String getPrixLocationJour(){
        return prixLocationJour;
    }
    public String getEtat(){
        return etat;
    }

    public boolean isDisponible() {
        return disponible;
    }
//other methode

    public String getNameVehicule(){
        return (this.marque+" "+this.modele);
    }

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
