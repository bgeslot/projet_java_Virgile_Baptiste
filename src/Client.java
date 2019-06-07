import java.util.ArrayList;

public class Client {

    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private ArrayList listeLocationEnCours;
    private String adresseMail;
    private String numTelephone;

    public Client()
    {

    }

    public Client(String nom, String prenom, String dateDeNaissance, String adresseMail, String numTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresseMail = adresseMail;
        this.numTelephone = numTelephone;
        this.listeLocationEnCours = new ArrayList();
    }

    //set

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setListeLocationEnCours(ArrayList listeLocationEnCours) {
        listeLocationEnCours = listeLocationEnCours;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //get

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public ArrayList getListeLocationEnCours() {
        return listeLocationEnCours;
    }

    public String getNom() {
        return nom;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    //other Metode

    public String toString(){
        String newString=new String();
        newString=this.getPrenom()+" "+this.getNom();
        return newString;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}