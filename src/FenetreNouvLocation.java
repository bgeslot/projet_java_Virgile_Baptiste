import javax.swing.*;
import java.awt.*;

public class FenetreNouvLocation {
    private Main main;
    private JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JComboBox jComboBox;
    private JTextField fieldDateDebut=new JTextField();
    private JTextField fieldDateFin=new JTextField();
    private JTextField fieldKmPrevi=new JTextField();
    private JTextField fieldPrixPrevi=new JTextField();
    private JCheckBox reduction=new JCheckBox();
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
    private JPanel panel71=new JPanel();
    private JPanel panel72=new JPanel();
    private JPanel panel81=new JPanel();
    private JPanel panel82=new JPanel();
    private JPanel panel91=new JPanel();
    private JPanel panel92=new JPanel();

    String[] clients={"Client 0","Client 1","Client 2","Client 3","Client 4","Client 5","Client 6"};

    public FenetreNouvLocation(Main m,Vehicule vehicule) {
        main = m;
        fenetre.setTitle("Nouvelle location");
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        jComboBox = new JComboBox(clients);
        panel.setLayout(new GridLayout(9,2));
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
        panel.add(panel71);
        panel.add(panel72);
        panel.add(panel81);
        panel.add(panel82);
        panel.add(panel91);
        panel.add(panel92);/*
        panel11.add();
        panel12.add();
        panel21.add();
        panel22.add();
        panel31.add();
        panel32.add();
        panel41.add();
        panel42.add();
        panel51.add();
        panel52.add();
        panel61.add();
        panel62.add();
        panel71.add();
        panel72.add();
        panel81.add();
        panel82.add();
        panel91.add();
        panel92.add();
        */
        fenetre.pack();
    }
}
