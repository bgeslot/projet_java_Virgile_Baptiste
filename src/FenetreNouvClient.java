import com.sun.org.apache.xml.internal.utils.StringToStringTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreNouvClient implements ActionListener {
    private Main main;
    private JFrame fenetre=new JFrame();
    private JPanel panel=new JPanel();
    private JPanel panel11=new JPanel();
    private JPanel panel12=new JPanel();
    private JPanel panel21=new JPanel();
    private JPanel panel22=new JPanel();
    private JPanel panel31=new JPanel();
    private JPanel panel32=new JPanel();
    private JPanel panel41=new JPanel();
    private JPanel panel42=new JPanel();
    private JPanel panel51=new JPanel();
    private JPanel panel52=new JPanel();
    private JPanel panel61=new JPanel();
    private JPanel panel62=new JPanel();
    private JTextField fieldNom = new JTextField();
    private JTextField fieldPrenom = new JTextField();
    private JTextField fieldDateDeNaissance = new JTextField();
    private JTextField fieldAdresseMail = new JTextField();
    private JTextField fieldNumeroTelephone = new JTextField();
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonAnnuler = new JButton("Annuler");

    public FenetreNouvClient(Main main) {
        this.main=main;
        fenetre.setTitle("Ajout client");
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        panel.setLayout(new GridLayout(6,2));
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
        panel11.add(new Label("Prénom :"));
        panel12.add(fieldPrenom);
        panel21.add(new Label("Nom :"));
        panel22.add(fieldNom);
        panel31.add(new Label("Date de naissance :"));
        panel32.add(fieldDateDeNaissance);
        panel41.add(new Label("Adresse mail :"));
        panel42.add(fieldAdresseMail);
        panel51.add(new Label("Numéro de téléphone :"));
        panel52.add(fieldNumeroTelephone);
        panel61.add(boutonAjouter);
        panel62.add(boutonAnnuler);
        fieldNom.setColumns(15);
        fieldAdresseMail.setColumns(15);
        fieldDateDeNaissance.setColumns(15);
        fieldNumeroTelephone.setColumns(15);
        fieldPrenom.setColumns(15);
        boutonAjouter.addActionListener(this);
        boutonAnnuler.addActionListener(this);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonAjouter)
        {
            Client newClient=new Client(fieldNom.getText(),fieldPrenom.getText(),fieldDateDeNaissance.getText(),fieldAdresseMail.getText(),fieldNumeroTelephone.getText());
            (main.menuClient).addClient(newClient);
            if (main.fenetreConsulterClient!=null)
            {
                main.fenetreConsulterClient.fenetre.dispose();
            }
            main.fenetreConsulterClient = new FenetreConsulterClient(main);
            fenetre.dispose();
        }
        else if (recup==boutonAnnuler)
        {
            fieldPrenom.setText("");
            fieldNumeroTelephone.setText("");
            fieldDateDeNaissance.setText("");
            fieldAdresseMail.setText("");
            fieldNom.setText("");
        }
    }
}
