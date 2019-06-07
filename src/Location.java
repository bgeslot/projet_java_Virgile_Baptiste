/**
 *Cette classe permet de definire une location
 */
public class Location {

    private int numLocation;
    private Vehicule vehicule;
    private Client client;
    private String dataDebut;
    private String duree;
    private String kmPrevu;
    private int PrixPrevu;
    private boolean reduction;

    public Location()
    {

    }

    /**
     * Crer une nouvelle location et utilise la duree de la location et le nombre de km prevu pour determine le prix.
     * De plus on met a jour la liste de vehicule louer par le client
     * @param client
     * @param numLocation
     * @param dataDebut
     * @param duree
     * @param kmPrevu
     * @param reduction
     * @param vehicule
     */
    public Location(Client client,int numLocation, String dataDebut, String duree, String kmPrevu, boolean reduction, Vehicule vehicule)
    {
        this.vehicule=vehicule;
        this.client=client;
        this.numLocation = numLocation;
        this.dataDebut = dataDebut;
        this.duree = duree;
        this.kmPrevu = kmPrevu;
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
        this.duree = durre;
    }

    public void setKmPrevu(String kmPrevu) {
        this.kmPrevu = kmPrevu;
    }

    public void setNumLocation(int numLocation) {
        this.numLocation = numLocation;
    }

    public void setPrixPrevu(int prixPrevu) {
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
        return duree;
    }

    public Client getClient() {
        return client;
    }

    public String getKmPrevu() {
        return kmPrevu;
    }

    public int getPrixPrevu() {
        return PrixPrevu;
    }

    public int getNumLocation() {
        return numLocation;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public boolean getReduction() {
        return reduction;
    }

    public String getDuree() {
        return duree;
    }
    //other metode

    /**
     * genere automatiquement le prix
     * @param vehicule
     * @param duree
     * @param kilometrage
     * @param reduction
     * @return
     */
    public static int prixLocation(Vehicule vehicule, int duree,int kilometrage, boolean reduction){
        //int temps=Integer.parseInt(uneDuree);
        //int km=Integer.parseInt(unKilometrage);
        int res=duree*Integer.parseInt(vehicule.getPrixLocationJour())+kilometrage;
        if (reduction)
        {
            res=(int) (0.9*res);
        }
        return res;
    }

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
