import java.util.ArrayList;

public class MenuClient {

    private ArrayList listeClient;

    public MenuClient() {
        listeClient = new ArrayList();
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

    public void addClient(Client aClient){
        (this.listeClient).add(aClient);

    }

    public void delClient(Client aClient){
        ArrayList listToModif=listeClient;
        if(listToModif.remove(aClient)){
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
