import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreNouvClient implements ActionListener {
    JFrame fenetre=new JFrame();
    JPanel panel=new JPanel();
    JPanel panel11=new JPanel();
    JPanel panel12=new JPanel();
    JPanel panel21=new JPanel();
    JPanel panel22=new JPanel();
    JPanel panel31=new JPanel();
    JPanel panel32=new JPanel();
    JPanel panel41=new JPanel();
    JPanel panel42=new JPanel();
    JPanel panel51=new JPanel();
    JPanel panel52=new JPanel();
    JPanel panel61=new JPanel();
    JPanel panel62=new JPanel();
    JTextField fieldNom = new JTextField();
    JTextField fieldPrenom = new JTextField();
    JTextField fieldDateDeNaissance = new JTextField();
    JTextField fieldAdresseMail = new JTextField();
    JTextField fieldNumeroTelephone = new JTextField();
    JButton boutonAjouter = new JButton("Ajouter");
    JButton boutonReset = new JButton("Reset");

    public FenetreNouvClient() {
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
        panel11.add(new Label("Nom :"));
        panel12.add(fieldNom);
        panel21.add(new Label("Prénom :"));
        panel22.add(fieldPrenom);
        panel31.add(new Label("Date de naissance :"));
        panel32.add(fieldDateDeNaissance);
        panel41.add(new Label("Adresse mail :"));
        panel42.add(fieldAdresseMail);
        panel51.add(new Label("Numéro de téléphone :"));
        panel52.add(fieldNumeroTelephone);
        panel61.add(boutonAjouter);
        panel62.add(boutonReset);
        fieldNom.setColumns(15);
        fieldAdresseMail.setColumns(15);
        fieldDateDeNaissance.setColumns(15);
        fieldNumeroTelephone.setColumns(15);
        fieldPrenom.setColumns(15);
        boutonAjouter.addActionListener(this);
        boutonReset.addActionListener(this);

        fenetre.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonAjouter)
        {

        }
        else if (recup==boutonReset)
        {
            fieldPrenom.setText("");
            fieldNumeroTelephone.setText("");
            fieldDateDeNaissance.setText("");
            fieldAdresseMail.setText("");
            fieldNom.setText("");
        }
    }
}
