import java.util.ArrayList;

public class MenuLocation {
    private ArrayList listeLocation;

    public MenuLocation MenuLocation(){
        MenuLocation newMenu=new MenuLocation();
        newMenu.setListeLocation(new ArrayList());
        return newMenu;
    }

    //set

    public void setListeLocation(ArrayList listeLocation) {
        this.listeLocation = listeLocation;
    }

    //get

    public ArrayList getListeLocation() {
        return listeLocation;
    }

    //usefull methode

    public void addLocation(Location aLocation){
        (this.listeLocation).add(aLocation);

    }

    public void delLocation(int i){
        listeLocation.remove(i);
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
