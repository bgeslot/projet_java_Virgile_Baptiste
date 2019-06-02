import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FenetreConsulterClient<a> implements ActionListener, ListSelectionListener {
    private Main main;
    private int index;
    private boolean doitChanger;
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
    private JList<String> jList= new JList();//data);
    private JScrollPane scrollPane = new JScrollPane(jList);
    private JLabel labelNom = new JLabel("");
    private JLabel labelPrenom = new JLabel("");
    private JLabel labelDateDeNaissance = new JLabel("");
    private JLabel labelMail = new JLabel("");
    private JLabel labelTelephone = new JLabel("");
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonSupprimer = new JButton("Supprimer");

    public FenetreConsulterClient(Main m) {
        main = m;
        index=0;
        doitChanger=true;
        ArrayList listeClient;
        listeClient = main.menuClient.getListeClient();
        int length=listeClient.size();
        String[] data=new String[length];
        for(int i=0;i<length; i++){
            data[i]=(((Client)(listeClient.get(i))).getNom()+" "+((Client)(listeClient.get(i))).getPrenom());
        }
        JList<String> jList= new JList(data);
        JScrollPane scrollPane = new JScrollPane(jList);
        fenetre.setTitle("Consulter liste clients");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.add(scrollPane);
        panel.add(panelDroite);
        panelDroite.setLayout(new GridLayout(6,2));
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
        panel11.add(new JLabel("Nom :"));
        panel12.add(labelNom);
        panel21.add(new JLabel("Prénom :"));
        panel22.add(labelPrenom);
        panel31.add(new JLabel("Naissance :"));
        panel32.add(labelDateDeNaissance);
        panel41.add(new JLabel("Adresse Mail :"));
        panel42.add(labelMail);
        panel51.add(new JLabel("Téléphone :"));
        panel52.add(labelTelephone);
        panel61.add(boutonAjouter);
        panel62.add(boutonSupprimer);
        jList.addListSelectionListener(this);
        boutonAjouter.addActionListener(this);
        boutonSupprimer.addActionListener(this);
        fenetre.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonAjouter)
        {
            new FenetreNouvClient(main);
        }
        else if (recup==boutonSupprimer)
        {

        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (doitChanger)
        {
            if (e.getFirstIndex() != index) {
                index = e.getFirstIndex();
            } else {
                index = e.getLastIndex();
            }
            doitChanger=false;
        }
        else
        {
            doitChanger=true;
        }
        Client client = (Client) main.menuClient.getListeClient().get(index);
        labelDateDeNaissance.setText(client.getDateDeNaissance());
        labelMail.setText(client.getAdresseMail());
        labelNom.setText(client.getNom());
        labelPrenom.setText(client.getPrenom());
        labelTelephone.setText(client.getNumTelephone());
        fenetre.pack();
    }
}
