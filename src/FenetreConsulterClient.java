import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Cet classe permet d'afficher une fenetre qui permet de consulter, modifier ou d'ajouter des clients grace a une liste deroulente et des boutons.
 * @param <a>
 */
public class FenetreConsulterClient<a> implements ActionListener, ListSelectionListener {
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
    private JList<String> jList;
    private JScrollPane scrollPane;
    private JLabel labelNom = new JLabel("");
    private JLabel labelPrenom = new JLabel("");
    private JLabel labelDateDeNaissance = new JLabel("");
    private JLabel labelMail = new JLabel("");
    private JLabel labelTelephone = new JLabel("");
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonSupprimer = new JButton("Supprimer");
    private JButton boutonModifier = new JButton("Modifier");
    private JButton boutonAnnuler = new JButton("Annuler");

    public FenetreConsulterClient(Main m) {
        main = m;
        int length=main.menuClient.getListeClient().size();
        String[] data=new String[length];
        data=main.menuClient.getClient(data);
        jList= new JList(data);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        scrollPane = new JScrollPane(jList);
        scrollPane.setPreferredSize(new Dimension(200,400));
        fenetre.setTitle("Consulter liste clients");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.add(scrollPane);
        panel.add(panelDroite);
        panelDroite.setLayout(new GridLayout(7,2));
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
        panel11.add(new JLabel("Prénom :"));
        panel12.add(labelPrenom);
        panel21.add(new JLabel("Nom :"));
        panel22.add(labelNom);
        panel31.add(new JLabel("Naissance :"));
        panel32.add(labelDateDeNaissance);
        panel41.add(new JLabel("Adresse Mail :"));
        panel42.add(labelMail);
        panel51.add(new JLabel("Téléphone :"));
        panel52.add(labelTelephone);
        panel61.add(boutonAjouter);
        panel62.add(boutonModifier);
        panel71.add(boutonSupprimer);
        panel72.add(boutonAnnuler);
        jList.addListSelectionListener(this);
        boutonAjouter.addActionListener(this);
        boutonSupprimer.addActionListener(this);
        boutonAnnuler.addActionListener(this);
        boutonModifier.addActionListener(this);
        Dimension tailleBouton=boutonSupprimer.getPreferredSize();
        boutonAnnuler.setPreferredSize(tailleBouton);
        boutonModifier.setPreferredSize(tailleBouton);
        boutonAjouter.setPreferredSize(tailleBouton);
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
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonAjouter)
        {
            new FenetreNouvClient(main);
        }
        else if (recup==boutonSupprimer)
        {
            if (jList.getSelectedIndex()==-1)
            {
                new FenetreErreur("Sélectionner un client");
            }
            else {
                (main.menuClient).delClient(jList.getSelectedIndex());
                main.fenetreConsulterClient = new FenetreConsulterClient(main);
                fenetre.dispose();
            }
        }
        else if (recup==boutonAnnuler)
        {
            fenetre.dispose();
        }
        else if (recup==boutonModifier) {
            int index = jList.getSelectedIndex();
            if (index != -1) {
                new FenetreModifierClient(main, (Client) main.menuClient.getListeClient().get(jList.getSelectedIndex()));
            }
            else
            {
                new FenetreErreur("Sélectionner un client");
            }
        }
    }

    /**
     * permet d'afficher les differente information sur un client
     * @param e
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {

        int index = jList.getSelectedIndex();
        Client client = (Client) main.menuClient.getListeClient().get(index);
        labelDateDeNaissance.setText(client.getDateDeNaissance());
        labelMail.setText(client.getAdresseMail());
        labelNom.setText(client.getNom());
        labelPrenom.setText(client.getPrenom());
        labelTelephone.setText(client.getNumTelephone());
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }
}
