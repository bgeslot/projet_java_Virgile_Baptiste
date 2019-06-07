import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        new FenetreErreur("messa oui");
        Main main=new Main();
        main.deserializeFromXML();
        new FenetreMain(main);
        //serializationClient((main.getMenuClient()).getListeClient());
    }

    public MenuClient getMenuClient() {
        return menuClient;
    }

    public void serializeToXML () throws IOException
    {
        FileOutputStream fosVehicule = new FileOutputStream("menuVehicule.xml");
        XMLEncoder encoderVehicule = new XMLEncoder(fosVehicule);
        encoderVehicule.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :"+e.toString());
            }
        });
        encoderVehicule.writeObject(this.menuVehicule);
        encoderVehicule.close();
        fosVehicule.close();

        FileOutputStream fosClient = new FileOutputStream("menuClient.xml");
        XMLEncoder encoderClient = new XMLEncoder(fosClient);
        encoderClient.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :"+e.toString());
            }
        });
        encoderClient.writeObject(this.menuClient);
        encoderClient.close();
        fosClient.close();

        FileOutputStream fosLocation = new FileOutputStream("menuLocation.xml");
        XMLEncoder encoderLocation = new XMLEncoder(fosLocation);
        encoderLocation.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :"+e.toString());
            }
        });
        encoderLocation.writeObject(this.menuLocation);
        encoderLocation.close();
        fosLocation.close();

    }

    public void deserializeFromXML() throws IOException {
        FileInputStream fisClient = new FileInputStream("menuClient.xml");
        XMLDecoder decoderClient = new XMLDecoder(fisClient);
        menuClient = (MenuClient) decoderClient.readObject();
        decoderClient.close();
        fisClient.close();

        FileInputStream fisLocation = new FileInputStream("menuLocation.xml");
        XMLDecoder decoderLocation = new XMLDecoder(fisLocation);
        menuLocation = (MenuLocation) decoderLocation.readObject();
        decoderLocation.close();
        fisLocation.close();

        FileInputStream fisVehicule = new FileInputStream("menuVehicule.xml");
        XMLDecoder decoderVehicule = new XMLDecoder(fisVehicule);
        menuVehicule = (MenuVehicule) decoderVehicule.readObject();
        decoderVehicule.close();
        fisVehicule.close();
    }
}

