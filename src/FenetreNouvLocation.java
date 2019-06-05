import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;

public class FenetreNouvLocation implements ActionListener {
    private Main main;
    private Vehicule vehicule;
    private JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel labelPrix = new JLabel();
    private JComboBox jComboBox;
    private JTextField fieldDateDebut = new JTextField();
    private JTextField fieldDuree = new JTextField();
    private JTextField fieldKmPrevi = new JTextField();
    private JCheckBox boxReduction = new JCheckBox();
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonAnnuler = new JButton("Annuler");
    private JPanel panel11 = new JPanel();
    private JPanel panel12 = new JPanel();
    private JPanel panel21 = new JPanel();
    private JPanel panel22 = new JPanel();
    private JPanel panel31 = new JPanel();
    private JPanel panel32 = new JPanel();
    private JPanel panel41 = new JPanel();
    private JPanel panel42 = new JPanel();
    private JPanel panel51 = new JPanel();
    private JPanel panel52 = new JPanel();
    private JPanel panel61 = new JPanel();
    private JPanel panel62 = new JPanel();
    private JPanel panel71 = new JPanel();
    private JPanel panel72 = new JPanel();
    private JPanel panel81 = new JPanel();
    private JPanel panel82 = new JPanel();
    private JPanel panel91 = new JPanel();
    private JPanel panel92 = new JPanel();

    String[] clients = {"Client 0", "Client 1", "Client 2", "Client 3", "Client 4", "Client 5", "Client 6"};

    public FenetreNouvLocation(Main main, Vehicule vehicule) {
        this.main = main;
        this.vehicule = vehicule;
        fenetre.setTitle("Nouvelle location");
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        jComboBox = new JComboBox(clients);
        boxReduction.setEnabled(false);
        fieldDateDebut.setColumns(15);
        fieldDuree.setColumns(15);
        fieldKmPrevi.setColumns(15);
        boutonAjouter.addActionListener(this);
        boutonAnnuler.addActionListener(this);
        fieldDuree.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                int val;
                try
                {
                    val = Integer.parseInt(text);
                }
                catch (NumberFormatException er)
                {
                    val=0;
                }
                if (val>=7)
                {
                    System.out.println("val avant set = "+val);
                    boxReduction.setEnabled(true);
                }
                else
                {
                    boxReduction.setSelected(false);
                    boxReduction.setEnabled(false);
                }
            }
        });
        panel.setLayout(new GridLayout(9, 2));
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
        panel.add(panel61);
        panel.add(panel62);
        panel.add(panel71);
        panel.add(panel72);
        panel.add(panel81);
        panel.add(panel82);
        panel.add(panel91);
        panel.add(panel92);
        panel11.add(new JLabel("Location de :"));
        panel12.add(new JLabel(vehicule.getMarque() + " " + vehicule.getModele()));
        panel21.add(new JLabel("Numéro de Location :"));
        panel22.add(new JLabel(""));
        panel31.add(new JLabel("Client :"));
        panel32.add(jComboBox);
        panel41.add(new JLabel("Date de début :"));
        panel42.add(fieldDateDebut);
        panel51.add(new JLabel("Durée (en jours) :"));
        panel52.add(fieldDuree);
        panel61.add(new JLabel("Km prévisionnels :"));
        panel62.add(fieldKmPrevi);
        panel71.add(new JLabel("Réduction :"));
        panel72.add(boxReduction);
        panel81.add(new JLabel("Prix prévisionnel :"));
        panel82.add(labelPrix);
        panel91.add(boutonAjouter);
        panel92.add(boutonAnnuler);

        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup == boutonAjouter) {
            int i=main.menuLocation.getNewID();
            Location location=new Location(i,fieldDateDebut.getText(),fieldDuree.getText(),fieldKmPrevi.getText(),"a",boxReduction.isSelected());
            main.menuLocation.addLocation(location);
            if (main.fenetreConsulterLocation!=null)
            {
                main.fenetreConsulterLocation.fenetre.dispose();
            }
            main.fenetreConsulterLocation = new FenetreConsulterLocation(main);
            fenetre.dispose();
        } else if (recup == boutonAnnuler) {
            fenetre.dispose();
        }
    }
}