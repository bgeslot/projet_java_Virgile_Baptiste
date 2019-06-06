import java.util.Calendar;

public class Location {

    private int numLocation;
    private Vehicule vehicule;
    private Client client;
    private String dataDebut;
    private String durre;
    private String kmPrevu;
    private String PrixPrevu;
    private boolean reduction;

    public Location()
    {

    }

    public Location(int numLocation, String dataDebut, String durre, String kmPrevu, String prixPrevu, boolean reduction)
    {
        this.numLocation = numLocation;
        this.dataDebut = dataDebut;
        this.durre = durre;
        this.kmPrevu = kmPrevu;
        this.PrixPrevu = prixPrevu;
        this.reduction = reduction;
    }

    //set


    public void setClient(Client client) {
        this.client = client;
    }

    public void setDataDebut(String dataDebut) {
        this.dataDebut = dataDebut;
    }

    public void setDateFin(String durre) {
        this.durre = durre;
    }

    public void setKmPrevu(String kmPrevu) {
        this.kmPrevu = kmPrevu;
    }

    public void setNumLocation(int numLocation) {
        this.numLocation = numLocation;
    }

    public void setPrixPrevu(String prixPrevu) {
        PrixPrevu = prixPrevu;
    }

    public void setReduction(boolean reduction) {
        this.reduction = reduction;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    //get


    public String getDataDebut() {
        return dataDebut;
    }

    public String getDateFin() {
        return durre;
    }

    public Client getClient() {
        return client;
    }

    public String getKmPrevu() {
        return kmPrevu;
    }

    public String getPrixPrevu() {
        return PrixPrevu;
    }

    public int getNumLocation() {
        return numLocation;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    //other metode


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
