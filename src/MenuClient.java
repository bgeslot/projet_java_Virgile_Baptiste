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

    public void delClient(int i){
        if(i!=-1) {
            listeClient.remove(i);
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
