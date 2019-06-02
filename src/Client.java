import java.util.Calendar;

public class Client {

    private String nom;
    private String prenom;
    private Calendar dateDeNaissance;
    private Location[] ListeLocationEnCours;
    private String adresseMail;
    private String numTelephone;

    public  Client( )
    {

    }

    //set

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void setDateDeNaissance(Calendar dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setListeLocationEnCours(Location[] listeLocationEnCours) {
        ListeLocationEnCours = listeLocationEnCours;
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

    public Calendar getDateDeNaissance() {
        return dateDeNaissance;
    }

    public Location[] getListeLocationEnCours() {
        return ListeLocationEnCours;
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