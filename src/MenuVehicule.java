import java.util.ArrayList;

public class MenuVehicule {

    private ArrayList listeVehicule;

    public MenuVehicule MenuVrhicule(){
        return new MenuVehicule();
    }

    //set

    public void setListeVehicule(ArrayList listeVehicule) {
        this.listeVehicule = listeVehicule;
    }

    //get

    public ArrayList getListeVehicule() {
        return listeVehicule;
    }

    //usefull methode

   public void addVehicule(Vehicule aVehicule){
       ArrayList newListe=new ArrayList();
       ArrayList oldListe=listeVehicule;
       int n=oldListe.size();
       for(int i=0;i<n;++i){
           newListe.add(i,oldListe.get(i));
       }
       newListe.add(n,aVehicule);

    }

    public void delVehicule(Vehicule aVehicule){
        ArrayList listToModif=new ArrayList();
        if(listToModif.remove(aVehicule)){
            System.out.println("Element Suprimer");
        }
        else{
            System.out.println("Il n'y a pas de tel vehicule");
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
