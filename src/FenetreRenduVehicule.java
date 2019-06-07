import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Cette fenetre permet de rendre un vehicule
 */
public class FenetreRenduVehicule implements ActionListener {
    private Main main;
    private int index;
    private JFrame fenetre=new JFrame();
    private JPanel panel=new JPanel();
    private JPanel panel11=new JPanel();
    private JPanel panel12=new JPanel();
    private JPanel panel21=new JPanel();
    private JPanel panel22=new JPanel();
    private JPanel panel31=new JPanel();
    private JPanel panel32=new JPanel();
    private JPanel panel41=new JPanel();
    private JPanel panel42=new JPanel();
    private JPanel panel51=new JPanel();
    private JPanel panel52=new JPanel();
    private JLabel prixFinal=new JLabel();
    private JTextField fieldDuree = new JTextField();
    private JTextField fieldKm = new JTextField();
    private JButton boutonRendre=new JButton("Rendre");
    private JButton boutonAnnuler=new JButton("Annuler");
    public FenetreRenduVehicule(Main main, Location location, int index)
    {
        this.main=main;
        this.index=index;
        fenetre.setTitle("Rendu véhicule");
        fenetre.setContentPane(panel);
        fenetre.setVisible(true);
        panel.setLayout(new GridLayout(5,2));
        panel.add(panel11);
        panel.add(panel12);
        panel.add(panel21);
        panel.add(panel22);
        panel.add(panel31);
        panel.add(panel32);
        panel.add(panel41);
        panel.add(panel42);
        panel.add(panel51);
        panel.add(panel52);
        panel11.add(new JLabel("Fin de la location :"));
        panel12.add(new JLabel(String.valueOf(location.getNumLocation())));
        panel21.add(new JLabel("Durée en jours :"));
        panel22.add(fieldDuree);
        panel31.add(new JLabel("Distance en Km :"));
        panel32.add(fieldKm);
        panel41.add(new JLabel("Prix final :"));
        panel42.add(prixFinal);
        panel51.add(boutonRendre);
        panel52.add(boutonAnnuler);
        fieldDuree.setColumns(15);
        fieldKm.setColumns(15);
        fieldDuree.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                int nbKm;
                int nbJour;
                String stringNbJour=fieldDuree.getText();
                String stringNbKm=fieldKm.getText();
                try
                {
                    nbJour = Integer.parseInt(stringNbJour);
                }
                catch (NumberFormatException er)
                {
                    nbJour=0;
                }
                try
                {
                    nbKm = Integer.parseInt(stringNbKm);
                }
                catch (NumberFormatException er)
                {
                    nbKm=0;
                }
                prixFinal.setText(String.valueOf(Location.prixLocation(location.getVehicule(),nbJour,nbKm,location.getReduction())));
            }
        });
        fieldKm.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                int nbKm;
                int nbJour;
                String stringNbJour=fieldDuree.getText();
                String stringNbKm=fieldKm.getText();
                try
                {
                    nbJour = Integer.parseInt(stringNbJour);
                }
                catch (NumberFormatException er)
                {
                    nbJour=0;
                }
                try
                {
                    nbKm = Integer.parseInt(stringNbKm);
                }
                catch (NumberFormatException er)
                {
                    nbKm=0;
                }
                prixFinal.setText(String.valueOf(Location.prixLocation(location.getVehicule(),nbJour,nbKm,location.getReduction())));
            }
        });

        boutonAnnuler.addActionListener(this);
        boutonRendre.addActionListener(this);
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
    public void actionPerformed(ActionEvent e)
    {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonAnnuler)
        {
            fenetre.dispose();
        }
        else if (recup==boutonRendre)
        {
            main.menuLocation.delLocation(index);
            if (main.fenetreConsulterLocation!=null)
            {
                main.fenetreConsulterLocation.fenetre.dispose();
            }
            main.fenetreConsulterLocation=new FenetreConsulterLocation(main);
            fenetre.dispose();
        }
    }
}
