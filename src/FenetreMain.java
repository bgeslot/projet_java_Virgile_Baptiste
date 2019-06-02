import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreMain implements ActionListener {
    private Main main;
    private JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panel11 = new JPanel();
    private JPanel panel12 = new JPanel();
    private JPanel panel21 = new JPanel();
    private JPanel panel22 = new JPanel();
    private JPanel panel31 = new JPanel();
    private JPanel panel32 = new JPanel();
    private JButton boutonNouvClient = new JButton("    Ajouter un nouveau client   ");
    private JButton boutonNouvLocation = new JButton("DEBUG");
    private JButton boutonNouvVehicule = new JButton(" Ajouter un nouveau véhicule ");
    private JButton boutonConsulterClient = new JButton("   Consulter la liste des clients  ");
    private JButton boutonConsulterLocation = new JButton("Consulter la liste des locations");
    private JButton boutonConsulterVehicule = new JButton("Consulter la liste des véhicules");

    public FenetreMain(Main m) {
        main=m;
        fenetre.setTitle("Accueil");
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        panel.setLayout(new GridLayout(3,2));
        panel.add(panel11);
        panel.add(panel12);
        panel.add(panel21);
        panel.add(panel22);
        panel.add(panel31);
        panel.add(panel32);
        panel11.add(boutonNouvClient);
        panel12.add(boutonConsulterClient);
        panel21.add(boutonNouvLocation);
        panel22.add(boutonConsulterLocation);
        panel31.add(boutonNouvVehicule);
        panel32.add(boutonConsulterVehicule);
        boutonNouvClient.addActionListener(this);
        boutonConsulterClient.addActionListener(this);
        boutonNouvLocation.addActionListener(this);
        boutonConsulterLocation.addActionListener(this);
        boutonNouvVehicule.addActionListener(this);
        boutonConsulterVehicule.addActionListener(this);
        fenetre.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonNouvClient)
        {
            new FenetreNouvClient(main);
        }
        else if (recup==boutonConsulterClient)
        {
            new FenetreConsulterClient(main);
        }
        else if (recup==boutonNouvLocation)
        {
            System.out.println("Nombre de Clients : "+main.menuClient.getListeClient().size());
            new FenetreNouvLocation();
        }
        else if (recup==boutonConsulterLocation)
        {
            new FenetreConsulterLocation(main);
        }
        else if (recup==boutonNouvVehicule)
        {
            new FenetreNouvVehicule(main);
        }
        else if (recup==boutonConsulterVehicule)
        {
            new FenetreConsulterVehicule(main);
        }
    }
}
