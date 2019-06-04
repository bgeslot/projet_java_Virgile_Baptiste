import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FenetreConsulterAvion implements ActionListener, ListSelectionListener {
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
    //String[] data = {"Location 1","Location 2","Location 3","Location 4","Location 5","Location 6","Location 7","Location 8","Location 9","Location 10","Location 11","Location 12","Location 13","Location 14","Location 15","Location 16","Location 17","Location 18"};
    private JList<String> jList= null;//data);
    private JScrollPane scrollPane = new JScrollPane(jList);
    private JLabel labelMarque = new JLabel("");
    private JLabel labelModele = new JLabel("");
    private JLabel labelVitesseMax = new JLabel("");
    private JLabel labelPrixLoc = new JLabel("");
    private JLabel labelEtat = new JLabel("");
    private JLabel labelNbHeureVol = new JLabel("");
    private JLabel labelNbMoteur = new JLabel("");
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonSupprimer = new JButton("Supprimer");
    public FenetreConsulterAvion(Main m) {
        main = m;
        int length=main.menuVehicule.getListeAvion().size();
        String[] data=new String[length];
        data=getAvion(main,data);
        jList= new JList(data);
        JScrollPane scrollPane = new JScrollPane(jList);
        fenetre.setTitle("Consulter liste avion");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.add(scrollPane);
        panel.add(panelDroite);
        panelDroite.setLayout(new GridLayout(8, 2));
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
        panel11.add(new JLabel("Marque :"));
        panel12.add(labelMarque);
        panel21.add(new JLabel("Modèle :"));
        panel22.add(labelModele);
        panel31.add(new JLabel("Vitesse max :"));
        panel32.add(labelVitesseMax);
        panel41.add(new JLabel("Prix location de base :"));
        panel42.add(labelPrixLoc);
        panel51.add(new JLabel("Etat :"));
        panel52.add(labelEtat);
        panel61.add(new JLabel("Nb d'heures de vol :"));
        panel62.add(labelNbHeureVol);
        panel71.add(new JLabel("Nb de moteurs :"));
        panel72.add(labelNbMoteur);
        panel81.add(boutonAjouter);
        panel82.add(boutonSupprimer);
        jList.addListSelectionListener(this);
        boutonSupprimer.addActionListener(this);
        boutonAjouter.addActionListener(this);
        fenetre.pack();
    }

    public String[] getAvion(Main m,String[] data){
        m=main;
        ArrayList listeAvion;
        listeAvion = main.menuVehicule.getListeAvion();
        int length=listeAvion.size();
        data=new String[length];
        for(int i=0;i<length; i++){
            data[i]=(((Avion)(listeAvion.get(i))).getMarque()+" "+((Avion)(listeAvion.get(i))).getModele());
        }
        return data;
    }

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
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = jList.getSelectedIndex();
        System.out.println(index);
        Avion avion = (Avion) main.menuVehicule.getListeAvion().get(index);
        labelModele.setText(avion.getModele());
        labelMarque.setText(avion.getMarque());
        labelVitesseMax.setText(avion.getVitesseMax());
        labelEtat.setText(avion.getEtat());
        labelNbHeureVol.setText(avion.getHeureDeVol());
        labelNbMoteur.setText(avion.getNbMoteur());
        labelPrixLoc.setText(avion.getPrixLocationJour());
        fenetre.pack();
    }
}
