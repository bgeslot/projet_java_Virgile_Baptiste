import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cette classe permet de crer une fenetre qui mene vers les fenetre de consultation d'un vehicule avec 3 boutons 1 pour chaque vehicule
 */
public class FenetreConsulterVehicule implements ActionListener {
    private Main main;
    private JFrame fenetre=new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JButton boutonVoiture = new JButton("Voiture");
    private JButton boutonMoto = new JButton("  Moto  ");
    private JButton boutonAvion = new JButton("  Avion ");
    public FenetreConsulterVehicule(Main m)
    {
        main=m;
        fenetre.setTitle("Consulter liste véhicules");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.setLayout(new GridLayout(4,1));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel1.add(new Label("Vous voulez voir la liste des..."));
        panel2.add(boutonVoiture);
        panel3.add(boutonMoto);
        panel4.add(boutonAvion);
        boutonAvion.addActionListener(this);
        boutonMoto.addActionListener(this);
        boutonVoiture.addActionListener(this);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    /**
     * Permet d'utiliser les different boutons
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup == boutonAvion)
        {
            fenetre.dispose();
            if (main.fenetreConsulterAvion!=null)
            {
                main.fenetreConsulterAvion.fenetre.dispose();
            }
            main.fenetreConsulterAvion = new FenetreConsulterAvion(main);
        }
        else if (recup == boutonMoto)
        {
            fenetre.dispose();
            if (main.fenetreConsulterMoto!=null)
            {
                main.fenetreConsulterMoto.fenetre.dispose();
            }
            main.fenetreConsulterMoto = new FenetreConsulterMoto(main);
        }
        else if (recup == boutonVoiture)
        {
            fenetre.dispose();
            if (main.fenetreConsulterVoiture!=null)
            {
                main.fenetreConsulterVoiture.fenetre.dispose();
            }
            main.fenetreConsulterVoiture = new FenetreConsulterVoiture(main);
        }
    }
}
