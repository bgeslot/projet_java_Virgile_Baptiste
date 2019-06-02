import java.util.ArrayList;

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


    public void delVoiture(Voiture aVoiture){
        ArrayList listToModif=listeVoiture;
        if(listToModif.remove(aVoiture)){
            System.out.println("Element Suprimer");
        }
        else{
            System.out.println("Il n'y a pas de tel vehicule");
        }
    }

    public void delMoto(Moto aMoto){
        ArrayList listToModif=listeMoto;
        if(listToModif.remove(aMoto)){
            System.out.println("Element Suprimer");
        }
        else{
            System.out.println("Il n'y a pas de tel vehicule");
        }
    }

    public void delAvion(Avion aAvion){
        ArrayList listToModif=listeAvion;
        if(listToModif.remove(aAvion)){
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
