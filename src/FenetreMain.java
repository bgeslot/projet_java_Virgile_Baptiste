import javax.swing.*;
import java.awt.*;

public class FenetreMain {
    private JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panel11 = new JPanel();
    private JPanel panel12 = new JPanel();
    private JPanel panel21 = new JPanel();
    private JPanel panel22 = new JPanel();
    private JPanel panel31 = new JPanel();
    private JPanel panel32 = new JPanel();
    private JButton boutonNouvClient = new JButton("Ajouter un nouveau client");
    private JButton boutonNouvLocation = new JButton("Ajouter une nouvelle location");
    private JButton boutonNouvVehicule = new JButton("Ajouter nouveau véhicule");
    private JButton boutonConsulterClient = new JButton("Consulter la liste des clients");
    private JButton boutonConsulterLocation = new JButton("Consulter la liste des locations");
    private JButton boutonConsulterVehicule = new JButton("Consulter la liste des véhicules");

    public FenetreMain() {
        fenetre.setTitle("Accueil");
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);
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
        boutonNouvClient.setPreferredSize(new Dimension(220,25));
        boutonConsulterClient.setPreferredSize(new Dimension(220,25));
        boutonNouvLocation.setPreferredSize(new Dimension(220,25));
        boutonConsulterLocation.setPreferredSize(new Dimension(220,25));
        boutonNouvVehicule.setPreferredSize(new Dimension(220,25));
        boutonConsulterVehicule.setPreferredSize(new Dimension(220,25));
        fenetre.pack();
    }

    public static void main(String[] args) {
        FenetreMain test = new FenetreMain();
    }
}
