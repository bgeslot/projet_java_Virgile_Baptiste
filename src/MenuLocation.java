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
        ArrayList newListe=new ArrayList();
        ArrayList oldListe=listeLocation;
        int n=oldListe.size();
        for(int i=0;i<n;++i){
            newListe.add(i,oldListe.get(i));
        }
        newListe.add(n,aLocation);

    }

    public void delLocation(Vehicule aLocation){
        ArrayList listToModif=listeLocation;
        if(listToModif.remove(aLocation)){
            System.out.println("Element Suprimer");
        }
        else{
            System.out.println("Il n'y a pas de tel location");
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
