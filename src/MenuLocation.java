import java.util.ArrayList;

/**
 * La classe MenuLocation permet de creer des objet contenant une liste de location
 */
public class MenuLocation {
    public ArrayList listeLocation;
    private int numLocaMin;

    public MenuLocation(){
        this.setListeLocation(new ArrayList());
        numLocaMin=0;
    }

    //set

    public void setListeLocation(ArrayList listeLocation) {
        this.listeLocation = listeLocation;
    }

    public void setNumLocaMin(int numLocaMin) {
        this.numLocaMin = numLocaMin;
    }
//get

    public ArrayList getListeLocation() {
        return listeLocation;
    }

    public int getNumLocaMin() {
        return numLocaMin;
    }

    public int getActualID()
    {
        return this.numLocaMin+1;
    }
//usefull methode

    /**
     * permet de changer la variable d'instance numLocaMin qui sert à donne l'identifiant d'une location
     * @return
     */
    public int getNewID(){
        this.numLocaMin=numLocaMin+1;
        return  numLocaMin;
    }

    public void addLocation(Location aLocation){
        (this.listeLocation).add(aLocation);

    }

    public void delLocation(int i){
        if(i!=-1) {
            Location location=(Location)(this.listeLocation.get(i));
            location.getVehicule().setDisponible(true);
            listeLocation.remove(i);

        }
    }

    // other


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
