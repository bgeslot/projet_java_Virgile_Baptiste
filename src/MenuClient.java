import java.util.ArrayList;

public class MenuClient {

    private ArrayList listeClient;

    public MenuClient MenuClient(){
        return new MenuClient();
    }

    //set

    public void setListeClient(ArrayList listeClient) {
        this.listeClient = listeClient;
    }

    //get

    public ArrayList getListeClient() {
        return listeClient;
    }

    //usefull methode

    public void addClient(Location aClient){
        ArrayList newListe=new ArrayList();
        ArrayList oldListe=listeClient;
        int n=oldListe.size();
        for(int i=0;i<n;++i){
            newListe.add(i,oldListe.get(i));
        }
        newListe.add(n,aClient);

    }

    public void delLocation(Vehicule aLocation){
        ArrayList listToModif=listeClient;
        if(listToModif.remove(aLocation)){
            System.out.println("Element Suprimer");
        }
        else{
            System.out.println("Il n'y a pas de tel client");
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
