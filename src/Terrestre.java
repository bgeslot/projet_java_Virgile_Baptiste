public abstract class Terrestre extends Vehicule {

    private int km;
    private int puissance;

    // seter

    public void setKm(int km) {
        this.km = km;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    // geter


    public int getKm() {
        return km;
    }

    public int getPuissance() {
        return puissance;
    }

    //other methode

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
