import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FenetreConsulterMoto implements ActionListener, ListSelectionListener {
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
    private JLabel labelKm = new JLabel("");
    private JLabel labelPuissance = new JLabel("");
    private JButton boutonLouer = new JButton("Louer");
    private JButton boutonSupprimer = new JButton("Supprimer");

    public FenetreConsulterMoto(Main m) {
        main = m;
        int length=main.menuVehicule.getListeMoto().size();
        String[] data=new String[length];
        data=getMoto(main,data);
        jList= new JList(data);
        JScrollPane scrollPane = new JScrollPane(jList);
        fenetre.setTitle("Consulter liste clients");
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
        panel31.add(new JLabel("Vitesse maximale :"));
        panel32.add(labelVitesseMax);
        panel41.add(new JLabel("Prix de location par jour de base :"));
        panel42.add(labelPrixLoc);
        panel51.add(new JLabel("Etat :"));
        panel52.add(labelEtat);
        panel61.add(new JLabel("Nombre de kilomètres :"));
        panel62.add(labelKm);
        panel71.add(new JLabel("Puissance :"));
        panel72.add(labelPuissance);
        panel81.add(boutonLouer);
        panel82.add(boutonSupprimer);
        jList.addListSelectionListener(this);
        boutonSupprimer.addActionListener(this);
        boutonSupprimer.addActionListener(this);
        fenetre.pack();
    }

    public String[] getMoto(Main m,String[] data){
        m=main;
        ArrayList listeMoto;
        listeMoto = main.menuVehicule.getListeMoto();
        int length=listeMoto.size();
        data=new String[length];
        for(int i=0;i<length; i++){
            data[i]=(((Moto)(listeMoto.get(i))).getMarque()+" "+((Moto)(listeMoto.get(i))).getModele());
        }
        return data;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonLouer)
        {
            Moto moto=(Moto) main.menuVehicule.getListeMoto().get(jList.getSelectedIndex());
            new FenetreNouvLocation(main,moto);
        }
        else if (recup==boutonSupprimer)
        {

        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index=jList.getSelectedIndex();
    }
}
