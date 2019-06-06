import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public MenuVehicule menuVehicule=new MenuVehicule();
    public MenuClient menuClient=new MenuClient();
    public MenuLocation menuLocation=new MenuLocation();
    public FenetreConsulterAvion fenetreConsulterAvion=null;
    public FenetreConsulterVoiture fenetreConsulterVoiture=null;
    public FenetreConsulterMoto fenetreConsulterMoto=null;
    public FenetreConsulterClient fenetreConsulterClient=null;
    public FenetreConsulterLocation fenetreConsulterLocation=null;
    public static void main(String[] args) throws IOException {
        Main main=new Main();
        new FenetreMain(main);
        System.out.println(main.menuVehicule.getListeVoiture().size());
        main.menuVehicule.addVoiture(new Voiture("","","","","","","",""));
        System.out.println(main.menuVehicule.getListeVoiture().size());
        Main.serializeToXML(main);
        //serializationClient((main.getMenuClient()).getListeClient());
    }

    public MenuClient getMenuClient() {
        return menuClient;
    }

    private static void serializeToXML (Main main) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("menuVehicule.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :"+e.toString());
            }
        });
        encoder.writeObject(main.menuVehicule);
        encoder.close();
        fos.close();
    }
}

