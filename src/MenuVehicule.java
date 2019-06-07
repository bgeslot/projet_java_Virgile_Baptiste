import java.util.ArrayList;

/**
 * La classe MenuClient permet de creer des objet contenant une liste de clients
 */
public class MenuVehicule {

    private ArrayList listeVoiture;
    private ArrayList listeMoto;
    private ArrayList listeAvion;

    public MenuVehicule() {
        listeVoiture=new ArrayList();
        listeMoto=new ArrayList();
        listeAvion=new ArrayList();
    }

    //set

    public void setListeAvion(ArrayList listeAvion) {
        this.listeAvion = listeAvion;
    }

    public void setListeMoto(ArrayList listeMoto) {
        this.listeMoto = listeMoto;
    }

    public void setListeVoiture(ArrayList listeVoiture) {
        this.listeVoiture = listeVoiture;
    }
    //get

    public ArrayList getListeAvion() {
        return listeAvion;
    }

    public ArrayList getListeMoto() {
        return listeMoto;
    }

    public ArrayList getListeVoiture() {
        return listeVoiture;
    }
    //usefull methode

   public void addVoiture(Voiture aVoiture){
       (this.listeVoiture).add(aVoiture);

    }

    public void addMoto(Moto aMoto){
        (this.listeMoto).add(aMoto);

    }

    public void addAvion(Avion aAvion){
        (this.listeAvion).add(aAvion);
    }


    public void delVoiture(int i){
        if(i!=-1) {
            listeVoiture.remove(i);
        }
    }

    public void delMoto(int i){
        if(i!=-1) {
            listeMoto.remove(i);
        }
    }

    public void delAvion(int i){
        if(i!=-1) {
            listeAvion.remove(i);
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
