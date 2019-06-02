import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreConsulterVoiture implements ActionListener, ListSelectionListener {
    private Main main;
    private JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panelDroite = new JPanel();
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
    String[] data = {"Voiture 1","Voiture 2","Voiture 3","Voiture 4","Voiture 5","Voiture 6","Voiture 7","Voiture 8","Voiture 9","Voiture 10","Voiture 11","Voiture 12","Voiture 13","Voiture 14","Voiture 15","Voiture 16","Voiture 17","Voiture 18"};
    private JList<String> jList= new JList(data);
    private JScrollPane scrollPane = new JScrollPane(jList);
    private JLabel labelMarque = new JLabel("");
    private JLabel labelModele = new JLabel("");
    private JLabel labelVitesseMax = new JLabel("");
    private JLabel labelPrixLoc = new JLabel("");
    private JLabel labelEtat = new JLabel("");
    private JLabel labelKm = new JLabel("");
    private JLabel labelPuissance = new JLabel("");
    private JLabel labelNbPlace = new JLabel("");
    private JButton boutonRendre = new JButton("Rendre");
    private JButton boutonSupprimer = new JButton("Supprimer");
    public FenetreConsulterVoiture(Main m) {
        main = m;
        fenetre.setTitle("Consulter liste clients");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.add(scrollPane);
        panel.add(panelDroite);
        panelDroite.setLayout(new GridLayout(9, 2));
        panelDroite.add(panel11);
        panelDroite.add(panel12);
        panelDroite.add(panel21);
        panelDroite.add(panel22);
        panelDroite.add(panel31);
        panelDroite.add(panel32);
        panelDroite.add(panel41);
        panelDroite.add(panel42);
        panelDroite.add(panel51);
        panelDroite.add(panel52);
        panelDroite.add(panel61);
        panelDroite.add(panel62);
        panelDroite.add(panel71);
        panelDroite.add(panel72);
        panelDroite.add(panel81);
        panelDroite.add(panel82);
        panelDroite.add(panel91);
        panelDroite.add(panel92);
        panel11.add(new JLabel("Marque :"));
        panel12.add(labelMarque);
        panel21.add(new JLabel("Modèle :"));
        panel22.add(labelModele);
        panel31.add(new JLabel("Vitesse maximale :"));
        panel32.add(labelVitesseMax);
        panel41.add(new JLabel("Prix de location :"));
        panel42.add(labelPrixLoc);
        panel51.add(new JLabel("Etat :"));
        panel52.add(labelEtat);
        panel61.add(new JLabel("Nombre de kilomètres :"));
        panel62.add(labelKm);
        panel71.add(new JLabel("Puissance :"));
        panel72.add(labelPuissance);
        panel81.add(new JLabel("Nb de places :"));
        panel82.add(labelNbPlace);
        panel91.add(boutonRendre);
        panel92.add(boutonSupprimer);
        jList.addListSelectionListener(this);
        boutonSupprimer.addActionListener(this);
        boutonSupprimer.addActionListener(this);
        fenetre.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
