import java.util.ArrayList;

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
//usefull methode

    public int getNewID(){
        this.numLocaMin=numLocaMin+1;
        return  numLocaMin;
    }

    public void addLocation(Location aLocation){
        (this.listeLocation).add(aLocation);

    }

    public void delLocation(int i){
        if(i!=-1) {
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
