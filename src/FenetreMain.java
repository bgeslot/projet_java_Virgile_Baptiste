import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreMain implements ActionListener {
    private Main main;
    private JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JButton boutonConsulterClient = new JButton("Consulter la liste des clients");
    private JButton boutonConsulterLocation = new JButton("Consulter la liste des locations");
    private JButton boutonConsulterVehicule = new JButton("Consulter la liste des véhicules");

    public FenetreMain(Main m) {
        main=m;
        fenetre.setTitle("Accueil");
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        panel.setLayout(new GridLayout(3,1));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
        panel1.add(boutonConsulterClient);
        panel2.add(boutonConsulterLocation);
        panel3.add(boutonConsulterVehicule);
        boutonConsulterClient.addActionListener(this);
        boutonConsulterLocation.addActionListener(this);
        boutonConsulterVehicule.addActionListener(this);
        Dimension tailleBouton=boutonConsulterLocation.getPreferredSize();
        boutonConsulterVehicule.setPreferredSize(tailleBouton);
        boutonConsulterClient.setPreferredSize(tailleBouton);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonConsulterClient)
        {
            if (main.fenetreConsulterClient!=null)
            {
                main.fenetreConsulterClient.fenetre.dispose();
            }
            main.fenetreConsulterClient = new FenetreConsulterClient(main);
        }

        else if (recup==boutonConsulterLocation)
        {
            if (main.fenetreConsulterLocation!=null)
            {
                main.fenetreConsulterLocation.fenetre.dispose();
            }
            main.fenetreConsulterLocation = new FenetreConsulterLocation(main);
        }
        else if (recup==boutonConsulterVehicule)
        {
            new FenetreConsulterVehicule(main);
        }
    }
}
