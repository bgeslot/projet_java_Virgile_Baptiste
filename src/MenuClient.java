import java.util.ArrayList;

/**
 * La classe MenuClient permet de creer des objet contenant une liste de client
 */
public class MenuClient {

    private ArrayList listeClient;

    public MenuClient()
    {
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

    /**
     * Permet d'ajouter un client
     * @param aClient
     */
    public void addClient(Client aClient)
    {
        (this.listeClient).add(aClient);
    }

    /**
     * Permet de supprimer le i-eme client
     * @param i
     */
    public void delClient(int i){
        if(i!=-1) {
            listeClient.remove(i);
        }
    }

    /**
     * Cette methode permet d'obtenir une liste des nom et prenom des client pour l'utilise dans l'interface
     * @param data
     * @return
     */
    public String[] getClient(String[] data){
        ArrayList listeClient;
        listeClient = this.getListeClient();
        int length=listeClient.size();
        data=new String[length];
        for(int i=0;i<length; i++){
            data[i]=(((Client)(listeClient.get(i))).getPrenom()+" "+((Client)(listeClient.get(i))).getNom());
        }
        return data;
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
