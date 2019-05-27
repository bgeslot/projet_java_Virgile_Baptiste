import java.util.Calendar;

public class Location {

    private int numLocation;
    private Vehicule vehicule;
    private Client client;
    private Calendar dataDebut;
    private Calendar dateFin;
    private float kmPrevu;
    private float PrixPrevu;
    private boolean reduction;

    public Location Location(){
        return new Location();
    }

    //set


    public void setClient(Client client) {
        this.client = client;
    }

    public void setDataDebut(Calendar dataDebut) {
        this.dataDebut = dataDebut;
    }

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    public void setKmPrevu(float kmPrevu) {
        this.kmPrevu = kmPrevu;
    }

    public void setNumLocation(int numLocation) {
        this.numLocation = numLocation;
    }

    public void setPrixPrevu(float prixPrevu) {
        PrixPrevu = prixPrevu;
    }

    public void setReduction(boolean reduction) {
        this.reduction = reduction;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    //get


    public Calendar getDataDebut() {
        return dataDebut;
    }

    public Calendar getDateFin() {
        return dateFin;
    }

    public Client getClient() {
        return client;
    }

    public float getKmPrevu() {
        return kmPrevu;
    }

    public float getPrixPrevu() {
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
