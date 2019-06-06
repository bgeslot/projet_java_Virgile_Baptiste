import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

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

    public void addClient(Client aClient)
    {
        (this.listeClient).add(aClient);
    }

    public void delClient(int i){
        if(i!=-1) {
            listeClient.remove(i);
        }
    }

    public String[] getClient(String[] data){
        ArrayList listeClient;
        listeClient = this.getListeClient();
        int length=listeClient.size();
        data=new String[length];
        for(int i=0;i<length; i++){
            data[i]=(((Client)(listeClient.get(i))).getNom()+" "+((Client)(listeClient.get(i))).getPrenom());
        }
        return data;
    }

    // other

    public static  void serializationClient(MenuClient menuClient) {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("client.xml")));
            encoder.writeObject(menuClient.getListeClient());
            encoder.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (encoder != null) {
                encoder.close();
            }
        }
    }


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
