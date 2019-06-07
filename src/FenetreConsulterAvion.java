import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Cet classe permet d'afficher une fenetre qui permet de consulter les avions
 */
public class FenetreConsulterAvion implements ActionListener, ListSelectionListener {
    private Main main;
    public JFrame fenetre = new JFrame();
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
    private JList<String> jList= null;//data);
    private JScrollPane scrollPane;
    private JLabel labelMarque = new JLabel("");
    private JLabel labelModele = new JLabel("");
    private JLabel labelVitesseMax = new JLabel("");
    private JLabel labelPrixLoc = new JLabel("");
    private JLabel labelEtat = new JLabel("");
    private JLabel labelNbHeureVol = new JLabel("");
    private JLabel labelNbMoteur = new JLabel("");
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonSupprimer = new JButton("Supprimer");
    private JButton boutonModifier = new JButton("Modifier");
    private JButton boutonLouer = new JButton("Louer");
    public FenetreConsulterAvion(Main m) {
        main = m;
        int length=main.menuVehicule.getListeAvion().size();
        String[] data=new String[length];
        data=getAvion(data);
        jList= new JList(data);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        scrollPane = new JScrollPane(jList);
        scrollPane.setPreferredSize(new Dimension(200,400));
        fenetre.setTitle("Consulter liste avion");
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
        panel31.add(new JLabel("Vitesse max :"));
        panel32.add(labelVitesseMax);
        panel41.add(new JLabel("Prix location/j :"));
        panel42.add(labelPrixLoc);
        panel51.add(new JLabel("Etat :"));
        panel52.add(labelEtat);
        panel61.add(new JLabel("Nb d'heures vol :"));
        panel62.add(labelNbHeureVol);
        panel71.add(new JLabel("Nb de moteurs :"));
        panel72.add(labelNbMoteur);
        panel81.add(boutonAjouter);
        panel82.add(boutonModifier);
        panel91.add(boutonLouer);
        panel92.add(boutonSupprimer);
        Dimension tailleBouton=boutonSupprimer.getPreferredSize();
        boutonLouer.setPreferredSize(tailleBouton);
        boutonModifier.setPreferredSize(tailleBouton);
        boutonAjouter.setPreferredSize(tailleBouton);
        boutonSupprimer.addActionListener(this);
        boutonAjouter.addActionListener(this);
        boutonModifier.addActionListener(this);
        boutonLouer.addActionListener(this);
        jList.addListSelectionListener(this);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    /**
     * Permet d'avoire une liste de String utiliser pour l'affichage des avion
     * @param data
     * @return
     */
    public String[] getAvion(String[] data){
        ArrayList listeAvion;
        listeAvion = main.menuVehicule.getListeAvion();
        int length=listeAvion.size();
        data=new String[length];
        for(int i=0;i<length; i++){
            data[i]=(((Avion)(listeAvion.get(i))).getMarque()+" "+((Avion)(listeAvion.get(i))).getModele());
        }
        return data;
    }

    /**
     * Permet d'utiliser les different boutons
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonAjouter)
        {
            new FenetreNouvAvion(main);
        }
        else if (recup==boutonSupprimer)
        {
            main.menuVehicule.delAvion(jList.getSelectedIndex());
            new FenetreConsulterAvion(main);
            if (main.fenetreConsulterAvion!=null)
            {
                main.fenetreConsulterAvion.fenetre.dispose();
            }
            main.fenetreConsulterAvion = new FenetreConsulterAvion(main);
            fenetre.dispose();
        }
        else if (recup==boutonLouer)
        {
            int index = jList.getSelectedIndex();
            if(index!=-1) {
                Avion avion=(Avion) main.menuVehicule.getListeAvion().get(jList.getSelectedIndex());
                boolean dispo=(avion.isDisponible());
                if (dispo) {
                new FenetreNouvLocation(main,avion);
                }
                else {
                    new FenetreErreur("Ce véhicule est déja loué");
                }
            }
        }
        else if (recup==boutonModifier) {
            int index = jList.getSelectedIndex();
            if (index != -1) {
                new FenetreModifierAvion(main, (Avion) main.menuVehicule.getListeAvion().get(jList.getSelectedIndex()));
            }
        }
    }

    /**
     * permet d'afficher les differente information sur un avion
     * @param e
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = jList.getSelectedIndex();
        Avion avion = (Avion) main.menuVehicule.getListeAvion().get(index);
        labelModele.setText(avion.getModele());
        labelMarque.setText(avion.getMarque());
        labelVitesseMax.setText(avion.getVitesseMax());
        labelEtat.setText(avion.getEtat());
        labelNbHeureVol.setText(avion.getHeureDeVol());
        labelNbMoteur.setText(avion.getNbMoteur());
        labelPrixLoc.setText(avion.getPrixLocationJour());
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }
}
