import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FenetreConsulterVoiture implements ActionListener, ListSelectionListener {
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
    private JPanel panel101 = new JPanel();
    private JPanel panel102 = new JPanel();
    private JList<String> jList;
    private JScrollPane scrollPane;
    private JLabel labelMarque = new JLabel("");
    private JLabel labelModele = new JLabel("");
    private JLabel labelVitesseMax = new JLabel("");
    private JLabel labelPrixLoc = new JLabel("");
    private JLabel labelEtat = new JLabel("");
    private JLabel labelKm = new JLabel("");
    private JLabel labelPuissance = new JLabel("");
    private JLabel labelNbPlace = new JLabel("");
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonSupprimer = new JButton("Supprimer");
    private JButton boutonLouer = new JButton("Louer");
    private JButton boutonModifier = new JButton("Modifier");
    public FenetreConsulterVoiture(Main m) {
        main = m;
        int length=main.menuVehicule.getListeVoiture().size();
        String[] data=new String[length];
        data=getVoiture(main,data);
        jList= new JList(data);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        scrollPane = new JScrollPane(jList);
        scrollPane.setPreferredSize(new Dimension(200,400));
        fenetre.setTitle("Consulter liste Voitures");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.add(scrollPane);
        panel.add(panelDroite);
        panelDroite.setLayout(new GridLayout(10, 2));
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
        panelDroite.add(panel101);
        panelDroite.add(panel102);
        panel11.add(new JLabel("Marque :"));
        panel12.add(labelMarque);
        panel21.add(new JLabel("Modèle :"));
        panel22.add(labelModele);
        panel31.add(new JLabel("Vitesse max :"));
        panel32.add(labelVitesseMax);
        panel41.add(new JLabel("Prix de location/j :"));
        panel42.add(labelPrixLoc);
        panel51.add(new JLabel("Etat :"));
        panel52.add(labelEtat);
        panel61.add(new JLabel("Nb de kilomètres :"));
        panel62.add(labelKm);
        panel71.add(new JLabel("Puissance :"));
        panel72.add(labelPuissance);
        panel81.add(new JLabel("Nb de places :"));
        panel82.add(labelNbPlace);
        panel91.add(boutonAjouter);
        panel92.add(boutonModifier);
        panel101.add(boutonLouer);
        panel102.add(boutonSupprimer);
        Dimension tailleBouton=boutonSupprimer.getPreferredSize();
        boutonLouer.setPreferredSize(tailleBouton);
        boutonModifier.setPreferredSize(tailleBouton);
        boutonAjouter.setPreferredSize(tailleBouton);
        jList.addListSelectionListener(this);
        boutonAjouter.addActionListener(this);
        boutonSupprimer.addActionListener(this);
        boutonLouer.addActionListener(this);
        boutonModifier.addActionListener(this);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    public String[] getVoiture(Main m,String[] data){
        m=main;
        ArrayList listeVoiture;
        listeVoiture = main.menuVehicule.getListeVoiture();
        int length=listeVoiture.size();
        data=new String[length];
        for(int i=0;i<length; i++){
            data[i]=(((Voiture)(listeVoiture.get(i))).getMarque()+" "+((Voiture)(listeVoiture.get(i))).getModele());
        }
        return data;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonAjouter)
        {
            new FenetreNouvVoiture(main);
        }
        else if (recup==boutonSupprimer)
        {
            main.menuVehicule.delVoiture(jList.getSelectedIndex());
            if (main.fenetreConsulterVoiture!=null)
            {
                main.fenetreConsulterVoiture.fenetre.dispose();
            }
            main.fenetreConsulterVoiture = new FenetreConsulterVoiture(main);
            fenetre.dispose();
        }
        else if (recup==boutonLouer)
        {
            new FenetreNouvLocation(main,(Voiture) main.menuVehicule.getListeVoiture().get(jList.getSelectedIndex()));
        }
        else if (recup==boutonModifier)
        {
            new FenetreModifierVoiture(main, (Voiture) main.menuVehicule.getListeVoiture().get(jList.getSelectedIndex()));
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = jList.getSelectedIndex();
        System.out.println(index);
        Voiture voiture = (Voiture) main.menuVehicule.getListeVoiture().get(index);
        labelModele.setText(voiture.getModele());
        labelMarque.setText(voiture.getMarque());
        labelVitesseMax.setText(voiture.getVitesseMax());
        labelEtat.setText(voiture.getEtat());
        labelKm.setText(voiture.getKm());
        labelPuissance.setText(voiture.getPuissance());
        labelPrixLoc.setText(voiture.getPrixLocationJour());
        labelNbPlace.setText(voiture.getNbPlace());
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }
}