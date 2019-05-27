public class Avion extends Aerien {

    private int nbMoteur;

    public Avion Avion(){
        return new Avion();
    }

    //set

    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    //get

    public int getNbMoteur() {
        return nbMoteur;
    }

    //other

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
