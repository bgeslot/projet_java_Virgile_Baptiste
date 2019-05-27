public abstract class Vehicule {

    private String marque;
    private String modele;
    private int vitesseMax;
    private int prixLocationJour;
    private String etat;

    public abstract Vehicule Vehicule();

    //set

    public void setMarque(String aMarque){
        marque=aMarque;
    }
    public void setModele(String aModele){
        modele=aModele;
    }
    public void setVitesseMax(int aVitesseMax){
        vitesseMax=aVitesseMax;
    }
    public void setPrixLocationJour(int aPrix){
        prixLocationJour=aPrix;
    }
    public void setEtat(String aEtat){
        etat=aEtat;
    }

    // get

    public String getMarque(){
        return marque;
    }
    public String getModele(){
        return modele;
    }
    public int getVitesseMax(){
        return vitesseMax;
    }
    public int getPrixLocationJour(){
        return prixLocationJour;
    }
    public String getEtat(){
        return etat;
    }




}
