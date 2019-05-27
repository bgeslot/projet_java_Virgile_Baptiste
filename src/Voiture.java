public class Voiture extends Terrestre {

    //new car

    public Voiture Voiture(){
        return new Voiture();
    };

    private int nbPlace;

    //seter


    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    //geter


    public int getNbPlace() {
        return nbPlace;
    }

    //other methode


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
