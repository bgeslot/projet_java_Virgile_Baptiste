import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FenetreConsulterLocation implements ActionListener, ListSelectionListener
{
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
    private JList<String> jList;
    private JScrollPane scrollPane = new JScrollPane(jList);
    private JLabel labelNumLoc = new JLabel("");
    private JLabel labelVehicule = new JLabel("");
    private JLabel labelClient = new JLabel("");
    private JLabel labelDateDebut = new JLabel("");
    private JLabel labelDateFin = new JLabel("");
    private JLabel labelKmPrevi = new JLabel("");
    private JLabel labelReduction = new JLabel("");
    private JLabel labelPrixPrevi = new JLabel("");
    private JButton boutonRendre = new JButton("Rendre");
    private JButton boutonSupprimer = new JButton("Supprimer");


    public FenetreConsulterLocation(Main main) {
        this.main = main;
        int length=main.menuLocation.listeLocation.size();
        String[] data=new String[length];
        data=getLocation(data);
        jList= new JList(data);
        scrollPane =new JScrollPane(jList);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        fenetre.setTitle("Consulter liste locations");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.add(scrollPane);
        scrollPane.setPreferredSize(new Dimension(200,400));
        panel.add(panelDroite);
        panelDroite.setLayout(new GridLayout(10,2));
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
        panel82.add(labelReduction);
        panel91.add(boutonRendre);
        panel92.add(boutonSupprimer);
        jList.addListSelectionListener(this);
        boutonSupprimer.addActionListener(this);
        boutonRendre.addActionListener(this);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    public String[] getLocation(String[] data){
        ArrayList listeLocation;
        listeLocation = main.menuLocation.getListeLocation();
        int length=listeLocation.size();
        data=new String[length];
        for(int i=0;i<length; i++) {
            data[i] = String.valueOf(((Location)listeLocation.get(i)).getNumLocation());
        }
        return data;
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
            main.menuLocation.delLocation(jList.getSelectedIndex());
            main.fenetreConsulterLocation = new FenetreConsulterLocation(main);
            fenetre.dispose();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = jList.getSelectedIndex();
        System.out.println(index);
        Location location=(Location) main.menuLocation.getListeLocation().get(index);
        labelNumLoc.setText(String.valueOf(((Location) main.menuLocation.getListeLocation().get(jList.getSelectedIndex())).getNumLocation()));
        labelClient.setText(location.getClient().toString());
        System.out.println(location.getClient().toString());
        labelVehicule.setText(location.getVehicule().getNameVehicule());
        labelDateDebut.setText(location.getDataDebut());
        labelDateFin.setText(location.getDateFin());
        labelKmPrevi.setText(location.getKmPrevu());
        if (location.getReduction())
        {
            labelReduction.setText("oui");
        }
        else
        {
            labelReduction.setText("non");
        }
        labelPrixPrevi.setText(String.valueOf(location.getPrixPrevu()));
    }
}
