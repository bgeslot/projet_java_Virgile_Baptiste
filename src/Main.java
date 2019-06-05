public class Main {
    public MenuVehicule menuVehicule=new MenuVehicule();
    public MenuClient menuClient=new MenuClient();
    public MenuLocation menuLocation=new MenuLocation();
    public FenetreConsulterAvion fenetreConsulterAvion=null;
    public FenetreConsulterVoiture fenetreConsulterVoiture=null;
    public FenetreConsulterMoto fenetreConsulterMoto=null;
    public FenetreConsulterClient fenetreConsulterClient=null;
    public FenetreConsulterLocation fenetreConsulterLocation=null;
    public static void main(String[] args)
    {
        Main main=new Main();
        new FenetreMain(main);
        //serializationClient((main.getMenuClient()).getListeClient());
    }

    public MenuClient getMenuClient() {
        return menuClient;
    }
}