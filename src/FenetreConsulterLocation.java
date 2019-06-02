import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreConsulterLocation implements ActionListener, ListSelectionListener
{
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
        String[] data = {"Location 1","Location 2","Location 3","Location 4","Location 5","Location 6","Location 7","Location 8","Location 9","Location 10","Location 11","Location 12","Location 13","Location 14","Location 15","Location 16","Location 17","Location 18"};
        private JList<String> jList= new JList(data);
        private JScrollPane scrollPane = new JScrollPane(jList);
        private JLabel labelNumLoc = new JLabel("");
        private JLabel labelVehicule = new JLabel("");
        private JLabel labelClient = new JLabel("");
        private JLabel labelDateDebut = new JLabel("");
        private JLabel labelDateFin = new JLabel("");
        private JLabel labelKmPrevi = new JLabel("");
        private JLabel labelPrixPrevi = new JLabel("");
        private JLabel labelReduction = new JLabel("");
        private JButton boutonRendre = new JButton("Rendre");
        private JButton boutonSupprimer = new JButton("Supprimer");

        public FenetreConsulterLocation(Main m) {
            main = m;
            fenetre.setTitle("Consulter liste clients");
            fenetre.setContentPane(panel);
            fenetre.setLocationRelativeTo(null);
            fenetre.setVisible(true);
            panel.add(scrollPane);
            panel.add(panelDroite);
            panelDroite.setLayout(new GridLayout(9,2));
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
            panel11.add(new JLabel("Numéro de location :"));
            panel12.add(labelNumLoc);
            panel21.add(new JLabel("Véhicule :"));
            panel22.add(labelVehicule);
            panel31.add(new JLabel("Client :"));
            panel32.add(labelClient);
            panel41.add(new JLabel("Date de début :"));
            panel42.add(labelDateDebut);
            panel51.add(new JLabel("Date de fin :"));
            panel52.add(labelDateFin);
            panel61.add(new JLabel("Kilomètres prévisionnels :"));
            panel62.add(labelKmPrevi);
            panel71.add(new JLabel("Prix prévisionnel :"));
            panel72.add(labelPrixPrevi);
            panel81.add(new JLabel("Réduction :"));
            panel82.add(labelPrixPrevi);
            panel91.add(boutonRendre);
            panel92.add(boutonSupprimer);
            jList.addListSelectionListener(this);
            boutonSupprimer.addActionListener(this);
            boutonSupprimer.addActionListener(this);
            fenetre.pack();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup == boutonRendre)
        {
            new FenetreRenduVehicule();
        }
        else if (recup==boutonSupprimer)
        {

        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int location = e.getLastIndex();
    }
}
